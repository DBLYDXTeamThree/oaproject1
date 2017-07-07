//将methods提升为全局
var methods = 
{
	"user-register": function ()
	{
		//动态加载部门列表
		loadDepts();
		
		//动态加载角色列表
		loadRoles();
	},
	
	"user-user_manager": function ()
	{
		//动态加载部门列表
		loadDepts();
		
		//动态加载用户列表
		loadUsers();
	},
	
	"user-mail_list": function ()
	{
		
		//动态加载用户列表
		loadMailList();
	},
	"forum-getForum":function(){
		
		//加载帖子列表
		loadForums();
	},
	"forum-comgetForum":function(){
		
		//普通人员加载帖子列表
		loadcommonForums();
	},
	
	"forum-replyForum":function(data){
		//回复帖子
		var id = getParam();
		var forumid = id.forumId;
		var createby = id.createby;
		$("#createby").val(createby);
		$("#forumid").val(forumid);
		
		loadDetailForums(forumid);
	},
	
	"approve-approve": function ()
	{
		
		//动态加载审核表
		loadApprove();
	}
    ,
	"main": function ()
	{
		/* 动态加载通告——主页
		 * 动态加载论坛——主页
		 * 动态加载公示——主页
		 * @author:杨雪* */
		loadNoticeforMain();
		loadForumforMain();
		loadArticleforMain();
	},
	"notice-show": function ()
	{
		/* 加载通告列表
		 * @author:杨雪* */
		loadNotice();
	
	},
	"approve-project":function ()
	{
		/* 动态加载审批流程列表
		 * @author:杨雪* */
		loadApprove_projectlist();
	
	},
	"approve-flowNode":function(){
		/* 动态加载节点列表
		 * @author:杨雪* */
		loadFlowNode();
	},
	"approve-approveLevel":function(){
		/* 动态加载审核级别列表
		 * @author:杨雪* */
		loadApproveLevel();
		loadRolesforLevel();//加载角色
	},
	"approve-dispatch":function(){
		/* 根据role_id查询出四组数据 
		 * @author:杨雪* */
		loadUserForRoleId();
		//动态加载部门列表
		loadDepts();
	}
	
};
		
$(
	function ()
	{
		//绑定导航点击事件
		$(".dropdown-menu li a ").click
		(
			function ()
			{

				var id = $(this).prop("id");
				
				loadPage(id, methods[id.replace("/", "-")]);
			}
		).css("cursor", "pointer");
		
		
	}
);





/**
 * 加载页面
 */
function loadPage(url, method, datas)
{
	//修正注册页面重新加载报错bug
	$(".Content").nextAll().remove();
	
	$(".main-right").load
	(
		url,
		
		datas,
		
		function ()
		{
			//修正动态加载页面文本框内容串行
			$(".input-medium").css("line-height", "16px");
			
			$(".search_btn").css("line-height", "16px");
			
			method();
		}
	);
}

/**
 * 设置加载页面所需参数
 */
function setParam(param)
{
	$("#param4page").attr("cache-data", param);
}

/*
 * 将时间戳转换成时间字符串
 * @author杨雪
 * */
function getLocalTime(nS) {     
	nS = nS/1000;
	var time = new Date(parseInt(nS) * 1000).toLocaleDateString().substr(0,17);
	time  = time.replace("/","-").replace("/","-");
	    return time;
	}  

/**
 * 加载页面完成后获取所需参数
 */
function getParam()
{
	//alert($("#param4page").attr("cache-data"));
	
	return JSON.parse($("#param4page").attr("cache-data"));
}

/**
 * ajax获取json数据
 */
function ajax4Json(url, method, datas)
{
	$.ajax
	({
		type: "POST",
		
		url: url,
		
		data: datas,
		
		dataType: "JSON",
		
		async : false,
		
		success: function (data)
		{
			successMethod(data, method);
		},
	
		error: function ()
		{
			console.error("ajax error!");
		}
	});
}

/**
 * 提交json格式表单并获取返回json格式数据
 */
function ajaxWithJson(url, method, datas)
{
	$.ajax
	({
		type: "POST",
		
		url: url,
		
		data: datas,
		
		dataType: "JSON",
		
		async : false,
		
		//设置请求头信息
		contentType : 'application/json;charset=utf-8', 
		
		success: function (data)
		{
			successMethod(data, method);
		},
	
		error: function ()
		{
			console.error("ajax error!");
		}
	});
}

