<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	$(function(){
		$("#delBtn").click
		(
			function ()
			{
				if (confirm("请确认是否要删除这些节点"))
				{
					var checkBoxes = $("#content1 :checkbox");
					
					var checkBox = null;
					
					var idList = [];
					
					$.each
					(
						checkBoxes,
						
						function (i)
						{
							checkBox = $(checkBoxes[i]);
							
							if (checkBox.prop("checked"))
							{
								idList.push(checkBox.parent().parent().data("id"));
							}
						}
					);
					
					ajax4Json
					(
						"delAttachs",
						
						function (data)
						{
							if(date=="success")
								window.location.reload(true)
						},
						
						{idList: idList}
					);
				}
			}
		);
		
		
		$("a[id='look']").each(function(){
			$(this).click(function(){
				loadAttachList($(this).next().val())
			})
			
		})
		
	})
	
	function loadAttachList(id)
	{	
		ajax4Json
		(
			"loadAttachList1?id="+id,

			function (data)
			{
				var thead = $("#content1").children(":first");

				$("#content1").empty();

				$("#content1").append(thead);
				
				var attachList = data["attachList"];
				
				var keyList = ["fileName"];

				$.each
				(
					attachList,

					function(i)
					{
						var attach = attachList[i];
						
						var tr = createDataRow(attach, keyList, true)
						.append
						(
							"<th><a class='download' style='color:#666; cursor:pointer;'>下载</a></th>"
						);

						$("#content1").append(tr);
					}
				);
				
				$(".download").click
				(
					function ()
					{
						download("download", {attachid: $(this).parent().parent().data("id")});
					}
				);
				
				$(".table tr:odd").css("background-color","#fff");
			}
			
			
		)
		}
	
	
   </script>
 
<!--导航结束-->
<!--内容开始-->
<div class="main-right">
<ol class="breadcrumb">
    <li><a href="#">当前位置:</a></li>
    <li><a href="#">发文管理</a></li>
    <li class="active">我的发文</li>
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
	            <c:forEach items="${sa }" var="a" varStatus="s">
	            <c:if test="${s.count%2==1 }"><tr style="background-color:rgb(255,255,255);"></c:if>
	            <c:if test="${s.count%2==0 }"><tr style="background-color:#EEEEEE;"></c:if>
	                <th class="id">${a.id }</th>
	                <th class="caption">
	                <c:if test="${a.caption=='' }">无</c:if>
	                <c:if test="${a.caption!='' }">${a.caption}</c:if>
	                </th>
	                <th class="dispatcher">
	                <c:if test="${a.dispatcherName.realname==null }">无</c:if>
	                <c:if test="${a.dispatcherName.realname!=null }">${a.dispatcherName.realname}</c:if>
	                </th>
	                <th class="unit_sign">
	                <c:if test="${a.unitSignName.realname==null }">无</c:if>
	                <c:if test="${a.unitSignName.realname!=null }">${a.unitSignName.realname}</c:if>
	                </th>
	                <th class="checker">
	                <c:if test="${a.checkerName.realname==null }">无</c:if>
	                <c:if test="${a.checkerName.realname!=null }">${a.checkerName.realname}</c:if>
	                </th>
	                <th class="check_article">
	                <c:if test="${a.checkArticleName.realname==null }">无</c:if>
	                <c:if test="${a.checkArticleName.realname!=null }">${a.checkArticleName.realname}</c:if>
	                </th>
	                <th class="main_dept">${a.department.departmentCaption }</th>
	                <th class="drafter">
	                <c:if test="${a.drafter=='' }">无</c:if>
	                <c:if test="${a.drafter!='' }">${a.drafter}</c:if>
	                </th>
	                <th><a href="#" class="attachManager" style="color:#666;" data-toggle="modal" data-target="#myModa2" id="look">管理</a>
	                <input type="hidden" value="${a.id}">
	                </th>
	                <th><a href="editArticle?id=${a.id }" class='btn btn-primary moreinfo' >详情</a></th>
	                <c:if test="${a.deliverApproveFlag==0 }">
	                <th class="deliver_approve_flag">未送审</th>
	                <th><a href="send_art?articleid=${a.id }" class='btn btn-primary send'  >送审</a></th>
	                </c:if>
	                <c:if test="${a.deliverApproveFlag==1 }">
	                <th class="deliver_approve_flag">已送审</th>
	                <th></th>
	                </c:if>
	                <c:if test="${a.deliverApproveFlag==3 }">
	                <th class="deliver_approve_flag">已通过</th>
	                <th></th>
	                </c:if>
	                <c:if test="${a.deliverApproveFlag==4 }">
	                <th class="deliver_approve_flag">已退回</th>
	                <th><a href="resend_art?articleid=${a.id }" class='btn btn-primary send' type='button' >重新送审</a></th>
	                </c:if>
	                </tr>
	            </c:forEach> 
	            
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
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/sendArticle/article_manager.js"></script> --%>
</body>
</html>
