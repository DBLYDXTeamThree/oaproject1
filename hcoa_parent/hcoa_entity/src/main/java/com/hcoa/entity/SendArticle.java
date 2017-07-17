package com.hcoa.entity;

import java.util.Date;

public class SendArticle {
    private Long id;

    private Long dispatcher;

    private Long unitSign;

    private Long checker;

    private Long checkArticle;

    private String mainDept;

    private String drafter;

    private String cellphone;

    private String secretLevel;

    private String fileNum;

    private String caption;

    private Integer attach;

    private String mainSend;

    private String cc;

    private String subject;

    private String typer;

    private String checkConfirm;

    private Integer copies;

    private Date createtime;

    private Long createby;

    private Integer publishFlag;

    private Integer deliverApproveFlag;
    
    private String checkerName1;
    
    private String deptName;
    
    private Boolean result;
    
    //部门
    private Department department;
    //签发
    private StaffInfo dispatcherName;
    //会签
    private StaffInfo unitSignName;
    //审核
    private StaffInfo checkerName;
    //核稿
    private StaffInfo checkArticleName;

   

	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getCheckerName1() {
		return checkerName1;
	}

	public void setCheckerName1(String checkerName1) {
		this.checkerName1 = checkerName1;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public StaffInfo getDispatcherName() {
		return dispatcherName;
	}

	public void setDispatcherName(StaffInfo dispatcherName) {
		this.dispatcherName = dispatcherName;
	}

	public StaffInfo getUnitSignName() {
		return unitSignName;
	}

	public void setUnitSignName(StaffInfo unitSignName) {
		this.unitSignName = unitSignName;
	}

	public StaffInfo getCheckerName() {
		return checkerName;
	}

	public void setCheckerName(StaffInfo checkerName) {
		this.checkerName = checkerName;
	}

	public StaffInfo getCheckArticleName() {
		return checkArticleName;
	}

	public void setCheckArticleName(StaffInfo checkArticleName) {
		this.checkArticleName = checkArticleName;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(Long dispatcher) {
        this.dispatcher = dispatcher;
    }

    public Long getUnitSign() {
        return unitSign;
    }

    public void setUnitSign(Long unitSign) {
        this.unitSign = unitSign;
    }

    public Long getChecker() {
        return checker;
    }

    public void setChecker(Long checker) {
        this.checker = checker;
    }

    public Long getCheckArticle() {
        return checkArticle;
    }

    public void setCheckArticle(Long checkArticle) {
        this.checkArticle = checkArticle;
    }

    public String getMainDept() {
        return mainDept;
    }

    public void setMainDept(String mainDept) {
        this.mainDept = mainDept == null ? null : mainDept.trim();
    }

    public String getDrafter() {
        return drafter;
    }

    public void setDrafter(String drafter) {
        this.drafter = drafter == null ? null : drafter.trim();
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone == null ? null : cellphone.trim();
    }

    public String getSecretLevel() {
        return secretLevel;
    }

    public void setSecretLevel(String secretLevel) {
        this.secretLevel = secretLevel == null ? null : secretLevel.trim();
    }

    public String getFileNum() {
        return fileNum;
    }

    public void setFileNum(String fileNum) {
        this.fileNum = fileNum == null ? null : fileNum.trim();
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption == null ? null : caption.trim();
    }

    public Integer getAttach() {
        return attach;
    }

    public void setAttach(Integer attach) {
        this.attach = attach;
    }

    public String getMainSend() {
        return mainSend;
    }

    public void setMainSend(String mainSend) {
        this.mainSend = mainSend == null ? null : mainSend.trim();
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc == null ? null : cc.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getTyper() {
        return typer;
    }

    public void setTyper(String typer) {
        this.typer = typer == null ? null : typer.trim();
    }

    public String getCheckConfirm() {
        return checkConfirm;
    }

    public void setCheckConfirm(String checkConfirm) {
        this.checkConfirm = checkConfirm == null ? null : checkConfirm.trim();
    }

    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getCreateby() {
        return createby;
    }

    public void setCreateby(Long createby) {
        this.createby = createby;
    }

    public Integer getPublishFlag() {
        return publishFlag;
    }

    public void setPublishFlag(Integer publishFlag) {
        this.publishFlag = publishFlag;
    }

    public Integer getDeliverApproveFlag() {
        return deliverApproveFlag;
    }

    public void setDeliverApproveFlag(Integer deliverApproveFlag) {
        this.deliverApproveFlag = deliverApproveFlag;
    }
}