<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
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
	<script type="text/javascript" src="js/lib.js"></script>
	<script type="text/javascript" src="js/init.js"></script>

   <!--导航结束-->
<!--内容开始-->
<div class="main-right">
<!--面包屑导航-->
  <ol class="breadcrumb">
    <li><a href="#">当前位置:</a></li>
    <li><a href="#">发文管理</a></li>
    <li class="active">发文申请</li>
  </ol>
<!--面包屑导航-->
<!--表单-->
<form class="form-inline registerform" name="form1" method = "post" enctype='multipart/form-data'style="min-height:360px;">
 <ul class="search">
      <li style="float:left; padding-left:30px;"><button class="btn btn1" id="addRule" data-toggle="modal" data-target="#myModal">新增</button></li>
      <div class="clear"></div>
    </ul>
    <input type="hidden" id="nodeId" name="nodeId" value="${nodeId}"/>
        <table class="table table-hover table-bordered">
            <thead id="ruleList">
	             <tr style="background-color:#EEEEEE;">
	                <th>规则名称</th>
	                <th>审批级别</th>
	                <th>审批角色</th>
	                <th>操作</th>
	            </tr>
            </thead>
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
               新增审批项目
            </h4>
         </div>
  <form class="form-horizontal registerform" name="addForm" method = "post" enctype='multipart/form-data' style="margin-top: 20px;">
  <input type="hidden" name="node.id" value="${nodeId}"/>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>规则名称</label>
      <div class="controls">
          <input type="text" name="rule_caption" class="input-medium">
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>审批级别</label>
      <div class="controls">
          <input type="text" name="approve_level" class="input-medium">
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
               	角色选择
            </h4>
         </div>
         <div class="modal-body" style=" max-height: 300px;overflow:auto;">
            <table class="table table-hover table-bordered">
            <thead id="content1">
	            <tr style="background-color:#EEEEEE;">
	                <th>选择</th>
	                <th>角色名</th>
	            </tr>
            </thead>
        </table>
         </div>
         <input type="hidden" id="ruleId"/>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" 
               data-dismiss="modal">关闭
            </button>
            <button type="button" class="btn btn-primary" id="selRoleBtn" data-dismiss="modal">
               提交更改
            </button>
         </div>
      </div><!-- /.modal-content -->
</div><!-- /.modal -->
</div>
<!--内容结束-->
<!--尾部开始-->
  <div class="clear"></div> 
  <div class="Footer">
   <p>哈尔滨市交通基础设施投资建设管理有限公司 版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;技术支持：鑫联华</p>
 </div>
<!--尾部结束-->
<script type="text/javascript" src="js/flow/rule_manager.js"></script>
</body>
</html>

