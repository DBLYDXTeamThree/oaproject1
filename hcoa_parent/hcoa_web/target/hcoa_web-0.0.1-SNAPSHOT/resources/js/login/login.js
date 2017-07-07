$(
	function ()
	{
		$("#vcode").click
		(
			function ()
			{
				$(this).attr("src", "getImg?nocache=" + new Date().getTime());
			}
		);
	}
);