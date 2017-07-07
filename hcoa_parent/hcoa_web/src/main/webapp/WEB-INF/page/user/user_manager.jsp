<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ include file="../head.jsp"%>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap-combined.min.css">  
	<link rel="stylesheet" type="text/css" href="css/title/table.css">
	<link href="css/index.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/lib.js"></script>
	<script type="text/javascript" src="js/init.js"></script>

<!--导航结束-->
<!--内容开始-->
<div class="main-right">
<ol class="breadcrumb">
    <li><a href="#">当前位置:</a></li>
    <li><a href="#">发文管理</a></li>
    <li class="active">待发公文</li>
</ol>
    <form id="queryForm"  action="" method="get">
     <ul class="search">
      <li style="float:left">
        <select class="selectpicker" data-style="btn-primary" name="deptId" id="department"  style="width: 150px;height: 30px;margin-right: 20px;margin-left: 30px;">
        	<option value="-1">全部</option>
        </select></li>
      <li style="float:left">关键词：<input type="text" name="realname" class="search_btn" value></li>
      <li style="float:left; padding-left:30px;">
			<input type="button" id="queryBtn" class="btn" value="提交"/>
		</li>
    </ul>
    </form>
    <form id="editForm" method="post">
    	<input type="hidden" id="userid" name="id"/>
    </form>
        <table class="table table-hover table-bordered">
            <thead id="userList">
	            <tr style="background-color:#EEEEEE;">
	                <th>用户名</th>
	                <th>姓名</th>
	                <th>手机</th>
	                <th>部门</th>
	                <th>年龄</th>
	                <th>性别</th>
	                <th>状态</th>
	                <th>操作</th>
	            </tr>
            </thead>
        </table>
    </div>
 <!--表单-->
<!--内容结束-->
<!--尾部开始-->
  <div class="clear"></div> 
  <div class="Footer">
   <p>哈尔滨市交通基础设施投资建设管理有限公司 版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;技术支持：鑫联华</p>
 </div>
<!--尾部结束-->
<script type="text/javascript" src="js/user/user_manager.js"></script>
</body>
</html>
