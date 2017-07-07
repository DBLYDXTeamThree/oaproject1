
$(function () {
    $("#slider").responsiveSlides({
    auto: true,
    pager: true,
    nav: true,
    speed: 500,
    // 对应外层div的class : slide_container
    namespace: "slide"
    });
	$(".slide_tabs li a").text("");	
});