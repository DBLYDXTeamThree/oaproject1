package com.hcoa.entity;

public class RoleSet {
    private Long id;

    private String roleCaption;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleCaption() {
        return roleCaption;
    }

    public void setRoleCaption(String roleCaption) {
        this.roleCaption = roleCaption == null ? null : roleCaption.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}