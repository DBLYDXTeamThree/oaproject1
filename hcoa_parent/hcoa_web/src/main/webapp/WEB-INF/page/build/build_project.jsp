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
<!--** 下面的js不能删除袄是公用的 也不能改袄**-->
<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap-switch.js"></script>
<script type="text/javascript" src="js/ajaxupload.js"></script>
<script type="text/javascript" src="js/lib.js"></script>
<script type="text/javascript" src="js/init.js"></script>
<script type="text/javascript" src="js/build/build_project.js"></script>

   <!--导航结束-->
<!--内容开始-->
<div class="main-right">
<!--面包屑导航-->
  <ol class="breadcrumb">
    <li><a href="#">当前位置:</a></li>
    <li><a href="#">发文管理</a></li>
    <li class="active">发文申请</li>
  </ol>
    <form id="editForm" method="post">
    	<input type="hidden" id="buildid" name="buildid"/>
    </form>
<!--面包屑导航-->
<!--表单-->
<form class="form-inline registerform" action = "saveUserInfo" name="form1" method = "post" enctype='multipart/form-data'style="min-height:360px;">
 
    
        <table class="table table-hover table-bordered">
            <thead>
            <tr style="background-color:#EEEEEE;">
                <th>序号</th>
                <th>项目名称</th>
                <th>用地面积</th>
                <th>建筑面积</th>
                <th>层数</th>
                <th>状态</th>
                <th>附件</th>
                <th>操作</th>
            </tr>
        
            <c:forEach items="${build_projectlist}" var="build_projectlist">
	          <tr style="background-color:#EEEEEE;">
	             <th class="build_projectlist_id" > ${build_projectlist.id}</th>
	             <th title="${build_projectlist.caption}">
	             	${fn:substring(build_projectlist.caption,0,20) }
	             	<c:if test="${fn:length(build_projectlist.caption) > 20 }">
						...
    	   		 	</c:if>
	             </th>
	               <th >
	               	${build_projectlist.area}
	              </th>
	            <th>
	            	${build_projectlist.build_area}
	            </th>
	             <th>
	            	${build_projectlist.floor_num}
	            </th>
	            
	            <th>
	            	<c:if test="${build_projectlist.deliver_approve_flag == 0}">未送审</c:if>
	            	<c:if test="${build_projectlist.deliver_approve_flag == 1}">已送审</c:if>
	            	<c:if test="${build_projectlist.deliver_approve_flag == 2}">处理中</c:if>
	            	<c:if test="${build_projectlist.deliver_approve_flag == 3}">已通过</c:if>
	            	<c:if test="${build_projectlist.deliver_approve_flag == 4}">已退回</c:if>
	            </th>
	              
	              <th><a href='#'  class='editRoles attachBuild' style='color:#666;' data-toggle='modal' data-target='#myModa2'>管理</a></th>
				 <th>
                  <button class="btn btn-primary detail_build" type="button" >详情</button>&nbsp;
                  <c:if test="${build_projectlist.deliver_approve_flag == 0}">
                  	 <button class='btn btn-primary send' type='button' data-toggle='modal' data-target='#myModa3'>送审</button>
                  </c:if>
                 
                  <c:if test="${build_projectlist.deliver_approve_flag == 4}">
                  	 <button class='btn btn-primary send' type='button' data-toggle='modal' data-target='#myModa3'>重新送审</button>
                  </c:if>
                </th>
				 </tr>
	          </c:forEach>
           
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
               	附件管理
            </h4>
         </div>
         <div class="modal-body" style=" max-height: 300px;overflow:auto;">
         	<form action="upload" id="uploadForm" method="post" enctype="multipart/form-data">
         	
	         	<ul class="search" style="margin-bottom: 20px;">
		          <li style="float:left; padding-left:10px;">
		          	<input type="button" id="button" value="上传附件" style="background-image: -webkit-linear-gradient(top, #ffffff, #e6e6e6); border: 1px solid #ccc; height:30px;padding: 2px 12px;"/>
		          </li>
		          
		          <li style="float:left; padding-left:10px;">
		          	<input type="button" id="delBtn" value="删除" style="background-image: -webkit-linear-gradient(top, #ffffff, #e6e6e6); border: 1px solid #ccc; height:30px;padding: 2px 12px;"/>
		          </li>
		          
		          <div class="clear"></div>
		        </ul>
	        </form>
	        
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

<!-- 模态框（Modal） -->
<div class="modal fade" id="myModa3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" id="myModalLabel">
               审批操作
            </h4>
         </div>
  <form class="form-horizontal registerform" name="sendForm" method="post" enctype='multipart/form-data' style="margin-top: 20px;">
  
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>描述</label>
      <div class="controls">
         <textarea style="width:90%; height:70px;" name="remark" id="remark"></textarea>
      </div>
  </div>
  </form>
         <div class="modal-footer">
            <button type="button" class="btn btn-default btn1" 
               data-dismiss="modal">关闭
            </button>
            <button type="button" class="btn btn-primary" id="subBtn" data-dismiss="modal">
               	送审
            </button>
         </div>
      </div><!-- /.modal-content -->
   </div><!-- /.modal -->
    </div>
    </div>



  
<!--内容结束-->
<!--尾部开始-->
  <div class="clear"></div> 
  <div class="Footer">
   <p>哈尔滨市交通基础设施投资建设管理有限公司 版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;技术支持：鑫联华</p>
 </div>
<!--尾部结束-->

  <script type="text/javascript">
      $(document).ready(function(){ 
            $(".table tr:odd").css("background-color","#fff");
      })
      </script>
<script type="text/javascript" src="js/build/sendbuild_project.js"></script>
</body>
</html>
