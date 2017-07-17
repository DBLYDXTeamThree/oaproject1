3<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">

    <title>交通管理局OA管理平台</title>

    <meta name="pragma" content="no-cache">
    <meta name="cache-control" content="no-cache">
    <meta name="expires" content="0">
    <meta charset="utf-8">
    <style type="text/css">
        #divv{
            border:3px solid;
            border-color:#00ffff;
            background-color:yellow;
            width:350px;
            height:200px;
            opacity: 0.5;
            position:absolute;
            top:500px;
            left:400px;
        }
    </style>

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




	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/title/table.css">
	<link href="${pageContext.request.contextPath}/resources/css/index.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.2.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/ajaxupload.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/lib.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/init.js"></script>
    <script>
        $(
            function ()
            {
                $("#addBtn").click
                (
                    function ()
                    {
                        clear();
                    }
                );

                $("#subBtn").click
                (
                    function ()
                    {
                        var id = $("#dept_id").val();

                        var action = null;

                        if (id)
                        {
                            action = "editDept";
                        }

                        else
                        {
                            action = "addDept";
                        }

                        ajax4Json
                        (
                            action,

                            function (data)
                            {
                                $("#closeBtn").trigger("click");

                            },
                            $("form[name='addForm']").serialize()

                        );
                    }
                );
            }
        );


        function clear()
        {
            $("#dept_id").val("");

            $("#department_caption").val("");

            $("#remark").val("");
        }
    </script>
<script>
    //删除按钮的方法
    function del(){
        alert(1)
    }

    $(function(){


        //关键词提交
        $("#queryBtn").click(function(){
        /* 	$.get("${pageContext.request.contextPath}/deptManagement/getDepts4List",{remark:$("#remark").val()},function(data){
        		
        	}) */
        	
            $.ajax({
                type : "POST",
                url : "${pageContext.request.contextPath}/deptManagement/getDepts4List?remark="+$("#deptName").val(),
                data : JSON.stringify({
                   /*  remark:$("#deptName").val() */
                }),
                dataType : "JSON",
                async : false,
                // 设置请求头信息
                contentType : "application/json;charset=utf-8",
                success : function(data)
                {
                    var thead = $("#deptList").children(":first");
                    $("#deptList").empty();
                    $("#deptList").append(thead);
                    var keyList = ["departmentCaption", "remark"];
                    $.each
                    (
                        data,
                        function(i,e)
                        {
                            var dept = data[i];
                            var tr = createDataRow(dept, keyList, false).append(
                                "<th>" +
                                "<button class='btn btn-primary moreinfo' type='button' data-toggle='modal' data-target='#myModa2'>详情</button>&nbsp;" +
                                "<button class='btn btn-primary delBtn' type='button'>删除</button>" +
                                "</th>"
                            );
                            $("#deptList").append(tr);
                        }
                    );
                    //  eq  gt  lt
                    $(".table tr:gt(0)").css("background-color","#fff");
                },
                error : function()
                {
                    console.error("ajax error!");
                }
            }); 
        })

        //详情按钮点击事件
        $(".moreinfo").click
        (
            function ()
            {
                /*$.each($(this).parent().siblings(),function(){
                    alert($(this).text())
                })*/
                $("#dept_id").val($(this).attr("id"));

                $("#department_caption").val($(this).parent().siblings().filter(":eq(0)").text());

                $("#remark").val($(this).parent().siblings().filter(":eq(1)").text());

                //更新部门描述
                $("#btn").click(function(){

                    if($("#department_caption").val()==""){
                        alert("名字不能为空！！！")
                    }else{
                    /* 	$.get("${pageContext.request.contextPath}/deptManagement/updateDept",{id:$("#dept_id"),departmentCaption:$("#department_caption"),remark:$("#remark").val()},function(data){
                    		if(data){
                                //关闭浮动div
                                $("#closeBtn").trigger("click");
                                window.location.reload()
                            }
                            if(data==false){
                                alert("此名字已存在")
                            }
                    	}) */
                     $.ajax({
                        type : "POST",
                        url : "${pageContext.request.contextPath}/deptManagement/updateDept",
                        data : JSON.stringify({
                            id:$("#dept_id").val(),
                            departmentCaption:$("#department_caption").val(),
                            remark:$("#remark").val(),
                        }),
                        dataType : "JSON",
                        async : false,
                        // 设置请求头信息
                        contentType : "application/json;charset=utf-8",
                        success :function (data) {
                          if(data){
                              //关闭浮动div
                              $("#closeBtn").trigger("click");
                              window.location.reload()
                          }
                          if(data==false){
                              alert("此名字已存在")
                          }
                        },
                    });
 
                    }
                })
            }
        );
        $("#addBtn").click(function(){
            $("#btn").click(function(){
                if($("#department_caption").val()==""){
                    alert("名字不能为空！！！")
                }else{
               /*  	$.get("${pageContext.request.contextPath}/deptManagement/addDept",{departmentCaption:$("#department_caption").val(),remark:$("#remark").val()},function(data){
                		 if(data){
                             //关闭浮动div
                             $("#closeBtn").trigger("click");
                             window.location.reload()
                         }
                         if(data==false){
                             alert("此名字已存在")
                         }
                	}) */
                      $.ajax({
                        type : "POST",
                        url : "${pageContext.request.contextPath}/deptManagement/addDept?id="+$("#dept_id").val()+"&departmentCaption="+$("#department_caption").val()+"&remark="+$("#remark").val(),
                        data : {
                            /* id:$("#dept_id").val(),
                            departmentCaption:$("#department_caption").val(),
                            remark:$("#remark").val(), */
                        },
                        dataType : "JSON",
                        async : false,
                        // 设置请求头信息
                        contentType : "application/json;charset=utf-8",
                        success :function (data) {
                            if(data){
                                //关闭浮动div
                                $("#closeBtn").trigger("click");
                                window.location.reload()
                            }
                            if(data==false){
                                alert("此名字已存在")
                            }
                        },
                    }); 

                } 
            })
        })

        //删除
        $("button[id=delete]").each(function () {
            $(this).click(function () {
            	
            	console.log(JSON.stringify({
                    id:$(this).val(),
                }));
            	
            /* 	$.get("${pageContext.request.contextPath}/deptManagement/delDept",{id:$(this).val()},function(data){
            		if(data){
                        //关闭浮动div
                        $("#closeBtn").trigger("click");
                        window.location.reload()
                    }
                    if(data==false){
                        alert("此部门存在人员,不可删除")
                    }
            	}) */
            	
                $.ajax({
                    type : "POST",
                    url : "${pageContext.request.contextPath}/deptManagement/delDept?id="+$(this).val(),
                    data : JSON.stringify({
                      /*   id:$(this).val(), */
                    }),
                    dataType : "JSON",
                    async : false,
                    // 设置请求头信息
                   // contentType : "application/json;charset=utf-8",
                    success :function (data) {
                        if(data){
                            //关闭浮动div
                            $("#closeBtn").trigger("click");
                            window.location.reload()
                        }
                        if(data==false){
                            alert("此部门存在人员,不可删除")
                        }
                    },
                }); 
              
            })

        })




    })

