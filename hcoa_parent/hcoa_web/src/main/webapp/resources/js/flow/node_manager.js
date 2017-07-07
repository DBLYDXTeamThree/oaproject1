$(
	function ()
	{
		loadNodes();
		
		$("#addNode").click
		(
			function ()
			{
				$("#myModalLabel").text("新增项目节点");
				
				resetForm();
			}
		);
		
		$("#subBtn").click
		(
			function ()
			{
				var action = "addNode";
				
				if ($("#node_id").val())
				{
					action = "updateNode";
				}
				
				ajaxWithJson
				(
					action,

					function (data)
					{
						$("#closeBtn").trigger("click");
						
						loadNodes();
					},
					
					formToJson($("form[name='addForm']"))
				);
			}
		);
		
		$("#delBtn").click
		(
			function ()
			{
				if (confirm("请确认是否要删除这些节点"))
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
						"delNodes",
						
						function (data)
						{
							loadNodes();
						},
						
						{idList: idList}
					);
				}
			}
		);
	}
);

function loadNodes()
{
	ajax4Json
	(
		"getNodes",

		function (data)
		{
			var thead = $("#nodeList").children(":first");

			$("#nodeList").empty();

			$("#nodeList").append(thead);
			
			var nodeList = data["nodeList"];
			
			var keyList = ["node_num", "node_caption", "remark"];

			$.each
			(
				nodeList,

				function(i)
				{
					var node = nodeList[i];
					
					var tr = createDataRow(node, keyList, true)
					.append
					(
							"<th><a style='color:#666; cursor: pointer;' class='editRules'>审批规则定义</a></th>"
					)
					.append
					(
						"<th>" +
						"<button class='btn btn-primary editBtn' data-toggle='modal' data-target='#myModal'>修改</button>&nbsp;" +
						"</th>"
					);

					$("#nodeList").append(tr);
				}
			);
			
			$(".table tr:odd").css("background-color","#fff");
			
			$(".editRules").click
			(
				function ()
				{
					$("#nodeId").val($(this).parent().parent().data("id"));
					
					submitForm($("#editRuleForm"), "editRule");
				}
			);
			
			$(".editBtn").click
			(
				function ()
				{
					$("#myModalLabel").text("修改项目节点");
					
					loadNodeById($(this).parent().parent().data("id"));
				}
			);
		},
		
		{projectId: $("#projectId").val()}
	);
}

function loadNodeById(id)
{
	ajax4Json
	(
		"editNodeWithId",

		function (data)
		{
			initForm(data["node"]);
		},
		
		{id: id}
	);
}

function initForm(data)
{
	$("#node_id").val(data.id);
	
	$("#node_num").val(data.node_num);
	
	$("#node_caption").val(data.node_caption);
	
	$("#remark").val(data.remark);
}

function resetForm()
{	
	$("#node_id").val("");
	
	$("#node_num").val("");
	
	$("#node_caption").val("");
	
	$("#remark").val("");
}