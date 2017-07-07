<%--
  Created by IntelliJ IDEA.
  User: acer1
  Date: 2017/7/2
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <!--  <base href="http://localhost:8080/base/">-->

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
    <link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/resources/css/jquery.datetimepicker.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/lanrenzhijia_2.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/datePicker.css" >
    <!--***这里是单独调用的css文件***-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/index/demo.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/index/index1.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/index/From.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/index/index.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/ajaxupload.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/title/Examination1.css">
    <!--** 下面的js不能删除袄 这5个是公用的 也不能改袄**-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.2.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap-switch.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/lib.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/init.js"></script>

    <style type="text/css">
        .dropdown:hover .menu-top {
            display: block;
        }

        .dropdown-submenu{
            position:relative;
        }

        .dropdown-submenu > .dropdown-menu{
            top:0;
            left:100%;
            margin-top:-6px;
            margin-left:-1px;
            -webkit-border-radius:0 6px 6px 6px;
            -moz-border-radius:0 6px 6px 6px;
            border-radius:0 6px 6px 6px;
        }

        .dropdown-submenu:hover > .dropdown-menu{
            display:block;
        }

        .dropdown-submenu > a:after{
            display:block;
            content:" ";
            float:right;
            width:0;
            height:0;
            border-color:transparent;
            border-style:solid;
            border-width:5px 0 5px 5px;
            border-left-color:#cccccc;
            margin-top:5px;
            margin-right:-10px;
        }

        .dropdown-submenu:hover > a:after{
            border-left-color:#ffffff;
        }

        .dropdown-submenu .pull-left{
            float:none;
        }

        .dropdown-submenu.pull-left > .dropdown-menu{
            left:-100%;
            margin-left:10px;
            -webkit-border-radius:6px 0 6px 6px;
            -moz-border-radius:6px 0 6px 6px;
            border-radius:6px 0 6px 6px;
        }
    </style>

    <!--导航结束-->
    <!--内容开始-->
    <div class="main-right">
        <div class="col-md-7">
            <!--快速通道-->
            <h3 style="border:1px solid #d4d1d1;"><a href="#" class="btn btn-link"><i><img src="${pageContext.request.contextPath}/resources/images/index_271.jpg"></i>admin</a></h3>
            <ul style="border:1px solid #d4d1d1;">
                <li class="col-xs-4 col-sm-4 col-md-4 main-top"><a href="sendArticle/dispatch"><img src="${pageContext.request.contextPath}/resources/images/index_10.jpg" alt=""/></a></li>
                <li class="col-xs-4 col-sm-4 col-md-4 main-top"><a href="sendArticle/backlog_manager"><img src="${pageContext.request.contextPath}/resources/images/index_12.jpg" alt=""/></a></li>
                <li class="col-xs-4 col-sm-4 col-md-4 main-top"><a href="sendArticle/article_manager"><img src="${pageContext.request.contextPath}/resources/images/index_14.jpg" alt=""/></a></li>
                <div class="clear"></div>
            </ul>
            <!--快速通道-->
            <!--通知公告-->
            <h3 style="border:1px solid #d4d1d1;"><a href="getNotices" class="btn btn-link"><i><img src="${pageContext.request.contextPath}/resources/images/index_271.jpg"></i>通知公告</a></h3>
            <ul style="border:1px solid #d4d1d1;min-height:415px;">

                <li class="col-md-12 main-top1">
                    <a href="notice/detail?id=3">
                        <p>
                   <span  class="fl hang" title="鑫联华信息有限公司">
                     鑫联华信息有限公司

                   </span>
                            <span class="fr">2015-11-27 14:50:50</span>
                        </p>
                    </a>
                </li>

                <li class="col-md-12 main-top1">
                    <a href="notice/detail?id=4">
                        <p>
                   <span  class="fl hang" title="鑫联华信息有限公司">
                     鑫联华信息有限公司

                   </span>
                            <span class="fr">2015-11-27 14:50:53</span>
                        </p>
                    </a>
                </li>

                <li class="col-md-12 main-top1">
                    <a href="notice/detail?id=5">
                        <p>
                   <span  class="fl hang" title="鑫联华信息有限公司">
                     鑫联华信息有限公司

                   </span>
                            <span class="fr">2015-11-27 14:50:56</span>
                        </p>
                    </a>
                </li>

                <li class="col-md-12 main-top1">
                    <a href="notice/detail?id=7">
                        <p>
                   <span  class="fl hang" title="鑫联华信息有限公司">
                     鑫联华信息有限公司

                   </span>
                            <span class="fr">2015-11-27 14:51:02</span>
                        </p>
                    </a>
                </li>

                <li class="col-md-12 main-top1">
                    <a href="notice/detail?id=8">
                        <p>
                   <span  class="fl hang" title="鑫联华信息有限公司">
                     鑫联华信息有限公司

                   </span>
                            <span class="fr">2015-11-27 14:51:05</span>
                        </p>
                    </a>
                </li>

                <li class="col-md-12 main-top1">
                    <a href="notice/detail?id=26">
                        <p>
                   <span  class="fl hang" title="这是一个测试通告">
                     这是一个测试通告

                   </span>
                            <span class="fr">2015-12-02 17:38:52</span>
                        </p>
                    </a>
                </li>

                <div class="clear"></div>
            </ul>
            <!--通知公告-->
            <!--代办公文-->
            <h3 style="border:1px solid #d4d1d1;"><a href="sendArticle/backlog_manager" class="btn btn-link"><i><img src="${pageContext.request.contextPath}/resources/images/index_271.jpg"></i>待办公文</a></h3>
            <ul style="border:1px solid #d4d1d1; min-height:210px;">

                <div class="clear"></div>
            </ul>
            <!--代办公文-->
            <!--公式信息-->
            <h3 style="border:1px solid #d4d1d1;"><a href="getArticleAll" class="btn btn-link"><i><img src="${pageContext.request.contextPath}/resources/images/index_271.jpg"></i>公示信息</a></h3>
            <ul style="border:1px solid #d4d1d1;min-height:210px;">

                <li class="col-md-12 main-top1">
                    <a >
                        <p>
                   <span  class="fl hang" title="111111111">

                     111111111

                   </span>


                            <span class="fr">2015-12-06 20:30:04</span>

                        </p>
                    </a>
                </li>

                <li class="col-md-12 main-top1">
                    <a >
                        <p>
                   <span  class="fl hang" title="111111111">

                     111111111

                   </span>


                            <span class="fr">2015-12-06 20:30:04</span>

                        </p>
                    </a>
                </li>

                <li class="col-md-12 main-top1">
                    <a >
                        <p>
                   <span  class="fl hang" title="111111111">

                     111111111

                   </span>


                            <span class="fr">2015-12-06 20:30:04</span>

                        </p>
                    </a>
                </li>

                <li class="col-md-12 main-top1">
                    <a >
                        <p>
                   <span  class="fl hang" title="111111111">

                     111111111

                   </span>


                            <span class="fr">2015-12-06 20:30:04</span>

                        </p>
                    </a>
                </li>

                <div class="clear"></div>
            </ul>
            <!--公式信息-->
        </div>
        <div class="col-md-5">
            <!--公司动态-->
            <h3 style="border:1px solid #d4d1d1;"><a href="#" class="btn btn-link"><i><img src="${pageContext.request.contextPath}/resources/images/index_271.jpg"></i>公司动态</a></h3>
            <div class="slide_container">
                <ul class="rslides" id="slider">
                    <li>
                        <img src="${pageContext.request.contextPath}/resources/images/1.jpg" alt="">
                        <p class="caption">01</p>
                    </li>
                    <li>
                        <img src="${pageContext.request.contextPath}/resources/images/1.jpg" alt="">
                        <p class="caption">02</p>
                    </li>
                    <li>
                        <img src="${pageContext.request.contextPath}/resources/images/1.jpg" alt="">
                        <p class="caption">03</p>
                    </li>
                    <li>
                        <img src="${pageContext.request.contextPath}/resources/images/2.jpg" alt="">
                        <p class="caption">04</p>
                    </li>
                    <li>
                        <img src="${pageContext.request.contextPath}/resources/images/3.jpg" alt="">
                        <p class="caption">05</p>
                    </li>
                </ul>
            </div>
            <div class="clear"></div>
            <!--公司动态-->
            <h3 style="border:1px solid #d4d1d1;"><a href="getForums" class="btn btn-link"><i><img src="images/index_271.jpg"></i>职工社区</a></h3>
            <ul style="border:1px solid #d4d1d1; min-height:765px;">

                <li class="col-md-12 main-top1">
                    <a href="detailForum?id=172">
                        <p style="color:#50afd7">谁开的房间</p>
                        <span  class="fl hang" title="申达股份">
	                     申达股份

	                   </span>
                        <span class="fr">2015-11-29 14:11:40</span>
                        </p>
                    </a>
                </li>

                <li class="col-md-12 main-top1">
                    <a href="detailForum?id=176">
                        <p style="color:#50afd7">没看捐款的</p>
                        <span  class="fl hang" title="收款的烦恼">
	                     收款的烦恼

	                   </span>
                        <span class="fr">2015-11-29 15:41:47</span>
                        </p>
                    </a>
                </li>

                <li class="col-md-12 main-top1">
                    <a href="detailForum?id=178">
                        <p style="color:#50afd7">fgsw</p>
                        <span  class="fl hang" title="sdfg">
	                     sdfg

	                   </span>
                        <span class="fr">2015-11-30 08:53:05</span>
                        </p>
                    </a>
                </li>

                <li class="col-md-12 main-top1">
                    <a href="detailForum?id=179">
                        <p style="color:#50afd7">sdf</p>
                        <span  class="fl hang" title="sdf">
	                     sdf

	                   </span>
                        <span class="fr">2015-11-30 08:54:54</span>
                        </p>
                    </a>
                </li>

                <li class="col-md-12 main-top1">
                    <a href="detailForum?id=180">
                        <p style="color:#50afd7">df</p>
                        <span  class="fl hang" title="sdf">
	                     sdf

	                   </span>
                        <span class="fr">2015-11-30 08:57:13</span>
                        </p>
                    </a>
                </li>

                <li class="col-md-12 main-top1">
                    <a href="detailForum?id=181">
                        <p style="color:#50afd7">sdf</p>
                        <span  class="fl hang" title="sdf">
	                     sdf

	                   </span>
                        <span class="fr">2015-11-30 09:18:02</span>
                        </p>
                    </a>
                </li>

                <li class="col-md-12 main-top1">
                    <a href="detailForum?id=183">
                        <p style="color:#50afd7">rtw</p>
                        <span  class="fl hang" title="wer">
	                     wer

	                   </span>
                        <span class="fr">2015-11-30 09:25:10</span>
                        </p>
                    </a>
                </li>

                <li class="col-md-12 main-top1">
                    <a href="detailForum?id=184">
                        <p style="color:#50afd7">df</p>
                        <span  class="fl hang" title="se">
	                     se

	                   </span>
                        <span class="fr">2015-11-30 09:27:51</span>
                        </p>
                    </a>
                </li>

                <div class="clear"></div>
        </div>
    </div>

</div>
<!--内容结束-->
<!--尾部开始-->
<div class="clear"></div>
<div class="Footer" style="margin-top: 10px;">
    <p>哈尔滨市交通基础设施投资建设管理有限公司 版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;技术支持：鑫联华</p>
</div>
<!--尾部结束-->
<script src="${pageContext.request.contextPath}/resources/js/index/responsiveslides.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/index/slider.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/sendArticle/history_manager.js"></script>
<!--尾部结束-->
</body>
</html>
