/*-------------------------------- 数据 begin ----------------------------------*/
//菜单集合
var menuList = 
[
 	//首页
 	new MenuItem
 	({
 		id: "main",
 		
 		code: "SY",
 		
 		icon: "resources/images/nav_1.jpg"
 	}),
 	
 	//部门
 	new MenuItem
 	({
 		code: "BM",
 		
 		icon: "resources/images/nav_2.jpg",
 		
 		children: 
 		{
 			code: "BM",
 			
 			ZHB: 
	 		[
				//新建发文
				new MenuItem
				({
					id: "sendArticle/dispatch",
					
					text: "新建发文"
				}),
				
				//发文管理
				new MenuItem
				({
					id: "sendArticle/article_manager_all",
					
					text: "发文管理"
				})
			],
			
			QQB:
			[
				//新建立项
				new MenuItem
				({
					id: "build/addbuild_project",
					
					text: "新建立项"
				}),
				
				//立项管理
				new MenuItem
				({
					id: "getBuild_projects",
					
					text: "立项管理"
				}),
				
				//待办立项
				new MenuItem
				({
					id: "build/backlog_manager",
					
					text: "待办立项"
				}),
				
				//已办立项
				new MenuItem
				({
					id: "build/history_manager",
					
					text: "已办立项"
				})
			],
			
			RLZYB: 
			[
				//用户注册
				new MenuItem
				({
					id: "user/register",
					
					text: "用户注册"
				}),
				
				//人员管理
				new MenuItem
				({
					id: "user/user_manager",
					
					text: "人员管理"
				})
	 		]
 		},
 		
 		children4Third:
 		[
			//综合部
			new MenuItem
			({
				code: "ZHB",
				
				text: "综合部",
				
				children: 
				[
					//新建发文
					new MenuItem
					({
						id: "sendArticle/dispatch",
						
						text: "新建发文"
					}),
					
					//发文管理
					new MenuItem
					({
						id: "sendArticle/article_manager_all",
						
						text: "发文管理"
					})
				]
			}),
		 	
		 	//前期部
		 	new MenuItem
		 	({
		 		code: "QQB",
		 		
		 		text: "前期部",
		 		
		 		children:
		 		[
					//新建立项
					new MenuItem
					({
						id: "build/addbuild_project",
						
						text: "新建立项"
					}),
					
					//立项管理
					new MenuItem
					({
						id: "getBuild_projects",
						
						text: "立项管理"
					}),
					
					//待办立项
					new MenuItem
					({
						id: "build/backlog_manager",
						
						text: "待办立项"
					}),
					
					//已办立项
					new MenuItem
					({
						id: "build/history_manager",
						
						text: "已办立项"
					})
		 		]
		 	}),
			
		 	//人事部
		 	new MenuItem
		 	({
		 		code: "RSB",
		 		
		 		text: "人事部",
		 		
		 		children:
		 		[
					//用户注册
					new MenuItem
					({
						id: "user/register",
						
						text: "用户注册"
					}),
					
					//人员管理
					new MenuItem
					({
						id: "user/user_manager",
						
						text: "人员管理"
					})
		 		]
		 	})
 		]
 	}),
 	
 	//发文
 	new MenuItem
 	({
 		code: "FW",
 		
 		icon: "resources/images/nav_3.jpg",
 		
 		children:
 		[
			//新建发文
			new MenuItem
			({
				id: "sendArticle/dispatch",
				
				text: "新建发文"
			}),
			
			//我的发文
			new MenuItem
			({
				id: "sendArticle/article_manager",
				
				text: "我的发文"
			}),
			
			//待办公文
			new MenuItem
			({
				id: "sendArticle/backlog_manager",
				
				text: "待办公文"
			}),
			
			//已办公文
			new MenuItem
			({
				id: "sendArticle/history_manager",
				
				text: "已办公文"
			})
 		]
 	}),
 	
 	//系统
 	new MenuItem
 	({
 		code: "XT",
 		
 		icon: "resources/images/nav_5.jpg",
 		
 		children:
 		[
			//用户管理
		 	new MenuItem
		 	({
		 		id: "user/user_manager",
		 		
		 		text: "用户管理"
		 	}),
		 	
		 	//角色管理
		 	new MenuItem
		 	({
		 		id: "role/role_manager",
		 		
		 		text: "角色管理"
		 	}),
		 	
		 	//部门管理
		 	new MenuItem
		 	({
		 		id: "dept/dept_manager",
		 		
		 		text: "部门管理"
		 	}),
		 	
		 	//通告管理
		 	new MenuItem
		 	({
		 		id: "getNoticesAdmin",
		 		
		 		text: "通告管理"
		 	}),
		 	
		 	//流程管理
		 	new MenuItem
		 	({
		 		id: "flow/flow_manager",
		 		
		 		text: "流程管理"
		 	})/*,
		 	
		 	new MenuItem
		 	({
		 		id: "getData_dictionarys",
		 		
		 		text: "数据字典"
		 	})
             ,
		 	new MenuItem
		 	({
		 		id: "getApprove",
		 		
		 		text: "审核列表"
		 	})*/
		 	
 		]
 	}),
 	
 	//职工
 	new MenuItem
 	({
 		id: "getForums",
 		
 		code: "ZG",
 		
 		icon: "resources/images/nav_6.jpg"
 	})/*,
 	
 	//通讯录
 	new MenuItem
 	({
 		id: "getMailList",
 		
 		code: "ZG",
 		
 		icon: "images/nav_8.jpg"
 	})*/
 	
];
/*-------------------------------- 数据 end ------------------------------------*/

