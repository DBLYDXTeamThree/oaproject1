$(document).ready(function(){
	
	$(".insertdata_dictionary").Validform
	({
		callback: function (form)
		{
			var state = $("#state").val();
			var id = $("#id").val();
			if(state=='1'){
				//修改
				var action = "updateData_dictionary?id="+id;
				
				var path = "getData_dictionarys";
				
			}else{
				var action = "addData_dictionary";
				
				var path = "getData_dictionarys";
			}
			
			doSubmit(form, action, path);
			
			
			return false;
		},
			
		tiptype: 1,
		
		datatype:
		{
			"*6-20": /^[^\s]{6,20}$/,
			"zh2-6": /^[\u4E00-\u9FA5\uf900-\ufa2d]{2,4}$/,
			"forumtitle": function (gets, obj, curform, regxp)
			{
  				//参数gets是获取到的表单元素值，obj为当前表单元素，curform为当前验证的表单，regxp为内置的一些正则表达式的引用;
  				var reg1=/^[\w\.]{4,16}$/,
  				
    			reg2=/^[\u4E00-\u9FA5\uf900-\ufa2d]{2,8}$/;

  				if (reg1.test(gets))
  				{
  					return true;
  				}
  				
  				if (reg2.test(gets))
  				{
  					return true;
  				}
  				
  				return false;
			}
			},
			
		usePlugin:
		{
  		
  			
    	
		}
	});
	
	
	
	
})

function doSubmit(form, action, path)
{
	
	var datas = formToJson(form);
	ajaxWithJson
	(
		action,
		
		function (data)
		{
			
			window.location.href = path;
			
			
		},
		
		datas
	);
}




