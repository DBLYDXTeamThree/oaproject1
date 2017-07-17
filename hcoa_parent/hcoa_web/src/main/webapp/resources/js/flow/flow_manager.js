$(
	function ()
	{
		loadProjects();
		
		$("#addProject").click
		(
			function ()
			{
				$("#myModalLabel").text("新增审批项目");
				
				resetForm();
			}
		);
		
		$("#subBtn").click
		(
			function ()
			{
				var id = $("#project_id").val();
				
				var action = "addProject";
				
				if (id)
				{
					action = "updateProject";
				}
				
				ajaxWithJson
				(
					action,

					function (data)
					{
						$("#closeBtn").trigger("click");
						
						/*loadProjects();*/
						
						window.location.href="flow_manager";
					},
					
					formToJson($("form[name='editForm']"))
				);
			}
		);
		
		$("#delBtn").click
		(
			function ()
			{
				if (confirm("请确认是否要删除这些项目"))
				{
					var checkBoxes = $("input[type='checkbox']");
					
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
						"delProjects",
						
						function (data)
						{
							loadProjects();
						},
						
						{idList: idList}
					);
				}
			}
		);
	}
);

function loadUser()
{
	ajax4Json
	(
		"getUserObj",

		function (data)
		{
			$("#createby").val(data.userObj.id);
			
			$("#create_dept").val(data.userObj.dept.id);
			
			$("#username").val(data.userObj.realname);
		}
	);
}

function loadProjects()
{
	ajax4Json
	(
		"getProjects",

		function (data)
		{
			var thead = $("#projectList").children(":first");

			$("#projectList").empty();

			$("#projectList").append(thead);
			
			var projectList = data["projectList"];
			
			var keyList = ["caption", "createtime", "deptName", "userName"];

			$.each
			(
				projectList,

				function(i)
				{
					var project = projectList[i];
					
					var tr = createDataRow(project, keyList, true)
					.append
					(
							"<th><a style='color:#666; cursor: pointer;' class='editNodes'>节点定义</a></th>"
					)
					.append
					(
						"<th>" +
						"<button class='btn btn-primary editBtn' data-toggle='modal' data-target='#myModal'>修改</button>&nbsp;" +
						"</th>"
					);

					$("#projectList").append(tr);
				}
			);
			
			var times = $(".createtime");
			
			$.each
			(
				times,
				
				function (i)
				{
					$(times[i]).text(getLocalTime(new Date(parseInt($(times[i]).text()))));
				}
			);
			
			$(".table tr:odd").css("background-color","#fff");
			
			$(".editNodes").click
			(
				function ()
				{
					$("#projectId").val($(this).parent().parent().data("id"));
					
					submitForm($("#editNodeForm"), "editNode");
				}
			);
			
			$(".editBtn").click
			(
				function ()
				{
					$("#myModalLabel").text("修改审批项目");
					
					loadProjectById($(this).parent().parent().data("id"));
				}
			);
		}
	);
}

function loadProjectById(id)
{
	ajax4Json
	(
		"editProject",

		function (data)
		{
			initForm(data["project"]);
		},
		
		{id: id}
	);
}

function initForm(data)
{
	$("#project_id").val(data.id);
	
	$("#caption").val(data.caption);
	
	$("#createby").val(data.createby);
	
	$("#create_dept").val(data.create_dept);
	
	$("#username").val(data.userName);
	
	$("#table_name").val(data.table_name);
	
	$("#content").val(data.content);
}

function resetForm()
{
	$("#project_id").val("");
	
	$("#caption").val("");
	
	loadUser();
	
	$("#table_name").val("");
	
	$("#content").val("");
}