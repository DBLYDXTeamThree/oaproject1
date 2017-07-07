<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ include file="../head.jsp"%>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/title/table.css">
	<link href="css/index.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/ajaxupload.js"></script>
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
     <li style="float:left; padding-left:30px; padding-right: 20px;">
      	<button class="btn btn1" id="addBtn" data-toggle="modal" data-target="#myModa2">新增</button>
      </li>
      <li style="float:left">关键词：<input type="text" name="roleName" class="search_btn" value></li>
      <li style="float:left; padding-left:30px;">
			<input type="button" id="queryBtn" class="btn" value="提交"/>
	</li>
    </ul>
    <div class="clear" style="height:10px;"></div>
    </form>
    <form id="editForm" method="post">
    	<input type="hidden" id="roleid" name="id"/>
    </form>
        <table class="table table-hover table-bordered">
            <thead id="roleList">
	            <tr style="background-color:#EEEEEE;">
	                <th>角色名</th>
	                <th>描述</th>
	                <th>操作</th>
	            </tr>
            </thead>
        </table>
        
                <!-- 模态框（Modal） -->
<div class="modal fade" id="myModa2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" id="myModalLabel">
            </h4>
         </div>
  <form class="form-horizontal registerform" name="addForm" method = "post" enctype='multipart/form-data' style="margin-top: 20px;">
  <input type="hidden" id="role_id" name="id"/>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>角色名</label>
      <div class="controls">
          <input type="text" id="role_caption" name="role_caption" class="input-medium">
      </div>
  </div>

  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>描述</label>
      <div class="controls">
         <textarea id="remark" name="remark"></textarea>
      </div>
  </div>
  </form>
         <div class="modal-footer">
            <button type="button" id="closeBtn" class="btn btn-default btn1" 
               data-dismiss="modal">关闭
            </button>
            <button type="button" class="btn btn-primary" id="subBtn">
               保存
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
<script type="text/javascript" src="js/role/role_manager.js"></script>
</body>
</html>