/*-------------------------------- 工具方法 begin ----------------------------------*/
function createFirstMenu(item)
{
	var menu = $("<li></li>").addClass("dropdown");
	
	var iconFrame = $("<a></a>").addClass("dropdown-toggle")
								.attr("data-toggle", "dropdown");
	
	if (item.id)
	{
		iconFrame.attr("href", item.id)
		.click
		(
			function ()
			{
				window.location.href = "/base/" + item.id;
			}
		);
	}
	
	var icon = $("<img/>").attr("src", item.icon)
						  .attr("width", 91)
						  .attr("height", 82);
	
	iconFrame.append(icon);
	
	return menu.append(iconFrame);
}

function createSeconedMenu(parent, list, cls)
{
	var frame = $("<ul></ul>").addClass(cls);
	
	$.each
	(
		list,
		
		function (i)
		{
			var itemLi = $("<li></li>");
			
			if (list[i].id)
			{
				itemLi.append
				(
					$("<a></a>").prop("href", list[i].id)
								.text(list[i].text)
				);
			}
			
			else
			{
				itemLi.append
				(
					$("<a></a>").text(list[i].text)
				);
			}
			
			if (list[i].children)
			{
				createThirdMenu(itemLi, list[i].children);
			}
			
			frame.append(itemLi);
		}
	);
	
	parent.append(frame);
}

function createThirdMenu(parent, list)
{
	parent.addClass("dropdown-submenu");
	
	parent.children("a").prop("tabindex", -1);
	
	createSeconedMenu(parent, list, "dropdown-menu");
}

function initMenu()
{
	var nav = $(".nav");
	
	$.each
	(
		menuList,
			
		function (i)
		{
			var item = menuList[i];
			
			var first = createFirstMenu(item);
			
			if (item.code && item.code === "BM")
			{
				ajax4Json
				(
					"getUserObj",
					
					function (data)
					{
						var user = data["userObj"];
						
						if (user.role.id == 4)
						{
							item.children = item.children4Third;
						}
						
						else
						{
							var children = item.children;
							
							switch (user.dept.id)
							{
								case 1:
								{
									if (children.SCJYB)
									{
										item.children = children.SCJYB;
									}
									
									break;
								}
								
								case 2:
								{
									if (children.QQB)
									{
										item.children = children.QQB;
									}
									
									break;
								}
								
								case 3:
								{
									if (children.JJHTB)
									{
										item.children = children.JJHTB;
									}
									
									break;
								}
								
								case 4:
								{
									if (children.WYB)
									{
										item.children = children.WYB;
									}
									
									break;
								}
								
								case 5:
								{
									if (children.RLZYB)
									{
										item.children = children.RLZYB;
									}
									
									break;
								}
								
								case 6:
								{
									if (children.JJFZB)
									{
										item.children = children.JJFZB;
									}
									
									break;
								}
								
								case 7:
								{
									if (children.ZHB)
									{
										item.children = children.ZHB;
									}
									
									break;
								}
								
								case 8:
								{
									if (children.DQB)
									{
										item.children = children.DQB;
									}
									
									break;
								}
								
								default:
								{
									item.children = item.children4Third;
								}
							}
						}
					}
				);
			}
			
			else if (item.code && item.code === "XT")
			{
				ajax4Json
				(
					"getUserObj",
					
					function (data)
					{
						var user = data["userObj"];
						
						if (user.role.id != 4)
						{
							item.children = null;
							
							first = null;
						}
					}
				);
			}
			
			if (item.children)
			{
				createSeconedMenu(first, item.children, "dropdown-menu menu-top");
			}
			
			nav.append(first);
		}
	);
}

