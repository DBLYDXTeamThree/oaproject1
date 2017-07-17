$(
	function ()
	{
		loadAllRoles();
		
		$("#queryBtn").click
		(
			function ()
			{
				//动态加载用户列表
				loadAllRoles();
			}
		);
		

		$("#addBtn").click
		(
			function ()
			{
				clear();
			}
		);
		
		$("#subBtn").click
		(
			function ()
			{
				var id = $("#role_id").val();
				
				var action = null;
				
				if (id)
				{
					action = "editRole";
				}
				
				else
				{
					action = "addRole";
				}
				
				ajax4Json
				(
					action, 
					
					function (data)
					{
						//$("#closeBtn").trigger("click");
						
						loadAllRoles();
					}, 
					
					$("form[name='addForm']").serialize()
				);
			}
		);
	}
);

/**
 * 加载角色列表
 */
function loadAllRoles()
{
	ajax4Json
	(
		"getRoles4List",

		function (data)
		{
			var thead = $("#roleList").children(":first");

			$("#roleList").empty();

			$("#roleList").append(thead);

			var roleList = data["roleList"];
			
			var keyList = ["role_caption", "remark"];

			$.each
			(
				roleList,

				function(i)
				{
					var role = roleList[i];
					
					var tr = createDataRow(role, keyList, false).append
					(
						"<th>" +
						"<button class='btn btn-primary moreinfo' type='button' data-toggle='modal' data-target='#myModa2' type='button'>详情</button>&nbsp;" +
						"<button class='btn btn-primary delBtn' type='button'>删除</button>" +
						"</th>"
					)

					$("#roleList").append(tr);
				}
			);
			
			$(".table tr:odd").css("background-color","#fff");
			
			$(".moreinfo").click
			(
				function ()
				{
					$("#role_id").val($(this).parent().parent().data("id"));
					
					$("#role_caption").val($(this).parent().prevAll(".role_caption").text());
					
					$("#remark").val($(this).parent().prevAll(".remark").text());
				}
			);
			
			$(".delBtn").click
			(
				function ()
				{
					ajax4Json
					(
						"delRole", 
						
						function (data)
						{
							loadAllRoles();
						}, 
						
						{id: $(this).parent().parent().data("id")}
					);
				}
			);
		},

		$("#queryForm").serialize()
	);
}

function clear()
{
	$("#role_id").val("");
	
	$("#role_caption").val("");
	
	$("#remark").val("");
}