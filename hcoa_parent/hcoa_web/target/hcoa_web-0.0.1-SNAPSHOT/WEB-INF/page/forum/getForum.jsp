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
<script type="text/javascript" src="js/user/user_manager.js"></script>
<script type="text/javascript" src="js/user/mh.js"></script>
<script type="text/javascript" src="js/forum/forum.js"></script>
<script type="text/javascript" src="js/lib.js"></script>
<script type="text/javascript" src="js/init.js"></script>

<!--面包屑导航-->
  <ol class="breadcrumb">
    <li><a href="#">当前位置:</a></li>
    <li><a href="#">职工社区</a></li>
    <li class="active">职工论坛</li>
  </ol>
<!--面包屑导航-->
<!--表单-->
<!--<li style="float:left; padding-left:60px;"><input type="submit" class="btn btn1" value="发帖"></li>  -->

<form class="form-inline registerform" name="form1" method = "post" enctype='multipart/form-data'style="min-height:360px;">
<ul class="search">
 <li id="li" style="float:left; padding-left:50px;"><button class="btn btn1 add" id="add" data-toggle="modal" >发帖</button></li>  
 
      
      
      <div class="clear"></div>
    </ul>
    <div class="clear" style="height:10px;"></div>
	<input type="hidden" name="role_id" id="role_id" value="${role_id }"/>
        <table class="table table-hover table-bordered">
            <thead id="forum">
            <tr style="background-color:#EEEEEE;">
            
                <th>ID</th>
                <th>标题</th>
                <th>发帖内容</th>
                <th>发帖人</th>
                <th>发帖时间</th>
                <th>操作</th>
            </tr>
             <c:forEach items="${forumlist}" var="forumlist">
	          <tr style="background-color:#EEEEEE;">
	             <th> ${forumlist.id}</th>
	             <th title="${forumlist.caption}">
	             	${fn:substring(forumlist.caption,0,5) }
	             	<c:if test="${fn:length(forumlist.caption) > 5 }">
						...
    	   		 	</c:if>
	             </th>
	            <th title="${forumlist.content}">
	              	${fn:substring(forumlist.content,0,20) }
           <c:if test="${fn:length(forumlist.content) > 20 }">
				...
      	    </c:if>
	              </th>
	             <th> ${forumlist.user.realname}</th>
	             <th><fmt:formatDate value="${forumlist.createtime }" pattern="yyyy-MM-dd HH:mm:ss"/>  </th>
				 <th><a href="detailForum?id=${forumlist.id }" >回复</a>&nbsp;<a href="delForum?id=${forumlist.id}" onclick="return confirm('确定删除吗?');" >删帖</a>&nbsp;</th>
				 </tr>
	          </c:forEach>
            </thead>
        </table>
</form>

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
 <script src="js/index/responsiveslides.min.js"></script>
 <script src="js/index/slider.js"></script>

 <link rel="stylesheet" type="text/css" href="css/table/table.css">

<!--尾部结束-->
</body>
</html>