</script>
  
<!--导航结束-->
<!--内容开始-->
<div class="main-right">
<ol class="breadcrumb">
    <li><a href="#">当前位置:</a></li>
    <li><a href="#">系统设置</a></li>
    <li class="active">部门管理</li>
</ol>
    <form id="queryForm"  action="" method="get">
     <ul class="search">
      <li style="float:left; padding-left:30px; padding-right: 20px;">
      	<button class="btn btn1" id="addBtn" data-toggle="modal" data-target="#myModa2">新增</button>
      </li>
      
      <li style="float:left">关键词：<input type="text" id="deptName" name="deptName" class="search_btn" value=""></li>
      <li style="float:left; padding-left:30px;">
			<input type="button" id="queryBtn" class="btn" value="提交"/>
		</li>
    </ul>
    <div class="clear" style="height:10px;"></div>
    </form>
    <form id="editForm" method="post">
    	<input type="hidden" id="deptid" name="id"/>
    </form>
        <table class="table table-hover table-bordered">
            <thead id="deptList">
	            <tr style="background-color:#EEEEEE;">
	                <th>部门名</th>
	                <th>描述</th>
	                <th>操作</th>
	            </tr>
            <c:forEach items="${list}" var="l">
                <tr>
                    <th>${l.departmentCaption}</th>
                    <c:choose>
                        <c:when test="${l.remark==null||''.equals(l.remark)}">
                            <th>无</th>
                        </c:when>
                        <c:otherwise>
                            <th>${l.remark}</th>
                        </c:otherwise>
                    </c:choose>
                    <%--<c:if test=""><th>无</th></c:if>
                    <c:if test="${l.remark!=null}"><th>${l.remark}</th></c:if>--%>
                    <th><button id="${l.id}" class="btn btn-primary moreinfo" type="button" data-toggle="modal" data-target="#myModa2">详情</button>&nbsp;
                        <button id="delete"   class="btn btn-primary delBtn" value="${l.id}" type="button">删除</button>
                        <%--<a href="/delDept/${l.id}" class="btn btn-primary delBtn" >删除</a>--%>
                        <%--<input type="hidden" value="${l.id}">--%>
                    </th>
                </tr>
            </c:forEach>
            </thead>
        </table>

    <%--<!-- 确认框   create by wcr-->

    <div id="divv" style="display: none">
        <div style="float: right;">
            <input style="color: white;background-color:red" id="btn2" type="button" value="×">
        </div>
            <span>确认删除吗?</span>
        <input id="del_confirm" type="button" value="确定">
        <input id="del_cancel" type="button" value="取消">
    </div>--%>
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
  <input type="hidden" id="dept_id" name="id" value="${id}"/>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>部门名</label>
      <div class="controls">
          <input type="text" id="department_caption" name="department_caption" value="${department_caption}" class="input-medium">
      </div>
  </div>

  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>描述</label>
      <div class="controls">
         <textarea id="remark" name="remark" value="${remark}"></textarea>
      </div>
  </div>
  </form>
         <div class="modal-footer">
            <button type="button" id="closeBtn" class="btn btn-default btn1" 
               data-dismiss="modal">关闭
            </button>
            <button id="btn" type="button" class="btn btn-primary" id="subBtn">
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
<%--<script type="text/javascript" src="${pageContext.request.contextPath}/js/dept/dept_manager.js"></script>--%>
</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/dept/dept_manager.js"></script>