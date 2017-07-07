<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>交通管理局OA管理平台</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" media="screen" href="css/jquery.datetimepicker.css">  
<link href="css/index.css" rel="stylesheet" type="text/css">
<link href="css/Dispatch/Dispatch.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap-switch.js"></script>
<script type="text/javascript" src="js/meng.js"></script>
</head>
<body > 
<input type="hidden" id="userforRoleIdList1"/>
<input type="hidden" id="userforRoleIdList2"/>
<input type="hidden" id="userforRoleIdList3"/>
<input type="hidden" id="userforRoleIdList4"/>
<div class="Content">

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
<form class="form-inline registerform" action = "saveUserInfo" name="form1" method = "post" enctype='multipart/form-data'>
  <div class="form-group">
      <label class="form-label"><span style="color:red;">*&nbsp;</span>签发</label>
      <div class="controls">
          <input type="text" class="input-medium" data-toggle="modal" data-target="#myModal" id="myModal_1">
          <input type="hidden" value="" id="myModal_hidden1">
      </div>
  </div>
  <div class="form-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>审核</label>
      <div class="controls">
          <input type="text" class="input-medium" data-toggle="modal" data-target="#myModal" id="myModal_2">
          <input type="hidden" value="" id="myModal_hidden2">
      </div>
  </div>
  <div class="form-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>会签</label>
      <div class="controls">
         <input type="tel" class="input-medium" value="" data-toggle="modal" data-target="#myModal" id="myModal_3">
         <input type="hidden" value="" id="myModal_hidden3">
      </div>
  </div>
  <div class="form-group">
      <label class="control-label"> <span style="color:red;">*&nbsp;</span>主办部门</label>
      <div class="controls">
               <div class="btn-group"> 
                <select class="selectpicker" data-style="btn-primary" name="dept.id" 
	      		id="department" style="width:150px; height:30px;">
	            </select>
               </div>
           </div>
   </div>
   <div class="form-group">
      <label class="form-label"><span style="color:red;">*&nbsp;</span>核稿</label>
      <div class="controls">
          <input type="text" class="input-medium" data-toggle="modal" data-target="#myModal" id="myModal_4">
          <input type="hidden" value="" id="myModal_hidden4">
      </div>
  </div>
  <div class="form-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>拟稿人</label>
      <div class="controls">
          <input type="text" class="input-medium" id="year">
      </div>
  </div>
  <div class="form-group">
      <label class="control-label"> <span style="color:red;">*&nbsp;</span>秘密等级</label>
      <div class="controls">
               <div class="btn-group"> 
               <select class="selectpicker" data-style="btn-primary" name="roleid" id="moren"  style="width: 150px;height: 30px;">
                      <option value="1">一级</option>
                      <option value="2">二级</option>
                      <option value="3">三级</option>
                      <option value="4">四级</option>
                  
               </select>
               </div>
           </div>
   </div>
  <div class="form-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>联系电话</label>
      <div class="controls">
          <input type="text" class="input-medium" id="year">
      </div>
  </div>
  <div class="form-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>文件标题</label>
      <div class="controls">
          <input type="text" class="input-medium" id="year">
      </div>
  </div>
    <div class="form-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>主题</label>
      <div class="controls">
          <input type="text" class="input-medium" id="year">
      </div>
  </div>
  <div class="form-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>抄送</label>
      <div class="controls">
          <input type="text" class="input-medium" id="year">
      </div>
  </div>
    <div class="form-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>主题词</label>
      <div class="controls">
          <input type="text" class="input-medium" id="year">
      </div>
  </div>
  <div class="form-group">
      <label class="control-label"><span style="color:red;">*&nbsp;</span>打字</label>
      <div class="controls">
          <input type="text" class="input-medium">
      </div>
  </div>
  <div class="form-group">
      <label class="control-label"> <span style="color:red;">*&nbsp;</span>校对</label>
      <div class="controls">
          <input type="text" class="input-medium" value="">
      </div>
  </div>
  <div class="form-group">
      <label class="control-label"> <span style="color:red;">*&nbsp;</span>份数</label>
      <div class="controls">
          <input type="text" class="input-medium" value="">
      </div>
  </div>
  <div class="form-group" id="ckMonth">
      <label class="form-label"><span style="color:red;">*&nbsp;</span>撰写日期</label>
      <div class="controls">
        <input type="text" placeholder="2015/08/25" class="input-medium" id="datetimepicker2"> 
      </div>
  </div>
 <!-- <div class="form-group">
      <label class="control-label"> <span style="color:red;">*&nbsp;</span>上传附件</label>
      <div class="controls">
        <input id="lefile" type="file" style="display:none">
