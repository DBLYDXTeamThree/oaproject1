$(
	function ()
	{
		loadArticle();
		
		// 创建一个上传参数
		var uploadOption =
		{
		    action: "upload",    // 提交目标
		    
		    name: "file",            // 服务端接收的名称
		    
		    dataType: "json",
		    
		    autoSubmit: true,        // 是否自动提交
		    
		    // 开始上传文件
		    onSubmit: function (file, extension)
		    {
		    	this.setData({articleid: $("#articleid").val()});
		    },
		    
		    // 上传完成之后
		    onComplete: function (file, response) 
		    {
		    	loadAttachList();
		    }
		};

		// 初始化图片上传框
		new AjaxUpload("#button", uploadOption);
		
		$("#delBtn").click
		(
			function ()
			{
				if (confirm("请确认是否要删除这些节点"))
				{
					var checkBoxes = $("#content1 :checkbox");
					
					var checkBox = null;
					
					var idList = [];
					
					$.each
					(
						checkBoxes,
						
						function (i)
						{
							checkBox = $(checkBoxes[i]);
							
							if (checkBox.prop("checked"))
							{
								idList.push(checkBox.parent().parent().data("id"));
							}
						}
					);
					
					ajax4Json
					(
						"delAttachs",
						
						function (data)
						{
							loadAttachList();
						},
						
						{idList: idList}
					);
				}
			}
		);
		
		$("#subBtn").click
		(
			function ()
			{				
				ajax4Json
				(
					"sendArticle",
					
					function (data)
					{
						loadArticle();
						
						$("#articleid").val("");
						
						$("#remark").val("");
					},
					
					{articleid: $("#articleid").val(), remark: $("#remark").val()}
				);
			}
		);
	}
);

function loadArticle()
{
	ajax4Json
	(
		"getArticleList",

		function (data)
		{
			var thead = $("#articleList").children(":first");

			$("#articleList").empty();

			$("#articleList").append(thead);

			var articleList = data["articleList"];
			
			var keyList = ["id", "caption", "dispatcher", "unit_sign", "checker", 
			               "check_article", "main_dept", "drafter", "deliver_approve_flag"];
			
			$.each
			(
				articleList,

				function(i)
				{
					var article = articleList[i];
					
					var tr = createDataRow(article, keyList, false);
					
					var lastEle = tr.children(":last");
					
					lastEle.before
					(
						"<th><a href='#' class='attachManager' style='color:#666;' data-toggle='modal' data-target='#myModa2'>管理</a></th>"
					)
					.before
					(
						"<th><button class='btn btn-primary moreinfo' type='submit'>详情</button></th>"
					);
					
					if (article.deliver_approve_flag=="未送审")
					{
						lastEle.after
						(
							"<th><button class='btn btn-primary send' type='button' data-toggle='modal' data-target='#myModa3'>送审</button></th>"
						);
					}
					
					else if (article.deliver_approve_flag=="已退回")
					{
						lastEle.after
						(
							"<th><button class='btn btn-primary send' type='button' data-toggle='modal' data-target='#myModa3'>重新送审</button></th>"
						);
					}
					
					else
					{
						lastEle.after
						(
							"<th></th>"
						);
					}

					$("#articleList").append(tr);
				}
			);
			
			$(".table tr:odd").css("background-color","#fff");
			
			$(".attachManager").click
			(
				function ()
				{
					$("#articleid").val($(this).parent().parent().data("id"));
					
					loadAttachList();
				}
			);
			
			$(".moreinfo").click
			(
				function ()
				{
					$("#articleid").val($(this).parent().parent().data("id"));
					
					submitForm($("#editForm"), "editArticle");
				}
			);
			
			$(".send").click
			(
				function ()
				{
					$("#articleid").val($(this).parent().parent().data("id"));
				}
			);
		}
	);
}

function loadAttachList()
{	
	ajax4Json
	(
		"loadAttachList",

		function (data)
		{
			var thead = $("#content1").children(":first");

			$("#content1").empty();

			$("#content1").append(thead);
			
			var attachList = data["attachList"];
			
			var keyList = ["file_name"];

			$.each
			(
				attachList,

				function(i)
				{
					var attach = attachList[i];
					
					var tr = createDataRow(attach, keyList, true)
					.append
					(
							"<th><a class='download' style='color:#666; cursor:pointer;'>下载</a></th>"
					);

					$("#content1").append(tr);
				}
			);
			
			$(".download").click
			(
				function ()
				{
					download("download", {attachid: $(this).parent().parent().data("id")});
				}
			);
			
			$(".table tr:odd").css("background-color","#fff");
		},
		
		{articleid: $("#articleid").val()}
	);
}