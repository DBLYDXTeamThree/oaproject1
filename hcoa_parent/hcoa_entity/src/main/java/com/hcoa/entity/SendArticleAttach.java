package com.hcoa.entity;

import java.util.Date;

public class SendArticleAttach {
    private Long id;

    private Long sendArticleId;

    private String fileName;

    private String filePath;

    private Long createby;

    private Date createtime;

    private Long remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSendArticleId() {
        return sendArticleId;
    }

    public void setSendArticleId(Long sendArticleId) {
        this.sendArticleId = sendArticleId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public Long getCreateby() {
        return createby;
    }

    public void setCreateby(Long createby) {
        this.createby = createby;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getRemark() {
        return remark;
    }

    public void setRemark(Long remark) {
        this.remark = remark;
    }
}