function successMethod(data, method)
{
	//成功不需要提示
	if (data.code == 1)
	{
		method(data.datas);
	}
	
	//成功并且提示
	else if (data.code == 3)
	{
		//$.Showmsg(data.msg);
		
		method(data.datas);
		
		//$.Hidemsg();
	}
	
	else
	{
		$.Showmsg(data.msg);
	}
}

/**
 * 表单转换为复杂json参数串
 */
function formToJson(formObj)
{
	var objArr = formObj.serializeArray();
	
	var jsonObj = {};
	
	$.each
	(
		objArr,
		
		function (i)
		{
			var name = objArr[i]["name"];
			
			var val = objArr[i]["value"];
			
			if (name.indexOf(".") > 0)
			{
				var nameArr = name.split(".");
				
				if (!objArr[i][nameArr[0]])
				{
					jsonObj[nameArr[0]] = {};
				}
				
				jsonObj[nameArr[0]][nameArr[1]] = val;
			}
			
			else
			{
				jsonObj[name] = val;
			}
		}
	);
	
	return JSON.stringify(jsonObj);
}

/**
 * 加载部门
 */
function loadDepts()
{
	ajax4Json
	(
		"getDepts", 
		
		function (data)
		{						
			var deptSel = $("#department");
			
			$.each
			(
				data,
				
				function (i)
				{
					deptSel.append("<option value='" + i + "'>" + data[i] + "</option>");
				}
			);
		}
	);
}

/**
 * 加载角色列表
 */
function loadRoles()
{
	ajax4Json
	(
		"getRoles", 
		
		function (data)
		{
			var roleSel = $("#role");
			
			$.each
			(
				data,
				
				function (i)
				{
					roleSel.append("<option value='" + i + "'>" + data[i] + "</option>");
				}
			);
		}
	);
}



//加载帖子
function loadForums(){
	ajax4Json
	(
		"getForums", 
		
		function (data)
		{
			var thead = $("#forum").children(":first");
			
			$("#forum").empty();
			
			$("#forum").append(thead);
			var forumList = data["forumList"];
			var forumSel = $("#forum");
			
			
			$.each
			(
				forumList,
				
				function (i)
				{
					var d = new  Date(forumList[i].createtime);
				    
					forumSel.append('<tr style="background-color:#EEEEEE;">'+
								                //onclick="delforum(' + forumList[i].id + ')"
								                '<th class="forumid" >'+forumList[i].id+'</th>'+
								                '<th class="forumcaption">'+forumList[i].caption+'</th>'+
								                '<th class="forumrealname">'+forumList[i].user.realname+'</th>'+
								                '<th>'+getLocalTime(d)+'</th>'+
								                '<th><button type="button" class="btn btn-primary reply" id="forum/replyForum" >回复</button>&nbsp;<button class="btn btn-primary del " type="button"  >删帖</button>&nbsp;</th></tr>');
				}
			);
		}
	);
}

//普通人员加载所以帖子
function loadcommonForums(){
	ajax4Json
	(
		"getForums", 
		
		function (data)
		{
			var thead = $("#forum").children(":first");
			
			$("#forum").empty();
			
			$("#forum").append(thead);
			var forumList = data["forumList"];
			var forumSel = $("#forum");
			
			
			$.each
			(
				forumList,
				
				function (i)
				{
					var d = new  Date(forumList[i].createtime);
				    
					forumSel.append('<tr style="background-color:#EEEEEE;">'+
								                //onclick="delforum(' + forumList[i].id + ')"
								                '<th class="forumid" >'+forumList[i].id+'</th>'+
								                '<th class="forumcaption">'+forumList[i].caption+'</th>'+
								                '<th class="forumrealname">'+forumList[i].user.realname+'</th>'+
								                '<th>'+getLocalTime(d)+'</th>'+
								                '<th><button type="button" class="btn btn-primary reply" id="forum/replyForum" >回复</button>&nbsp;</tr>');
				}
			);
		}
	);
}

