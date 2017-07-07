<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ include file="../head.jsp"%>
<!--**不管谁，下面的js文件与css文件都不能更改和替换  谢谢合作  有问题请叫我更改 **-->
<!--**这里是共有调用的css文件  不能改袄**-->
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap-combined.min.css">  
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
<script type="text/javascript" src="js/user/user_manager.js"></script>
<script type="text/javascript" src="js/user/mh.js"></script>
<script type="text/javascript" src="js/forum/forum.js"></script>

<!--面包屑导航-->
  <ol class="breadcrumb">
    <li><a href="#">当前位置:</a></li>
    <li><a href="#">系统设置</a></li>
    <li class="active">数据字典</li>
  </ol>
<!--面包屑导航-->
<!--表单-->
<!--<li style="float:left; padding-left:60px;"><input type="submit" class="btn btn1" value="发帖"></li>  -->

<form class="form-inline registerform" name="form1" method = "post" enctype='multipart/form-data'style="min-height:360px;">


        <table class="table table-hover table-bordered">
            <thead id="forum">
            <tr style="background-color:#EEEEEE;">
            
                <th>ID</th>
                <th>类别ID</th>
                <th>显示文本</th>
                <th>后台值</th>
                <th>备注</th>
                <th>操作</th>
            </tr>
             <c:forEach items="${data_dictionarylist}" var="data_dictionarylist">
	          <tr style="background-color:#EEEEEE;">
	             <th> ${data_dictionarylist.id}</th>
	             <th> ${data_dictionarylist.tid}</th>
	             <th> ${data_dictionarylist.display_text}</th>
	             <th> ${data_dictionarylist.display_value}</th>
	             <th> ${data_dictionarylist.remark}</th>
				 <th><a href="forum/addData_dictionary" >添加</a>&nbsp;<a href="findData_dictionaryById?id=${data_dictionarylist.id }" >修改</a>&nbsp;<a href="delData_dictionary?id=${data_dictionarylist.id }" onclick="return confirm('确定删除吗?');" >删除</a>&nbsp;</th>
				 </tr>
	          </c:forEach>
            </thead>
        </table>
</form>
  <script type="text/javascript">
      $(document).ready(function(){ 
            $(".table tr:odd").css("background-color","#fff");
      })
      </script>
<!--尾部开始-->
  <div class="clear"></div> 
  <div class="Footer">
   <p>哈尔滨市交通基础设施投资建设管理有限公司 版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;技术支持：鑫联华</p>
  </div>
<!--尾部结束-->
 <script src="js/index/responsiveslides.min.js"></script>
 <script src="js/index/slider.js"></script>

 <link rel="stylesheet" type="text/css" href="css/table/table.css">

<!--尾部结束-->
</body>
</html>

