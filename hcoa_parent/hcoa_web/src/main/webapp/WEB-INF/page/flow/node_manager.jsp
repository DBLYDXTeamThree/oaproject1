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
<form class="form-inline registerform" action="" name="form1" method = "post" enctype='multipart/form-data'style="min-height:360px;">
 <ul class="search">
      <li style="float:left; padding-left:30px;"><button class="btn btn1" id="addNode" data-toggle="modal" data-target="#myModal">新增</button></li>
      <li style="float:left; padding-left:30px;"><input type="button" id="delBtn" class="btn btn1" value="删除"></li>
      <div class="clear"></div>
    </ul>
    <input type="hidden" id="projectId" name="projectId" value="${projectId}"/>
        <table class="table table-hover table-bordered">
            <thead id="nodeList">
	            <tr style="background-color:#EEEEEE;">
	                <th>选择</th>
	                <th>序号</th>
	                <th>节点名称</th>
	                <th>备注</th>
	                <th>审批规则定义</th>
	                <th>操作</th>
	            </tr>
            </thead>
        </table>
</form>
<form id="editRuleForm" method="post">
	<input type="hidden" id="nodeId" name="nodeId" value=""/>
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
            </h4>
         </div>
  <form class="form-horizontal registerform" name="addForm" method = "post" enctype='multipart/form-data' style="margin-top: 20px;">
  <input type="hidden" name="project.id" value="${projectId}"/>
  <input type="hidden" name="id" id="node_id" value=""/>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>编号</label>
      <div class="controls">
          <input type="text" id="node_num" name="node_num" class="input-medium">
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>节点名称</label>
      <div class="controls">
          <input type="text"id="node_caption" name="node_caption" class="input-medium">
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>备注</label>
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
<!--内容结束-->
<!--尾部开始-->
  <div class="clear"></div> 
  <div class="Footer">
   <p>哈尔滨市交通基础设施投资建设管理有限公司 版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;技术支持：鑫联华</p>
 </div>
<!--尾部结束-->
<script type="text/javascript" src="js/flow/node_manager.js"></script>
</body>
</html>

