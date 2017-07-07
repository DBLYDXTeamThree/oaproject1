$(
	function ()
	{
		loadAllDepts();
		
		$("#queryBtn").click
		(
			function ()
			{
				//动态加载用户列表
				loadAllDepts();
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
				var id = $("#dept_id").val();
				
				var action = null;
				
				if (id)
				{
					action = "editDept";
				}
				
				else
				{
					action = "addDept";
				}
				
				ajax4Json
				(
					action, 
					
					function (data)
					{
						$("#closeBtn").trigger("click");
						
						loadAllDepts();
					}, 
					
					$("form[name='addForm']").serialize()
				);
			}
		);
	}
);

/**
 * 加载部门列表
 */
function loadAllDepts()
{
	ajax4Json
	(
		"getDepts4List",

		function (data)
		{
			var thead = $("#deptList").children(":first");

			$("#deptList").empty();

			$("#deptList").append(thead);

			var deptList = data["deptList"];
			
			var keyList = ["department_caption", "remark"];

			$.each
			(
				deptList,

				function(i)
				{
					var dept = deptList[i];
					
					var tr = createDataRow(dept, keyList, false).append
					(
						"<th>" +
						"<button class='btn btn-primary moreinfo' type='button' data-toggle='modal' data-target='#myModa2'>详情</button>&nbsp;" +
						"<button class='btn btn-primary delBtn' type='button'>删除</button>" +
						"</th>"
					);

					$("#deptList").append(tr);
				}
			);
			
			$(".table tr:odd").css("background-color","#fff");
			
			$(".moreinfo").click
			(
				function ()
				{
					$("#dept_id").val($(this).parent().parent().data("id"));
					
					$("#department_caption").val($(this).parent().prevAll(".department_caption").text());
					
					$("#remark").val($(this).parent().prevAll(".remark").text());
				}
			);
			
			$(".delBtn").click
			(
				function ()
				{
					ajax4Json
					(
						"delDept", 
						
						function (data)
						{
							loadAllDepts();
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
	$("#dept_id").val("");
	
	$("#department_caption").val("");
	
	$("#remark").val("");
}