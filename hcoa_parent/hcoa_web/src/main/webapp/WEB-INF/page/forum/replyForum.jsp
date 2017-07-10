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
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/dispatch/From_1.css" >
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/dispatch/datePicker.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/index.css" >
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap-switch.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/lib.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/init.js"></script>

<!--内容开始-->
<div class="main-right">
<!--面包屑导航-->
  <ol class="breadcrumb">
    <li><a href="#">当前位置:</a></li>
    <li><a href="#">职工论坛</a></li>
    <li class="active">论坛回复</li>
  </ol>
<!--面包屑导航-->
<!--表单-->
<form class="form-inline registerform addreplyForum" action="addReplyForum" name="form1" method = "post" enctype='multipart/form-data'style="min-height:360px;">
        <div class="Reply" style="width:99%; margin:0 auto; border: #cccccc solid 1px;border-radius:5px;">
           <div class="Reply_title" style="width:98%; margin:0 auto; border-bottom: #cccccc solid 1px;">
             <p style="color:#353535;font-size:16px;font-weight:bold;line-height: 55px;height: auto;padding-right: 10px; padding-left: 10px;"><span id="detail1" style="color:#000; float:lift">${detailList.caption}</Span><span style="color:#ababab; float:right" id="detail4"><fmt:formatDate value="${detailList.createtime }" pattern="yyyy-MM-dd HH:mm:ss"/></span><span style="color:#000; float:right; padding-right:20px;" id="detail3">${detailList.staff.realname}</span></p>
           </div>
           <div class="Reply_content" id="detail2" style="width:98%; margin:0 auto;text-indent:2em; color:#989898; height:150px;line-height: 30px; margin-top:5px;max-height: 150px;overflow: auto;">
				${detailList.content}
           </div>
           <input type="hidden" id="createby" name="createby" value="${staff.id}"/>
           <input type="hidden" id="forumid" name="forumid" value="${detailList.id  }"/>
        </div>
         <div class="Reply_Details" style="width:99%; margin:0 auto; border: #cccccc solid 1px;border-radius:5px; margin-top:20px;">
            <textarea name="content" datatype="*" nullmsg="请输入回复内容！" style="width:100%; height:150px; border:none"></textarea>
         </div>
         <a id="back" href="getForums" class="btn" style="margin:10px; float:right">返回</a>
         <button type="submit"  id="subBtn" class="btn" style="margin:10px; float:right">保存</button>
        <table class="table table-hover table-bordered">
            <thead class="reply1" id="forumList">
            <tr style="background-color:#EEEEEE;color: #000;">
                <th>序号</th>
                <th>姓名</th>
                <th>内容</th>
                <th>时间</th>
            </tr>
            
             <c:forEach items="${findreplyList}" var="findreplyList">
	          <tr style="background-color:#EEEEEE;color: #000;">
	             <th> ${findreplyList.id}</th>
	             <th> ${findreplyList.staff.realname}</th>
	             <th> ${findreplyList.content}</th>
	             <th><fmt:formatDate value="${findreplyList.createtime }" pattern="yyyy-MM-dd HH:mm:ss"/>  </th>
				 
				 </tr>
	          </c:forEach>

            </thead>
        </table>
</form>
 <!--表单-->




<!--尾部开始-->
  <div class="clear"></div> 
  <div class="Footer">
   <p>哈尔滨市交通基础设施投资建设管理有限公司 版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;技术支持：鑫联华</p>
  </div>
<!--尾部结束-->

<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/forum/replyforum.js"></script>  --%> 
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/from/Validform_v5.3.2_min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/from/passwordStrength-min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/from/jquery.datePicker-min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/from/jquery.datetimepicker.js"></script>  
 <script src="${pageContext.request.contextPath}/resources/js/index/responsiveslides.min.js"></script>
 <script src="${pageContext.request.contextPath}/resources/js/index/slider.js"></script>
<!--尾部结束-->
</body>
</html>