/**
 * ajax获取json数据
 */
function ajax4Json(url, method, datas)
{
	$.ajax({
		type : "POST",

		url : url,

		data : datas,

		dataType : "JSON",

		async : false,

		success : function(data)
		{
			successMethod(data, method);
		},

		error : function()
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
	$.ajax({
		type : "POST",

		url : url,

		data : datas,

		dataType : "JSON",

		async : false,

		// 设置请求头信息
		contentType : 'application/json;charset=utf-8',

		success : function(data)
		{
			successMethod(data, method);
		},

		error : function()
		{
			console.error("ajax error!");
		}
	});
}

function successMethod(data, method)
{
	// 成功不需要提示
	if (data.code == 1)
	{
		method(data.datas);
	}

	// 成功并且提示
	else if (data.code == 3)
	{
		alert(data.msg);

		method(data.datas);

		// $.Hidemsg();
	}

	else
	{
		alert(data.msg);
		//$.Showmsg(data.msg);
	}
}

/*
 * 将时间戳转换成时间字符串 
 */
function getTime(nS)
{
	nS = nS / 1000;
	var time = new Date(parseInt(nS) * 1000).toLocaleDateString().substr(0, 17);
	time = time.replace("/", "-").replace("/", "-");
	return time;
}

/**
 * 表单转换为复杂json参数串
 */
function formToJson(formObj)
{
	var objArr = formObj.serializeArray();

	var jsonObj = {};

	$.each(objArr,

	function(i)
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
	});

	return JSON.stringify(jsonObj);
}

//将时间戳转换成日期格式
function getLocalTime(now)
{
	var year = now.getFullYear();
	
	var month = (now.getMonth() + 1 < 10 ? '0' + (now.getMonth() + 1) : now.getMonth() + 1);
	
	var date = (now.getDate() < 10 ? '0' + (now.getDate()) : now.getDate());
	
	var hour = (now.getHours() < 10 ? '0' + (now.getHours()) : now.getHours());
	
	var minute = (now.getMinutes() < 10 ? '0' + (now.getMinutes()) : now.getMinutes());
	
	var second = (now.getSeconds() < 10 ? '0' + (now.getSeconds()) : now.getSeconds());
	
	return year + "-" + month + "-" + date + "   " + hour + ":" + minute + ":" + second;
}

function createDataRow(data, keys, hasCheckbox)
{
	var row = $("<tr style='background-color:#EEEEEE;'></tr>");
	
	if (hasCheckbox)
	{
		row.append("<th><input type='checkbox'></th>");
	}
	
	if (data.id)
	{
		row.data("id", data.id);
	}
	
	$.each
	(
		keys,
		
		function (i)
		{
			if (data[keys[i]]!=0 && !data[keys[i]] || data[keys[i]]=="")
			{
				data[keys[i]] = "无";
			}
			
			row.append("<th class='" + keys[i] + "'>" + data[keys[i]] + "</th>");
		}
	);
	
	return row;
}

function submitForm(form, action)
{
	form.prop("action", action).get(0).submit();
}

function doSubmit(form, action, path)
{
	var datas = formToJson(form);
	
	ajaxWithJson
	(
		action,
		
		function (data)
		{
			window.location.href = path;
		},
		
		datas
	);
}

function download(action, datas)
{
	var form=$("<form>");
	
	form.css("display", "none");
	
	form.attr("target", "");
	
	form.attr("method", "post");
	
	form.attr("action", action);
	
	$.each
	(
		datas,
		
		function (key)
		{
			var input = $("<input>");
			
			input.attr("type", "hidden");
			
			input.attr("name", key);
			
			input.attr("value", datas[key]);
			
			form.append(input);
		}
	);
	
	$("body").append(form);//将表单放置在web中

	form.submit();//表单提交
	
	form.remove();
}
/*-------------------------------- 工具方法 end ----------------------------------*/

/*-------------------------------- 工具类 begin ----------------------------------*/
function MenuItem(opts)
{
	this.id = opts.id ? opts.id : "";
	
	this.code = opts.code ? opts.code : "";
	
	this.text = opts.text ? opts.text : "";
	
	this.icon = opts.icon ? opts.icon : "";
	
	this.children4Third = opts.children4Third ? opts.children4Third : null;
	
	this.children = opts.children ? opts.children : null;
}
/*-------------------------------- 工具类 end ----------------------------------*/