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
	  <c:forEach items="${fn }" var = "m" varStatus="xxx">
        <c:if test="${xxx.count%2==1 }"><tr style="background-color:#ffffff;"></c:if>
	    <c:if test="${xxx.count%2==0 }"><tr style="background-color:#eeeeee;"></c:if>
	                <th><input type="checkbox" name="check" value="${m.id }" id="check"></th>
	                <th>${m.nodeNum }</th>
	                <th>${m.nodeCaption }</th>
	                <th>
                      <c:if test="${m.remark!=null}">${m.remark}</c:if>
                            <c:if test="${m.remark==null}">无</c:if>
                    
                    </th>
	                <th>
	                <a href="rule_manager?flag=${m.id }" id="rulemanager111">审批规则定义</a>
	              
	                </th>
	                <th>
	                <button class="btn btn-primary editBtn" data-toggle="modal" data-target="#myModal" id="editnode">修改</button>
	                <input type="hidden" value="${m.id}" id="jid">
                <input type="hidden" value="${m.nodeNum }" id="nodeNum">
	                <input type="hidden" value="${m.nodeCaption }" id="nodeCaption">
	                </th>
	            </tr>
	  </c:forEach>         
            </thead>
        </table>
</form>
<form id="editRuleForm" method="post" name="flag">
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
  <input type="hidden" name="project.id" value="1"/>
  <input type="hidden" name="id" id="node_id" value=""/>
  <input type="hidden" name="approveProjectId" value="${fn[0].approveProjectId}" id="hide"/>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>编号</label>
      <div class="controls">
          <input type="text" id="node_num" name="nodeNum" class="input-medium">
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>节点名称</label>
      <div class="controls">
          <input type="text"id="node_caption" name="nodeCaption" class="input-medium">
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
         <input type="hidden" id="flagvalue" value="${flag }">
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
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/flow/node_manager.js"></script> --%>
<script type="text/javascript">
 $(function(){
	
	 $("#delBtn").click(function(){
	        var s=[]; var i=0;
	        $("#check:checked").each(function(){
	            s[i++]=$(this).val();
	        })
	        $.ajax({
	            type: "POST",
	            url: "${pageContext.request.contextPath}/delNode",
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
	                    alert("修改失败");
	                }
	            },
	        });
	 })
	   $("#addNode").click(function(){
		   $("#myModalLabel").text("新增节点");
		   //alert($("#hide").val())
            $("#node_num").attr("readonly",null);
            $("#node_caption").attr("readonly",null);
            $("#node_num").val("");
            $("#node_caption").val("");
            $("#subBtn").click(function(){
                if($("#node_num").val()==""||$("#node_caption").val()=="") {
                    alert("请输入编号或节点名称");
                }else{
                    $.ajax({
                        type : "POST",
                        url : "${pageContext.request.contextPath}/addNode",
                        data : JSON.stringify({
                            approveProjectId:$("#hide").val(),
                            nodeNum:$("#node_num").val(),
                            nodeCaption:$("#node_caption").val(),
                            remark:$("#remark").val()
                        }),
                        dataType : "JSON",
                        async : false,
                        // 设置请求头信息
                        contentType: "application/json;charset=utf-8",
                        success:function (data) {
                        	
                            if(data){
                                //关闭浮动div
                                $("#closeBtn").trigger("click");
                              window.location.reload();
                            }
                            else{
                                alert("编号或节点名称已存在");
                            }
                        },
                    });
                }
            })
        })
        


         $("button[id=editnode]").each(function(){
        	
        $(this).click(function(){
      
            var id2=$(this).next().val();
            var nodeNum2=$(this).next().next().val();
            var nodeCaption2=$(this).next().next().next().val();


            $("#myModalLabel").text("修改节点定义");
            $("#node_num").val(nodeNum2);
            $("#node_caption").val(nodeCaption2);
            $("#node_num").attr("readonly","readonly");
            $("#node_caption").attr("readonly","readonly");
            $("#subBtn").click(function(){
                $.ajax({
                    type : "POST",
                    url : "${pageContext.request.contextPath}/editNode",
                    data : JSON.stringify({
                        id:id2,
                        nodeNum:nodeNum2,
                        nodeCaption:nodeCaption2,
                        remark:$("#remark").val()
                    }),
                    dataType : "JSON",
                    async : false,
                    // 设置请求头信息
                    contentType: "application/json;charset=utf-8",
                    success:function (data) {
                        if(data){
                            //关闭浮动div
                            $("#closeBtn").trigger("click");
                            window.location.reload()
                        }
                        if(data==false){
                            alert("修改失败");
                        }
                    },
                });
            })
        })
    })
		
});

</script>
</body>                             
</html>

