<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@ include file="../head.jsp"%>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/index.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/Examination1.css">
	<!--** 下面的js不能删除袄是公用的 也不能改袄**-->
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
    <li><a href="#">当前位置:</a></li>
    <li><a href="#">发文管理</a></li>
    <li class="active">发文申请</li>
  </ol>
<!--面包屑导航-->
<!--表单-->
<form class="form-inline registerform" action="" name="form1" method = "post" enctype='multipart/form-data'style="min-height:360px;">
 <ul class="search">
      <li style="float:left; padding-left:30px;"><button class="btn btn1" id="addProject" data-toggle="modal" data-target="#myModal">新增</button></li>
      <li style="float:left; padding-left:30px;"><input type="button" id="delBtn" class="btn btn1" value="删除" ></li>
      <div class="clear"></div>
    </ul>
        <table class="table table-hover table-bordered">
            <thead id="projectList">
	            <tr style="background-color:#EEEEEE;">
	                <th>选择</th>
	                <th>项目流程名称</th>
	                <th>发起时间</th>
	                <th>发起部门</th>
	                <th>发起人</th>
	                <th>节点定义</th>
	                <th>操作</th>
	            </tr>
	            
       <c:forEach items="${pf }" var ="x" varStatus="xxx">
       <c:if test="${xxx.count%2==1 }"><tr style="background-color:#ffffff;"></c:if>
	    <c:if test="${xxx.count%2==0 }"><tr style="background-color:#eeeeee;"></c:if>
	                <th><input type="checkbox" name="check" value="${x.id }" id="check">
	                
	                </th>
	                <th>${x.caption }</th>
	                
	                <th><fmt:formatDate value="${x.createtime }" pattern="yyyy-MM-dd HH:mm:ss"/>
	                </th>
	                <th>${x.dept.departmentCaption }</th>
	                <th>${x.si.realname }</th>
	                <th><a href="node_manager?id=${x.id }" id="nodemanager111">节点定义</a></th>
	                <th>
	                <button id="edit" class="btn btn-primary editBtn" data-toggle="modal" data-target="#myModal">修改</button> 
	                    <input type="hidden" value="${x.id}" id="lid">
	                    <input type="hidden" value="${x.caption }">
                        <input type="hidden" value="${x.si.realname}">
                        <input type="hidden" value="${x.tableName}">
                        <input type="hidden" value="${x.content}">

	                </th>
	             
	            </c:forEach> 
	        </thead>
        </table>          
</form>
<form id="editNodeForm" method="post">
	<input type="hidden" id="projectId" name="projectId"/>
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
  <form class="form-horizontal registerform" action="" name="editForm" method = "post" enctype='multipart/form-data' style="margin-top: 20px;">
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>项目名称</label>
      <div class="controls">
      	  <input type="hidden" name="id" id="project_id" value=""/>
          <input type="text" name="caption" id="caption"  class="input-medium"/>
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>发起人</label>
      <div class="controls">
      	<input type="hidden" name="createby" id="createby" value=""/>
      	<input type="hidden" name="createDept" id="create_dept" value=""/>
        <input type="text" class="input-medium" id="username" value="">
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>表名</label>
      <div class="controls">
         <input type="text" id="table_name" name="tableName" value="" class="input-medium" />
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>描述</label>
      <div class="controls">
         <textarea id="content" name="content" value=""></textarea>
      </div>
  </div>
  </form>
         <div class="modal-footer">
         
            <button type="button" id="closeBtn" class="btn btn-default btn1" 
               data-dismiss="modal">关闭
            </button>
            <button type="submit" class="btn btn-primary" id="subBtn">
               提交更改
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
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/flow/flow_manager.js"></script> --%>
<script>
$(function(){
	
	   
 $("#delBtn").click(function(){
    var s=[]; var i=0;
    $("#check:checked").each(function(){
        s[i++]=$(this).val();
    })
    //alert(s);
    $.ajax({
        type: "POST",
        url: "${pageContext.request.contextPath}/delProject",
        data: JSON.stringify({
            ids:s
        }),
        dataType: "JSON",
        async: false,
        // 设置请求头信息
        contentType: 'application/json;charset=utf-8',
        success: function (data) {
            if (data) {
                //关闭浮动div
                $("#closeBtn").trigger("click");
                window.location.reload()
            }
            if (data == false) {
                alert("删除失败");
            }
        },
    });
   })
   //alert(s);
    

	 
	$("button[id='edit']").each(function(){
		
        $(this).click(function(){
        	
        	 var id1=$(this).next().val();
        	 var caption1= $(this).next().next().val();
             var name1= $(this).next().next().next().val();
             var tableName1= $(this).next().next().next().next().val();
             var content1= $(this).next().next().next().next().next().val();
             
       
             //alert(id1+name1+tableName1+content1)
             $("#myModalLabel").text("修改审批项目");
             $("#username").val(name1);
             $("#table_name").val(tableName1);
             $("#content").html(content1);
             $("#caption").attr("readonly","readonly");
             $("#username").attr("readonly","readonly");
            

            $("#subBtn").click(function() {
                if ($("#table_name").val() == "") {
                    alert("请输入表名"+" "+content1);
                } else {
                    $.ajax({
                        type: "POST",
                        url: "${pageContext.request.contextPath}/projectedit",
                        data: JSON.stringify({
                            id: id1,
                            caption:caption1,
                            name: name1,
                            tableName: tableName1,
                            content: content1
                        }),
                      
                        dataType: "JSON",
                        async: false,
                        // 设置请求头信息
                        contentType: 'application/json;charset=utf-8',
                        success: function (data) {
      
                        	if (data) {
                                //关闭浮动div
                                $("#closeBtn").trigger("click");
                                window.location.reload()
                            }
                            if (data == false) {
                                alert("修改失败");
                            }
                        },
                    });
                }
            })
        })
    })

    $("#addProject").click(function () {
        $("#caption").attr("readonly",null);
        $("#username").attr("readonly",null);
        $("#caption").val("");
        $("#username").val("");
        $("#table_name").val("");
        $("#content").html("");
      
        $("#subBtn").click(function(){
        	  //alert("hah ");
            if($("#caption").val()==""||$("#username").val()==""||$("#table_name").val()=="") {
            	 alert("请输入项目名称或发起人或表名");
            }else{
                $.ajax({
                    type : "POST",
                    url : "${pageContext.request.contextPath}/addProject",
                    data : JSON.stringify({
                        caption:$("#caption").val(),
                        name:$("#username").val(),
                        tableName:$("#table_name").val(),
                        content:$("#content").val()
                    }),
                    dataType : "JSON",
                    async : false,
                    // 设置请求头信息
                    contentType: 'application/json;charset=utf-8',
                    success:function (data) {
                        if(data){
                            //关闭浮动div
                            $("#closeBtn").trigger("click");
                            window.location.reload()
                        }
                        if(data==false){
                            alert("项目流程名称已存在或不是正确的发起人");
                        }
                    },
                });
            }
        })
    })
  
});
</script>
</body>
</html>

