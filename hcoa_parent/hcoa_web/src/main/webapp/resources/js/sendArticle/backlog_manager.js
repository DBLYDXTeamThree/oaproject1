$(
	function ()
	{
		loadBackLog();
	}
);

function loadBackLog()
{
	ajax4Json
	(
		"getBackLogList",

		function (data)
		{
			var thead = $("#backLogList").children(":first");

			$("#backLogList").empty();

			$("#backLogList").append(thead);

			var backLogList = data["backLogList"];
			
			var keyList = ["id", "title", "deliver", "cellphone", "dept"];
			
			$.each
			(
				backLogList,

				function (i)
				{
					var backLog = backLogList[i];
					
					var tr = createDataRow(backLog, keyList, false).append
					(
						"<th>" +
						"<button class='btn btn-primary attachManager' type='button' data-toggle='modal' data-target='#myModa2'>查看</button>" +
						"</th>"
					)
					.append
					(
						"<th>" +
						"<button class='btn btn-primary successBtn' type='button'>同意</button>&nbsp;" +
						"<button class='btn btn-primary unsuccessBtn' type='button'>不同意</button>" +
						"</th>"
					)
					.data("articleId", backLog.modelId);
					
					$("#backLogList").append(tr);
				}
			);
			
			$(".table tr:odd").css("background-color","#fff");
			
			$(".attachManager").click
			(
				function ()
				{
					loadAttachList($(this).parent().parent().data("articleId"));
				}
			);
			
			$(".successBtn").click
			(
				function ()
				{
					ajax4Json
					(
						"doApprove",
						
						function (data)
						{
							loadBackLog();
						},
						
						{code: 1, tableName: "send_article", articleId: $(this).parent().parent().data("articleId"), id: $(this).parent().parent().data("id")}
					);
				}
			);
			
			$(".unsuccessBtn").click
			(
				function ()
				{
					ajax4Json
					(
						"doApprove",
						
						function (data)
						{
							loadBackLog();
						},
						
						{code: 0, tableName: "send_article", articleId: $(this).parent().parent().data("articleId"), id: $(this).parent().parent().data("id")}
					);
				}
			);
		},
		
		{tableName: "send_article"}
	);
}

function loadAttachList(id)
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
		
		{articleid: id}
	);
}