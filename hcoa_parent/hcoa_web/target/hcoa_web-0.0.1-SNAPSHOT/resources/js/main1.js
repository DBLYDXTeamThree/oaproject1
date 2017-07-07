
$(function () {
  var user = $.cookie("user"); //user
  if (user != null && user != '' && user != undefined) {
    // $("# iframemain1").attr("href", "mainrouter");
    $("#dlAllUser").attr("href", "findall?curPage=1");
    $("#ptAllUser").attr("href", "findalluser");
  } else {
  
    top.location.href = "login";
  }
})


  
