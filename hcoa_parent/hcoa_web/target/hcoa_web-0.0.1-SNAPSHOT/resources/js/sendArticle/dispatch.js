$(
	function ()
	{
		$("#data").data("flowId", 1);
		
		loadDepts();
		
		loadPerson();
		
		$('#datetimepicker2').datetimepicker
		({
			yearOffset : 0,
			lang : 'ch',
			timepicker : false,
			format : 'Y-m-d',
			formatDate : 'Y-m-d',
		});
		
		var personMap = $("#content1").data("personMap");
		
		$(".flow-node").click
		(
			function ()
			{
				var obj = $(this);
				
				$("#myModalLabel").text(obj.attr("node-name"));
				
				var thead = $("#content1").children(":first");

				$("#content1").empty();

				$("#content1").append(thead);
				
				var userList = personMap[obj.attr("node-id")];
				
				var keyList = ["realname", "deptname"];

				//动态创建人员列表
				$.each
				(
					userList,

					function (i)
					{
						var user = userList[i];
						
						var tr = createDataRow(user, keyList, true);

						$("#content1").append(tr);
					}
				);
				
				var selected = obj.next().val();
				
				//设置上次选中状态
				if (selected)
				{
					$("#content1 tr").each
					(
						function ()
						{
							if ($(this).data("id") == selected)
							{
								$(this).find(":checkbox").prop("checked", "checked");
							}
						}
					);
				}
				
				//设置多选框单选
				$(":checkbox").click
				(
					function ()
					{
						if ($(this).prop("checked"))
						{
							$(":checkbox").prop("checked", "");
							
							$(this).prop("checked", "checked");
						}
					}
				).dblclick
				(
					function ()
					{
						$(this).trigger("click");
					}
				);
				
				$(".table tr:odd").css("background-color","#fff");
				
				$("#subBtn").click
				(
					function ()
					{
						var count = 0;
						
						$("#content1 tr").each
						(
							function ()
							{
								if ($(this).find(":checkbox").prop("checked"))
								{
									obj.val($(this).find(".realname").text());
									
									obj.next().val($(this).data("id"));
									
									count ++;
								}
							}
						);
						
						if (count == 0)
						{
							obj.val("");
							
							obj.next().val("");
						}
						
						clearTable($(this));
					}
				);
			}
		);
		
		$("#closeBtn").click
		(
			function ()
			{
				clearTable($("#subBtn"));
			}
		);
		
		$("#backBtn").click
		(
			function ()
			{
				window.location.href = "/base/sendArticle/article_manager";
			}
		);
		
		var action = "saveArticle";
		
		var articleId = $("#article_id").val();
		
		var status = $("#article_status").val();
		
		if (articleId)
		{
			if (status == 0 || status == 4)
			{
				action = "updateArticle";
			}
			
			else
			{
				if (status == 3)
				{
					$("#saveBtn").html("公示");
					
					action = "openArticle";
				}
				
				else
				{
					$("#saveBtn").remove();
				}
				
				var dispatcherEle = $("#dispatcherName").parent();
				
				var dispatcherVal = $("#dispatcherName").val();
				
				var checkerEle = $("#checkerName").parent();
				
				var checkerVal = $("#checkerName").val();
				
				var unitSignEle = $("#unitSignName").parent();
				
				var unitSignVal = $("#unitSignName").val();
				
				var checkArticleEle = $("#checkArticleName").parent();
				
				var checkArticleVal = $("#checkArticleName").val();
				
				var dateEle = $('#datetimepicker2').parent();
				
				var dateVal = $('#datetimepicker2').val();
				
				$("#dispatcherName").remove();
				
				$("#checkerName").remove();
				
				$("#unitSignName").remove();
				
				$("#checkArticleName").remove();
				
				$('#datetimepicker2').remove();
				
				dispatcherEle.append(createReadOnlyInput(dispatcherVal));
				
				checkerEle.append(createReadOnlyInput(checkerVal));
				
				unitSignEle.append(createReadOnlyInput(unitSignVal));
				
				checkArticleEle.append(createReadOnlyInput(checkArticleVal));
				
				dateEle.append(createReadOnlyInput(dateVal));
				
				$("input").prop("readonly", "readonly");
				
				$("select").prop("disabled", "disabled");
			}
		}
		
		$("#saveBtn").click
		(
			function ()
			{
				doSubmit($("form[name='addForm']"), action, "/base/sendArticle/article_manager");
			}
		);
	}
);

/**
 * 加载各节点人员列表
 */
function loadPerson()
{
	ajax4Json
	(
		"getPersonList", 
		
		function (data)
		{
			$("#content1").data("personMap", data["personMap"]);
		}
	);
}

/**
 * 重置表格状态
 */
function clearTable(subBtn)
{
	subBtn.unbind("click");
	
	$(":checkbox").prop("checked", "");
	
	$(":checkbox").unbind("click");
}

function createReadOnlyInput(val)
{
	return "<input type='text' value='" + val + "' class='input-medium'/>";
}