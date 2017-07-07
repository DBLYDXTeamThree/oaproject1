 $(document).ready(function(){
	
	 $(".detail_build").click
	 (
		function ()
		{
			var id = $(this).parent().prevAll(".build_projectlist_id").text();
		
			window.location.href = "getBuild_projectById?id="+id;
		}
	);
 });
 
 

  


  
