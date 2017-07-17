<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@ include file="../head.jsp"%>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/title/table.css">
	<link href="${pageContext.request.contextPath}/resources/css/index.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.2.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/ajaxupload.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/lib.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/init.js"></script>
 
<!--导航结束-->
<!--内容开始-->
<div class="main-right">
<ol class="breadcrumb">
    <li>当前位置:</li>
    <li>发文管理</li>
    <li class="active">待发公文</li>
</ol>
<form class="form-inline registerform" action = "saveUserInfo" name="form1" method = "post" enctype='multipart/form-data'style="min-height:360px;">
        <table class="table table-hover table-bordered">
            <thead id="backLogList">
	            <tr style="background-color:#EEEEEE;">
	            	<th>序号</th>
	                <th>项目名称</th>
	                <th>用地面积</th>
	                <th>建筑面积</th>
	                <th>层数</th>
	                <th>操作</th>
	                <th>附件</th>
	            </tr>
            </thead>
        </table>
</form>
 <!--表单-->

<!-- 模态框（Modal） -->
<div class="modal fade" id="myModa2" tabindex="-1" role="dialog" 
 aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" id="myModalLabel">
               	查看附件
            </h4>
         </div>
         <div class="modal-body" style=" max-height: 300px;overflow:auto;">	        
            <table class="table table-hover table-bordered">
	            <thead id="content1">
		            <tr style="background-color:#EEEEEE;">
		                <th>选择</th>
		                <th>附件名</th>
		                <th>操作</th>
		            </tr>
	            </thead>
	        </table>
         </div>
         <input type="hidden" id="ruleId"/>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" 
               data-dismiss="modal">关闭
            </button>
         </div>
      </div><!-- /.modal-content -->
</div><!-- /.modal -->
</div>
    </div>
 <!--表单-->
<!--内容结束-->
<!--尾部开始-->
  <div class="clear"></div> 
  <div class="Footer">
   <p>哈尔滨市交通基础设施投资建设管理有限公司 版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;技术支持：鑫联华</p>
 </div>
<!--尾部结束-->
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/build/history_manager.js"></script>
</body>
</html>