<div class="input-append">
  <input id="photoCover" class="input-medium" type="text" style="height:25px;float: left;">
  <a class="btn" onclick="$('input[id=lefile]').click();" style="background-image: -webkit-linear-gradient(top, #ffffff, #e6e6e6); border: 1px solid #ccc; height:26px;padding: 2px 12px;">选择</a>
</div>
      </div>
  </div>-->
<script type="text/javascript">
$('input[id=lefile]').change(function() {
$('#photoCover').val($(this).val());
});
</script>
   <div class="clear"></div>
  <div class="form-group" style="width: 300px;float: left;" id="butt">
      <div class="controls controls1">
          <button type="submit" class="btn btn-primary">提交审核</button>
      </div>
  </div>
  <div class="form-group" style="float: left; margin-left:40px;">
      <div class="controls controls1" >
          <a id="back"href="javascript(0)" class="btn btn-primary">返回首页</a>
      </div>
  </div>
 </form>
 <!--表单-->
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" 
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
            <thead id="content1">
            <tr style="background-color:#EEEEEE;">
                <th><input type="checkbox"></th>
                <th>人员姓名</th>
                <th>部门</th>
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
<script type="text/javascript" src="js/Validform_v5.3.2_min.js"></script>
<script type="text/javascript" src="js/jquery.datePicker-min.js"></script>
<script type="text/javascript"  src="js/jquery.datetimepicker.js">  </script>  
<script type="text/javascript">
  $('#datetimepicker2').datetimepicker({ // 日历效果
  yearOffset:0,
  lang:'ch',
  timepicker:false,
  format:'Y/m/d',
  formatDate:'Y/m/d',
});
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

