$(
	function ()
	{
		initMenu();
	}
);

/**
 * 加载部门
 */
function loadDepts()
{
	ajax4Json
	(
		"getDepts",

		function(data)
		{
			var deptSel = $("#department");
			
			var deptId = $("#dept_id").val();
	
			$.each
			(
				data,
	
				function(i)
				{
					var opt = $("<option value='" + i + "'>" + data[i] + "</option>");
					
					if (i == deptId)
					{
						opt.attr("selected", "selected");
					}
					
					deptSel.append(opt);
				}
			);
		}
	);
}

/**
 * 加载角色列表
 */
function loadRoles()
{
	ajax4Json
	(
		"getRoles",

		function(data)
		{
			var roleSel = $("#role");
			
			var roleId = $("#role_id").val();
	
			$.each
			(
				data,
	
				function(i)
				{
					var opt = $("<option value='" + i + "'>" + data[i] + "</option>");
					
					if (i == roleId)
					{
						opt.attr("selected", "selected");
					}
					
					roleSel.append(opt);
				}
			);
		}
	);
}