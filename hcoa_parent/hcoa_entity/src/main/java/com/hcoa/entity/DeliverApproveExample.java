package com.hcoa.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeliverApproveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliverApproveExample() {
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

        public Criteria andProjectFlowIdIsNull() {
            addCriterion("project_flow_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectFlowIdIsNotNull() {
            addCriterion("project_flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectFlowIdEqualTo(Long value) {
            addCriterion("project_flow_id =", value, "projectFlowId");
            return (Criteria) this;
        }

        public Criteria andProjectFlowIdNotEqualTo(Long value) {
            addCriterion("project_flow_id <>", value, "projectFlowId");
            return (Criteria) this;
        }

        public Criteria andProjectFlowIdGreaterThan(Long value) {
            addCriterion("project_flow_id >", value, "projectFlowId");
            return (Criteria) this;
        }

        public Criteria andProjectFlowIdGreaterThanOrEqualTo(Long value) {
            addCriterion("project_flow_id >=", value, "projectFlowId");
            return (Criteria) this;
        }

        public Criteria andProjectFlowIdLessThan(Long value) {
            addCriterion("project_flow_id <", value, "projectFlowId");
            return (Criteria) this;
        }

        public Criteria andProjectFlowIdLessThanOrEqualTo(Long value) {
            addCriterion("project_flow_id <=", value, "projectFlowId");
            return (Criteria) this;
        }

        public Criteria andProjectFlowIdIn(List<Long> values) {
            addCriterion("project_flow_id in", values, "projectFlowId");
            return (Criteria) this;
        }

        public Criteria andProjectFlowIdNotIn(List<Long> values) {
            addCriterion("project_flow_id not in", values, "projectFlowId");
            return (Criteria) this;
        }

        public Criteria andProjectFlowIdBetween(Long value1, Long value2) {
            addCriterion("project_flow_id between", value1, value2, "projectFlowId");
            return (Criteria) this;
        }

        public Criteria andProjectFlowIdNotBetween(Long value1, Long value2) {
            addCriterion("project_flow_id not between", value1, value2, "projectFlowId");
            return (Criteria) this;
        }

        public Criteria andPublicIdIsNull() {
            addCriterion("public_id is null");
            return (Criteria) this;
        }

        public Criteria andPublicIdIsNotNull() {
            addCriterion("public_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublicIdEqualTo(Long value) {
            addCriterion("public_id =", value, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdNotEqualTo(Long value) {
            addCriterion("public_id <>", value, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdGreaterThan(Long value) {
            addCriterion("public_id >", value, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("public_id >=", value, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdLessThan(Long value) {
            addCriterion("public_id <", value, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdLessThanOrEqualTo(Long value) {
            addCriterion("public_id <=", value, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdIn(List<Long> values) {
            addCriterion("public_id in", values, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdNotIn(List<Long> values) {
            addCriterion("public_id not in", values, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdBetween(Long value1, Long value2) {
            addCriterion("public_id between", value1, value2, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdNotBetween(Long value1, Long value2) {
            addCriterion("public_id not between", value1, value2, "publicId");
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

        public Criteria andDeliverIdIsNull() {
            addCriterion("deliver_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliverIdIsNotNull() {
            addCriterion("deliver_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverIdEqualTo(Long value) {
            addCriterion("deliver_id =", value, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdNotEqualTo(Long value) {
            addCriterion("deliver_id <>", value, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdGreaterThan(Long value) {
            addCriterion("deliver_id >", value, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdGreaterThanOrEqualTo(Long value) {
            addCriterion("deliver_id >=", value, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdLessThan(Long value) {
            addCriterion("deliver_id <", value, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdLessThanOrEqualTo(Long value) {
            addCriterion("deliver_id <=", value, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdIn(List<Long> values) {
            addCriterion("deliver_id in", values, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdNotIn(List<Long> values) {
            addCriterion("deliver_id not in", values, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdBetween(Long value1, Long value2) {
            addCriterion("deliver_id between", value1, value2, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdNotBetween(Long value1, Long value2) {
            addCriterion("deliver_id not between", value1, value2, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliveMessageIsNull() {
            addCriterion("delive_message is null");
            return (Criteria) this;
        }

        public Criteria andDeliveMessageIsNotNull() {
            addCriterion("delive_message is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveMessageEqualTo(String value) {
            addCriterion("delive_message =", value, "deliveMessage");
            return (Criteria) this;
        }

        public Criteria andDeliveMessageNotEqualTo(String value) {
            addCriterion("delive_message <>", value, "deliveMessage");
            return (Criteria) this;
        }

        public Criteria andDeliveMessageGreaterThan(String value) {
            addCriterion("delive_message >", value, "deliveMessage");
            return (Criteria) this;
        }

        public Criteria andDeliveMessageGreaterThanOrEqualTo(String value) {
            addCriterion("delive_message >=", value, "deliveMessage");
            return (Criteria) this;
        }

        public Criteria andDeliveMessageLessThan(String value) {
            addCriterion("delive_message <", value, "deliveMessage");
            return (Criteria) this;
        }

        public Criteria andDeliveMessageLessThanOrEqualTo(String value) {
            addCriterion("delive_message <=", value, "deliveMessage");
            return (Criteria) this;
        }

        public Criteria andDeliveMessageLike(String value) {
            addCriterion("delive_message like", value, "deliveMessage");
            return (Criteria) this;
        }

        public Criteria andDeliveMessageNotLike(String value) {
            addCriterion("delive_message not like", value, "deliveMessage");
            return (Criteria) this;
        }

        public Criteria andDeliveMessageIn(List<String> values) {
            addCriterion("delive_message in", values, "deliveMessage");
            return (Criteria) this;
        }

        public Criteria andDeliveMessageNotIn(List<String> values) {
            addCriterion("delive_message not in", values, "deliveMessage");
            return (Criteria) this;
        }

        public Criteria andDeliveMessageBetween(String value1, String value2) {
            addCriterion("delive_message between", value1, value2, "deliveMessage");
            return (Criteria) this;
        }

        public Criteria andDeliveMessageNotBetween(String value1, String value2) {
            addCriterion("delive_message not between", value1, value2, "deliveMessage");
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

        public Criteria andDeliverDatetimeIsNull() {
            addCriterion("deliver_datetime is null");
            return (Criteria) this;
        }

        public Criteria andDeliverDatetimeIsNotNull() {
            addCriterion("deliver_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverDatetimeEqualTo(Date value) {
            addCriterion("deliver_datetime =", value, "deliverDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliverDatetimeNotEqualTo(Date value) {
            addCriterion("deliver_datetime <>", value, "deliverDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliverDatetimeGreaterThan(Date value) {
            addCriterion("deliver_datetime >", value, "deliverDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliverDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deliver_datetime >=", value, "deliverDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliverDatetimeLessThan(Date value) {
            addCriterion("deliver_datetime <", value, "deliverDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliverDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("deliver_datetime <=", value, "deliverDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliverDatetimeIn(List<Date> values) {
            addCriterion("deliver_datetime in", values, "deliverDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliverDatetimeNotIn(List<Date> values) {
            addCriterion("deliver_datetime not in", values, "deliverDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliverDatetimeBetween(Date value1, Date value2) {
            addCriterion("deliver_datetime between", value1, value2, "deliverDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliverDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("deliver_datetime not between", value1, value2, "deliverDatetime");
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