$(function(){


  var arr = $("#userforRoleIdList1").val();
  var arr1 = $("#userforRoleIdList2").val();
  var arr2 = $("#userforRoleIdList3").val();
  var arr3 = $("#userforRoleIdList4").val();

  arr = JSON.parse(arr);
  arr1 = JSON.parse(arr1);
  arr2 = JSON.parse(arr2);
  arr3 = JSON.parse(arr3);

  
   var content1=$("#content1");
   var jishu=0;
    $("#myModal_1").focus(function(){
      jishu=1;
    $(content1).html('<tr style="background-color:#EEEEEE;">'+
     '<th><input type="checkbox"></th>'+
     '<th>人员姓名</th>'+
     '<th>部门</th>'+
     '</tr>');
       for (var i = 0; i <arr.length; i++) {
    content1.append(
     '<tr style="background-color:#EEEEEE;">'+
     '<th><input type="checkbox" data="'+arr[i].ids+'"value="'+arr[i].name+'"></th>'+
     '<th>'+arr[i].name+'</th>'+
     '<th>'+arr[i].bumen+'</th>'+
     '</tr>'
    );
  }
    })
    $("#myModal_2").focus(function(){
      jishu=2;
    $(content1).html('<tr style="background-color:#EEEEEE;">'+
     '<th><input type="checkbox"></th>'+
     '<th>人员姓名</th>'+
     '<th>部门</th>'+
     '</tr>');
       for (var i = 0; i <arr1.length; i++) {
    content1.append(
     '<tr style="background-color:#EEEEEE;">'+
     '<th><input type="checkbox" data="'+arr1[i].ids+'"value="'+arr1[i].name+'"></th>'+
     '<th>'+arr1[i].name+'</th>'+
     '<th>'+arr1[i].bumen+'</th>'+
     '</tr>'
    );
  }
    })
    $("#myModal_3").focus(function(){
       jishu=3;
    $(content1).html('<tr style="background-color:#EEEEEE;">'+
     '<th><input type="checkbox"></th>'+
     '<th>人员姓名</th>'+
     '<th>部门</th>'+
     '</tr>');
       for (var i = 0; i <arr2.length; i++) {
    content1.append(
     '<tr style="background-color:#EEEEEE;">'+
     '<th><input type="checkbox" data="'+arr2[i].ids+'"value="'+arr2[i].name+'"></th>'+
     '<th>'+arr2[i].name+'</th>'+
     '<th>'+arr2[i].bumen+'</th>'+
     '</tr>'
    );
  }
    })
    $("#myModal_4").focus(function(){
       jishu=4;
    $(content1).html('<tr style="background-color:#EEEEEE;">'+
     '<th><input type="checkbox"></th>'+
     '<th>人员姓名</th>'+
     '<th>部门</th>'+
     '</tr>');
       for (var i = 0; i <arr3.length; i++) {
    content1.append(
     '<tr style="background-color:#EEEEEE;">'+
     '<th><input type="checkbox" data="'+arr3[i].ids+'"value="'+arr3[i].name+'"></th>'+
     '<th>'+arr3[i].name+'</th>'+
     '<th>'+arr3[i].bumen+'</th>'+
     '</tr>'
    );
  }
    })
$("#seach").click(function(){
  var seach_vla=$("#seach_vla").val();
  $(content1).html('<tr style="background-color:#EEEEEE;">'+
     '<th><input type="checkbox"></th>'+
     '<th>人员姓名</th>'+
     '<th>部门</th>'+
     '</tr>');
  if (jishu==1) {
    for (var i = 0; i <arr3.length; i++) {
    if((arr[i].name).indexOf(seach_vla)>=0){
    content1.append(
     '<tr style="background-color:#EEEEEE;">'+
     '<th><input type="checkbox" data="'+arr[i].ids+'"value="'+arr[i].name+'"></th>'+
     '<th>'+arr[i].name+'</th>'+
     '<th>'+arr[i].bumen+'</th>'+
     '</tr>'
    );
    }
  }
  }else if(jishu==2){
    for (var i = 0; i <arr3.length; i++) {
    if((arr1[i].name).indexOf(seach_vla)>=0){
    content1.append(
     '<tr style="background-color:#EEEEEE;">'+
      '<th><input type="checkbox" data="'+arr1[i].ids+'"value="'+arr1[i].name+'"></th>'+
     '<th>'+arr1[i].name+'</th>'+
     '<th>'+arr1[i].bumen+'</th>'+
     '</tr>'
    );
    }
  }
  }else if(jishu==3){
    for (var i = 0; i <arr2.length; i++) {
    if((arr2[i].name).indexOf(seach_vla)>=0){
    content1.append(
     '<tr style="background-color:#EEEEEE;">'+
      '<th><input type="checkbox" data="'+arr2[i].ids+'"value="'+arr2[i].name+'"></th>'+
     '<th>'+arr2[i].name+'</th>'+
     '<th>'+arr2[i].bumen+'</th>'+
     '</tr>'
    );
    }
  }
  }else if(jishu==4){
    for (var i = 0; i <arr3.length; i++) {
    if((arr3[i].name).indexOf(seach_vla)>=0){
    content1.append(
     '<tr style="background-color:#EEEEEE;">'+
      '<th><input type="checkbox" data="'+arr3[i].ids+'"value="'+arr3[i].name+'"></th>'+
     '<th>'+arr3[i].name+'</th>'+
     '<th>'+arr3[i].bumen+'</th>'+
     '</tr>'
    );
    }
  }
  };
})

$("#Submit").click(function(){
var names='';
var abc='';
var inp = document.getElementsByTagName('input');
 for (var i = 0; i < inp.length; i++) {
    if (inp[i].type == "checkbox") {
      if (inp[i].checked==true) {
          abc = abc+inp[i].getAttribute('data')+",";
          names=names+inp[i].value+'|';
      };  
    }
 }
 if (jishu==1) {
 $("#myModal_1").val(names);
 $("#myModal_hidden1").val(abc);
 }else if (jishu==2) {
 $("#myModal_2").val(names);
 $("#myModal_hidden2").val(abc);
 }else if (jishu==3) {
 $("#myModal_hidden3").val(abc);
 }else if (jishu==4) {
 $("#myModal_hidden4").val(abc);
 };
})
})
  </script>
</body>
</html>
