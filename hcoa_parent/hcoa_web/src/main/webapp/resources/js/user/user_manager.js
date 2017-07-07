$(
	function ()
	{
		loadDepts();
		
		loadUsers();
		
		$("#department").change
		(
			function ()
			{
				//动态加载用户列表
				loadUsers();
			}
		);
		
		$("#queryBtn").click
		(
			function ()
			{
				//动态加载用户列表
				loadUsers();
			}
		);
	}
);

/**
 * 加载用户列表
 */
function loadUsers()
{
	ajax4Json
	(
		"getUsers",

		function (data)
		{
			var thead = $("#userList").children(":first");

			$("#userList").empty();

			$("#userList").append(thead);

			var userList = data["userList"];
			
			var keyList = ["login_username", "realname", "cellphone", "deptname", "age", "sex", "status"];

			$.each
			(
				userList,

				function (i)
				{
					var user = userList[i];
					
					var tr = createDataRow(user, keyList, false).append
					(
						"<th>" +
						"<button class='btn btn-primary moreinfo' type='submit'>详情</button>&nbsp;" +
						"<button class='btn btn-primary fire' type='submit'>停用</button>" +
						"</th>"
					);

					$("#userList").append(tr);
				}
			);
			
			//绑定详情按钮点击事件
			$(".moreinfo").click
			(
				function ()
				{
					$("#userid").val($(this).parent().parent().data("id"));
					
					submitForm($("#editForm"), "editUser");
				}
			);
			
			//绑定停用按钮点击事件
			$(".fire").click
			(
				function ()
				{
					var obj = $(this);
					
					if (confirm("确定要停用该用户么？"))
					{
						ajax4Json
						(
							"fireUser",
							
							function (data)
							{
								obj.parent().parent().children(".status").text(data.status);
							},
							
							{id: $(this).parent().parent().data("id")}
						);
					}
				}
			);
			
			$(".table tr:odd").css("background-color","#fff");
		},

		$("#queryForm").serialize()
	);
}