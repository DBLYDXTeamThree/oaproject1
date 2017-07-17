package com.hcoa.entity;

public class ApproveLevel {
    private Long id;

    private Long flowNodeId;

    private String ruleCaption;

    private Integer approveLevel;
    
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

    public Long getFlowNodeId() {
        return flowNodeId;
    }

    public void setFlowNodeId(Long flowNodeId) {
        this.flowNodeId = flowNodeId;
    }

    public String getRuleCaption() {
        return ruleCaption;
    }

    public void setRuleCaption(String ruleCaption) {
        this.ruleCaption = ruleCaption == null ? null : ruleCaption.trim();
    }

    public Integer getApproveLevel() {
        return approveLevel;
    }

    public void setApproveLevel(Integer approveLevel) {
        this.approveLevel = approveLevel;
    }
}