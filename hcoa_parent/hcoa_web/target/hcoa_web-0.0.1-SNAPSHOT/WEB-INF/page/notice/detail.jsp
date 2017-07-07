<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ include file="../head.jsp"%>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="css/index.css">
		<link rel="stylesheet" type="text/css" href="css/title/Examination1.css">
		
<!-- 		<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="css/jquery.datetimepicker.css" media="screen">  
		<link rel="stylesheet" type="text/css" href="css/slider.css" />
		<link rel="stylesheet" type="text/css" href="css/datePicker.css" >
		
		<link rel="stylesheet" type="text/css" href="css/index/demo.css">
		<link rel="stylesheet" type="text/css" href="css/index/index1.css">
		<link rel="stylesheet" type="text/css" href="css/index/From.css">
		<link rel="stylesheet" type="text/css" href="css/index/index.css" />
 -->		
		<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
		<script type="text/javascript" src="js/bootstrap-switch.js"></script>
		<script type="text/javascript" src="js/lib.js"></script>
		<script type="text/javascript" src="js/init.js"></script>
<!--导航结束-->


<!--内容开始-->
<div class="main-right">
<!--面包屑导航-->
  <ol class="breadcrumb">
    <li><a href="#">当前位置:</a></li>
    <li><a href="#">发文管理</a></li>
    <li class="active">发文申请</li>
  </ol>
<!--面包屑导航-->
<!--表单-->
<form class="form-inline registerform" action = "saveUserInfo" name="form1" method = "post" enctype='multipart/form-data'style="min-height:360px;">
        <div class="Reply" style="width:99%; margin:0 auto; border: #cccccc solid 1px;border-radius:5px;">
           <div class="Reply_title" style="width:98%; margin:0 auto; border-bottom: #cccccc solid 1px;">
             <p id=caption style="color:#353535;font-size:16px;font-weight:bold;height:auto;line-height: 55px;padding-right: 10px; padding-left: 10px;">${notice.caption}
             <span style="color:#ababab; float:right"><fmt:formatDate value="${notice.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></span></p>
           </div>
           <div class="Reply_content" style="width:98%; margin:0 auto;text-indent:2em; color:#989898; height:400px;line-height: 30px; margin-top:20px;">
           <div id=content style="max-height: 400px;overflow: auto;">
				${notice.content}
            </div>
           </div>
        </div>
       
</form>
 <!--表单-->
</div>
<!--内容结束-->


			<!--尾部开始-->
			<div class="clear"></div> 
			<div class="Footer">
				<p>哈尔滨市交通基础设施投资建设管理有限公司 版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;技术支持：鑫联华</p>
			</div>
			<!--尾部结束-->
		</div>
	</body>
</html>
