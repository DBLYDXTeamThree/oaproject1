package com.hcoa.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuildProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuildProjectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCaptionIsNull() {
            addCriterion("caption is null");
            return (Criteria) this;
        }

        public Criteria andCaptionIsNotNull() {
            addCriterion("caption is not null");
            return (Criteria) this;
        }

        public Criteria andCaptionEqualTo(String value) {
            addCriterion("caption =", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotEqualTo(String value) {
            addCriterion("caption <>", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionGreaterThan(String value) {
            addCriterion("caption >", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionGreaterThanOrEqualTo(String value) {
            addCriterion("caption >=", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLessThan(String value) {
            addCriterion("caption <", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLessThanOrEqualTo(String value) {
            addCriterion("caption <=", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLike(String value) {
            addCriterion("caption like", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotLike(String value) {
            addCriterion("caption not like", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionIn(List<String> values) {
            addCriterion("caption in", values, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotIn(List<String> values) {
            addCriterion("caption not in", values, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionBetween(String value1, String value2) {
            addCriterion("caption between", value1, value2, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotBetween(String value1, String value2) {
            addCriterion("caption not between", value1, value2, "caption");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andBuildAreaIsNull() {
            addCriterion("build_area is null");
            return (Criteria) this;
        }

        public Criteria andBuildAreaIsNotNull() {
            addCriterion("build_area is not null");
            return (Criteria) this;
        }

        public Criteria andBuildAreaEqualTo(String value) {
            addCriterion("build_area =", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaNotEqualTo(String value) {
            addCriterion("build_area <>", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaGreaterThan(String value) {
            addCriterion("build_area >", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaGreaterThanOrEqualTo(String value) {
            addCriterion("build_area >=", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaLessThan(String value) {
            addCriterion("build_area <", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaLessThanOrEqualTo(String value) {
            addCriterion("build_area <=", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaLike(String value) {
            addCriterion("build_area like", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaNotLike(String value) {
            addCriterion("build_area not like", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaIn(List<String> values) {
            addCriterion("build_area in", values, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaNotIn(List<String> values) {
            addCriterion("build_area not in", values, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaBetween(String value1, String value2) {
            addCriterion("build_area between", value1, value2, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaNotBetween(String value1, String value2) {
            addCriterion("build_area not between", value1, value2, "buildArea");
            return (Criteria) this;
        }

        public Criteria andFloorNumIsNull() {
            addCriterion("floor_num is null");
            return (Criteria) this;
        }

        public Criteria andFloorNumIsNotNull() {
            addCriterion("floor_num is not null");
            return (Criteria) this;
        }

        public Criteria andFloorNumEqualTo(String value) {
            addCriterion("floor_num =", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumNotEqualTo(String value) {
            addCriterion("floor_num <>", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumGreaterThan(String value) {
            addCriterion("floor_num >", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumGreaterThanOrEqualTo(String value) {
            addCriterion("floor_num >=", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumLessThan(String value) {
            addCriterion("floor_num <", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumLessThanOrEqualTo(String value) {
            addCriterion("floor_num <=", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumLike(String value) {
            addCriterion("floor_num like", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumNotLike(String value) {
            addCriterion("floor_num not like", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumIn(List<String> values) {
            addCriterion("floor_num in", values, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumNotIn(List<String> values) {
            addCriterion("floor_num not in", values, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumBetween(String value1, String value2) {
            addCriterion("floor_num between", value1, value2, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumNotBetween(String value1, String value2) {
            addCriterion("floor_num not between", value1, value2, "floorNum");
            return (Criteria) this;
        }

        public Criteria andEnvCheckIsNull() {
            addCriterion("env_check is null");
            return (Criteria) this;
        }

        public Criteria andEnvCheckIsNotNull() {
            addCriterion("env_check is not null");
            return (Criteria) this;
        }

        public Criteria andEnvCheckEqualTo(String value) {
            addCriterion("env_check =", value, "envCheck");
            return (Criteria) this;
        }

        public Criteria andEnvCheckNotEqualTo(String value) {
            addCriterion("env_check <>", value, "envCheck");
            return (Criteria) this;
        }

        public Criteria andEnvCheckGreaterThan(String value) {
            addCriterion("env_check >", value, "envCheck");
            return (Criteria) this;
        }

        public Criteria andEnvCheckGreaterThanOrEqualTo(String value) {
            addCriterion("env_check >=", value, "envCheck");
            return (Criteria) this;
        }

        public Criteria andEnvCheckLessThan(String value) {
            addCriterion("env_check <", value, "envCheck");
            return (Criteria) this;
        }

        public Criteria andEnvCheckLessThanOrEqualTo(String value) {
            addCriterion("env_check <=", value, "envCheck");
            return (Criteria) this;
        }

        public Criteria andEnvCheckLike(String value) {
            addCriterion("env_check like", value, "envCheck");
            return (Criteria) this;
        }

        public Criteria andEnvCheckNotLike(String value) {
            addCriterion("env_check not like", value, "envCheck");
            return (Criteria) this;
        }

        public Criteria andEnvCheckIn(List<String> values) {
            addCriterion("env_check in", values, "envCheck");
            return (Criteria) this;
        }

        public Criteria andEnvCheckNotIn(List<String> values) {
            addCriterion("env_check not in", values, "envCheck");
            return (Criteria) this;
        }

        public Criteria andEnvCheckBetween(String value1, String value2) {
            addCriterion("env_check between", value1, value2, "envCheck");
            return (Criteria) this;
        }

        public Criteria andEnvCheckNotBetween(String value1, String value2) {
            addCriterion("env_check not between", value1, value2, "envCheck");
            return (Criteria) this;
        }

        public Criteria andBuildProIsNull() {
            addCriterion("build_pro is null");
            return (Criteria) this;
        }

        public Criteria andBuildProIsNotNull() {
            addCriterion("build_pro is not null");
            return (Criteria) this;
        }

        public Criteria andBuildProEqualTo(String value) {
            addCriterion("build_pro =", value, "buildPro");
            return (Criteria) this;
        }

        public Criteria andBuildProNotEqualTo(String value) {
            addCriterion("build_pro <>", value, "buildPro");
            return (Criteria) this;
        }

        public Criteria andBuildProGreaterThan(String value) {
            addCriterion("build_pro >", value, "buildPro");
            return (Criteria) this;
        }

        public Criteria andBuildProGreaterThanOrEqualTo(String value) {
            addCriterion("build_pro >=", value, "buildPro");
            return (Criteria) this;
        }

        public Criteria andBuildProLessThan(String value) {
            addCriterion("build_pro <", value, "buildPro");
            return (Criteria) this;
        }

        public Criteria andBuildProLessThanOrEqualTo(String value) {
            addCriterion("build_pro <=", value, "buildPro");
            return (Criteria) this;
        }

        public Criteria andBuildProLike(String value) {
            addCriterion("build_pro like", value, "buildPro");
            return (Criteria) this;
        }

        public Criteria andBuildProNotLike(String value) {
            addCriterion("build_pro not like", value, "buildPro");
            return (Criteria) this;
        }

        public Criteria andBuildProIn(List<String> values) {
            addCriterion("build_pro in", values, "buildPro");
            return (Criteria) this;
        }

        public Criteria andBuildProNotIn(List<String> values) {
            addCriterion("build_pro not in", values, "buildPro");
            return (Criteria) this;
        }

        public Criteria andBuildProBetween(String value1, String value2) {
            addCriterion("build_pro between", value1, value2, "buildPro");
            return (Criteria) this;
        }

        public Criteria andBuildProNotBetween(String value1, String value2) {
            addCriterion("build_pro not between", value1, value2, "buildPro");
            return (Criteria) this;
        }

        public Criteria andKeepEngIsNull() {
            addCriterion("keep_eng is null");
            return (Criteria) this;
        }

        public Criteria andKeepEngIsNotNull() {
            addCriterion("keep_eng is not null");
            return (Criteria) this;
        }

        public Criteria andKeepEngEqualTo(String value) {
            addCriterion("keep_eng =", value, "keepEng");
            return (Criteria) this;
        }

        public Criteria andKeepEngNotEqualTo(String value) {
            addCriterion("keep_eng <>", value, "keepEng");
            return (Criteria) this;
        }

        public Criteria andKeepEngGreaterThan(String value) {
            addCriterion("keep_eng >", value, "keepEng");
            return (Criteria) this;
        }

        public Criteria andKeepEngGreaterThanOrEqualTo(String value) {
            addCriterion("keep_eng >=", value, "keepEng");
            return (Criteria) this;
        }

        public Criteria andKeepEngLessThan(String value) {
            addCriterion("keep_eng <", value, "keepEng");
            return (Criteria) this;
        }

        public Criteria andKeepEngLessThanOrEqualTo(String value) {
            addCriterion("keep_eng <=", value, "keepEng");
            return (Criteria) this;
        }

        public Criteria andKeepEngLike(String value) {
            addCriterion("keep_eng like", value, "keepEng");
            return (Criteria) this;
        }

        public Criteria andKeepEngNotLike(String value) {
            addCriterion("keep_eng not like", value, "keepEng");
            return (Criteria) this;
        }

        public Criteria andKeepEngIn(List<String> values) {
            addCriterion("keep_eng in", values, "keepEng");
            return (Criteria) this;
        }

        public Criteria andKeepEngNotIn(List<String> values) {
            addCriterion("keep_eng not in", values, "keepEng");
            return (Criteria) this;
        }

        public Criteria andKeepEngBetween(String value1, String value2) {
            addCriterion("keep_eng between", value1, value2, "keepEng");
            return (Criteria) this;
        }

        public Criteria andKeepEngNotBetween(String value1, String value2) {
            addCriterion("keep_eng not between", value1, value2, "keepEng");
            return (Criteria) this;
        }

        public Criteria andShouldResearchIsNull() {
            addCriterion("should_research is null");
            return (Criteria) this;
        }

        public Criteria andShouldResearchIsNotNull() {
            addCriterion("should_research is not null");
            return (Criteria) this;
        }

        public Criteria andShouldResearchEqualTo(String value) {
            addCriterion("should_research =", value, "shouldResearch");
            return (Criteria) this;
        }

        public Criteria andShouldResearchNotEqualTo(String value) {
            addCriterion("should_research <>", value, "shouldResearch");
            return (Criteria) this;
        }

        public Criteria andShouldResearchGreaterThan(String value) {
            addCriterion("should_research >", value, "shouldResearch");
            return (Criteria) this;
        }

        public Criteria andShouldResearchGreaterThanOrEqualTo(String value) {
            addCriterion("should_research >=", value, "shouldResearch");
            return (Criteria) this;
        }

        public Criteria andShouldResearchLessThan(String value) {
            addCriterion("should_research <", value, "shouldResearch");
            return (Criteria) this;
        }

        public Criteria andShouldResearchLessThanOrEqualTo(String value) {
            addCriterion("should_research <=", value, "shouldResearch");
            return (Criteria) this;
        }

        public Criteria andShouldResearchLike(String value) {
            addCriterion("should_research like", value, "shouldResearch");
            return (Criteria) this;
        }

        public Criteria andShouldResearchNotLike(String value) {
            addCriterion("should_research not like", value, "shouldResearch");
            return (Criteria) this;
        }

        public Criteria andShouldResearchIn(List<String> values) {
            addCriterion("should_research in", values, "shouldResearch");
            return (Criteria) this;
        }

        public Criteria andShouldResearchNotIn(List<String> values) {
            addCriterion("should_research not in", values, "shouldResearch");
            return (Criteria) this;
        }

        public Criteria andShouldResearchBetween(String value1, String value2) {
            addCriterion("should_research between", value1, value2, "shouldResearch");
            return (Criteria) this;
        }

        public Criteria andShouldResearchNotBetween(String value1, String value2) {
            addCriterion("should_research not between", value1, value2, "shouldResearch");
            return (Criteria) this;
        }

        public Criteria andFirstDesignIsNull() {
            addCriterion("first_design is null");
            return (Criteria) this;
        }

        public Criteria andFirstDesignIsNotNull() {
            addCriterion("first_design is not null");
            return (Criteria) this;
        }

        public Criteria andFirstDesignEqualTo(String value) {
            addCriterion("first_design =", value, "firstDesign");
            return (Criteria) this;
        }

        public Criteria andFirstDesignNotEqualTo(String value) {
            addCriterion("first_design <>", value, "firstDesign");
            return (Criteria) this;
        }

        public Criteria andFirstDesignGreaterThan(String value) {
            addCriterion("first_design >", value, "firstDesign");
            return (Criteria) this;
        }

        public Criteria andFirstDesignGreaterThanOrEqualTo(String value) {
            addCriterion("first_design >=", value, "firstDesign");
            return (Criteria) this;
        }

        public Criteria andFirstDesignLessThan(String value) {
            addCriterion("first_design <", value, "firstDesign");
            return (Criteria) this;
        }

        public Criteria andFirstDesignLessThanOrEqualTo(String value) {
            addCriterion("first_design <=", value, "firstDesign");
            return (Criteria) this;
        }

        public Criteria andFirstDesignLike(String value) {
            addCriterion("first_design like", value, "firstDesign");
            return (Criteria) this;
        }

        public Criteria andFirstDesignNotLike(String value) {
            addCriterion("first_design not like", value, "firstDesign");
            return (Criteria) this;
        }

        public Criteria andFirstDesignIn(List<String> values) {
            addCriterion("first_design in", values, "firstDesign");
            return (Criteria) this;
        }

        public Criteria andFirstDesignNotIn(List<String> values) {
            addCriterion("first_design not in", values, "firstDesign");
            return (Criteria) this;
        }

        public Criteria andFirstDesignBetween(String value1, String value2) {
            addCriterion("first_design between", value1, value2, "firstDesign");
            return (Criteria) this;
        }

        public Criteria andFirstDesignNotBetween(String value1, String value2) {
            addCriterion("first_design not between", value1, value2, "firstDesign");
            return (Criteria) this;
        }

        public Criteria andChooseFilesIsNull() {
            addCriterion("choose_files is null");
            return (Criteria) this;
        }

        public Criteria andChooseFilesIsNotNull() {
            addCriterion("choose_files is not null");
            return (Criteria) this;
        }

        public Criteria andChooseFilesEqualTo(String value) {
            addCriterion("choose_files =", value, "chooseFiles");
            return (Criteria) this;
        }

        public Criteria andChooseFilesNotEqualTo(String value) {
            addCriterion("choose_files <>", value, "chooseFiles");
            return (Criteria) this;
        }

        public Criteria andChooseFilesGreaterThan(String value) {
            addCriterion("choose_files >", value, "chooseFiles");
            return (Criteria) this;
        }

        public Criteria andChooseFilesGreaterThanOrEqualTo(String value) {
            addCriterion("choose_files >=", value, "chooseFiles");
            return (Criteria) this;
        }

        public Criteria andChooseFilesLessThan(String value) {
            addCriterion("choose_files <", value, "chooseFiles");
            return (Criteria) this;
        }

        public Criteria andChooseFilesLessThanOrEqualTo(String value) {
            addCriterion("choose_files <=", value, "chooseFiles");
            return (Criteria) this;
        }

        public Criteria andChooseFilesLike(String value) {
            addCriterion("choose_files like", value, "chooseFiles");
            return (Criteria) this;
        }

        public Criteria andChooseFilesNotLike(String value) {
            addCriterion("choose_files not like", value, "chooseFiles");
            return (Criteria) this;
        }

        public Criteria andChooseFilesIn(List<String> values) {
            addCriterion("choose_files in", values, "chooseFiles");
            return (Criteria) this;
        }

        public Criteria andChooseFilesNotIn(List<String> values) {
            addCriterion("choose_files not in", values, "chooseFiles");
            return (Criteria) this;
        }

        public Criteria andChooseFilesBetween(String value1, String value2) {
            addCriterion("choose_files between", value1, value2, "chooseFiles");
            return (Criteria) this;
        }

        public Criteria andChooseFilesNotBetween(String value1, String value2) {
            addCriterion("choose_files not between", value1, value2, "chooseFiles");
            return (Criteria) this;
        }

        public Criteria andAreaPlanAgreeIsNull() {
            addCriterion("area_plan_agree is null");
            return (Criteria) this;
        }

        public Criteria andAreaPlanAgreeIsNotNull() {
            addCriterion("area_plan_agree is not null");
            return (Criteria) this;
        }

        public Criteria andAreaPlanAgreeEqualTo(String value) {
            addCriterion("area_plan_agree =", value, "areaPlanAgree");
            return (Criteria) this;
        }

        public Criteria andAreaPlanAgreeNotEqualTo(String value) {
            addCriterion("area_plan_agree <>", value, "areaPlanAgree");
            return (Criteria) this;
        }

        public Criteria andAreaPlanAgreeGreaterThan(String value) {
            addCriterion("area_plan_agree >", value, "areaPlanAgree");
            return (Criteria) this;
        }

        public Criteria andAreaPlanAgreeGreaterThanOrEqualTo(String value) {
            addCriterion("area_plan_agree >=", value, "areaPlanAgree");
            return (Criteria) this;
        }

        public Criteria andAreaPlanAgreeLessThan(String value) {
            addCriterion("area_plan_agree <", value, "areaPlanAgree");
            return (Criteria) this;
        }

        public Criteria andAreaPlanAgreeLessThanOrEqualTo(String value) {
            addCriterion("area_plan_agree <=", value, "areaPlanAgree");
            return (Criteria) this;
        }

        public Criteria andAreaPlanAgreeLike(String value) {
            addCriterion("area_plan_agree like", value, "areaPlanAgree");
            return (Criteria) this;
        }

        public Criteria andAreaPlanAgreeNotLike(String value) {
            addCriterion("area_plan_agree not like", value, "areaPlanAgree");
            return (Criteria) this;
        }

        public Criteria andAreaPlanAgreeIn(List<String> values) {
            addCriterion("area_plan_agree in", values, "areaPlanAgree");
            return (Criteria) this;
        }

        public Criteria andAreaPlanAgreeNotIn(List<String> values) {
            addCriterion("area_plan_agree not in", values, "areaPlanAgree");
            return (Criteria) this;
        }

        public Criteria andAreaPlanAgreeBetween(String value1, String value2) {
            addCriterion("area_plan_agree between", value1, value2, "areaPlanAgree");
            return (Criteria) this;
        }

        public Criteria andAreaPlanAgreeNotBetween(String value1, String value2) {
            addCriterion("area_plan_agree not between", value1, value2, "areaPlanAgree");
            return (Criteria) this;
        }

        public Criteria andAreaAgreeIsNull() {
            addCriterion("area_agree is null");
            return (Criteria) this;
        }

        public Criteria andAreaAgreeIsNotNull() {
            addCriterion("area_agree is not null");
            return (Criteria) this;
        }

        public Criteria andAreaAgreeEqualTo(String value) {
            addCriterion("area_agree =", value, "areaAgree");
            return (Criteria) this;
        }

        public Criteria andAreaAgreeNotEqualTo(String value) {
            addCriterion("area_agree <>", value, "areaAgree");
            return (Criteria) this;
        }

        public Criteria andAreaAgreeGreaterThan(String value) {
            addCriterion("area_agree >", value, "areaAgree");
            return (Criteria) this;
        }

        public Criteria andAreaAgreeGreaterThanOrEqualTo(String value) {
            addCriterion("area_agree >=", value, "areaAgree");
            return (Criteria) this;
        }

        public Criteria andAreaAgreeLessThan(String value) {
            addCriterion("area_agree <", value, "areaAgree");
            return (Criteria) this;
        }

        public Criteria andAreaAgreeLessThanOrEqualTo(String value) {
            addCriterion("area_agree <=", value, "areaAgree");
            return (Criteria) this;
        }

        public Criteria andAreaAgreeLike(String value) {
            addCriterion("area_agree like", value, "areaAgree");
            return (Criteria) this;
        }

        public Criteria andAreaAgreeNotLike(String value) {
            addCriterion("area_agree not like", value, "areaAgree");
            return (Criteria) this;
        }

        public Criteria andAreaAgreeIn(List<String> values) {
            addCriterion("area_agree in", values, "areaAgree");
            return (Criteria) this;
        }

        public Criteria andAreaAgreeNotIn(List<String> values) {
            addCriterion("area_agree not in", values, "areaAgree");
            return (Criteria) this;
        }

        public Criteria andAreaAgreeBetween(String value1, String value2) {
            addCriterion("area_agree between", value1, value2, "areaAgree");
            return (Criteria) this;
        }

        public Criteria andAreaAgreeNotBetween(String value1, String value2) {
            addCriterion("area_agree not between", value1, value2, "areaAgree");
            return (Criteria) this;
        }

        public Criteria andBuildProjectAgreeIsNull() {
            addCriterion("build_project_agree is null");
            return (Criteria) this;
        }

        public Criteria andBuildProjectAgreeIsNotNull() {
            addCriterion("build_project_agree is not null");
            return (Criteria) this;
        }

        public Criteria andBuildProjectAgreeEqualTo(String value) {
            addCriterion("build_project_agree =", value, "buildProjectAgree");
            return (Criteria) this;
        }

        public Criteria andBuildProjectAgreeNotEqualTo(String value) {
            addCriterion("build_project_agree <>", value, "buildProjectAgree");
            return (Criteria) this;
        }

        public Criteria andBuildProjectAgreeGreaterThan(String value) {
            addCriterion("build_project_agree >", value, "buildProjectAgree");
            return (Criteria) this;
        }

        public Criteria andBuildProjectAgreeGreaterThanOrEqualTo(String value) {
            addCriterion("build_project_agree >=", value, "buildProjectAgree");
            return (Criteria) this;
        }

        public Criteria andBuildProjectAgreeLessThan(String value) {
            addCriterion("build_project_agree <", value, "buildProjectAgree");
            return (Criteria) this;
        }

        public Criteria andBuildProjectAgreeLessThanOrEqualTo(String value) {
            addCriterion("build_project_agree <=", value, "buildProjectAgree");
            return (Criteria) this;
        }

        public Criteria andBuildProjectAgreeLike(String value) {
            addCriterion("build_project_agree like", value, "buildProjectAgree");
            return (Criteria) this;
        }

        public Criteria andBuildProjectAgreeNotLike(String value) {
            addCriterion("build_project_agree not like", value, "buildProjectAgree");
            return (Criteria) this;
        }

        public Criteria andBuildProjectAgreeIn(List<String> values) {
            addCriterion("build_project_agree in", values, "buildProjectAgree");
            return (Criteria) this;
        }

        public Criteria andBuildProjectAgreeNotIn(List<String> values) {
            addCriterion("build_project_agree not in", values, "buildProjectAgree");
            return (Criteria) this;
        }

        public Criteria andBuildProjectAgreeBetween(String value1, String value2) {
            addCriterion("build_project_agree between", value1, value2, "buildProjectAgree");
            return (Criteria) this;
        }

        public Criteria andBuildProjectAgreeNotBetween(String value1, String value2) {
            addCriterion("build_project_agree not between", value1, value2, "buildProjectAgree");
            return (Criteria) this;
        }

        public Criteria andKickOffAgreeIsNull() {
            addCriterion("kick_off_agree is null");
            return (Criteria) this;
        }

        public Criteria andKickOffAgreeIsNotNull() {
            addCriterion("kick_off_agree is not null");
            return (Criteria) this;
        }

        public Criteria andKickOffAgreeEqualTo(String value) {
            addCriterion("kick_off_agree =", value, "kickOffAgree");
            return (Criteria) this;
        }

        public Criteria andKickOffAgreeNotEqualTo(String value) {
            addCriterion("kick_off_agree <>", value, "kickOffAgree");
            return (Criteria) this;
        }

        public Criteria andKickOffAgreeGreaterThan(String value) {
            addCriterion("kick_off_agree >", value, "kickOffAgree");
            return (Criteria) this;
        }

        public Criteria andKickOffAgreeGreaterThanOrEqualTo(String value) {
            addCriterion("kick_off_agree >=", value, "kickOffAgree");
            return (Criteria) this;
        }

        public Criteria andKickOffAgreeLessThan(String value) {
            addCriterion("kick_off_agree <", value, "kickOffAgree");
            return (Criteria) this;
        }

        public Criteria andKickOffAgreeLessThanOrEqualTo(String value) {
            addCriterion("kick_off_agree <=", value, "kickOffAgree");
            return (Criteria) this;
        }

        public Criteria andKickOffAgreeLike(String value) {
            addCriterion("kick_off_agree like", value, "kickOffAgree");
            return (Criteria) this;
        }

        public Criteria andKickOffAgreeNotLike(String value) {
            addCriterion("kick_off_agree not like", value, "kickOffAgree");
            return (Criteria) this;
        }

        public Criteria andKickOffAgreeIn(List<String> values) {
            addCriterion("kick_off_agree in", values, "kickOffAgree");
            return (Criteria) this;
        }

        public Criteria andKickOffAgreeNotIn(List<String> values) {
            addCriterion("kick_off_agree not in", values, "kickOffAgree");
            return (Criteria) this;
        }

        public Criteria andKickOffAgreeBetween(String value1, String value2) {
            addCriterion("kick_off_agree between", value1, value2, "kickOffAgree");
            return (Criteria) this;
        }

        public Criteria andKickOffAgreeNotBetween(String value1, String value2) {
            addCriterion("kick_off_agree not between", value1, value2, "kickOffAgree");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("createby is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("createby is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(Long value) {
            addCriterion("createby =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(Long value) {
            addCriterion("createby <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(Long value) {
            addCriterion("createby >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(Long value) {
            addCriterion("createby >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(Long value) {
            addCriterion("createby <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(Long value) {
            addCriterion("createby <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<Long> values) {
            addCriterion("createby in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<Long> values) {
            addCriterion("createby not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(Long value1, Long value2) {
            addCriterion("createby between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(Long value1, Long value2) {
            addCriterion("createby not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveFlagIsNull() {
            addCriterion("deliver_approve_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveFlagIsNotNull() {
            addCriterion("deliver_approve_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveFlagEqualTo(Integer value) {
            addCriterion("deliver_approve_flag =", value, "deliverApproveFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveFlagNotEqualTo(Integer value) {
            addCriterion("deliver_approve_flag <>", value, "deliverApproveFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveFlagGreaterThan(Integer value) {
            addCriterion("deliver_approve_flag >", value, "deliverApproveFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliver_approve_flag >=", value, "deliverApproveFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveFlagLessThan(Integer value) {
            addCriterion("deliver_approve_flag <", value, "deliverApproveFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveFlagLessThanOrEqualTo(Integer value) {
            addCriterion("deliver_approve_flag <=", value, "deliverApproveFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveFlagIn(List<Integer> values) {
            addCriterion("deliver_approve_flag in", values, "deliverApproveFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveFlagNotIn(List<Integer> values) {
            addCriterion("deliver_approve_flag not in", values, "deliverApproveFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveFlagBetween(Integer value1, Integer value2) {
            addCriterion("deliver_approve_flag between", value1, value2, "deliverApproveFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("deliver_approve_flag not between", value1, value2, "deliverApproveFlag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}