package com.hcoa.entity;

import java.util.ArrayList;
import java.util.List;

public class FlowNodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlowNodeExample() {
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

        public Criteria andNodeNumIsNull() {
            addCriterion("node_num is null");
            return (Criteria) this;
        }

        public Criteria andNodeNumIsNotNull() {
            addCriterion("node_num is not null");
            return (Criteria) this;
        }

        public Criteria andNodeNumEqualTo(String value) {
            addCriterion("node_num =", value, "nodeNum");
            return (Criteria) this;
        }

        public Criteria andNodeNumNotEqualTo(String value) {
            addCriterion("node_num <>", value, "nodeNum");
            return (Criteria) this;
        }

        public Criteria andNodeNumGreaterThan(String value) {
            addCriterion("node_num >", value, "nodeNum");
            return (Criteria) this;
        }

        public Criteria andNodeNumGreaterThanOrEqualTo(String value) {
            addCriterion("node_num >=", value, "nodeNum");
            return (Criteria) this;
        }

        public Criteria andNodeNumLessThan(String value) {
            addCriterion("node_num <", value, "nodeNum");
            return (Criteria) this;
        }

        public Criteria andNodeNumLessThanOrEqualTo(String value) {
            addCriterion("node_num <=", value, "nodeNum");
            return (Criteria) this;
        }

        public Criteria andNodeNumLike(String value) {
            addCriterion("node_num like", value, "nodeNum");
            return (Criteria) this;
        }

        public Criteria andNodeNumNotLike(String value) {
            addCriterion("node_num not like", value, "nodeNum");
            return (Criteria) this;
        }

        public Criteria andNodeNumIn(List<String> values) {
            addCriterion("node_num in", values, "nodeNum");
            return (Criteria) this;
        }

        public Criteria andNodeNumNotIn(List<String> values) {
            addCriterion("node_num not in", values, "nodeNum");
            return (Criteria) this;
        }

        public Criteria andNodeNumBetween(String value1, String value2) {
            addCriterion("node_num between", value1, value2, "nodeNum");
            return (Criteria) this;
        }

        public Criteria andNodeNumNotBetween(String value1, String value2) {
            addCriterion("node_num not between", value1, value2, "nodeNum");
            return (Criteria) this;
        }

        public Criteria andNodeCaptionIsNull() {
            addCriterion("node_caption is null");
            return (Criteria) this;
        }

        public Criteria andNodeCaptionIsNotNull() {
            addCriterion("node_caption is not null");
            return (Criteria) this;
        }

        public Criteria andNodeCaptionEqualTo(String value) {
            addCriterion("node_caption =", value, "nodeCaption");
            return (Criteria) this;
        }

        public Criteria andNodeCaptionNotEqualTo(String value) {
            addCriterion("node_caption <>", value, "nodeCaption");
            return (Criteria) this;
        }

        public Criteria andNodeCaptionGreaterThan(String value) {
            addCriterion("node_caption >", value, "nodeCaption");
            return (Criteria) this;
        }

        public Criteria andNodeCaptionGreaterThanOrEqualTo(String value) {
            addCriterion("node_caption >=", value, "nodeCaption");
            return (Criteria) this;
        }

        public Criteria andNodeCaptionLessThan(String value) {
            addCriterion("node_caption <", value, "nodeCaption");
            return (Criteria) this;
        }

        public Criteria andNodeCaptionLessThanOrEqualTo(String value) {
            addCriterion("node_caption <=", value, "nodeCaption");
            return (Criteria) this;
        }

        public Criteria andNodeCaptionLike(String value) {
            addCriterion("node_caption like", value, "nodeCaption");
            return (Criteria) this;
        }

        public Criteria andNodeCaptionNotLike(String value) {
            addCriterion("node_caption not like", value, "nodeCaption");
            return (Criteria) this;
        }

        public Criteria andNodeCaptionIn(List<String> values) {
            addCriterion("node_caption in", values, "nodeCaption");
            return (Criteria) this;
        }

        public Criteria andNodeCaptionNotIn(List<String> values) {
            addCriterion("node_caption not in", values, "nodeCaption");
            return (Criteria) this;
        }

        public Criteria andNodeCaptionBetween(String value1, String value2) {
            addCriterion("node_caption between", value1, value2, "nodeCaption");
            return (Criteria) this;
        }

        public Criteria andNodeCaptionNotBetween(String value1, String value2) {
            addCriterion("node_caption not between", value1, value2, "nodeCaption");
            return (Criteria) this;
        }

        public Criteria andNodeCodeIsNull() {
            addCriterion("node_code is null");
            return (Criteria) this;
        }

        public Criteria andNodeCodeIsNotNull() {
            addCriterion("node_code is not null");
            return (Criteria) this;
        }

        public Criteria andNodeCodeEqualTo(String value) {
            addCriterion("node_code =", value, "nodeCode");
            return (Criteria) this;
        }

