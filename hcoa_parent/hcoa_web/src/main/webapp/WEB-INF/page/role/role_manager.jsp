<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<script type="text/javascript">
		/* function ajax4Json(url, datas)
		{
			$.ajax({
				type : "POST",
	
				url : url,
	
				data : datas,
	
				dataType : "JSON",
	
				async : false,
	
				success : function(data)
				{
					window.loaction.reload()
				},
	
				error : function()
				{
					console.error("ajax error!");
				}
			});
		} */
		$(function(){
			$(".moreinfo").click
			(
				function ()
				{
			
					$("#role_id").val($(this).parent().prevAll(".role_id").text());
					
					$("#roleCaption").val($(this).parent().prevAll(".role_caption").text());
					
					$("#remark").val($(this).parent().prevAll(".remark").text());
				}
			);
			$(".delBtn").click
			(
				function ()
				{
					if(confirm('确实要删除该客户吗?')) {	
						$.ajax({
					        type: "get",
					        url: "<%=basePath%>delRole",
					        data: {id: $(this).parent().prevAll(".role_id").text()},
					        async : false,
					        dataType: "json",
					        success: function (data){
					        	alert("删除成功");
					        	if(data=="success")
					        	window.location.reload(true) ;
					        }
					  });	
					}
				}
			);
			$("#subBtn").click
			(
				function ()
				{
					var id = $("#role_id").val();
					
					var action = null;
					
					if (id)
					{
						action = "<%=basePath%>editRole";
					}
					
					else
					{
						action = "<%=basePath%>addRole";
					}
					$.ajax({
				        type: "POST",
				        url: action,
				        data: $("form[name='addForm']").serialize(),
				        async : false,
				        dataType: "json",
				        success: function (data){
				        	confirm("保存成功");
				        	if(data=="success")
				        		window.location.reload(true);
				        }
					});
				}
			);
			$("#addBtn").click
			(
				function ()
				{
					clear();
				}
			);
			function clear()
			{
				$("#role_id").val("");
				
				$("#roleCaption").val("");
				
				$("#remark").val("");
			}
			<%-- $("#queryBtn").click
			(
				function ()
				{
					
					
					$.ajax({
				        type: "POST",
				        
				        url: "<%=basePath%>searchRole",
				        
				        data: {sea : $("#searchBtn").val()},
				        
				        async : false,
				        
				        dataType: "json",
				        
				        success: function (data){
				        	
				        	$(data).each(function(){
				        		alert(data)
				        		$("#roleList").append(
				        				
				        		"<th style='display:none' class='role_id'>"+this.id+"</th>"+
				        		
								"<th class='role_caption'>"+this.roleCaption+"</th>"+
								
								"<th class='remark'>"+this.remark+"</th>"+
								
								"<th><button class='btn btn-primary moreinfo' type='button' data-toggle='modal' data-target='#myModa2' type='button'>详情</button>&nbsp;" +
								
								"<button class='btn btn-primary delBtn' type='button'>删除</button></th>" 
								);
							})
				        	
				        	
				        	
				        	
				        	/* var thead = $("#roleList").children(":first");

							$("#roleList").empty();

							$("#roleList").append(thead);

							var roleList = data["roleList"];
							
							var keyList = ["role_caption", "remark"];

							$.each
							(
								roleList,

								function(i)
								{
									var role = roleList[i];
									
									var tr = createDataRow(role, keyList, false).append
									(
										"<th>" +
										"<button class='btn btn-primary moreinfo' type='button' data-toggle='modal' data-target='#myModa2' type='button'>详情</button>&nbsp;" +
										"<button class='btn btn-primary delBtn' type='button'>删除</button>" +
										"</th>"
									)

									$("#roleList").append(tr);
								}
							); */
				        }
					}); 
				}
			); --%>
		})
	</script>
	<style> 
	    tr{ background: #EEEEEE;} 
	    tr:nth-child(2n){ background: rgb(255, 255, 255);} 
	    tr{ background-color: expression((this.sectionRowIndex % 2 == 0) ?   "#EEEEEE" : "rgb(255, 255, 255)" );} 
	</style>
<!--导航结束-->
<!--内容开始-->
<div class="main-right">
<ol class="breadcrumb">
    <li><a href="#">当前位置:</a></li>
    <li><a href="#">发文管理</a></li>
    <li class="active">待发公文</li>
</ol>
    <form id="queryForm"  action="<%=basePath %>searchRole" method="get">
     <ul class="search">
     <li style="float:left; padding-left:30px; padding-right: 20px;">
      	<button class="btn btn1" id="addBtn" data-toggle="modal" data-target="#myModa2">新增</button>
      </li>
      <li style="float:left">关键词：<input id="searchBtn" type="text" name="roleName" class="search_btn" ></li>
      <li style="float:left; padding-left:30px;">
			<input type="submit" id="queryBtn" class="btn" value="提交"/>
	</li>
    </ul>
    <div class="clear" style="height:10px;"></div>
    </form>
    <form id="editForm" method="post">
    	<input type="hidden" id="roleid" name="id"/>
    </form>
        <table class="table table-hover table-bordered" style="font-family: '黑体'">
            <thead id="roleList">
	            <tr style="background-color:#EEEEEE;">
	                <th>角色名</th>
	                <th>描述</th>
	                <th>操作</th>
	            </tr>
	            <c:forEach items="${roleSet }" var="rs">
				<tr>
					<th style="display:none" class="role_id">${rs.id}</th>
					<th class="role_caption">${rs.roleCaption}</th>
					<th class="remark">${rs.remark}</th>
					<th><button class="btn btn-primary moreinfo" type="button" data-toggle="modal" data-target="#myModa2" type="button">详情</button>&nbsp;
						<button class="btn btn-primary delBtn" type="button">删除</button></th>
				</tr>
			</c:forEach>
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
          <input type="text" id="roleCaption" name="roleCaption" class="input-medium">
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
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/role/role_manager.js"></script> --%>
</body>
</html>
