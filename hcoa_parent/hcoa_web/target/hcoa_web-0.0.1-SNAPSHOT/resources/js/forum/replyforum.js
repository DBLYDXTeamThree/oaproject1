$(document).ready(function(){
	
	$(".addreplyForum").Validform
	({
			callback: function (form)
			{
				
				var forumid = $("#forumid").val();
				var action = "addReplyForum";
				
				var path = "detailForum?id="+forumid;
				
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
	var datee = JSON.parse(datas);
	datee.user = {};
	datee.user.id=1;
	var forumid = $("#forumid").val();
	datee.parent_id = forumid;
	var datae =  JSON.stringify(datee);
	
	ajaxWithJson
	(
		action,
		
		function (data)
		{
			//alert(path);
			window.location.href = path;
			
			
		},
		
		datae
	);
}