        public Criteria andNodeCodeNotEqualTo(String value) {
            addCriterion("node_code <>", value, "nodeCode");
            return (Criteria) this;
        }

        public Criteria andNodeCodeGreaterThan(String value) {
            addCriterion("node_code >", value, "nodeCode");
            return (Criteria) this;
        }

        public Criteria andNodeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("node_code >=", value, "nodeCode");
            return (Criteria) this;
        }

        public Criteria andNodeCodeLessThan(String value) {
            addCriterion("node_code <", value, "nodeCode");
            return (Criteria) this;
        }

        public Criteria andNodeCodeLessThanOrEqualTo(String value) {
            addCriterion("node_code <=", value, "nodeCode");
            return (Criteria) this;
        }

        public Criteria andNodeCodeLike(String value) {
            addCriterion("node_code like", value, "nodeCode");
            return (Criteria) this;
        }

        public Criteria andNodeCodeNotLike(String value) {
            addCriterion("node_code not like", value, "nodeCode");
            return (Criteria) this;
        }

        public Criteria andNodeCodeIn(List<String> values) {
            addCriterion("node_code in", values, "nodeCode");
            return (Criteria) this;
        }

        public Criteria andNodeCodeNotIn(List<String> values) {
            addCriterion("node_code not in", values, "nodeCode");
            return (Criteria) this;
        }

        public Criteria andNodeCodeBetween(String value1, String value2) {
            addCriterion("node_code between", value1, value2, "nodeCode");
            return (Criteria) this;
        }

        public Criteria andNodeCodeNotBetween(String value1, String value2) {
            addCriterion("node_code not between", value1, value2, "nodeCode");
            return (Criteria) this;
        }

        public Criteria andTenderMethodIsNull() {
            addCriterion("tender_method is null");
            return (Criteria) this;
        }

        public Criteria andTenderMethodIsNotNull() {
            addCriterion("tender_method is not null");
            return (Criteria) this;
        }

        public Criteria andTenderMethodEqualTo(String value) {
            addCriterion("tender_method =", value, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodNotEqualTo(String value) {
            addCriterion("tender_method <>", value, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodGreaterThan(String value) {
            addCriterion("tender_method >", value, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodGreaterThanOrEqualTo(String value) {
            addCriterion("tender_method >=", value, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodLessThan(String value) {
            addCriterion("tender_method <", value, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodLessThanOrEqualTo(String value) {
            addCriterion("tender_method <=", value, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodLike(String value) {
            addCriterion("tender_method like", value, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodNotLike(String value) {
            addCriterion("tender_method not like", value, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodIn(List<String> values) {
            addCriterion("tender_method in", values, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodNotIn(List<String> values) {
            addCriterion("tender_method not in", values, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodBetween(String value1, String value2) {
            addCriterion("tender_method between", value1, value2, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodNotBetween(String value1, String value2) {
            addCriterion("tender_method not between", value1, value2, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andStartConfirmIsNull() {
            addCriterion("start_confirm is null");
            return (Criteria) this;
        }

        public Criteria andStartConfirmIsNotNull() {
            addCriterion("start_confirm is not null");
            return (Criteria) this;
        }

        public Criteria andStartConfirmEqualTo(Integer value) {
            addCriterion("start_confirm =", value, "startConfirm");
            return (Criteria) this;
        }

        public Criteria andStartConfirmNotEqualTo(Integer value) {
            addCriterion("start_confirm <>", value, "startConfirm");
            return (Criteria) this;
        }

        public Criteria andStartConfirmGreaterThan(Integer value) {
            addCriterion("start_confirm >", value, "startConfirm");
            return (Criteria) this;
        }

        public Criteria andStartConfirmGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_confirm >=", value, "startConfirm");
            return (Criteria) this;
        }

        public Criteria andStartConfirmLessThan(Integer value) {
            addCriterion("start_confirm <", value, "startConfirm");
            return (Criteria) this;
        }

        public Criteria andStartConfirmLessThanOrEqualTo(Integer value) {
            addCriterion("start_confirm <=", value, "startConfirm");
            return (Criteria) this;
        }

        public Criteria andStartConfirmIn(List<Integer> values) {
            addCriterion("start_confirm in", values, "startConfirm");
            return (Criteria) this;
        }

        public Criteria andStartConfirmNotIn(List<Integer> values) {
            addCriterion("start_confirm not in", values, "startConfirm");
            return (Criteria) this;
        }

        public Criteria andStartConfirmBetween(Integer value1, Integer value2) {
            addCriterion("start_confirm between", value1, value2, "startConfirm");
            return (Criteria) this;
        }

        public Criteria andStartConfirmNotBetween(Integer value1, Integer value2) {
            addCriterion("start_confirm not between", value1, value2, "startConfirm");
            return (Criteria) this;
        }

        public Criteria andApproveOrNotIsNull() {
            addCriterion("approve_or_not is null");
            return (Criteria) this;
        }

        public Criteria andApproveOrNotIsNotNull() {
            addCriterion("approve_or_not is not null");
            return (Criteria) this;
        }

        public Criteria andApproveOrNotEqualTo(Integer value) {
            addCriterion("approve_or_not =", value, "approveOrNot");
            return (Criteria) this;
        }

        public Criteria andApproveOrNotNotEqualTo(Integer value) {
            addCriterion("approve_or_not <>", value, "approveOrNot");
            return (Criteria) this;
        }

        public Criteria andApproveOrNotGreaterThan(Integer value) {
            addCriterion("approve_or_not >", value, "approveOrNot");
            return (Criteria) this;
        }

        public Criteria andApproveOrNotGreaterThanOrEqualTo(Integer value) {
            addCriterion("approve_or_not >=", value, "approveOrNot");
            return (Criteria) this;
        }

        public Criteria andApproveOrNotLessThan(Integer value) {
            addCriterion("approve_or_not <", value, "approveOrNot");
            return (Criteria) this;
        }

        public Criteria andApproveOrNotLessThanOrEqualTo(Integer value) {
            addCriterion("approve_or_not <=", value, "approveOrNot");
            return (Criteria) this;
        }

        public Criteria andApproveOrNotIn(List<Integer> values) {
            addCriterion("approve_or_not in", values, "approveOrNot");
            return (Criteria) this;
        }

        public Criteria andApproveOrNotNotIn(List<Integer> values) {
            addCriterion("approve_or_not not in", values, "approveOrNot");
            return (Criteria) this;
        }

        public Criteria andApproveOrNotBetween(Integer value1, Integer value2) {
            addCriterion("approve_or_not between", value1, value2, "approveOrNot");
            return (Criteria) this;
        }

        public Criteria andApproveOrNotNotBetween(Integer value1, Integer value2) {
            addCriterion("approve_or_not not between", value1, value2, "approveOrNot");
            return (Criteria) this;
        }

        public Criteria andSortNumIsNull() {
            addCriterion("sort_num is null");
            return (Criteria) this;
        }

        public Criteria andSortNumIsNotNull() {
            addCriterion("sort_num is not null");
            return (Criteria) this;
        }

        public Criteria andSortNumEqualTo(Long value) {
            addCriterion("sort_num =", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumNotEqualTo(Long value) {
            addCriterion("sort_num <>", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumGreaterThan(Long value) {
            addCriterion("sort_num >", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumGreaterThanOrEqualTo(Long value) {
            addCriterion("sort_num >=", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumLessThan(Long value) {
            addCriterion("sort_num <", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumLessThanOrEqualTo(Long value) {
            addCriterion("sort_num <=", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumIn(List<Long> values) {
            addCriterion("sort_num in", values, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumNotIn(List<Long> values) {
            addCriterion("sort_num not in", values, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumBetween(Long value1, Long value2) {
            addCriterion("sort_num between", value1, value2, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumNotBetween(Long value1, Long value2) {
            addCriterion("sort_num not between", value1, value2, "sortNum");
            return (Criteria) this;
        }

        public Criteria andApproveProjectIdIsNull() {
            addCriterion("approve_project_id is null");
            return (Criteria) this;
        }

        public Criteria andApproveProjectIdIsNotNull() {
            addCriterion("approve_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andApproveProjectIdEqualTo(Long value) {
            addCriterion("approve_project_id =", value, "approveProjectId");
            return (Criteria) this;
        }

        public Criteria andApproveProjectIdNotEqualTo(Long value) {
            addCriterion("approve_project_id <>", value, "approveProjectId");
            return (Criteria) this;
        }

        public Criteria andApproveProjectIdGreaterThan(Long value) {
            addCriterion("approve_project_id >", value, "approveProjectId");
            return (Criteria) this;
        }

        public Criteria andApproveProjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("approve_project_id >=", value, "approveProjectId");
            return (Criteria) this;
        }

        public Criteria andApproveProjectIdLessThan(Long value) {
            addCriterion("approve_project_id <", value, "approveProjectId");
            return (Criteria) this;
        }

        public Criteria andApproveProjectIdLessThanOrEqualTo(Long value) {
            addCriterion("approve_project_id <=", value, "approveProjectId");
            return (Criteria) this;
        }

        public Criteria andApproveProjectIdIn(List<Long> values) {
            addCriterion("approve_project_id in", values, "approveProjectId");
            return (Criteria) this;
        }

        public Criteria andApproveProjectIdNotIn(List<Long> values) {
            addCriterion("approve_project_id not in", values, "approveProjectId");
            return (Criteria) this;
        }

        public Criteria andApproveProjectIdBetween(Long value1, Long value2) {
            addCriterion("approve_project_id between", value1, value2, "approveProjectId");
            return (Criteria) this;
        }

        public Criteria andApproveProjectIdNotBetween(Long value1, Long value2) {
            addCriterion("approve_project_id not between", value1, value2, "approveProjectId");
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