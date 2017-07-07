$(
	function ()
	{
		loadRules();
		
		$("#addRule").click
		(
			function ()
			{
				resetForm();
			}
		);
		
		$("#subBtn").click
		(
			function ()
			{
				ajaxWithJson
				(
					"addRule",

					function (data)
					{
						$("#closeBtn").trigger("click");
						
						loadRules();
					},
					
					formToJson($("form[name='addForm']"))
				);
			}
		);
		
		$("#selRoleBtn").click
		(
			function ()
			{
				var idList = [-1];
				
				$("#content1 tr").each
				(
					function ()
					{
						if ($(this).find(":checkbox").prop("checked"))
						{
							idList.push($(this).data("id"));
						}
					}
				);
				
				ajax4Json
				(
					"selRoles",
					
					function (data)
					{
						$("#closeBtn").trigger("click");
					},
					
					{ruleId: $("#ruleId").val(), idList: idList}
				);
			}
		);
	}
);

function loadRules()
{
	ajax4Json
	(
		"getRules",

		function (data)
		{
			var thead = $("#ruleList").children(":first");

			$("#ruleList").empty();

			$("#ruleList").append(thead);
			
			var ruleList = data["ruleList"];
			
			var keyList = ["rule_caption", "approve_level"];

			$.each
			(
				ruleList,

				function(i)
				{
					var rule = ruleList[i];
					
					var tr = createDataRow(rule, keyList, false)
					.append
					(
							"<th><a href='#' class='editRoles' style='color:#666;' data-toggle='modal' data-target='#myModa2'>角色设置</a></th>"
					)
					.append
					(
						"<th>" +
						"<button class='btn btn-primary delBtn'>删除</button>&nbsp;" +
						"</th>"
					);

					$("#ruleList").append(tr);
				}
			);
			
			$(".table tr:odd").css("background-color","#fff");
			
			$(".editRoles").click
			(
				function ()
				{
					$("#ruleId").val($(this).parent().parent().data("id"));
					
					ajax4Json
					(
						"getRoles",

						function (data)
						{
							var thead = $("#content1").children(":first");

							$("#content1").empty();

							$("#content1").append(thead);
							
							var keyList = ["role_caption"];
							
							$.each
							(
								data,
								
								function (i)
								{
									var tr = createDataRow({id: i, role_caption: data[i]}, keyList, true);

									$("#content1").append(tr);
								}
							);
						}
					);
					
					ajax4Json
					(
						"getSelRoles",
						
						function (data)
						{
							var list = data["roleList"];
							
							$.each
							(
								list,
								
								function (i)
								{
									var role = list[i];
									
									$("#content1 tr").each
									(
										function ()
										{
											if ($(this).data("id") == role.id)
											{
												$(this).find(":checkbox").prop("checked", "checked");
											}
										}
									);
								}
							);
						},
						
						{ruleId: $(this).parent().parent().data("id")}
					);
				}
			);
			
			$(".delBtn").click
			(
				function ()
				{
					if (confirm("请确认是否删除规则"))
					{
						ajax4Json
						(
							"delRule",
							
							function (data)
							{
								loadRules();
							},
							
							{id: $(this).parent().parent().data("id")}
						);
					}
				}
			);
		},
		
		{nodeId: $("#nodeId").val()}
	);
}

function resetForm()
{
	$("input[name='rule_caption']").val("");
	
	$("input[name='approve_level']").val("");
}