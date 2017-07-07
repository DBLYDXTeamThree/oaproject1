package com.hcoa.entity;

public class Department {
    private Long id;

    private String departmentCaption;

    private Long parentId;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentCaption() {
        return departmentCaption;
    }

    public void setDepartmentCaption(String departmentCaption) {
        this.departmentCaption = departmentCaption == null ? null : departmentCaption.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}