//将时间戳转换成日期格式
function getLocalTime(now) { 
	 
	  var   year=now.getFullYear(); 
      var   month=(now.getMonth()+1 < 10 ? '0'+(now.getMonth()+1) : now.getMonth()+1);     
      var   date=(now.getDate()<10?'0'+(now.getDate()):now.getDate());     
      var   hour=(now.getHours()<10?'0'+(now.getHours()):now.getHours());     
      var   minute=(now.getMinutes()<10?'0'+(now.getMinutes()):now.getMinutes());     
      var   second=(now.getSeconds()<10?'0'+(now.getSeconds()):now.getSeconds());     
      return   year+"-"+month+"-"+date+"   "+hour+":"+minute+":"+second;            
} 


//加载帖子详情
function loadDetailForums(id){
	
	ajax4Json
	(
		"detailForum?id="+id,
		
		function (data)
		{
			var thead = $("#forumList").children(":first");
			
			$("#forumList").empty();
			
			$("#forumList").append(thead);
			var detailList = data["detailList"];
			var findreplyList = data["findreplyList"];
			/*
			alert("reply");
			alert(detailList);
			alert(findreplyList);
			*/
			var detaiSel1 = $("#detail1");
			var detaiSel2 = $("#detail2");
			var detaiSel3 = $("#detail3");
			var detaiSel4 = $("#detail4");
			var repSel = $(".reply1");
			var d = new  Date(detailList.createtime);
			if(findreplyList!=null&&findreplyList!=""){
				detaiSel1.text(detailList.caption);
				detaiSel2.text(detailList.content);
				detaiSel3.text(detailList.user.realname);
				detaiSel4.text(getLocalTime(d));
				$.each
				(
					findreplyList,
					
					function (i)
					{
						var d1 = new Date(findreplyList[i].createtime);
						repSel.append('<tr style="background-color:#EEEEEE;">'+
				                '<th class="forumid" >'+findreplyList[i].id+'</th>'+
				                '<th class="forumcaption">'+findreplyList[i].user.realname+'</th>'+
				                '<th class="forumrealname">'+findreplyList[i].content+'</th>'+
				                '<th>'+getLocalTime(d1)+'</th>'+
				                '</tr>');
					}
				);
				
			}else{
				//alert("bb");
				detaiSel1.text(detailList.caption);
				
				detaiSel2.text(detailList.content);
				
				detaiSel3.text(detailList.user.realname);
				
				detaiSel4.text(getLocalTime(d));
				
			}
				
		}
	);
	
}



/**
 * 创建列表项
 */
function createTH(text)
{
	return "<th>" + text + "</th>";
}

/**
 * 加载用户列表
 */
function loadUsers()
{	
	ajax4Json
	(
		"getUsers", 
		
		function (data)
		{
			var thead = $("#userList").children(":first");
			
			$("#userList").empty();
			
			$("#userList").append(thead);
			
			var userList = data["userList"];
			
			$.each
			(
				userList,
				
				function (i)
				{
					var user = userList[i];
					
					var tr = $("<tr style='background-color:#EEEEEE;'></tr>");
					
					tr.append("<th><input type='checkbox' value='" + user.id +"'></th>")
					  .append(createTH(user.login_username))
					  .append(createTH(user.realname))
					  .append(createTH(user.cellphone))
					  .append(createTH(user.dept.department_caption))
					  .append(createTH(user.age))
					  .append(createTH(user.sex))
					  .append(createTH(user.status))
					  .append(createTH(user.role.role_caption))
					  .append(createTH("<button class='btn btn-primary' type='submit'>详情</button>&nbsp;<button class='btn btn-primary' type='submit'>停用</button>"));
					
					$("#userList").append(tr);
				}
			);
		},
		
		$("#queryForm").serialize()
	);
}

/**
 * 加载通讯录列表
 */
function loadMailList()
{	
	ajax4Json
	(
		"getMailList", 
		
		function (data)
		{
			var thead = $("#mailList").children(":first");
			
			$("#mailList").empty();
			
			$("#mailList").append(thead);
			
			var mailList = data["mailList"];
			
			$.each
			(
				mailList,
				
				function (i)
				{
					var mail = mailList[i];
					
					var tr = $("<tr style='background-color:#EEEEEE;'></tr>");
					tr.append(createTH(mail.realname))
					  .append(createTH(mail.role.role_caption))
					  .append(createTH(mail.cellphone))
					  .append(createTH(mail.telephone))
					  .append(createTH(mail.telephone_ext))
					$("#mailList").append(tr);
					
				}
			);
		},
		
		$("#queryForm").serialize()
	);
	
}

