<!--节点
    @author:杨雪 --审核级别
-->
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
<form class="form-inline registerform" action = "saveUserInfo" name="form1" method = "post" enctype='multipart/form-data'style="min-height:360px;">
 <ul class="search">
      <li style="float:left; padding-left:30px;"><button class="btn btn1" data-toggle="modal" data-target="#myModal">新增</button></li>
      <li style="float:left; padding-left:30px;"><input type="submit" class="btn btn1" value="删除"></li>
      <div class="clear"></div>
    </ul>
        <table class="table table-hover table-bordered">
            <thead id="approve_levellist">
            <tr style="background-color:#EEEEEE;">
                <th>序号</th>
                <th>规则名称</th>
                <th>审批级别</th>
                <th>审批角色</th>
                <th>操作</th>
            </tr>
            
            </thead>
        </table>
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
               新增审批项目
            </h4>
         </div>
  <form class="form-horizontal registerform" action = "saveUserInfo" name="form1" method = "post" enctype='multipart/form-data' style="margin-top: 20px;">
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>规则名称</label>
      <div class="controls">
          <input type="text" class="input-medium">
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>审批级别</label>
      <div class="controls">
          <input type="text" class="input-medium">
      </div>
  </div>
  </form>
         <div class="modal-footer">
            <button type="button" class="btn btn-default btn1" 
               data-dismiss="modal">关闭
            </button>
            <button type="button" class="btn btn-primary" id="Submit">
               保存
            </button>
         </div>
      </div><!-- /.modal-content -->
   </div><!-- /.modal -->
</div>
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
               签发
            </h4>
         </div>
         <div class="modal-body" style=" max-height: 300px;overflow:auto;">
            <table class="table table-hover table-bordered">
            <thead id="rolelist">
            <tr style="background-color:#EEEEEE;">
                <th>选择</th>
                <th>角色名称</th>
            </tr>
      
             

            </thead>
        </table>
         </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" 
               data-dismiss="modal">关闭
            </button>
            <button type="button" class="btn btn-primary" id="Submit" data-dismiss="modal">
               提交更改
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
  <script type="text/javascript">
      $(document).ready(function(){ 
            $(".table tr:odd").css("background-color","#fff");
      })
      </script>
<script>
	  $(document).ready(function(){  // 导航鼠标经过效果
		dropdownOpen();//调用
	  });
  	function dropdownOpen() {  //鼠标划过就展开子菜单，免得需要点击才能展开 原来是点击才能展开
  		var $dropdownLi = $('li.dropdown');
  		$dropdownLi.mouseover(function() {
  			$(this).addClass('open');
  		}).mouseout(function() {
  			$(this).removeClass('open');
  		});
  	}
</script>
</body>
</html>
