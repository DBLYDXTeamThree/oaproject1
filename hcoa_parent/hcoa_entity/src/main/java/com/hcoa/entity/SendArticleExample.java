package com.hcoa.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SendArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SendArticleExample() {
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

        public Criteria andDispatcherIsNull() {
            addCriterion("dispatcher is null");
            return (Criteria) this;
        }

        public Criteria andDispatcherIsNotNull() {
            addCriterion("dispatcher is not null");
            return (Criteria) this;
        }

        public Criteria andDispatcherEqualTo(Long value) {
            addCriterion("dispatcher =", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherNotEqualTo(Long value) {
            addCriterion("dispatcher <>", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherGreaterThan(Long value) {
            addCriterion("dispatcher >", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherGreaterThanOrEqualTo(Long value) {
            addCriterion("dispatcher >=", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherLessThan(Long value) {
            addCriterion("dispatcher <", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherLessThanOrEqualTo(Long value) {
            addCriterion("dispatcher <=", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherIn(List<Long> values) {
            addCriterion("dispatcher in", values, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherNotIn(List<Long> values) {
            addCriterion("dispatcher not in", values, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherBetween(Long value1, Long value2) {
            addCriterion("dispatcher between", value1, value2, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherNotBetween(Long value1, Long value2) {
            addCriterion("dispatcher not between", value1, value2, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andUnitSignIsNull() {
            addCriterion("unit_sign is null");
            return (Criteria) this;
        }

        public Criteria andUnitSignIsNotNull() {
            addCriterion("unit_sign is not null");
            return (Criteria) this;
        }

        public Criteria andUnitSignEqualTo(Long value) {
            addCriterion("unit_sign =", value, "unitSign");
            return (Criteria) this;
        }

        public Criteria andUnitSignNotEqualTo(Long value) {
            addCriterion("unit_sign <>", value, "unitSign");
            return (Criteria) this;
        }

        public Criteria andUnitSignGreaterThan(Long value) {
            addCriterion("unit_sign >", value, "unitSign");
            return (Criteria) this;
        }

        public Criteria andUnitSignGreaterThanOrEqualTo(Long value) {
            addCriterion("unit_sign >=", value, "unitSign");
            return (Criteria) this;
        }

        public Criteria andUnitSignLessThan(Long value) {
            addCriterion("unit_sign <", value, "unitSign");
            return (Criteria) this;
        }

        public Criteria andUnitSignLessThanOrEqualTo(Long value) {
            addCriterion("unit_sign <=", value, "unitSign");
            return (Criteria) this;
        }

        public Criteria andUnitSignIn(List<Long> values) {
            addCriterion("unit_sign in", values, "unitSign");
            return (Criteria) this;
        }

        public Criteria andUnitSignNotIn(List<Long> values) {
            addCriterion("unit_sign not in", values, "unitSign");
            return (Criteria) this;
        }

        public Criteria andUnitSignBetween(Long value1, Long value2) {
            addCriterion("unit_sign between", value1, value2, "unitSign");
            return (Criteria) this;
        }

        public Criteria andUnitSignNotBetween(Long value1, Long value2) {
            addCriterion("unit_sign not between", value1, value2, "unitSign");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNull() {
            addCriterion("checker is null");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNotNull() {
            addCriterion("checker is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerEqualTo(Long value) {
            addCriterion("checker =", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotEqualTo(Long value) {
            addCriterion("checker <>", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThan(Long value) {
            addCriterion("checker >", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThanOrEqualTo(Long value) {
            addCriterion("checker >=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThan(Long value) {
            addCriterion("checker <", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThanOrEqualTo(Long value) {
            addCriterion("checker <=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerIn(List<Long> values) {
            addCriterion("checker in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotIn(List<Long> values) {
            addCriterion("checker not in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerBetween(Long value1, Long value2) {
            addCriterion("checker between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotBetween(Long value1, Long value2) {
            addCriterion("checker not between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckArticleIsNull() {
            addCriterion("check_article is null");
            return (Criteria) this;
        }

        public Criteria andCheckArticleIsNotNull() {
            addCriterion("check_article is not null");
            return (Criteria) this;
        }

        public Criteria andCheckArticleEqualTo(Long value) {
            addCriterion("check_article =", value, "checkArticle");
            return (Criteria) this;
        }

        public Criteria andCheckArticleNotEqualTo(Long value) {
            addCriterion("check_article <>", value, "checkArticle");
            return (Criteria) this;
        }

        public Criteria andCheckArticleGreaterThan(Long value) {
            addCriterion("check_article >", value, "checkArticle");
            return (Criteria) this;
        }

        public Criteria andCheckArticleGreaterThanOrEqualTo(Long value) {
            addCriterion("check_article >=", value, "checkArticle");
            return (Criteria) this;
        }

        public Criteria andCheckArticleLessThan(Long value) {
            addCriterion("check_article <", value, "checkArticle");
            return (Criteria) this;
        }

        public Criteria andCheckArticleLessThanOrEqualTo(Long value) {
            addCriterion("check_article <=", value, "checkArticle");
            return (Criteria) this;
        }

        public Criteria andCheckArticleIn(List<Long> values) {
            addCriterion("check_article in", values, "checkArticle");
            return (Criteria) this;
        }

        public Criteria andCheckArticleNotIn(List<Long> values) {
            addCriterion("check_article not in", values, "checkArticle");
            return (Criteria) this;
        }

        public Criteria andCheckArticleBetween(Long value1, Long value2) {
            addCriterion("check_article between", value1, value2, "checkArticle");
            return (Criteria) this;
        }

        public Criteria andCheckArticleNotBetween(Long value1, Long value2) {
            addCriterion("check_article not between", value1, value2, "checkArticle");
            return (Criteria) this;
        }

        public Criteria andMainDeptIsNull() {
            addCriterion("main_dept is null");
            return (Criteria) this;
        }

        public Criteria andMainDeptIsNotNull() {
            addCriterion("main_dept is not null");
            return (Criteria) this;
        }

        public Criteria andMainDeptEqualTo(String value) {
            addCriterion("main_dept =", value, "mainDept");
            return (Criteria) this;
        }

        public Criteria andMainDeptNotEqualTo(String value) {
            addCriterion("main_dept <>", value, "mainDept");
            return (Criteria) this;
        }

        public Criteria andMainDeptGreaterThan(String value) {
            addCriterion("main_dept >", value, "mainDept");
            return (Criteria) this;
        }

        public Criteria andMainDeptGreaterThanOrEqualTo(String value) {
            addCriterion("main_dept >=", value, "mainDept");
            return (Criteria) this;
        }

        public Criteria andMainDeptLessThan(String value) {
            addCriterion("main_dept <", value, "mainDept");
            return (Criteria) this;
        }

        public Criteria andMainDeptLessThanOrEqualTo(String value) {
            addCriterion("main_dept <=", value, "mainDept");
            return (Criteria) this;
        }

        public Criteria andMainDeptLike(String value) {
            addCriterion("main_dept like", value, "mainDept");
            return (Criteria) this;
        }

        public Criteria andMainDeptNotLike(String value) {
            addCriterion("main_dept not like", value, "mainDept");
            return (Criteria) this;
        }

        public Criteria andMainDeptIn(List<String> values) {
            addCriterion("main_dept in", values, "mainDept");
            return (Criteria) this;
        }

        public Criteria andMainDeptNotIn(List<String> values) {
            addCriterion("main_dept not in", values, "mainDept");
            return (Criteria) this;
        }

        public Criteria andMainDeptBetween(String value1, String value2) {
            addCriterion("main_dept between", value1, value2, "mainDept");
            return (Criteria) this;
        }

        public Criteria andMainDeptNotBetween(String value1, String value2) {
            addCriterion("main_dept not between", value1, value2, "mainDept");
            return (Criteria) this;
        }

        public Criteria andDrafterIsNull() {
            addCriterion("drafter is null");
            return (Criteria) this;
        }

        public Criteria andDrafterIsNotNull() {
            addCriterion("drafter is not null");
            return (Criteria) this;
        }

        public Criteria andDrafterEqualTo(String value) {
            addCriterion("drafter =", value, "drafter");
            return (Criteria) this;
        }

        public Criteria andDrafterNotEqualTo(String value) {
            addCriterion("drafter <>", value, "drafter");
            return (Criteria) this;
        }

        public Criteria andDrafterGreaterThan(String value) {
            addCriterion("drafter >", value, "drafter");
            return (Criteria) this;
        }

        public Criteria andDrafterGreaterThanOrEqualTo(String value) {
            addCriterion("drafter >=", value, "drafter");
            return (Criteria) this;
        }

        public Criteria andDrafterLessThan(String value) {
            addCriterion("drafter <", value, "drafter");
            return (Criteria) this;
        }

        public Criteria andDrafterLessThanOrEqualTo(String value) {
            addCriterion("drafter <=", value, "drafter");
            return (Criteria) this;
        }

        public Criteria andDrafterLike(String value) {
            addCriterion("drafter like", value, "drafter");
            return (Criteria) this;
        }

        public Criteria andDrafterNotLike(String value) {
            addCriterion("drafter not like", value, "drafter");
            return (Criteria) this;
        }

        public Criteria andDrafterIn(List<String> values) {
            addCriterion("drafter in", values, "drafter");
            return (Criteria) this;
        }

        public Criteria andDrafterNotIn(List<String> values) {
            addCriterion("drafter not in", values, "drafter");
            return (Criteria) this;
        }

        public Criteria andDrafterBetween(String value1, String value2) {
            addCriterion("drafter between", value1, value2, "drafter");
            return (Criteria) this;
        }

        public Criteria andDrafterNotBetween(String value1, String value2) {
            addCriterion("drafter not between", value1, value2, "drafter");
            return (Criteria) this;
        }

        public Criteria andCellphoneIsNull() {
            addCriterion("cellphone is null");
            return (Criteria) this;
        }

        public Criteria andCellphoneIsNotNull() {
            addCriterion("cellphone is not null");
            return (Criteria) this;
        }

        public Criteria andCellphoneEqualTo(String value) {
            addCriterion("cellphone =", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotEqualTo(String value) {
            addCriterion("cellphone <>", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneGreaterThan(String value) {
            addCriterion("cellphone >", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("cellphone >=", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLessThan(String value) {
            addCriterion("cellphone <", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLessThanOrEqualTo(String value) {
            addCriterion("cellphone <=", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLike(String value) {
            addCriterion("cellphone like", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotLike(String value) {
            addCriterion("cellphone not like", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneIn(List<String> values) {
            addCriterion("cellphone in", values, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotIn(List<String> values) {
            addCriterion("cellphone not in", values, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneBetween(String value1, String value2) {
            addCriterion("cellphone between", value1, value2, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotBetween(String value1, String value2) {
            addCriterion("cellphone not between", value1, value2, "cellphone");
            return (Criteria) this;
        }

        public Criteria andSecretLevelIsNull() {
            addCriterion("secret_level is null");
            return (Criteria) this;
        }

        public Criteria andSecretLevelIsNotNull() {
            addCriterion("secret_level is not null");
            return (Criteria) this;
        }

        public Criteria andSecretLevelEqualTo(String value) {
            addCriterion("secret_level =", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelNotEqualTo(String value) {
            addCriterion("secret_level <>", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelGreaterThan(String value) {
            addCriterion("secret_level >", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelGreaterThanOrEqualTo(String value) {
            addCriterion("secret_level >=", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelLessThan(String value) {
            addCriterion("secret_level <", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelLessThanOrEqualTo(String value) {
            addCriterion("secret_level <=", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelLike(String value) {
            addCriterion("secret_level like", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelNotLike(String value) {
            addCriterion("secret_level not like", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelIn(List<String> values) {
            addCriterion("secret_level in", values, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelNotIn(List<String> values) {
            addCriterion("secret_level not in", values, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelBetween(String value1, String value2) {
            addCriterion("secret_level between", value1, value2, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelNotBetween(String value1, String value2) {
            addCriterion("secret_level not between", value1, value2, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andFileNumIsNull() {
            addCriterion("file_num is null");
            return (Criteria) this;
        }

        public Criteria andFileNumIsNotNull() {
            addCriterion("file_num is not null");
            return (Criteria) this;
        }

        public Criteria andFileNumEqualTo(String value) {
            addCriterion("file_num =", value, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumNotEqualTo(String value) {
            addCriterion("file_num <>", value, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumGreaterThan(String value) {
            addCriterion("file_num >", value, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumGreaterThanOrEqualTo(String value) {
            addCriterion("file_num >=", value, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumLessThan(String value) {
            addCriterion("file_num <", value, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumLessThanOrEqualTo(String value) {
            addCriterion("file_num <=", value, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumLike(String value) {
            addCriterion("file_num like", value, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumNotLike(String value) {
            addCriterion("file_num not like", value, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumIn(List<String> values) {
            addCriterion("file_num in", values, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumNotIn(List<String> values) {
            addCriterion("file_num not in", values, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumBetween(String value1, String value2) {
            addCriterion("file_num between", value1, value2, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumNotBetween(String value1, String value2) {
            addCriterion("file_num not between", value1, value2, "fileNum");
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

        public Criteria andAttachIsNull() {
            addCriterion("attach is null");
            return (Criteria) this;
        }

        public Criteria andAttachIsNotNull() {
            addCriterion("attach is not null");
            return (Criteria) this;
        }

        public Criteria andAttachEqualTo(Integer value) {
            addCriterion("attach =", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotEqualTo(Integer value) {
            addCriterion("attach <>", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachGreaterThan(Integer value) {
            addCriterion("attach >", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachGreaterThanOrEqualTo(Integer value) {
            addCriterion("attach >=", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLessThan(Integer value) {
            addCriterion("attach <", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLessThanOrEqualTo(Integer value) {
            addCriterion("attach <=", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachIn(List<Integer> values) {
            addCriterion("attach in", values, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotIn(List<Integer> values) {
            addCriterion("attach not in", values, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachBetween(Integer value1, Integer value2) {
            addCriterion("attach between", value1, value2, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotBetween(Integer value1, Integer value2) {
            addCriterion("attach not between", value1, value2, "attach");
            return (Criteria) this;
        }

        public Criteria andMainSendIsNull() {
            addCriterion("main_send is null");
            return (Criteria) this;
        }

        public Criteria andMainSendIsNotNull() {
            addCriterion("main_send is not null");
            return (Criteria) this;
        }

        public Criteria andMainSendEqualTo(String value) {
            addCriterion("main_send =", value, "mainSend");
            return (Criteria) this;
        }

        public Criteria andMainSendNotEqualTo(String value) {
            addCriterion("main_send <>", value, "mainSend");
            return (Criteria) this;
        }

        public Criteria andMainSendGreaterThan(String value) {
            addCriterion("main_send >", value, "mainSend");
            return (Criteria) this;
        }

        public Criteria andMainSendGreaterThanOrEqualTo(String value) {
            addCriterion("main_send >=", value, "mainSend");
            return (Criteria) this;
        }

        public Criteria andMainSendLessThan(String value) {
            addCriterion("main_send <", value, "mainSend");
            return (Criteria) this;
        }

        public Criteria andMainSendLessThanOrEqualTo(String value) {
            addCriterion("main_send <=", value, "mainSend");
            return (Criteria) this;
        }

        public Criteria andMainSendLike(String value) {
            addCriterion("main_send like", value, "mainSend");
            return (Criteria) this;
        }

        public Criteria andMainSendNotLike(String value) {
            addCriterion("main_send not like", value, "mainSend");
            return (Criteria) this;
        }

        public Criteria andMainSendIn(List<String> values) {
            addCriterion("main_send in", values, "mainSend");
            return (Criteria) this;
        }

        public Criteria andMainSendNotIn(List<String> values) {
            addCriterion("main_send not in", values, "mainSend");
            return (Criteria) this;
        }

        public Criteria andMainSendBetween(String value1, String value2) {
            addCriterion("main_send between", value1, value2, "mainSend");
            return (Criteria) this;
        }

        public Criteria andMainSendNotBetween(String value1, String value2) {
            addCriterion("main_send not between", value1, value2, "mainSend");
            return (Criteria) this;
        }

        public Criteria andCcIsNull() {
            addCriterion("cc is null");
            return (Criteria) this;
        }

        public Criteria andCcIsNotNull() {
            addCriterion("cc is not null");
            return (Criteria) this;
        }

        public Criteria andCcEqualTo(String value) {
            addCriterion("cc =", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotEqualTo(String value) {
            addCriterion("cc <>", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcGreaterThan(String value) {
            addCriterion("cc >", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcGreaterThanOrEqualTo(String value) {
            addCriterion("cc >=", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcLessThan(String value) {
            addCriterion("cc <", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcLessThanOrEqualTo(String value) {
            addCriterion("cc <=", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcLike(String value) {
            addCriterion("cc like", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotLike(String value) {
            addCriterion("cc not like", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcIn(List<String> values) {
            addCriterion("cc in", values, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotIn(List<String> values) {
            addCriterion("cc not in", values, "cc");
            return (Criteria) this;
        }

        public Criteria andCcBetween(String value1, String value2) {
            addCriterion("cc between", value1, value2, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotBetween(String value1, String value2) {
            addCriterion("cc not between", value1, value2, "cc");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andTyperIsNull() {
            addCriterion("typer is null");
            return (Criteria) this;
        }

        public Criteria andTyperIsNotNull() {
            addCriterion("typer is not null");
            return (Criteria) this;
        }

        public Criteria andTyperEqualTo(String value) {
            addCriterion("typer =", value, "typer");
            return (Criteria) this;
        }

        public Criteria andTyperNotEqualTo(String value) {
            addCriterion("typer <>", value, "typer");
            return (Criteria) this;
        }

        public Criteria andTyperGreaterThan(String value) {
            addCriterion("typer >", value, "typer");
            return (Criteria) this;
        }

        public Criteria andTyperGreaterThanOrEqualTo(String value) {
            addCriterion("typer >=", value, "typer");
            return (Criteria) this;
        }

        public Criteria andTyperLessThan(String value) {
            addCriterion("typer <", value, "typer");
            return (Criteria) this;
        }

        public Criteria andTyperLessThanOrEqualTo(String value) {
            addCriterion("typer <=", value, "typer");
            return (Criteria) this;
        }

        public Criteria andTyperLike(String value) {
            addCriterion("typer like", value, "typer");
            return (Criteria) this;
        }

        public Criteria andTyperNotLike(String value) {
            addCriterion("typer not like", value, "typer");
            return (Criteria) this;
        }

        public Criteria andTyperIn(List<String> values) {
            addCriterion("typer in", values, "typer");
            return (Criteria) this;
        }

        public Criteria andTyperNotIn(List<String> values) {
            addCriterion("typer not in", values, "typer");
            return (Criteria) this;
        }

        public Criteria andTyperBetween(String value1, String value2) {
            addCriterion("typer between", value1, value2, "typer");
            return (Criteria) this;
        }

        public Criteria andTyperNotBetween(String value1, String value2) {
            addCriterion("typer not between", value1, value2, "typer");
            return (Criteria) this;
        }

        public Criteria andCheckConfirmIsNull() {
            addCriterion("check_confirm is null");
            return (Criteria) this;
        }

        public Criteria andCheckConfirmIsNotNull() {
            addCriterion("check_confirm is not null");
            return (Criteria) this;
        }

        public Criteria andCheckConfirmEqualTo(String value) {
            addCriterion("check_confirm =", value, "checkConfirm");
            return (Criteria) this;
        }

        public Criteria andCheckConfirmNotEqualTo(String value) {
            addCriterion("check_confirm <>", value, "checkConfirm");
            return (Criteria) this;
        }

        public Criteria andCheckConfirmGreaterThan(String value) {
            addCriterion("check_confirm >", value, "checkConfirm");
            return (Criteria) this;
        }

        public Criteria andCheckConfirmGreaterThanOrEqualTo(String value) {
            addCriterion("check_confirm >=", value, "checkConfirm");
            return (Criteria) this;
        }

        public Criteria andCheckConfirmLessThan(String value) {
            addCriterion("check_confirm <", value, "checkConfirm");
            return (Criteria) this;
        }

        public Criteria andCheckConfirmLessThanOrEqualTo(String value) {
            addCriterion("check_confirm <=", value, "checkConfirm");
            return (Criteria) this;
        }

        public Criteria andCheckConfirmLike(String value) {
            addCriterion("check_confirm like", value, "checkConfirm");
            return (Criteria) this;
        }

        public Criteria andCheckConfirmNotLike(String value) {
            addCriterion("check_confirm not like", value, "checkConfirm");
            return (Criteria) this;
        }

        public Criteria andCheckConfirmIn(List<String> values) {
            addCriterion("check_confirm in", values, "checkConfirm");
            return (Criteria) this;
        }

        public Criteria andCheckConfirmNotIn(List<String> values) {
            addCriterion("check_confirm not in", values, "checkConfirm");
            return (Criteria) this;
        }

        public Criteria andCheckConfirmBetween(String value1, String value2) {
            addCriterion("check_confirm between", value1, value2, "checkConfirm");
            return (Criteria) this;
        }

        public Criteria andCheckConfirmNotBetween(String value1, String value2) {
            addCriterion("check_confirm not between", value1, value2, "checkConfirm");
            return (Criteria) this;
        }

        public Criteria andCopiesIsNull() {
            addCriterion("copies is null");
            return (Criteria) this;
        }

        public Criteria andCopiesIsNotNull() {
            addCriterion("copies is not null");
            return (Criteria) this;
        }

        public Criteria andCopiesEqualTo(Integer value) {
            addCriterion("copies =", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesNotEqualTo(Integer value) {
            addCriterion("copies <>", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesGreaterThan(Integer value) {
            addCriterion("copies >", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesGreaterThanOrEqualTo(Integer value) {
            addCriterion("copies >=", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesLessThan(Integer value) {
            addCriterion("copies <", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesLessThanOrEqualTo(Integer value) {
            addCriterion("copies <=", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesIn(List<Integer> values) {
            addCriterion("copies in", values, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesNotIn(List<Integer> values) {
            addCriterion("copies not in", values, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesBetween(Integer value1, Integer value2) {
            addCriterion("copies between", value1, value2, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesNotBetween(Integer value1, Integer value2) {
            addCriterion("copies not between", value1, value2, "copies");
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

        public Criteria andPublishFlagIsNull() {
            addCriterion("publish_flag is null");
            return (Criteria) this;
        }

        public Criteria andPublishFlagIsNotNull() {
            addCriterion("publish_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPublishFlagEqualTo(Integer value) {
            addCriterion("publish_flag =", value, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagNotEqualTo(Integer value) {
            addCriterion("publish_flag <>", value, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagGreaterThan(Integer value) {
            addCriterion("publish_flag >", value, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_flag >=", value, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagLessThan(Integer value) {
            addCriterion("publish_flag <", value, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagLessThanOrEqualTo(Integer value) {
            addCriterion("publish_flag <=", value, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagIn(List<Integer> values) {
            addCriterion("publish_flag in", values, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagNotIn(List<Integer> values) {
            addCriterion("publish_flag not in", values, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagBetween(Integer value1, Integer value2) {
            addCriterion("publish_flag between", value1, value2, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_flag not between", value1, value2, "publishFlag");
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