/*@author:杨雪
 * 加载通告列表* */
function loadNotice()
{
	ajax4Json
	(
		"getNotices", 
		
		function (data)
		{						
			var noticelist = data["noticeslist1"];
			
			$.each
			(
					noticelist,
				
				function (i)
				{
				var no=i+1;
				var notice = noticelist[i];
				var createtime = notice.createtime;
				createtime = getTime(createtime);
			    $("#noticeslist").append(' <tr style="background-color:#EEEEEE;">'+
	                '<th>'+no+'</th>'+
	                '<th>[置顶]'+notice.caption+'</th>'+
	                '<th><a href="#" data-toggle="modal" data-target="#myModal">详情</a></th>'+
	                '<th>'+createtime+'</th></tr>');
				}
			);
		}
	);
}

/*@author:杨雪
 * 首页-加载通告动态* */
function loadNoticeforMain()
{
	ajax4Json
	(
		"getNoticesforMain", 
		
		function (data)
		{			
			var noticelist = data["noticelist"];
			if(noticelist.length>0){
				$.each
				(
				    noticelist,
					
					function (i)
					{
				    	var no=i+1;
						var notice = noticelist[i];
						var caption = notice.caption;
						if(caption.length>30){
							 caption = notice.caption+"..."
							
						}
						var createtime = notice.createtime;
						createtime = getTime(createtime);
						$("#noticelist").append(' <li class="col-md-12 main-top1"><a href="#"><p><span  class="fl hang"><span class="main-right_2">'+no+'</span>'+caption+'</span><span class="fr">'+createtime+'</span></p></a></li>'+
								           '<div class="clear"></div>');
					}
				);
				
			}
			
		}
	);
}

/*@author:杨雪
 * 首页-加载公示动态 */
function loadArticleforMain()
{
	ajax4Json
	(
		"getArticleforMain", 
		
		function (data)
		{			
			var send_articlelist = data["send_articlelist"];
			if(send_articlelist.length>0){
				$.each
				(
						send_articlelist,
					
					function (i)
					{
				    	
						var send_article= send_articlelist[i];
						var caption = send_article.caption;
						if(caption.length>30){
							var caption = send_article.caption+"..."
							
						}
						var createtime = send_article.createtime;
						createtime = getTime(createtime);
						$("#send_articlelist").append(' <li class="col-md-12 main-top1"><a href="#">'+
						     '<p><span class="fl hang">'+caption+'</span><span class="fr">'+createtime+'</span></p></a></li><div class="clear"></div>');
					}
				);
			}
		
		}
	);
}
/*@author:杨雪
 * 首页-加载论坛动态 */
function loadForumforMain()
{
	ajax4Json
	(
		"getForumforMain", 
		
		function (data)
		{			
			var forumlist = data["forumlist"];
			if(forumlist.length>0){
				$.each
				(
						forumlist,
					
					function (i)
					{
						var forum= forumlist[i];
						//if(forum.parent_id==null||forum.parent_id==''||forum.parent_id==undefined||forum.parent_id=='null'){
						//alert(forum.parent_id);
							var content = forum.content;
							if(content.length>30){
								var content = forum.content+"..."
								
							}
							var createtime = forum.createtime;
							createtime = getTime(createtime);
							$("#forumlist").append(' <li class="col-md-12 main-top1"><a href="#">'+
							           '<p style="color:#50afd7">'+forum.caption+'</p>'+
							           '<p><span class="fl hang">'+content+'</span><span class="fr">'+createtime+'</span></p></a></li>'+
							           '<div class="clear"></div>');
						//}
				    	
						
					}
				);
			}
		
		}
	);
}
/**
 * 加载角色列表for级别
 * @author:杨雪
 */
function loadRolesforLevel()
{
	ajax4Json
	(
		"getRoles", 
		
		function (data)
		{
			var roleSel = $("#rolelist");
			
			$.each
			(
				data,
				
				function (i)
				{
					
					roleSel.append('<tr style="background-color:#EEEEEE;">'+
					               ' <th><input type="checkbox" value=' + i +'></th>'+
					               '<th>'+data[i]+'</th></tr>');
				}
			);
		}
	);
}



/*@author:杨雪
 * 加载审核级别列表 */

