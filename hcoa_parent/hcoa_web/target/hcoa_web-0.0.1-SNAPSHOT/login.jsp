<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>交通管理局OA管理平台</title>
    
	<meta name="pragma" content="no-cache">
	<meta name="cache-control" content="no-cache">
	<meta name="expires" content="0">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
    <link rel="stylesheet" href="resources/css/bootstrap.min.css">
    
    <link rel="stylesheet" href="resources/css/login/font-awesome.min.css">
    <link rel="stylesheet" href="resources/css/login/form-elements.css">
    <link rel="stylesheet" href="resources/css/login/stylemc.css">
    
    <script src="resources/js/jquery-1.11.2.min.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
    
    <script src="resources/js/login/jquery.backstretch.min.js"></script>
    <script src="resources/js/login/scripts.js"></script>
    <script src="resources/js/login/login.js"></script>

        
        <script type="text/javascript">
          $(function(){
        	 
        	  var $captchaImage = $(".captchaImage");
        	  $("#btn").click(function(){	
        		  
        			$.get("${pageContext.request.contextPath}/identity/check","word="+$("input[name='code']").val(),function(d){
        				if(d==0){
        					alert("验证码输入错误");
        				}else{
        					$("form").submit()
        				}
        			})
        		})
        		
        		$captchaImage.click(function() {
        			$captchaImage.attr("src","${pageContext.request.contextPath}/identity/iden?i="+Math.random());
        		});
          })
        </script>
</head>
<body>
	<!-- Top content -->
	<div class="top-content">      
	    <div class="inner-bg">
	        <div class="container">
	            <div class="row">
	                <div class="col-sm-8 col-sm-offset-2 text">
	                    <div class="description">
	                      <p>
	                        <img src="resources/images/bt.png">
	                      </p>
	                    </div>
	                </div>
	            </div>
	            <div class="row">
	                <div class="col-sm-6 col-sm-offset-3 form-box">
	                  <div class="form-top">
	                    <div class="form-top-left">
	                      <strong><b>欢迎登录</b></strong>
	                    </div>
	                    <div class="form-top-right">
	                      <span><c:out value="${resp.msg}"/></span>
	                    </div>
	                    </div>
	                    <div class="form-bottom">
	                  <form role="form" action="login" method="post" class="login-form">
	                    <div class="form-group">
	                    <img src="resources/images/user.jpg">
	                        <input type="text" name="username" placeholder="请输入您的用户名" class="form-username form-control" id="form-username">
	                      </div>
	                      <div class="form-group">
	                       <img src="resources/images/password1.jpg">
	                        <input type="password" name="password" placeholder="请输入您的密码" class="form-password form-control" id="form-password">
	                      </div>
	                      <div class="form-group">
	                        <input type="text" name="code" placeholder="请输入验证码" class="form-username form-control" id="form-username" style="width: 73%;padding-left: 10px">
	                        <img id="vcode" class="captchaImage" src="${pageContext.request.contextPath}/identity/iden" style="width:25%; left: 75%;top: 3px; height:45px; " />
	                        <!-- <img id="vcode" src="getImg" style="width:25%; left: 75%;top: 3px; height:45px; "> -->
	                      </div>
	                      <button type="button" id="btn" class="btn">登录</button>
	                      <button type="reset" class="btn" style="background-color: #d4d5d5;color: #696969;float:right">重置</button>
	                      <div class="clear"></div>
	                  </form>
	                </div>
	                </div>
	            </div>
	        </div>
	    </div>
	    <div class="row" style="margin-right:0;">
	        <div class="col-sm-6 col-sm-offset-3 social-login">
	          <h5>技术支持：鑫联华</h5>
	        </div>
	    </div>
	</div>
    </body>
</html>
