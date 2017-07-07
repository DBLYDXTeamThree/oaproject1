$(
	function ()
	{
		$("#data").data("flowId", 1);
		
		loadDepts();
		
		loadPerson();
		
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
				
				//var selected = obj.next().val();
				var selected = obj.val();
				
				
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
				/*
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
				*/
				$(".table tr:odd").css("background-color","#fff");
				
				$("#subBtn").click
				(
					function ()
					{
						var count = 0;
						var a='';
						var b= '';
						var d= '';
						
						$("#content1 tr").each
						(
							function ()
							{
								if ($(this).find(":checkbox").prop("checked"))
								{
									
									
									b = b+$(this).find(".realname").text()+'|';
									d = d+$(this).data("id")+'|';
									count ++;
								}
							}
						);
						var c = b.substring(0,b.length-1);
						var e = d.substring(0,d.length-1);
						
						obj.val(c);
						
						obj.next().val(e);
						
						
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
		
		$("#savebuild").click
		(
			function ()
			{
				doSubmit($("form[name='form1']"), "addBuile_project", "/base/getBuild_projects");
			}
		);
		
		$("#updatebuild").click
		(
			function ()
			{
				var id = $("#id").val();
				
				doSubmit($("form[name='form1']"), "updateBuile_project?id="+id, "/base/getBuild_projects");
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
		"getBuildPersonList", 
		
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