function loadApproveLevel(){
	//定节点定义点击事件
	//alert('审核级别');
    var id = getParam();////获取他deidalert("id:"+id);
		ajax4JsonGet
		(							
			"getLevelforNode?flow_node_id="+id, 
			
			function (data)
			{	
				
				var thead = $("#approve_levellist").children(":first");
				$("#approve_levellist").empty();
				$("#approve_levellist").append(thead);
				var approve_levellist = data["approve_levellist"];
			  // alert(approve_levellist.length)
				$.each
				(
						approve_levellist,
					
					function (i)
					{
					    var no = i+1;
						var approve_level = approve_levellist[i];
						var tr = $("<tr style='background-color:#EEEEEE;'></tr>");
						
						  tr.append(createTH(no))
						  .append(createTH(approve_level.rule_caption))
						  .append(createTH( approve_level. approve_level))
                          .append(createTH("<a href='#' style='color:#666;' data-toggle='modal' data-target='#myModa2'>角色设置</a>"))									  						
                          .append(createTH("<button class='btn btn-primary' type='submit' >删除</button>"))
						$("#approve_levellist").append(tr);
					}
				);
				
			},
			$("#queryForm").serialize()
		);
}
/*@author:杨雪
 * 加载节点列表 */
function loadFlowNode(){
	//定节点定义点击事件
    var id = getParam();////获取他deidalert("id:"+id);
		ajax4JsonGet
		(							
			"getNodeforProject?approve_project_id="+id, 
			
			function (data)
			{	
				
				var thead = $("#flow_nodelist").children(":first");
				$("#flow_nodelist").empty();
				$("#flow_nodelist").append(thead);
				var flow_nodelist = data["flow_nodelist"];
				//alert(flow_nodelist.length)
				$.each
				(
					flow_nodelist,
					
					function (i)
					{
					    var no = i+1;
						var flow_node = flow_nodelist[i];
						var tr = $("<tr style='background-color:#EEEEEE;'></tr>");
						
						tr.append("<th><input type='checkbox' value='" + flow_node.id +"'></th>")
						  .append(createTH(no))
						  .append(createTH(flow_node.node_num))
                          .append(createTH("<a id="+flow_node.id+"  style='color:#666;'>节点定义</a>"))									  
						  .append(createTH(flow_node.start_confirm))
						$("#flow_nodelist").append(tr);
					}
				);
				$("#flow_nodelist tr th a").on("click",function(){
					//alert('ddjdnjn');
					var id = $(this).prop("id");//获取他的id  取到相应的id值
					//alert("id:"+id);
					setParam(id);
					var id1 = "approve/approveLevel";
					loadPage(id1, methods[id1.replace("/", "-")]);
			    });
			},
			$("#queryForm").serialize()
		);
}
/*@author:杨雪
 * 加载审批流程列表 */
function loadApprove_projectlist()
{	
	ajax4Json
	(
		"getApprove_project", 
		
		function (data)
		{
			var thead = $("#approve_projectlist").children(":first");
			
			$("#approve_projectlist").empty();
			
			$("#approve_projectlist").append(thead);
			
			var approve_projectlist = data["approve_projectlist"];

			$.each
			(
				approve_projectlist,
				
				function (i)
				{
					var approve_project = approve_projectlist[i];
					var createtime = approve_project.createtime;
					createtime = getTime(createtime);
					var tr = $("<tr style='background-color:#EEEEEE;'></tr>");
					
					tr.append("<th><input type='checkbox' value='" + approve_project.id +"'></th>")
					  .append(createTH(approve_project.table_name))
					  .append(createTH(createtime))
					  .append(createTH(approve_project.department_caption))
					  .append(createTH(approve_project.realname))
					  .append(createTH("<a id="+approve_project.id+"  style='color:#666;'>节点定义</a>"))
					  .append(createTH("<button class='btn btn-primary' type='submit' data-toggle='modal' data-target='#myModa2'>修改</button>"));
					
					$("#approve_projectlist").append(tr);
				}
			);
			$("#approve_projectlist tr th a").on("click",function(){
	            
				//alert("进来额 节点");
				var id = $(this).prop("id");//获取他的id  取到相应的id值
				//alert("id:"+id);
				
				setParam(id);
				//alert(getParam());
			
				var id1 = "approve/flowNode";
				loadPage(id1, methods[id1.replace("/", "-")]);
		    });
			
			
			
		},
		
		$("#queryForm").serialize()
	);
}

