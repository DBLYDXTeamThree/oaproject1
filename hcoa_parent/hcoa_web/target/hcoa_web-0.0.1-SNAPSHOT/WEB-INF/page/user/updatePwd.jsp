<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ include file="../head.jsp"%>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/dispatch/From.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/dispatch/jquery.datetimepicker.css">  
	<link rel="stylesheet" type="text/css" href="css/dispatch/demo.css">
	<link rel="stylesheet" type="text/css" href="css/dispatch/From_1.css" >
	<link rel="stylesheet" type="text/css" href="css/dispatch/datePicker.css">
	<link rel="stylesheet" type="text/css" href="css/index.css" >

<!--** 下面的js不能删除袄 这5个是公用的 也不能改袄**-->
<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap-switch.js"></script>
<script type="text/javascript" src="js/lib.js"></script>
<script type="text/javascript" src="js/init.js"></script>

<!--导航结束-->
<input type="hidden"  value="${pwd}" id="oldpwd" >
<ol class="breadcrumb">
    <li><a href="#">当前位置:</a></li>
    <li class="active">修改密码</li>
  </ol>
  <form name="forn" id="forn" action="editPwd" method="post" class="form-horizontal registerform">
   <div class="control-group">
      <label class="control-label">原始密码</label>
      <div class="controls">
          <input  type="password" id="oldlogin_pwd">
      </div>
  </div>
   <div class="control-group">
      <label class="control-label"> <span style="color:red;">*&nbsp;</span>密码</label>
      <div class="controls">
          <input type="password" class="input-medium" name="login_pwd" id="pwd1" >
          <span class="label">密码至少6个字符,最多18个字符！</span>
      </div>
  </div>
   <div class="control-group">
      <label class="control-label"> <span style="color:red;">*&nbsp;</span>确认密码</label>
      <div class="controls">
          <input type="password" class="input-medium" id="pwd2">
          <span class="label">确认密码应与上一次保持一致</span>
      </div>
  </div>
 
    <div class="control-group" style="width: 300px;float: left;" id="butt">
      <div class="controls">
          <button type="submit" class="btn btn-primary" onclick="yz()">提交</button>
      </div>
  </div>
    <script>
   
    function yz(){
        var oldpwd = $("#oldpwd").val();
        var oldlogin_pwd = $("#oldlogin_pwd").val();
	    var pwd1 = $("#pwd1").val();
	    var pwd2 = $("#pwd2").val();
	    if(oldpwd!=oldlogin_pwd){
	      alert("原始密码输入错误");
	      return ;
	    }
	    if(oldlogin_pwd==""){
	      alert("请输入原始密码");
	      return ;
	    }
	    if(pwd1==""){
	    	alert("请输入新密码");
	    	return ;
	    }
	    if(pwd1.length<6||pwd1.length>12){
	    	alert("密码长度应在6-12位之间");
	    	return ;
	    }
	    if(pwd1!=pwd2){
	    	alert("新密码应与确认密码保持一致");
	    	return ;
	    }
	     window.forn.submit();
    
    }
    
    </script>
  </form>
  </body>
</html>
