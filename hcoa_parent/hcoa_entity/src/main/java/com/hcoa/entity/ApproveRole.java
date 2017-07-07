package com.hcoa.entity;

public class ApproveRole {
    private Long id;

    private Long approveLevelId;

    private Long roleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApproveLevelId() {
        return approveLevelId;
    }

    public void setApproveLevelId(Long approveLevelId) {
        this.approveLevelId = approveLevelId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}