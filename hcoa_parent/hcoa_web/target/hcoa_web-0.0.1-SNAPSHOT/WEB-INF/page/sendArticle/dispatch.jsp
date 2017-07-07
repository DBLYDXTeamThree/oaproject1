<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ include file="../head.jsp"%>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/dispatch/From.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/dispatch/jquery.datetimepicker.css">  
	<link rel="stylesheet" type="text/css" href="css/dispatch/demo.css">
	<link rel="stylesheet" type="text/css" href="css/dispatch/From_1.css" >
	<link rel="stylesheet" type="text/css" href="css/dispatch/datePicker.css">
	<link rel="stylesheet" type="text/css" href="css/index.css" >
	<link rel="stylesheet" type="text/css" href="css/dispatch/Dispatch.css">
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
    <li class="active">待发公文</li>
  </ol>
<!--面包屑导航-->
<div id="data"></div>
<!--表单-->
<form class="form-inline registerform" name="addForm" method = "post" enctype='multipart/form-data'>
	<input type="hidden" id="article_id" name="id" value="${article.id}"/>
	<input type="hidden" id="article_status" name="deliver_approve_flag" value="${article.deliver_approve_flag}"/>
  <div class="form-group">
      <label class="form-label"><span style="color:red;">*&nbsp;</span>签发</label>
      <div class="controls">
          <input type="text" class="input-medium flow-node" id="dispatcherName" value="${article.dispatcher.realname}" node-id="1" node-name="签发" data-toggle="modal" data-target="#myModal">
          <input type="hidden" value="${article.dispatcher.id}" name="dispatcher.id">
      </div>
  </div>
  <div class="form-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>审核</label>
      <div class="controls">
          <input type="text" class="input-medium flow-node" id="checkerName" value="${article.checker.realname}" data-toggle="modal" node-id="2" node-name="审核" data-target="#myModal" id="myModal_2">
          <input type="hidden" name="checker.id" value="${article.checker.id}">
      </div>
  </div>
  <div class="form-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>会签</label>
      <div class="controls">
         <input type="tel" class="input-medium flow-node" id="unitSignName" value="${article.unit_sign.realname}" data-toggle="modal" node-id="3" node-name="会签" data-target="#myModal" id="myModal_3">
         <input type="hidden" name="unit_sign.id" value="${article.unit_sign.id}">
      </div>
  </div>
  <div class="form-group">
      <label class="control-label"> <span style="color:red;">*&nbsp;</span>主办部门</label>
      <div class="controls">
               <div class="btn-group">
               <input type="hidden" id="dept_id" value="${article.dept.id}"/>
               <select class="selectpicker" id="department" name="dept.id" value="${article.dept.id}"  data-style="btn-primary" style="width: 150px; height: 30px;">
               </select>
               </div>
           </div>
   </div>
   <div class="form-group">
      <label class="form-label"><span style="color:red;">*&nbsp;</span>核稿</label>
      <div class="controls">
          <input type="text" class="input-medium flow-node" id="checkArticleName" value="${article.check_article.realname}" data-toggle="modal" node-id="4" node-name="核稿" data-target="#myModal" id="myModal_4">
          <input type="hidden" name="check_article.id" value="${article.check_article.id}">
      </div>
  </div>
  <div class="form-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>拟稿人</label>
      <div class="controls">
          <input type="text" name="drafter" value="${article.drafter}" class="input-medium">
      </div>
  </div>
  <div class="form-group">
      <label class="control-label"> <span style="color:red;">*&nbsp;</span>秘密等级</label>
      <div class="controls">
               <div class="btn-group"> 
               <select class="selectpicker" data-style="btn-primary" name="secret_level" value="${article.secret_level}" style="width: 150px;height: 30px;">
                      <option value="1" <c:if test="${article.secret_level == 1}">selected="selected"</c:if>>1</option>
                      <option value="2" <c:if test="${article.secret_level == 2}">selected="selected"</c:if>>2</option>
                      <option value="3" <c:if test="${article.secret_level == 3}">selected="selected"</c:if>>3</option>
               </select>
               </div>
           </div>
   </div>
  <div class="form-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>联系电话</label>
      <div class="controls">
          <input type="text" name="cellphone" value="${article.cellphone}" class="input-medium">
      </div>
  </div>
  <div class="form-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>文件标题</label>
      <div class="controls">
          <input type="text" name="caption" value="${article.caption}" class="input-medium">
      </div>
  </div>
  
  <div class="form-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>哈交投</label>
      <div class="controls">
          <input type="text" name="file_num" value="${article.file_num}" class="input-medium">
      </div>
  </div>
  
  <div class="form-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>抄送</label>
      <div class="controls">
          <input type="text" name="cc" value="${article.cc}" class="input-medium">
      </div>
  </div>
    <div class="form-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>主题词</label>
      <div class="controls">
          <input type="text" name="subject" value="${article.subject}" class="input-medium">
      </div>
  </div>
  <div class="form-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>打字</label>
      <div class="controls">
          <input type="text" name="typer" value="${article.typer}" class="input-medium">
      </div>
  </div>
  <div class="form-group">
      <label class="control-label"> <span style="color:red;">*&nbsp;</span>校对</label>
      <div class="controls">
          <input type="text" name="check_confirm" value="${article.check_confirm}" class="input-medium" value="">
      </div>
  </div>
  <div class="form-group">
      <label class="control-label"> <span style="color:red;">*&nbsp;</span>份数</label>
      <div class="controls">
          <input type="text" name="copies" value="${article.copies}" class="input-medium">
      </div>
  </div>
  <div class="form-group" id="ckMonth">
      <label class="form-label"><span style="color:red;">*&nbsp;</span>撰写日期</label>
      <div class="controls">
      	<fmt:formatDate value="${article.createtime}" type="date" pattern="yyyy-MM-dd" var="createtime"/>
        <input type="text" name="createtime" value="${createtime}" placeholder="2015/08/25" class="input-medium" id="datetimepicker2"> 
      </div>
  </div>
   <div class="clear"></div>
  <div class="form-group" style="width: 300px;float: left;" id="butt">
      <div class="controls controls1">
          <button type="button" id="saveBtn" class="btn btn-primary">保存</button>
          <input type="hidden" id="publish_flag" name="publish_flag"/>
      </div>
  </div>
  <div class="form-group" style="float: left; margin-left:40px;">
      <div class="controls controls1" >
          <a id="backBtn" class="btn btn-primary">返回</a>
      </div>
  </div>
 </form>
 <!--表单-->
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" 
   aria-labelledby="myModalLabel" aria-hidden="true">
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
         <div class="modal-body" style=" max-height: 300px;overflow:auto;">
         <!-- <ul class="search" style="margin-bottom: 20px;">
          <li style="float:left">关键词：<input type="text" class="search_btn" value style="height:30px;" id="seach_vla"></li>
          <li style="float:left; padding-left:10px;"><input type="submit" class="btn" style="background-image: -webkit-linear-gradient(top, #ffffff, #e6e6e6); border: 1px solid #ccc; height:30px;padding: 2px 12px;" id="seach" value="搜索"></li>
          <div class="clear"></div>
        </ul> -->
            <table class="table table-hover table-bordered">
            <thead id="content1">
            <tr style="background-color:#EEEEEE;">
                <th>选择</th>
                <th>人员姓名</th>
                <th>部门</th>
            </tr>
            </thead>
        </table>
         </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" id="closeBtn"
               data-dismiss="modal">关闭
            </button>
            <button type="button" class="btn btn-primary" id="subBtn" data-dismiss="modal">
              	 提交更改
            </button>
         </div>
      </div><!-- /.modal-content -->
</div><!-- /.modal -->
<!--表单-->
 </div>
<!--内容结束-->
<!--尾部开始-->
  <div class="clear"></div> 
  <div class="Footer">
   <p>哈尔滨市交通基础设施投资建设管理有限公司 版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;技术支持：鑫联华</p>
 </div>
<!--尾部结束-->
<script type="text/javascript" src="js/from/Validform_v5.3.2_min.js"></script>
<script type="text/javascript" src="js/from/passwordStrength-min.js"></script>
<script type="text/javascript" src="js/from/jquery.datePicker-min.js"></script>
<script type="text/javascript" src="js/from/jquery.datetimepicker.js"></script>  
<script type="text/javascript" src="js/sendArticle/dispatch.js"></script>  
</body>
</html>
