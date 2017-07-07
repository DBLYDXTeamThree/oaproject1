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
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/index.css">
<link rel="stylesheet" type="text/css" href="css/title/Examination1.css">
<!--** 下面的js不能删除袄 这5个是公用的 也不能改袄**-->
<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap-switch.js"></script>
<script type="text/javascript" src="js/lib.js"></script>
<script type="text/javascript" src="js/init.js"></script>

<ol class="breadcrumb">
    <li>
    	<a href="#">当前位置:</a>
    </li>
    
    <li>
    	<a href="#">发文管理</a>
    </li>
    
    <li class="active">通讯录</li>
</ol>

<form id="Form1" action="" method="get">
	<ul class="search">
		<li style="float:left">
			<input type="text" name="realname" id ="realname" placeholder="请输入姓名" class="search_btn" value=""/>
		</li>
	
		<li style="float:left; padding-left:30px;">
		 <input type="submit" id="mailForm" class="btn" value="提交"/> 
		
			
		</li>
	</ul>
</form>
<div class="clear" style="height:10px;"></div>	
<table class="table table-hover table-bordered">
    <thead id="mailList">
     <tr style="background-color:#EEEEEE;">
         <th>姓名</th>
         <th>职务</th>
         <th>手机</th>
         <th>座机</th>
         <th>分机</th>
     </tr>
     <c:forEach items="${maillist}" var="maillist">
          <tr style="background-color:#EEEEEE;">
             <th> ${maillist.realname}</th>
             <th> ${maillist.role.role_caption}</th>
             <th> ${maillist.cellphone}</th>
             <th> ${maillist.telephone}</th>
             <th> ${maillist.telephone_ext}</th>
          </c:forEach>
    </thead>
</table>
<script type="text/javascript">
      $(document).ready(function(){ 
      
            $(".table tr:odd").css("background-color","#fff");
      })
     </script>
<!--尾部开始-->
  <div class="clear"></div> 
  <div class="Footer">
   <p>哈尔滨市交通基础设施投资建设管理有限公司 版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;技术支持：鑫联华</p>
  </div>
<!--尾部结束-->
<script type="text/javascript" src="js/user/mh.js"></script>
 <script src="js/index/responsiveslides.min.js"></script>
 <script src="js/index/slider.js"></script>

 <link rel="stylesheet" type="text/css" href="css/table/table.css">

<!--尾部结束-->
</body>
</html>


