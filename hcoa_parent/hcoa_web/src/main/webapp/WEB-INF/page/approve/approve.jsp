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
<link rel="stylesheet" type="text/css" href="css/bootstrap-combined.min.css">  
<link rel="stylesheet" type="text/css" href="css/title/table.css">
<link href="css/index.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/lib.js"></script>
<script type="text/javascript" src="js/init.js"></script>

<!--导航结束-->
<!--内容开始-->
<ol class="breadcrumb">
    <li><a href="#">当前位置:</a></li>
    <li class="active">审核列表</li>
</ol>
    <form action="getApprove" method="post">
     <ul class="search">
      <li style="float:left">
       </li>
      <li style="float:left">关键词：<input type="text"  name="titleMh" class="search_btn" value></li>
      <li style="float:left; padding-left:30px;"><input type="submit" value="查询"></a></li>
    </ul>
        <table class="table table-hover table-bordered">
 <thead>
            <tr style="background-color:#EEEEEE;">
                <th>送审信息</th>
                <th>审批人</th>
                <th>审批级别</th>
                <th>审批轮次</th>
                <th>审批意见</th>
                <th>审批时间</th>
                <th>操作状态</th>
            </tr>
            <c:forEach items="${approvelist1}" var="approve">
               <tr style="background-color:#EEEEEE;">
               
                <th>${approve.deliver_approve.deliver_id}</th>
                <th>${approve.realname}</th>
                <th>${approve.approve_level}</th>
                <th>${approve.approve_cycle_time}</th>
                <th>${approve.approve_suggestion}</th>
                <th>  <fmt:formatDate value="${approve.approve_datetime}" pattern="yyyy-MM-dd HH:mm:ss"/></th>
              
                <th>${approve.operation_status}</th>
            </tr>
          </c:forEach>
            
            </thead>
        </table>
        
        <ul class="pagination">
        <span>第${page.pageNo }页，共${page.totalPageNumber }页，每页${page.pageSize }条</span>
        
        <c:choose>
					<c:when test="${page.hasPrev }">
						
						<a href="<%=request.getContextPath()%>/getApprove?pageNo=${page.prePage}&titleMh=${titleMh}">&laquo;</a>
					</c:when>
					<c:otherwise>
					  <li><a href="javascript:void(0)">&laquo;</a></li>
  
					</c:otherwise>
				</c:choose>
				
				<c:choose>
					<c:when test="${page.hasNext }">
						<a href="<%=request.getContextPath()%>/getApprove?pageNo=${page.nextPage}&titleMh=${titleMh}">&raquo;</a>
						
					</c:when>
					<c:otherwise>
						
                       <li><a href="javascript:void(0)">&raquo;</a></li>
					</c:otherwise>
				</c:choose>
</ul>
    </form>
    </div>
  <script type="text/javascript">
      $(document).ready(function(){ 
            $(".table tr:odd").css("background-color","#fff");
            
      });
      
      
      </script>

<!--内容结束-->
<!--尾部开始-->
  <div class="clear"></div> 
  <div class="Footer">
   <p>哈尔滨市交通基础设施投资建设管理有限公司 版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;技术支持：鑫联华</p>
 </div>
<!--尾部结束-->
</body>
</html>