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
    <form id="editForm" method="post">
    	<input type="hidden" id="articleid" name="articleid"/>
    </form>
        <table class="table table-hover table-bordered">
            <thead id="articleList">
	            <tr style="background-color:#EEEEEE;">
	            	<th>序号</th>
	                <th>文件标题</th>
	                <th>签发</th>
	                <th>会签</th>
	                <th>审核</th>
	                <th>核稿</th>
	                <th>主办部门</th>
	                <th>拟稿人</th>
	                <th>附件</th>
	                <th>详情</th>
	                <th>送审状态</th>
	                <th>送审</th>
	            </tr>
            </thead>
        </table>
        
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
 <!--表单-->
<!--内容结束-->
<!--尾部开始-->
  <div class="clear"></div> 
  <div class="Footer">
   <p>哈尔滨市交通基础设施投资建设管理有限公司 版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;技术支持：鑫联华</p>
 </div>
<!--尾部结束-->
<script type="text/javascript" src="js/sendArticle/article_manager_all.js"></script>
</body>
</html>
