


$(function(){
   $('#datetimepicker2').datetimepicker({
  yearOffset:0,
  lang:'ch',
  timepicker:false,
  format:'Y/m/d',
  formatDate:'Y/m/d',
});
  $('#datetimepicker3').datetimepicker({
  yearOffset:0,
  lang:'ch',
  timepicker:false,
  format:'Y/m/d',
  formatDate:'Y/m/d',
});
})
$(function(){
  $("#datetimepicker2").blur(function(){  // 当选择年龄的地方失去焦点的时候 计算多大岁数
          var oDate = new Date(); //实例一个时间对象；
          var ydata=oDate.getFullYear();  //获取当前本机时间 中的年份
          var dqdata=$("#datetimepicker2").val(); //获取当前时间
          var ss;
          ss = dqdata.substring(0, 4); // 取子字符串。  截取后的时间
          if (dqdata!=""||dqdata!=null) {
            $("#year").val(ydata-ss+"岁");
          };
          
          });
  //$(".registerform").Validform();  //就这一行代码！;
  
  var getInfoObj=function(){
      return  $(this).parents("td").next().find(".info");
    }
  
  $("[datatype]").focusin(function(){
    if(this.timeout){clearTimeout(this.timeout);}
    var infoObj=getInfoObj.call(this);
    if(infoObj.siblings(".Validform_right").length!=0){
      return; 
    }
    infoObj.show().siblings().hide();
    
  }).focusout(function(){
    var infoObj=getInfoObj.call(this);
    this.timeout=setTimeout(function(){
      infoObj.hide().siblings(".Validform_wrong,.Validform_loading").show();
    },0);
    
  });
  $(".registerform").Validform({
    tiptype:1, 
    datatype:{
    "*6-20": /^[^\s]{6,20}$/,
    "zh2-6" : /^[\u4E00-\u9FA5\uf900-\ufa2d]{2,4}$/,
    "username":function(gets,obj,curform,regxp){
      //参数gets是获取到的表单元素值，obj为当前表单元素，curform为当前验证的表单，regxp为内置的一些正则表达式的引用;
      var reg1=/^[\w\.]{4,16}$/,
        reg2=/^[\u4E00-\u9FA5\uf900-\ufa2d]{2,8}$/;
 
      if(reg1.test(gets)){return true;}
      if(reg2.test(gets)){return true;}
      return false;
 
      //注意return可以返回true 或 false 或 字符串文字，true表示验证通过，返回字符串表示验证失败，字符串作为错误提示显示，返回false则用errmsg或默认的错误提示;
    },
    "phone":function(){
      // 5.0 版本之后，要实现二选一的验证效果，datatype 的名称 不 需要以 "option_" 开头;  
    }
  },
    usePlugin:{
      passwordstrength:{
        minLen:6,
        maxLen:18,
        trigger:function(obj,error){
          if(error){
            obj.parent().next().find(".passwordStrength").hide().siblings(".info").show();
          }else{
            obj.removeClass("Validform_error").parent().next().find(".passwordStrength").show().siblings().hide();  
          }
        }
      },
        datepicker:{
        format:"yyyy-mm-dd",//指定输出的时间格式;
        firstDayOfWeek:1,//指定每周开始的日期，0、1-6 对应 周日、周一到周六;
        clickInput:false,
        startDate:"1949-00-00",
        createButton:true
      }
    }
  });
})