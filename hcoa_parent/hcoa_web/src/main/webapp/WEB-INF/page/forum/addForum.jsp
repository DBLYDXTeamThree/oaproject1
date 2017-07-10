<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ include file="../head.jsp"%>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/dispatch/From.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/dispatch/jquery.datetimepicker.css">  
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/dispatch/demo.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/dispatch/From_1.css" >
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/dispatch/datePicker.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/index.css" >
<!--** 下面的js不能删除袄 这5个是公用的 也不能改袄**-->
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap-switch.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/lib.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/init.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/user/user_manager.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/user/mh.js"></script>

<!--面包屑导航-->
<ol class="breadcrumb">
	<li>
		<a href="#">当前位置:</a>
	</li>
	
	<li>
		<a href="#">职工社区</a>
	</li>
	
	<li class="active">论坛发帖</li>
</ol>
<!--面包屑导航-->

<!--表单-->
<form class="form-horizontal addforum" action="addforumm" name="form1" method="get" enctype='multipart/form-data'>
		
		<input type="hidden" name="id" value="${staff.id }"/>
		
	<div class="control-group">
	    <label class="control-label">
	    	<span style="color:red;">*&nbsp;</span>帖子标题
	    </label>
	    
	    <div class="controls">
	        <input type="text" name="caption" class="input-medium" datatype="*"  nullmsg="请输入帖子标题！" style="width:80%"/>
	    </div>
	</div>
	
	<div class="control-group">
	    <label class="control-label">
	    	<span style="color:red;">*&nbsp;</span>标题内容
	    </label>
	    
	   <div class="controls">
	        <textarea type="text" name="content" class="input-medium" datatype="*" 	nullmsg="请输入帖子内容！" style="width:80%; height:300px;"></textarea>
	        	
	        
	    </div>
	</div>

	
	<div class="control-group" style="width: 300px;float: left;" id="butt">
	    <div class="controls">
	        <button type="submit" id="subBtn1" class="btn btn-primary">提交发帖</button>
	    </div>
	</div>
	
	<div class="control-group" style="float: left; margin-left:40px;">
	    <div class="controls" style=" margin-left:140px;">
	        <a id="back" href="getForums" class="btn btn-primary">返回首页</a>
	    </div>
	</div>
</form>
<!--表单-->
<!--尾部开始-->
  <div class="clear"></div> 
  <div class="Footer">
   <p>哈尔滨市交通基础设施投资建设管理有限公司 版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;技术支持：鑫联华</p>
  </div>
<!--尾部结束-->





<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/from/Validform_v5.3.2_min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/from/passwordStrength-min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/from/jquery.datePicker-min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/from/jquery.datetimepicker.js"></script>  
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/forum/addforum.js"></script>--%>
 <script src="${pageContext.request.contextPath}/resources/js/index/responsiveslides.min.js"></script>
 <script src="${pageContext.request.contextPath}/resources/js/index/slider.js"></script>


 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/table/table.css">

<!--尾部结束-->
</body>
</html>


