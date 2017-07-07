<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
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
    <li class="active">待发公文</li>
  </ol>
<!--面包屑导航-->
<!--表单-->
<form class="form-horizontal registerform" action="saveUserInfo" name="form1" method = "post" enctype='multipart/form-data'>
	<input type="hidden" id="userid" name="id" value="${user.id}"/>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>真实姓名</label>
      <div class="controls">
          <input type="text" name="realname" value="${user.realname}" class="input-medium" datatype="zh2-6" nullmsg="请输入真实姓名！" errormsg="真实姓名至少2个中文字符,最多6个中文字符!">
          <span class="label">真实姓名至少2个中文字符,最多6个中文字符!</span>
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>性别</label>
      <div class="controls">
             <label class="checkbox-inline">
                <input type="radio" id="inlineCheckbox1" name="sex" value="1" datatype="*" nullmsg="请选择性别！" errormsg="请选择性别！" <c:if test="${user.sex == 1}">checked="checked"</c:if>>男
             </label>
             <label class="checkbox-inline">
                <input type="radio" id="inlineCheckbox2" name="sex" value="0" <c:if test="${user.sex == 0}">checked="checked"</c:if>>女
             </label>
      </div>
  </div>
  <div class="control-group" id="ckMonth">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>出生日期</label>
      <div class="controls">
      	<!-- 格式化日期 -->
      	<fmt:formatDate value="${user.birthday}" type="date" pattern="yyyy-MM-dd" var="birthday"/>
        <input type="text" placeholder="2015/08/25" class="input-medium" value="${birthday}" id="datetimepicker2" name="birthday" datatype="*" errormsg="请选择出生日期！"> 
         <span class="label">请选择出生日期!</span>
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>用户电话</label>
      <div class="controls">
         <input type="tel" name="cellphone" class="input-medium" value="${user.cellphone}" datatype="m" nullmsg="请输入手机号码！" errormsg="请输入手机号码！">
         <span class="label">手机号码格式例如:137 **** 4510!</span>
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>用户名</label>
      <div class="controls">
          <input type="text" class="input-medium" name="login_username" value="${user.login_username}"  datatype="s6-18" nullmsg="请输入用户名！" errormsg="用户名至少6个字符,最多18个字符！">
          <span class="label">用户名至少6个字符,最多18个字符！</span>
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"> <span style="color:red;">*&nbsp;</span>密码</label>
      <div class="controls">
          <input type="password" class="input-medium" name="login_pwd" value="${user.login_pwd}" plugin="passwordStrength" datatype="*6-18" nullmsg="请输入密码！" errormsg="密码至少6个字符,最多18个字符！" name="password">
          <span class="label">密码至少6个字符,最多18个字符！</span>
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"> <span style="color:red;">*&nbsp;</span>确认密码</label>
      <div class="controls">
          <input type="password" class="input-medium" value="${user.login_pwd}" recheck="login_pwd" datatype="*6-18" nullmsg="请确认密码！" errormsg="两次输入的密码不一致！">
      </div>
  </div>
  <div class="control-group" id="ckMonth">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>入职时间</label>
      <div class="controls">
      	<!-- 格式化日期 -->
      	<fmt:formatDate value="${user.entrytime}" type="date" pattern="yyyy-MM-dd" var="entrytime"/>
        <input type="text" placeholder="2015/08/21" class="input-medium" name="entrytime" value="${entrytime}" id="datetimepicker3" datatype="*" errormsg="请选择入职时间！"> 
      </div>
  </div>
   <div class="control-group">
      <label class="control-label"> <span style="color:red;">*&nbsp;</span>所在部门</label>
      <div class="controls">
               <div class="btn-group">
               <input type="hidden" id="dept_id" value="${user.dept.id}"/>
               <select class="selectpicker" data-style="btn-primary" name="dept.id" id="department" value="${user.dept.id}" style="width: 150px;height: 30px;">
               </select>
                <span class="label">请选择所在部门</span>
               </div>
           </div>
   </div>
   <div class="control-group">
    <label class="control-label"> <span style="color:red;">*&nbsp;</span>角色</label>
    <div class="controls">
             <div class="btn-group"> 
             <input type="hidden" id="role_id" value="${user.role.id}"/>
             <select class="selectpicker" data-style="btn-primary" name="role.id" id="role" value="${user.role.id}" style="width: 150px;height: 30px;">
             </select>
              <span class="label">请选择角色</span>
             </div>
         </div>
   </div>
  <div class="control-group" style="width: 300px;float: left;" id="butt">
      <div class="controls">
          <button type="submit" class="btn btn-primary">提交审核</button>
      </div>
  </div>
  <div class="control-group" style="float: left; margin-left:40px;">
      <div class="controls" style=" margin-left:140px;">
          <a id="back" href="javascript(0)" class="btn btn-primary">返回首页</a>
      </div>
  </div>
 </form>
 </div>
 <!--表单-->
<!--内容结束-->
<!--尾部开始-->
  <div class="clear"></div> 
  <div class="Footer">
   <p>哈尔滨市交通基础设施投资建设管理有限公司 版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;技术支持：鑫联华</p>
 </div>
<!--尾部结束-->
<script type="text/javascript" src="js/from/Validform_v5.3.2_min.js"></script>
<script type="text/javascript" src="js/from/passwordStrength-min.js"></script>
<script type="text/javascript" src="js/from/jquery.datePicker-min.js"></script>
<script type="text/javascript" src="js/from/jquery.datetimepicker.js"></script>  
<script type="text/javascript" src="js/user/register.js"></script>  
</body>
</html>
