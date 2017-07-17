package com.hcoa.entity;

public class FlowNode {
    private Long id;

    private String nodeNum;

    private String nodeCaption;

    private String nodeCode;

    private String tenderMethod;

    private Integer startConfirm;

    private Integer approveOrNot;

    private Long sortNum;

    private Long approveProjectId;

    private String remark;

    private Long []ids;

    public Long[] getIds() {
		return ids;
	}

	public void setIds(Long[] ids) {
		this.ids = ids;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(String nodeNum) {
        this.nodeNum = nodeNum == null ? null : nodeNum.trim();
    }

    public String getNodeCaption() {
        return nodeCaption;
    }

    public void setNodeCaption(String nodeCaption) {
        this.nodeCaption = nodeCaption == null ? null : nodeCaption.trim();
    }

    public String getNodeCode() {
        return nodeCode;
    }

    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode == null ? null : nodeCode.trim();
    }

    public String getTenderMethod() {
        return tenderMethod;
    }

    public void setTenderMethod(String tenderMethod) {
        this.tenderMethod = tenderMethod == null ? null : tenderMethod.trim();
    }

    public Integer getStartConfirm() {
        return startConfirm;
    }

    public void setStartConfirm(Integer startConfirm) {
        this.startConfirm = startConfirm;
    }

    public Integer getApproveOrNot() {
        return approveOrNot;
    }

    public void setApproveOrNot(Integer approveOrNot) {
        this.approveOrNot = approveOrNot;
    }

    public Long getSortNum() {
        return sortNum;
    }

    public void setSortNum(Long sortNum) {
        this.sortNum = sortNum;
    }

    public Long getApproveProjectId() {
        return approveProjectId;
    }

    public void setApproveProjectId(Long approveProjectId) {
        this.approveProjectId = approveProjectId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}