<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ include file="../head.jsp"%>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/dispatch/From.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/dispatch/jquery.datetimepicker.css">  
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/dispatch/demo.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/dispatch/from_1.css" >
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/dispatch/datePicker.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/index.css" >
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap-switch.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/lib.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/init.js"></script>

<!--导航结束-->
<!--内容开始-->
<div class="main-right">
<!--面包屑导航-->
  <ol class="breadcrumb">
    <li>当前位置:</li>
    <li>发文管理</li>
    <li class="active">新建立项</li>
  </ol>
<!--面包屑导航-->
<div id="data"></div>
<!--表单-->
<form class="form-horizontal registerform" name="form1" method = "post" action="addBuild_project" enctype='multipart/form-data'>
  <!--<ul class="search">
      <li style="float:left; padding-left:90px; padding-bottom:30px;"><button class="btn btn1" data-toggle="modal" data-target="#myModal">申请立项送审</button></li>
      <div class="clear"></div>
    </ul>  -->
  
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>项目名称</label>
      <div class="controls">
          <input type="text" class="input-medium" name="caption" datatype="*" nullmsg="请输入项目名称！" errormsg="请输入项目名称!" style="width:245px;">
        
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>具体地点</label>
      <div class="controls">
          <input type="text" name="address" class="input-medium" style="width:245px;">
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>用地面积</label>
      <div class="controls">
          <input type="text" name="area" class="input-medium"  style="width:245px;">
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>建筑面积</label>
      <div class="controls">
          <input type="text" name="buildArea" class="input-medium"  style="width:245px;">
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>层数</label>
      <div class="controls">
          <input type="text" name="floorNum" class="input-medium"  style="width:245px;">
      </div>
  </div>

  <div class="control-group">
      <label class="control-label"><span style="color:red;">&nbsp;</span>环评</label>
      <div class="controls">
          <input type="text" class="input-medium flow-node"  style="width:245px;" node-id="1" node-name="环评" data-toggle="modal" data-target="#myModal" id="env_checkName">
      	  <input type="hidden" value="" name="envCheck">
      </div>
  </div>

  <div class="control-group">
      <label class="control-label"><span style="color:red;">&nbsp;</span>立项</label>
      <div class="controls">
          <input type="text" class="input-medium flow-node"  style="width:245px;" node-id="2" node-name="立项" data-toggle="modal" data-target="#myModal" id="myModal_2">
          <input type="hidden" value="" name="buildPro">
      </div>
  </div>


  <div class="control-group">
      <label class="control-label"><span style="color:red;">&nbsp;</span>节能</label>
      <div class="controls">
          <input type="text" class="input-medium flow-node"  style="width:245px;" node-id="3" node-name="节能" data-toggle="modal" data-target="#myModal" id="myModal_3">
          <input type="hidden" value="" name="keepEng">
      </div>
  </div>

  <div class="control-group">
      <label class="control-label"><span style="color:red;">&nbsp;</span>可研</label>
      <div class="controls">
          <input type="text" class="input-medium flow-node"  style="width:245px;" node-id="4" node-name="可研" data-toggle="modal" data-target="#myModal" id="myModal_4">
          <input type="hidden" value="" name="shouldResearch">
      </div>
  </div>

  <div class="control-group">
      <label class="control-label"><span style="color:red;">&nbsp;</span>初步设计</label>
      <div class="controls">
          <input type="text" class="input-medium flow-node"  style="width:245px;" node-id="5" node-name="初步设计" data-toggle="modal" data-target="#myModal" id="myModal_5">
          <input type="hidden" value="" name="firstDesign">
      </div>
  </div>

  <div class="control-group">
      <label class="control-label"><span style="color:red;">&nbsp;</span>选址意见书</label>
      <div class="controls">
          <input type="text" class="input-medium flow-node"  style="width:245px;" node-id="6" node-name="选址意见书" data-toggle="modal" data-target="#myModal" id="myModal_6">
          <input type="hidden" value="" name="chooseFiles">
      </div>
  </div>

  <div class="control-group">
      <label class="control-label"><span style="color:red;">&nbsp;</span>建设用地规划许可证</label>
      <div class="controls">
          <input type="text" class="input-medium flow-node"  style="width:245px;" node-id="7" node-name="建设用地规划许可证" data-toggle="modal" data-target="#myModal" id="myModal_7">
          <input type="hidden" value="" name="areaPlanAgree">
      </div>
  </div>

  <div class="control-group">
      <label class="control-label"><span style="color:red;">&nbsp;</span>建设用地批准书</label>
      <div class="controls">
          <input type="text" class="input-medium flow-node"  style="width:245px;" node-id="8" node-name="建设用地批准书" data-toggle="modal" data-target="#myModal" id="myModal_8">
          <input type="hidden" value="" name="areaAgree">
      </div>
  </div>

  <div class="control-group">
      <label class="control-label"><span style="color:red;">&nbsp;</span>建设工程规划许可证</label>
      <div class="controls">
          <input type="text" class="input-medium flow-node"  style="width:245px;" node-id="9" node-name="建设工程规划许可证" data-toggle="modal" data-target="#myModal" id="myModal_9">
          <input type="hidden" value="" name="buildProjectAgree">
      </div>
  </div>

  <div class="control-group">
      <label class="control-label"><span style="color:red;">&nbsp;</span>施工许可证</label>
      <div class="controls">
          <input type="text" class="input-medium flow-node" style="width:245px;" node-id="10" node-name="施工许可证" data-toggle="modal" data-target="#myModal" id="myModal_10">
          <input type="hidden" value="" name="kickOffAgree">
      </div>
  </div>
  
  <div class="control-group" style="width: 300px;float: left;" id="butt">
      <div class="controls">
          <input type="submit" class="btn btn-primary" id="savebuild111" value="提交立项">
      </div>
  </div>

  <div class="control-group" style="float: left; margin-left:40px;">
      <div class="controls" style=" margin-left:140px;">
          <a id="back" href="getBuild_projects" class="btn btn-primary">返回</a>
      </div>
  </div>
  </div>
  
 </form>
 <!--表单-->
<!--内容结束-->
<!--尾部开始-->
  <div class="clear"></div> 
  <div class="Footer">
   <p>哈尔滨市交通基础设施投资建设管理有限公司 版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;技术支持：鑫联华</p>
 </div>
<!--尾部结束-->

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
            <button type="button" class="btn btn-default" 
               data-dismiss="modal">关闭
            </button>
            <button type="button" class="btn btn-primary" id="subBtn" data-dismiss="modal">
               提交更改
            </button>
         </div>
      </div><!-- /.modal-content -->
</div><!-- /.modal -->
</div><!-- 模态框结束 -->


<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/from/Validform_v5.3.2_min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/from/passwordStrength-min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/from/jquery.datePicker-min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/from/jquery.datetimepicker.js"></script>  
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/from/from_1.js"></script>  
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/build/build_dispatch.js"></script>
</body>
</html>
