<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML>
<html>
	<head>
    	<!-- <base href="http://localhost:8080/base/"> -->
    
    	<title>交通管理局OA管理平台</title>
    
		<meta name="pragma" content="no-cache">
		<meta name="cache-control" content="no-cache">
		<meta name="expires" content="0">
		<meta charset="utf-8"> 
		
	</head>
	
	<body>
		<div class="Content">
		
			<!--头部开始-->
			<div class="Header">
			</div>
		
<!--导航开始-->
<nav class="navbar-inverse" role="navigation">
  <div>
   <ul class="nav nav-pills">
     
   </ul>
  </div>
</nav>
<!--导航结束-->


<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap-combined.min.css">  
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/title/table.css">
<link href="${pageContext.request.contextPath}/resources/css/index.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/lib.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/init.js"></script>
    <script>
        $(function(){
            $(".look").click(function(){
                var $this=$(this);
                //查询文件
                $.ajax({
                    type : "POST",
                    url : "${pageContext.request.contextPath}/selectFile",
                    data : JSON.stringify({
                        id:$this.parent().siblings().filter(":eq(0)").text(),
                    }),
                    dataType : "JSON",
                    async : false,
                    // 设置请求头信息
                    contentType : "application/json;charset=utf-8",
                    success :function (data) {
                        var thead = $("#content1").children(":first");
                        $("#content1").empty();
                        $("#content1").append(thead);
                        var createname=data[0];
                        $.each
                        (data, function (i, e) {
                                $("#content1").append(
                                    "<tr style='background-color:#EEEEEE;'>" +
                                    "<th><input type='checkbox'></th>" +
                                    "<th>" + e.fileName + "</th>" +
                                    "<th><button class='btn btn-primary'' type='submit'>下载</button></th>" +
                                    "</tr>"
                                );
                            /*alert(e.createByName);*/
                            }
                        );
                        $("#caption").val($this.parent().siblings().filter(":eq(1)").text());
                        $("#checkname").val(createname.createByName);
                    }
                })
                 $("#Submit").click(function(){

                       $.ajax({
                          type:"post",
                          url:"${pageContext.request.contextPath}/saveUserInfo",
                          data:JSON.stringify({
                              id:$this.parent().siblings().filter(":eq(0)").text(),
                              remark:$("#textarea").val()
                          }),
                          dataType : "JSON",
                          async : false,
                          // 设置请求头信息
                          contentType : "application/json;charset=utf-8",
                          success : function(data){
                              window.location.reload();
                          }
                      })
                    } 
                );
            })


        })

    </script>
    <!--导航结束-->
    <!--内容开始-->
    <div class="main-right">
        <!--面包屑导航-->
        <ol class="breadcrumb">
            <li><a href="#">当前位置:</a></li>
            <li><a href="#">公示信息</a></li>

        </ol>
        <!--面包屑导航-->
        <!--表单-->
        <form class="form-inline registerform" action = "saveUserInfo" name="form1" method = "post" enctype='multipart/form-data'style="min-height:360px;">
            <table class="table table-hover table-bordered">
                <thead>
                <tr style="background-color:#EEEEEE;">
                    <th>序号</th>
                    <th>主题</th>
                    <th>最后审批人</th>
                    <th>部门</th>
                    <th>附件</th>
                  <%--  <th>操作</th>--%>
                </tr>

                <%--动态表格--%>
                <c:forEach items="${list}" var="l">
                    <c:if test="${l.caption!=null&&l.caption!=''}">
                   <%-- <c:if test="${l.checker!=null&&l.mainDept!=null}">--%>
                        <tr style="background-color:#EEEEEE;">
                            <th id="listid">${l.id}</th>
                            <th>${l.caption}</th>
                            <c:if test="${l.checkerName1!=null}"> <th>${l.checkerName1}</th></c:if>
                            <c:if test="${l.checkerName1==null}"> <th><i>未审核</i></th></c:if>
                            <th>${l.deptName}</th>
                            <th> <c:if test="${l.result==true}">
                                <button id="btn" class="btn btn-primary look" type="button" data-toggle="modal" data-target="#myModa2">查看</button>
                            </c:if>
                            <c:if test="${l.result==false}">
                                <span>无</span>
                            </c:if></th>
                           <%-- <th><button  class="btn btn-primary" type="submit"
                                        <c:if test="${l.deliverApproveFlag!=0}">
                                            <c:if test="${l.deliverApproveFlag!=3}">
                                                disabled="true"
                                            </c:if>
                                        </c:if>
                            >修改</button></th>--%>
                        </tr>
                    </c:if>
                    <%--</c:if>--%>
                </c:forEach>


                </thead>
            </table>
        </form>
        <!--表单-->

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
                            审批操作
                        </h4>
                    </div>
                    <form id="form" class="form-horizontal registerform" action = "saveUserInfo" name="form1" method = "post" enctype='multipart/form-data' style="margin-top: 20px;">
                        <div class="control-group">
                            <label class="control-label"><span style="color:red;">*&nbsp;</span>主题</label>
                            <div class="controls">
                                <input type="text" id="caption" class="input-medium" readonly="yes"  style="width:90%;">
                            </div>
                            <input type="hidden" id="sendArticleId">
                        </div>
                        <div class="control-group">
                            <label class="control-label"><span style="color:red;">*&nbsp;</span>发起人</label>
                            <div class="controls">
                                <input type="text" id="checkname" class="input-medium"  readonly="yes">
                            </div>
                        </div>
                        <div class="control-group" style=" max-height: 200px;overflow:auto;">
                            <table class="table table-hover table-bordered" style="width: 90%;margin: 0 auto;">
                                <thead id="content1">
                                <tr style="background-color:#EEEEEE;">
                                    <th>选择</th>
                                    <th>文件名</th>
                                    <th>下载</th>
                                </tr>
                                </thead>
                            </table>
                        </div>

                        <%--<div class="control-group">
                            <label class="control-label"><span style="color:red;">*&nbsp;</span>性别</label>
                            <div class="controls">
                                <label class="checkbox-inline">
                                    <input type="radio" name="sex"  value="option1">男
                                </label>
                                <label class="checkbox-inline">
                                    <input type="radio" name="sex"  value="option2">女
                                </label>
                            </div>
                        </div>--%>
                        <%--<div class="control-group">
                            <label class="control-label"><span style="color:red;">*&nbsp;</span>描述</label>
                            <div class="controls">
                                <textarea id="textarea" style="width:90%; height:70px;"></textarea>
                            </div>
                        </div>--%>
                    </form>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default btn1"
                                data-dismiss="modal">关闭
                        </button>
                        <button type="button" class="btn btn-primary" id="Submit" data-dismiss="modal">
                            <%--提交更改--%> 确定
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
    </div>
</div>
        <!--尾部结束-->
        <script type="text/javascript">
            $(document).ready(function(){
                $(".table tr:odd").css("background-color","#fff");
            })
        </script>
</body>
</html>