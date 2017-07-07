<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@ include file="../head.jsp"%>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" media="screen" href="css/jquery.datetimepicker.css">  
<link rel="stylesheet" type="text/css" href="css/lanrenzhijia_2.css" />
<link rel="stylesheet" type="text/css" href="css/datePicker.css" >
<!--***这里是单独调用的css文件***-->
<link rel="stylesheet" type="text/css" href="css/index/demo.css">
<link rel="stylesheet" type="text/css" href="css/index/index1.css">
<link rel="stylesheet" type="text/css" href="css/index/From.css">
<link rel="stylesheet" type="text/css" href="css/index/index.css" />
<!--** 下面的js不能删除袄 这5个是公用的 也不能改袄**-->
<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap-switch.js"></script>
<script type="text/javascript" src="js/lib.js"></script>
<script type="text/javascript" src="js/init.js"></script>
<script type="text/javascript" src="js/Validform_v5.3.2_min.js"/>
<script type="text/javascript" src="js/user/user_manager.js"></script>
<script type="text/javascript" src="js/user/mh.js"></script>

<!--面包屑导航-->
<ol class="breadcrumb">
	<li>
		<a href="#">当前位置:</a>
	</li>
	
	<li>
		<a href="#">发文管理</a>
	</li>
	
	<li class="active">待发公文</li>
</ol>
<!--面包屑导航-->

<!--表单-->
<form class="form-horizontal insertdata_dictionary" action="" 
		name="form1" method="get" enctype='multipart/form-data'>
		<input type="hidden" id="state" value="${state }"/>
		<input type="hidden" id="id" value="${id }"/>
		<c:choose>
		<c:when test="${state =='0'}">
		
	<div class="control-group">
	    <label class="control-label">
	    	<span style="color:red;">*&nbsp;</span>类别ID
	    </label>
	    
	    <div class="controls">
	        <input type="text" name="tid" class="input-medium" datatype="*" 
	        		nullmsg="请输入类别ID！" />
	        	
	        
	    </div>
	</div>
	
	
	
	
	
	<div class="control-group">
	    <label class="control-label">
	    	<span style="color:red;">*&nbsp;</span>显示文本
	    </label>
	    
	   <div class="controls">
	        <input type="text" name="display_text" class="input-medium" datatype="*" 
	        		nullmsg="请输入显示文本！" />
	        	
	        
	    </div>
	</div>
	
	<div class="control-group">
	    <label class="control-label">
	    	<span style="color:red;">*&nbsp;</span>后台值
	    </label>
	    
	   <div class="controls">
	        <input type="text" name="display_value" class="input-medium" datatype="*" 
	        		nullmsg="请输入后台值！" />
	        	
	        
	    </div>
	</div>
	
	<div class="control-group">
	    <label class="control-label">
	    	<span style="color:red;">*&nbsp;</span>备注
	    </label>
	    
	   <div class="controls">
	        <input type="text" name="remark" class="input-medium"  />
	        	
	        
	    </div>
	</div>
	</c:when>
<c:otherwise>
		<div class="control-group">
	    <label class="control-label">
	    	<span style="color:red;">*&nbsp;</span>类别ID
	    </label>
	    
	    <div class="controls">
	        <input type="text" name="tid" class="input-medium" value="${data_dictionary.tid }" datatype="*" 
	        		nullmsg="请输入类别ID！" />
	        	
	        
	    </div>
	</div>
	
	
	
	
	
	<div class="control-group">
	    <label class="control-label">
	    	<span style="color:red;">*&nbsp;</span>显示文本
	    </label>
	    
	   <div class="controls">
	        <input type="text" name="display_text" class="input-medium" value="${data_dictionary.display_text }" datatype="*" 
	        		nullmsg="请输入显示文本！" />
	        	
	        
	    </div>
	</div>
	
	<div class="control-group">
	    <label class="control-label">
	    	<span style="color:red;">*&nbsp;</span>后台值
	    </label>
	    
	   <div class="controls">
	        <input type="text" name="display_value" class="input-medium" value="${data_dictionary.display_value }" datatype="*" 
	        		nullmsg="请输入后台值！" />
	        	
	        
	    </div>
	</div>
	
	<div class="control-group">
	    <label class="control-label">
	    	<span style="color:red;">*&nbsp;</span>备注
	    </label>
	    
	   <div class="controls">
	        <input type="text" name="remark" class="input-medium" value="${data_dictionary.remark }"  />
	        	
	        
	    </div>
	</div>
	</c:otherwise>
  </c:choose>
	
	
	<div class="control-group" style="width: 300px;float: left;" id="butt">
	    <div class="controls">
	        <button type="submit" id="subBtn" class="btn btn-primary">提交审核</button>
	    </div>
	</div>
	
	<div class="control-group" style="float: left; margin-left:40px;">
	    <div class="controls" style=" margin-left:140px;">
	        <a id="back" href="getForums" class="btn btn-primary">返回首页</a>
	    </div>
	</div>
</form>
<!--表单-->
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





<script type="text/javascript" src="js/forum/insertdata_dictionary.js"></script>
 <script src="js/index/responsiveslides.min.js"></script>
 <script src="js/index/slider.js"></script>


 <link rel="stylesheet" type="text/css" href="css/table/table.css">

<!--尾部结束-->
</body>
</html>


