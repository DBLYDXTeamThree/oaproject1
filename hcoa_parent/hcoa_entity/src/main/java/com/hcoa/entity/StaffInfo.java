package com.hcoa.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class StaffInfo {
	private Long id;

	private String realname;

	private String deptname;

	private String loginUsername;

	private String loginPwd;

	private String cellphone;

	private Long departmentId;

	private Long roleId;

	private Long approveRuleId;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;

	private String position;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date entrytime;

	private String isDisplay;

	private String sex;

	private String status;

	private String telephone;

	private String telephoneExt;

	/**
	 * 员工部门
	 */
	private Department dept;
	/**
	 * 员工角色
	 */
	private RoleSet role;

	public String getDeptname() {
		if (dept != null) {
			return dept.getDepartmentCaption();
		}
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	private Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public RoleSet getRole() {
		return role;
	}

	public void setRole(RoleSet role) {
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname == null ? null : realname.trim();
	}

	public String getLoginUsername() {
		return loginUsername;
	}

	public void setLoginUsername(String loginUsername) {
		this.loginUsername = loginUsername == null ? null : loginUsername.trim();
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd == null ? null : loginPwd.trim();
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone == null ? null : cellphone.trim();
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getApproveRuleId() {
		return approveRuleId;
	}

	public void setApproveRuleId(Long approveRuleId) {
		this.approveRuleId = approveRuleId;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position == null ? null : position.trim();
	}

	public Date getEntrytime() {
		return entrytime;
	}

	public void setEntrytime(Date entrytime) {
		this.entrytime = entrytime;
	}

	public String getIsDisplay() {
		return isDisplay;
	}

	public void setIsDisplay(String isDisplay) {
		this.isDisplay = isDisplay == null ? null : isDisplay.trim();
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone == null ? null : telephone.trim();
	}

	public String getTelephoneExt() {
		return telephoneExt;
	}

	public void setTelephoneExt(String telephoneExt) {
		this.telephoneExt = telephoneExt == null ? null : telephoneExt.trim();
	}
}