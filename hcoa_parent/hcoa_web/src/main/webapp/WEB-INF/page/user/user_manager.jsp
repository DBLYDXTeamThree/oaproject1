<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ include file="../head.jsp"%>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/bootstrap-combined.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/title/table.css">
<link href="${pageContext.request.contextPath}/resources/css/index.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/lib.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/init.js"></script>
<%-- <script type="text/javascript">
		function selectStaff(id){
			$.post("<%=basePath%>hcoa_web/user_manager2",{"departMentCaptionId":id},function(){
				window.location.reload();
			});
		}
	</script> --%>
	<script type="text/javascript">
		<%-- function  selectBI(){
			 $.ajax({
			        type: "get",
			        url: "<%=basePath%>user_manager2",
			        data: {"id":$("#department").val()},
			        async : false,
			        dataType: "json",
			        success: function (data){
			        	window.location.reload(true);
			        }
			  });
			  document.getElementById("selectById").submit();
		} --%>
		 $(function(){
			 /* $("#department").change(function(){  
		            $("#selectById").submit();  
		       }) */
		     $(".moreinfo").click(function (){
			    	 $("#editForm").attr("action","<%=basePath%>editUser");
					 $("#userid").attr("value",$(this).parent().prevAll(".sid").text());
					 $("#editForm").submit();
					}
			);
			 $(".fire").click
				(
					function ()
					{
						if (confirm("确定要停用该用户么？"))
						{
							$.ajax({
						        type: "POST",
						        url: "<%=basePath%>fireUser",
						        data: {id: $(this).parent().prevAll(".sid").text()},
						        async : false,
						        dataType: "json",
						        success: function (data){
						        	alert("操作成功");
						        	if(data=="success")
						        	window.location.reload(true);
						    	}
							});
						}
					}
				);
			 $("#department1").change(function(){
				 $("#selectById").attr("action","<%=basePath%>searchDept");
				 $("#hi").attr("value",$("#department1").val());
				 $("#selectById").submit();
			 })
		 })
	</script>
	<style> 
	    tr{ background: #EEEEEE;} 
	    tr:nth-child(2n){ background: rgb(255, 255, 255);} 
	    tr{ background-color: expression((this.sectionRowIndex % 2 == 0) ?   "#EEEEEE" : "rgb(255, 255, 255)" );} 
	</style>
<!--

//-->
<!--导航结束-->
<!--内容开始-->
<div class="main-right">
	<ol class="breadcrumb">
		<li><a href="#">当前位置:</a></li>
		<li><a href="#">发文管理</a></li>
		<li class="active">待发公文</li>
	</ol>
	<form id="selectById"  method="get">
		<input type="hidden" id="hi" name="id">
	</form>
	<form id="queryForm" action="<%=basePath %>searchStaff" method="get">
		<ul class="search">
			<li style="float: left">
			<select class="selectpicker"
				data-style="btn-primary" name="deptId" id="department1"
				style="width: 150px; height: 30px; margin-right: 20px; margin-left: 30px;">
					<option value="-1">全部</option>
					<c:forEach items="${depts }" var="dept" varStatus="i">
						<option value="${dept.id}" ${dept.id==did?"selected":""} >${dept.departmentCaption}</option>
					</c:forEach>
			</select>
			</li>
			<li style="float: left">关键词：<input type="text" name="realname"
				class="search_btn" value></li>
			<li style="float: left; padding-left: 30px;"><input
				type="submit" id="queryBtn" class="btn" value="提交" /></li>
		</ul>
	</form>
	<form id="editForm" method="post">
		<input type="hidden" id="userid" name="id" />
	</form>
	<table class="table table-hover table-bordered">
		<thead id="userList">
			<tr style="background-color: #EEEEEE;">
				<th>用户名</th>
				<th>姓名</th>
				<th>手机</th>
				<th>部门</th>
				<th>生日</th>
				<th>性别</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${staffInfo }" var="siv">
				<tr> 
					<th style="display:none" class="sid">${siv.id}</th>
					<th id="login_username">${siv.loginUsername}</th>
					<th id="realname">${siv.realname}</th>
					<th id="cellphone">${siv.cellphone}</th>
					<th id="deptname">${siv.dept.departmentCaption}</th>
					<th id="birth"><fmt:formatDate value="${siv.birthday}" type="date"
							dateStyle="long" /></th>
					<th id="sex"><c:if test="${siv.sex=='1'}">男</c:if> <c:if
							test="${siv.sex=='0'}">女</c:if></th>
					<th id="status"><c:if test="${siv.status=='1'}">在职</c:if> <c:if
							test="${siv.status=='0'}">离职</c:if></th>
					<th><button class='btn btn-primary moreinfo' type='submit'>详情</button>&nbsp;
						<button class='btn btn-primary fire' type='submit'>停用</button></th>
				</tr>
			</c:forEach>
		</thead>
	</table>
</div>
<!--表单-->
<!--内容结束-->
<!--尾部开始-->
<div class="clear"></div>
<div class="Footer">
	<p>哈尔滨市交通基础设施投资建设管理有限公司
		版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;技术支持：鑫联华</p>
</div>
<!--尾部结束-->
<%-- <script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/user/user_manager.js"></script> --%>
</body>
</html>
