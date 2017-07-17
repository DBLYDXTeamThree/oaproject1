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
		"getProjectBackLogList",

		function (data)
		{
			var thead = $("#backLogList").children(":first");

			$("#backLogList").empty();

			$("#backLogList").append(thead);

			var backLogList = data["backLogList"];
			
			var keyList = ["id", "caption", "area", "build_area", "floor_num"];
			
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
			
			$(".successBtn").click
			(
				function ()
				{
					ajax4Json
					(
						"doApprove4Project",
						
						function (data)
						{
							window.location.href = "backlog_manager";
						},
						
						{code: 1, tableName: "build_project", projectId: $(this).parent().parent().data("projectId"), id: $(this).parent().parent().data("id")}
					);
				}
			);
			
			$(".unsuccessBtn").click
			(
				function ()
				{
					ajax4Json
					(
						"doApprove4Project",
						
						function (data)
						{
							loadBackLog();
						},
						
						{code: 0, tableName: "build_project", projectId: $(this).parent().parent().data("projectId"), id: $(this).parent().parent().data("id")}
					);
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
					download("builddownload", {build_projectlist_id: $(this).parent().parent().data("id")});
				}
			);
			
			$(".table tr:odd").css("background-color","#fff");
		},
		
		{build_project_id: id}
	);
}