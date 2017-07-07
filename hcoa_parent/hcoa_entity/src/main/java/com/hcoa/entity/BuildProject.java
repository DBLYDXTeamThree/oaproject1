package com.hcoa.entity;

import java.util.Date;

public class BuildProject {
    private Long id;

    private String caption;

    private String address;

    private String area;

    private String buildArea;

    private String floorNum;

    private String envCheck;

    private String buildPro;

    private String keepEng;

    private String shouldResearch;

    private String firstDesign;

    private String chooseFiles;

    private String areaPlanAgree;

    private String areaAgree;

    private String buildProjectAgree;

    private String kickOffAgree;

    private String remark;

    private Long createby;

    private Date createtime;

    private Integer deliverApproveFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption == null ? null : caption.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getBuildArea() {
        return buildArea;
    }

    public void setBuildArea(String buildArea) {
        this.buildArea = buildArea == null ? null : buildArea.trim();
    }

    public String getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(String floorNum) {
        this.floorNum = floorNum == null ? null : floorNum.trim();
    }

    public String getEnvCheck() {
        return envCheck;
    }

    public void setEnvCheck(String envCheck) {
        this.envCheck = envCheck == null ? null : envCheck.trim();
    }

    public String getBuildPro() {
        return buildPro;
    }

    public void setBuildPro(String buildPro) {
        this.buildPro = buildPro == null ? null : buildPro.trim();
    }

    public String getKeepEng() {
        return keepEng;
    }

    public void setKeepEng(String keepEng) {
        this.keepEng = keepEng == null ? null : keepEng.trim();
    }

    public String getShouldResearch() {
        return shouldResearch;
    }

    public void setShouldResearch(String shouldResearch) {
        this.shouldResearch = shouldResearch == null ? null : shouldResearch.trim();
    }

    public String getFirstDesign() {
        return firstDesign;
    }

    public void setFirstDesign(String firstDesign) {
        this.firstDesign = firstDesign == null ? null : firstDesign.trim();
    }

    public String getChooseFiles() {
        return chooseFiles;
    }

    public void setChooseFiles(String chooseFiles) {
        this.chooseFiles = chooseFiles == null ? null : chooseFiles.trim();
    }

    public String getAreaPlanAgree() {
        return areaPlanAgree;
    }

    public void setAreaPlanAgree(String areaPlanAgree) {
        this.areaPlanAgree = areaPlanAgree == null ? null : areaPlanAgree.trim();
    }

    public String getAreaAgree() {
        return areaAgree;
    }

    public void setAreaAgree(String areaAgree) {
        this.areaAgree = areaAgree == null ? null : areaAgree.trim();
    }

    public String getBuildProjectAgree() {
        return buildProjectAgree;
    }

    public void setBuildProjectAgree(String buildProjectAgree) {
        this.buildProjectAgree = buildProjectAgree == null ? null : buildProjectAgree.trim();
    }

    public String getKickOffAgree() {
        return kickOffAgree;
    }

    public void setKickOffAgree(String kickOffAgree) {
        this.kickOffAgree = kickOffAgree == null ? null : kickOffAgree.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public Integer getDeliverApproveFlag() {
        return deliverApproveFlag;
    }

    public void setDeliverApproveFlag(Integer deliverApproveFlag) {
        this.deliverApproveFlag = deliverApproveFlag;
    }
}