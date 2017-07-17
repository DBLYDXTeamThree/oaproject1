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
		"getProjectHistoryList",

		function (data)
		{
			var thead = $("#backLogList").children(":first");

			$("#backLogList").empty();

			$("#backLogList").append(thead);

			var backLogList = data["backLogList"];
			
			var keyList = ["id", "caption", "area", "build_area", "floor_num", "status"];
			
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
					.data("projectId", backLog.modelId);
					
					$("#backLogList").append(tr);
				}
			);
			
			$(".table tr:odd").css("background-color","#fff");
			
			$(".attachManager").click
			(
				function ()
				{				    
					loadBuildProjectList($(this).parent().parent().data("projectId"));//查build附件表
				}
			);
		},
		
		{tableName: "build_project"}
	);
}

function loadBuildProjectList(id)
{	
	ajax4Json
	(
		"loadBuildProjectList",

		function (data)
		{
			var thead = $("#content1").children(":first");

			$("#content1").empty();

			$("#content1").append(thead);
			
			var attachList = data["build_project_attachList"];
			
			
			var keyList = ["fileName"];

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
					download("builddownload", {build_projectlist_id: $(this).parent().parent().data("id")});
				}
			);
			
			$(".table tr:odd").css("background-color","#fff");
		},
		
		{build_project_id: id}
	);
}