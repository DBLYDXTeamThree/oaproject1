<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="itcast" uri="http://itcast.cn/common/"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ include file="../head.jsp"%>
		<!--***这里是单独调用的css文件***-->
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/index.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/title/Examination1.css">
		
		
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.2.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap-switch.js"></script>

		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/lib.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/init.js"></script>

<!--导航结束-->

			
			<!--内容开始-->
			<div class="main-right">

<!--面包屑导航-->
  <ol class="breadcrumb"> 
    <li style="color: rgb(0, 0, 0);">当前位置:</li>
    <li style="color: rgb(0, 0, 0);">系统设置</li>
    <li style="color: rgb(0, 0, 0);" class="active">通告管理</li>
  </ol>
<!--面包屑导航-->
<!--表单-->
<form class="form-inline registerform" action = "saveUserInfo" name="form1" method = "post" enctype='multipart/form-data'style="min-height:360px;">

<ul class="search">
    <li style="float:left">
    <li style="float:left">
    <li style="float:left; padding-left:30px;"><button class="btn btn1" data-toggle="modal" data-target="#myModal">新增通告</button></li>
</ul> 
<div class="clear" style="height:10px;"></div>
        <table class="table table-hover table-bordered">
            <thead id="noticeslist">
            <tr style="background-color:#EEEEEE;color: rgb(0, 0, 0);">
                
                <th>ID</th>
                <th>通告标题</th>
                <th>详情</th>
                <th>通告时间</th>
            </tr>
            <c:forEach items="${page.rows}" var="message">
				<tr style="background-color:#EEEEEE;color: rgb(0, 0, 0);">
	                <th>${message.id}</th>
	                <th title="${message.caption }">
		             	${fn:substring(message.caption,0,30) }
		             	<c:if test="${fn:length(message.caption) > 30 }">
							...
	    	   		 	</c:if>
					</th>
	                <!-- <th>${message.content }</th>  -->
	                <th><a href="detail?id=${message.id}">详情</a>|<a onclick="return confirm('你确定删除吗');" href="noticedel?id=${message.id}" >删除</a></th>
	                <th><fmt:formatDate value="${message.createtime }" pattern="yyyy-MM-dd HH:mm:ss"/>  </th>
				</tr>		            
			</c:forEach>	
			
            </thead>
            <itcast:page url="${pageContext.request.contextPath }/getNoticesAdmin" />
        </table>
</form>
 <!--表单-->
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" id="myModalLabel">
               新增通告
            </h4>
         </div>
  <form id=form1 name=form1 class="form-horizontal registerform" action="noticesave?nid=${staff.id }" method = "post" style="margin-top: 20px;">
  <div class="control -group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>通告标题</label>
      <div class="controls">
          <input id="noticeCaption" name="noticeCaption" type="text" class="input-medium" style="width: 80%;">
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>通告内容</label>
      <div class="controls">
         <textarea style="height: 150px; width: 80%;" id="noticeContent" name="noticeContent"></textarea>
      </div>
  </div>
  
           <div class="modal-footer">
            <button type="button" 
            class="btn btn-default btn1" 
               data-dismiss="modal">关闭
            </button>
            <button type="button" class="btn btn-primary" id="Submit" data-toggle="modal" data-target="#myModa2">
               提交更改
            </button>

         </div>
  </form>


  <!-- 加隔行颜色 -->
    <script type="text/javascript">
      $(document).ready(function(){ 
            $(".table tr:odd").css("background-color","#fff");
      })
     </script>

     
            <script>
              $("#Submit").click(function(){
              var title1=$("#noticeCaption").val();
              var title2=$("#noticeContent").val();
              if(title1==""){
				alert("标题不能为空")
				return;
              }else if(title2==""){
				alert("内容不能为空")
				return;
              }else{
              	window.form1.submit();
              }
              })
            </script>
            
            
            
      </div><!-- /.modal-content -->
   </div><!-- /.modal -->
</div>
<!--内容结束-->
		</div>
			<!--内容结束-->
			
			<!--尾部开始-->
			<div class="clear"></div> 
			<div class="Footer">
				<p>哈尔滨市交通基础设施投资建设管理有限公司 版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;技术支持：鑫联华</p>
			</div>
			<!--尾部结束-->

	</body>
</html>