/*@author:杨雪
 * 加载审批列表 */
function loadApprove(){
	ajax4JsonGet
	(	
		"getApprove", 
		
		function (data)
		{	
			var approvelist = data["approvelist"];
			var pageNo = data["pageNo"];
			var count = data["count"];
			//给分页设置id
			$("#approvepage").append('<li><a id="before">&laquo;</a></li>'+		  
					  '<li><a id="next" >&raquo;</a></li>');
			//当前页 和总页数
			$("#page_count").text("当前页：第"+pageNo+"页    共 "+count+"页");
			//列表
			$.each
			(
			    approvelist,
				
				function (i)
				{
					var approve = approvelist[i];
					var approve_datetime = approve.approve_datetime;
					approve_datetime = getTime(approve_datetime);
					var tr = $("<tr style='background-color:#EEEEEE;'></tr>");
					
					  tr.append(createTH(approve.deliver_approve.deliver_id))
					  .append(createTH(approve.realname))
					  .append(createTH(approve.approve_level))
					  .append(createTH(approve.approve_cycle_time))
					  .append(createTH(approve.approve_suggestion))
					  .append(createTH(approve_datetime))
					  .append(createTH(approve.operation_status));
					$("#approvelist").append(tr);
				}
			);
			//绑定上一页点击事件
			$("#before").click
			(
				function ()
				{
					//alert("bofore");
					var titleMh = $("#titleMh").val();
					if((pageNo-1)<=0){ 
						var pageno2 = 1;
						
					}else{
						pageNo = parseInt(pageNo);
						var pageno2 = pageNo-1;
					}
					
					ajax4JsonGet
					(							
						"getApprove?titleMh="+titleMh+"&pageNo="+pageno2+"&count="+count, 
						
						function (data)
						{	
							//清除数据\
							//("2");
							var thead = $("#approvelist").children(":first");
							$("#approvelist").empty();
							$("#approvelist").append(thead);
							var approvelist = data["approvelist"];
							var pageNo = data["pageNo"];
							var count = data["count"];
							
							$("#page_count").text("当前页：第"+pageNo+"页    共 "+count+"页");
							$.each
							(
							    approvelist,
								
								function (i)
								{
									var approve = approvelist[i];
									var approve_datetime = approve.approve_datetime;
									approve_datetime = getTime(approve_datetime);
									var tr = $("<tr style='background-color:#EEEEEE;'></tr>");
									  tr.append(createTH(approve.deliver_approve.deliver_id))
									  .append(createTH(approve.realname))
									  .append(createTH(approve.approve_level))
									  .append(createTH(approve.approve_cycle_time))
									  .append(createTH(approve.approve_suggestion))
									  .append(createTH(approve_datetime))
									  .append(createTH(approve.operation_status));
									$("#approvelist").append(tr);
								}
							);
						},
						$("#queryForm").serialize()
					);
				}
			).css("cursor", "pointer");
			
			
			//绑定下一页点击事件
			$("#next").click
			(
				function ()
				{
					//alert("nexta");
					var titleMh = $("#titleMh").val();
					if((pageNo+1)>=count){
						var pageno1  = count;
						
					}else{
						pageNo = parseInt(pageNo);
						var pageno1 = pageNo+1 ;
					}
				
					//下一页
					ajax4JsonGet
					(	
						"getApprove?titleMh="+titleMh+"&pageNo="+pageno1+"&count="+count, 
						
						function (data)
						{	
							//清除数据
							var thead = $("#approvelist").children(":first");
							
							$("#approvelist").empty();
							
							$("#approvelist").append(thead);
							var approvelist = data["approvelist"];
							var pageNo = data["pageNo"];
							var count = data["count"];
						
							//循环分页
							$("#page_count").text("当前页：第"+pageNo+"页    共 "+count+"页");
							$.each
							(
									approvelist,
								
								function (i)
								{
									var approve = approvelist[i];
									var approve_datetime = approve.approve_datetime;
									approve_datetime = getTime(approve_datetime);
									var tr = $("<tr style='background-color:#EEEEEE;'></tr>");
									
									  tr.append(createTH(approve.deliver_approve.deliver_id))
									  .append(createTH(approve.realname))
									  .append(createTH(approve.approve_level))
									  .append(createTH(approve.approve_cycle_time))
									  .append(createTH(approve.approve_suggestion))
									  .append(createTH(approve_datetime))
									  .append(createTH(approve.operation_status));
									$("#approvelist").append(tr);
								}
							);
						},
						$("#queryForm").serialize()
					);
				}
			).css("cursor", "pointer");
			
			//给搜索框 绑定点击事件 ok
			$("#find").click
			(
				function ()
				{
					var titleMh = $("#titleMh").val();
					//模糊查询
					ajax4JsonGet
					(	
						
						"getApprove?titleMh="+titleMh, 
						
						function (data)
						{	
							//清除数据
							var thead = $("#approvelist").children(":first");
							$("#approvelist").empty();
							$("#approvelist").append(thead);
							var approvelist = data["approvelist"];
							var pageNo = data["pageNo"];
							var count = data["count"];
							
							//循环分页
							$("#page_count").text("当前页：第"+pageNo+"页    共 "+count+"页");
							$.each
							(
							    approvelist,
								
								function (i)
								{
									var approve = approvelist[i];
									var approve_datetime = approve.approve_datetime;
									approve_datetime = getTime(approve_datetime);
									var tr = $("<tr style='background-color:#EEEEEE;'></tr>");
									  tr.append(createTH(approve.deliver_approve.deliver_id))
									  .append(createTH(approve.realname))
									  .append(createTH(approve.approve_level))
									  .append(createTH(approve.approve_cycle_time))
									  .append(createTH(approve.approve_suggestion))
									  .append(createTH(approve_datetime))
									  .append(createTH(approve.operation_status));
									$("#approvelist").append(tr);
								}
							);
						},
						$("#queryForm").serialize()
					);
				}
			).css("cursor", "pointer");
			
			
		},
		$("#queryForm").serialize()
	);
	
	/**杨雪
 * ajax获取json数据
 */
function ajax4JsonGet(url, method, datas)
{
	$.ajax
	({
		type: "GET",
		
		url: url,
		
		data: datas,
		
		dataType: "JSON",
		
		async : false,
		
		success: function (data)
		{
			successMethod(data, method);
		},
	
		error: function ()
		{
			console.error("ajax error!");
		}
	});
}


/*
 * 将时间戳转换成时间字符串
 * @author杨雪
 * */
function getTime(nS) {     
	nS = nS/1000;
	var time = new Date(parseInt(nS) * 1000).toLocaleDateString().substr(0,17);
	time  = time.replace("/","-").replace("/","-");
	    return time;
	}  



/**
 * 根据role_id查询出四组数据  
 * @author:杨雪
 */
function loadUserForRoleId()
{
	ajax4Json
	(
		"getUserForRoleId", 
		
		function (data)
		{
			//alert("回来了");
			var userforRoleIdList1 = data["userforRoleIdList1"];
			
			var userforRoleIdList2 = data["userforRoleIdList2"];
			
		    var userforRoleIdList3 = data["userforRoleIdList3"];
		  
			var userforRoleIdList4 = data["userforRoleIdList4"];
		    userforRoleIdList1 = JSON.stringify(userforRoleIdList1);
			userforRoleIdList2 = JSON.stringify(userforRoleIdList2);
			userforRoleIdList3 = JSON.stringify(userforRoleIdList3);
			userforRoleIdList4 = JSON.stringify(userforRoleIdList4);
		    //alert(userforRoleIdList1);
		    //alert(userforRoleIdList2);
		    //alert(userforRoleIdList3);
		    //alert(userforRoleIdList4);
			
			$("#userforRoleIdList1").val(userforRoleIdList1);
			$("#userforRoleIdList2").val(userforRoleIdList2);
			$("#userforRoleIdList3").val(userforRoleIdList3);
			$("#userforRoleIdList4").val(userforRoleIdList4);
		}
	);
}

function loadDetailNotice(){
    var id = getParam();
  // alert(id);
    ajax4JsonGet
    (
        "noticedetail?id="+id,
        function (data)
        {
        	var detail = data["detailList"];
            var caption = detail.caption;
            var content = detail.content;
           // var dt = new  Date(data.createtime);
            $("#caption").text(caption);
            $("#content").text(content);
            $("#createtime").text(detail.createtime);
        }
    );
}






















}