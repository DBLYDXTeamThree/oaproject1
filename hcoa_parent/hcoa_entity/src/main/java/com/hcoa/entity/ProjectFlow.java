package com.hcoa.entity;

public class ProjectFlow {
    private Long id;

    private Long flowNodeId;

    private Long approveProjectId;

    private String nodeStatus;

    private Integer currentApproveLevel;

    private Integer currentCycleTime;

    private Long publicId;

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

    public Long getApproveProjectId() {
        return approveProjectId;
    }

    public void setApproveProjectId(Long approveProjectId) {
        this.approveProjectId = approveProjectId;
    }

    public String getNodeStatus() {
        return nodeStatus;
    }

    public void setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus == null ? null : nodeStatus.trim();
    }

    public Integer getCurrentApproveLevel() {
        return currentApproveLevel;
    }

    public void setCurrentApproveLevel(Integer currentApproveLevel) {
        this.currentApproveLevel = currentApproveLevel;
    }

    public Integer getCurrentCycleTime() {
        return currentCycleTime;
    }

    public void setCurrentCycleTime(Integer currentCycleTime) {
        this.currentCycleTime = currentCycleTime;
    }

    public Long getPublicId() {
        return publicId;
    }

    public void setPublicId(Long publicId) {
        this.publicId = publicId;
    }
}