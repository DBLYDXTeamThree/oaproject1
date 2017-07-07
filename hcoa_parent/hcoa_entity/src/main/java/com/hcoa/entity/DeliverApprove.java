package com.hcoa.entity;

import java.util.Date;

public class DeliverApprove {
    private Long id;

    private Long projectFlowId;

    private Long publicId;

    private Long approveProjectId;

    private Long deliverId;

    private String deliveMessage;

    private String remark;

    private Date deliverDatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjectFlowId() {
        return projectFlowId;
    }

    public void setProjectFlowId(Long projectFlowId) {
        this.projectFlowId = projectFlowId;
    }

    public Long getPublicId() {
        return publicId;
    }

    public void setPublicId(Long publicId) {
        this.publicId = publicId;
    }

    public Long getApproveProjectId() {
        return approveProjectId;
    }

    public void setApproveProjectId(Long approveProjectId) {
        this.approveProjectId = approveProjectId;
    }

    public Long getDeliverId() {
        return deliverId;
    }

    public void setDeliverId(Long deliverId) {
        this.deliverId = deliverId;
    }

    public String getDeliveMessage() {
        return deliveMessage;
    }

    public void setDeliveMessage(String deliveMessage) {
        this.deliveMessage = deliveMessage == null ? null : deliveMessage.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getDeliverDatetime() {
        return deliverDatetime;
    }

    public void setDeliverDatetime(Date deliverDatetime) {
        this.deliverDatetime = deliverDatetime;
    }
}