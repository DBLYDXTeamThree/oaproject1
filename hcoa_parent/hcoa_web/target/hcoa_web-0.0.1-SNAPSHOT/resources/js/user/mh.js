$(document).ready(function(){
	//alert("mh");
	
	$("#mailForm").click(function(){
		var realname = $("#realname").val();
		
		var action = "getMailList";
		
		var path = "getMailList";
		
		doSubmit(realname, action, path);
	})
	
})

function doSubmit(form, action, path)
{
	
	ajaxWithJson
	(
		action,
		
		function (data)
		{
			window.location.href = path;

		},
		
		form
	);
}
