$(
	function ()
	{
		loadHistory();
	}
);

function loadHistory()
{
	ajax4Json
	(
		"getHistoryList",

		function (data)
		{
			var thead = $("#historyList").children(":first");

			$("#historyList").empty();

			$("#historyList").append(thead);

			var historyList = data["historyList"];
			
			var keyList = ["id", "title", "deliver", "cellphone", "dept", "status"];
			
			$.each
			(
				historyList,

				function (i)
				{
					var history = historyList[i];
					
					var tr = createDataRow(history, keyList, false).append
					(
						"<th>" +
						"<button class='btn btn-primary attachManager' type='button' data-toggle='modal' data-target='#myModa2'>查看</button>" +
						"</th>"
					)
					.data("articleId", history.modelId);
					
					$("#historyList").append(tr);
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