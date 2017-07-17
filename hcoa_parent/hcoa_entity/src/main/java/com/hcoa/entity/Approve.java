package com.hcoa.entity;

import java.util.Date;

public class Approve {
    private Long id;

    private Long deliverApproveId;

    private Long publicId;

    private Long approveProjectId;

    private Long approverId;

    private Long approveLevel;

    private Long approveCycleTime;

    private Date approveDatetime;

    private String operationStatus;

    private String approveSuggestion;
    //审核人信息
    private StaffInfo staffInfo;
    //发文信息
    private SendArticle sendArticle;
    

    public StaffInfo getStaffInfo() {
		return staffInfo;
	}

	public void setStaffInfo(StaffInfo staffInfo) {
		this.staffInfo = staffInfo;
	}

	public SendArticle getSendArticle() {
		return sendArticle;
	}

	public void setSendArticle(SendArticle sendArticle) {
		this.sendArticle = sendArticle;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeliverApproveId() {
        return deliverApproveId;
    }

    public void setDeliverApproveId(Long deliverApproveId) {
        this.deliverApproveId = deliverApproveId;
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

    public Long getApproverId() {
        return approverId;
    }

    public void setApproverId(Long approverId) {
        this.approverId = approverId;
    }

    public Long getApproveLevel() {
        return approveLevel;
    }

    public void setApproveLevel(Long approveLevel) {
        this.approveLevel = approveLevel;
    }

    public Long getApproveCycleTime() {
        return approveCycleTime;
    }

    public void setApproveCycleTime(Long approveCycleTime) {
        this.approveCycleTime = approveCycleTime;
    }

    public Date getApproveDatetime() {
        return approveDatetime;
    }

    public void setApproveDatetime(Date approveDatetime) {
        this.approveDatetime = approveDatetime;
    }

    public String getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus == null ? null : operationStatus.trim();
    }

    public String getApproveSuggestion() {
        return approveSuggestion;
    }

    public void setApproveSuggestion(String approveSuggestion) {
        this.approveSuggestion = approveSuggestion == null ? null : approveSuggestion.trim();
    }
}