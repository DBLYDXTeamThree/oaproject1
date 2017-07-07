<!--审批流程
    @author:杨雪
-->
<!--内容开始-->
<div class="main-right">
<!--面包屑导航-->
  <ol class="breadcrumb">
    <li><a href="#">当前位置:</a></li>
    <li><a href="#">审核项目</a></li>
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
            <thead id="approve_projectlist">
            <tr style="background-color:#EEEEEE;">
                <th>选择</th>
                <th>项目流程名称</th>
                <th>发起时间</th>
                <th>发起部门</th>
                <th>发起人</th>
                <th>节点定义</th>
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
      <label class="control-label"><span style="color:red;">*&nbsp;</span>项目名称</label>
      <div class="controls">
          <input type="text" class="input-medium">
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>发起人</label>
      <div class="controls">
          <input type="text" class="input-medium" value="孟令超" readonly="yes">
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>描述</label>
      <div class="controls">
         <textarea></textarea>
      </div>
  </div>
  </form>
         <div class="modal-footer">
            <button type="button" class="btn btn-default btn1" 
               data-dismiss="modal">关闭
            </button>
            <button type="button" class="btn btn-primary" id="Submit" data-toggle="modal" data-target="#myModa2">
               提交更改
            </button>
         </div>
      </div><!-- /.modal-content -->
   </div><!-- /.modal -->
</div>
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
               修改审批项目
            </h4>
         </div>
  <form class="form-horizontal registerform" action = "saveUserInfo" name="form1" method = "post" enctype='multipart/form-data' style="margin-top: 20px;">
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>项目名称</label>
      <div class="controls">
          <input type="text" class="input-medium">
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>发起人</label>
      <div class="controls">
          <input type="text" class="input-medium" value="孟令超" readonly="yes">
      </div>
  </div>
  <div class="control-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>描述</label>
      <div class="controls">
         <textarea></textarea>
      </div>
  </div>
  </form>
         <div class="modal-footer">
            <button type="button" class="btn btn-default btn1" 
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

