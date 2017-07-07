package com.hcoa.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApproveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApproveExample() {
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

        public Criteria andDeliverApproveIdIsNull() {
            addCriterion("deliver_approve_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveIdIsNotNull() {
            addCriterion("deliver_approve_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveIdEqualTo(Long value) {
            addCriterion("deliver_approve_id =", value, "deliverApproveId");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveIdNotEqualTo(Long value) {
            addCriterion("deliver_approve_id <>", value, "deliverApproveId");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveIdGreaterThan(Long value) {
            addCriterion("deliver_approve_id >", value, "deliverApproveId");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveIdGreaterThanOrEqualTo(Long value) {
            addCriterion("deliver_approve_id >=", value, "deliverApproveId");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveIdLessThan(Long value) {
            addCriterion("deliver_approve_id <", value, "deliverApproveId");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveIdLessThanOrEqualTo(Long value) {
            addCriterion("deliver_approve_id <=", value, "deliverApproveId");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveIdIn(List<Long> values) {
            addCriterion("deliver_approve_id in", values, "deliverApproveId");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveIdNotIn(List<Long> values) {
            addCriterion("deliver_approve_id not in", values, "deliverApproveId");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveIdBetween(Long value1, Long value2) {
            addCriterion("deliver_approve_id between", value1, value2, "deliverApproveId");
            return (Criteria) this;
        }

        public Criteria andDeliverApproveIdNotBetween(Long value1, Long value2) {
            addCriterion("deliver_approve_id not between", value1, value2, "deliverApproveId");
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

        public Criteria andApproverIdIsNull() {
            addCriterion("approver_id is null");
            return (Criteria) this;
        }

        public Criteria andApproverIdIsNotNull() {
            addCriterion("approver_id is not null");
            return (Criteria) this;
        }

        public Criteria andApproverIdEqualTo(Long value) {
            addCriterion("approver_id =", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdNotEqualTo(Long value) {
            addCriterion("approver_id <>", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdGreaterThan(Long value) {
            addCriterion("approver_id >", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdGreaterThanOrEqualTo(Long value) {
            addCriterion("approver_id >=", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdLessThan(Long value) {
            addCriterion("approver_id <", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdLessThanOrEqualTo(Long value) {
            addCriterion("approver_id <=", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdIn(List<Long> values) {
            addCriterion("approver_id in", values, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdNotIn(List<Long> values) {
            addCriterion("approver_id not in", values, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdBetween(Long value1, Long value2) {
            addCriterion("approver_id between", value1, value2, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdNotBetween(Long value1, Long value2) {
            addCriterion("approver_id not between", value1, value2, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproveLevelIsNull() {
            addCriterion("approve_level is null");
            return (Criteria) this;
        }

        public Criteria andApproveLevelIsNotNull() {
            addCriterion("approve_level is not null");
            return (Criteria) this;
        }

        public Criteria andApproveLevelEqualTo(Long value) {
            addCriterion("approve_level =", value, "approveLevel");
            return (Criteria) this;
        }

        public Criteria andApproveLevelNotEqualTo(Long value) {
            addCriterion("approve_level <>", value, "approveLevel");
            return (Criteria) this;
        }

        public Criteria andApproveLevelGreaterThan(Long value) {
            addCriterion("approve_level >", value, "approveLevel");
            return (Criteria) this;
        }

        public Criteria andApproveLevelGreaterThanOrEqualTo(Long value) {
            addCriterion("approve_level >=", value, "approveLevel");
            return (Criteria) this;
        }

        public Criteria andApproveLevelLessThan(Long value) {
            addCriterion("approve_level <", value, "approveLevel");
            return (Criteria) this;
        }

        public Criteria andApproveLevelLessThanOrEqualTo(Long value) {
            addCriterion("approve_level <=", value, "approveLevel");
            return (Criteria) this;
        }

        public Criteria andApproveLevelIn(List<Long> values) {
            addCriterion("approve_level in", values, "approveLevel");
            return (Criteria) this;
        }

        public Criteria andApproveLevelNotIn(List<Long> values) {
            addCriterion("approve_level not in", values, "approveLevel");
            return (Criteria) this;
        }

        public Criteria andApproveLevelBetween(Long value1, Long value2) {
            addCriterion("approve_level between", value1, value2, "approveLevel");
            return (Criteria) this;
        }

        public Criteria andApproveLevelNotBetween(Long value1, Long value2) {
            addCriterion("approve_level not between", value1, value2, "approveLevel");
            return (Criteria) this;
        }

        public Criteria andApproveCycleTimeIsNull() {
            addCriterion("approve_cycle_time is null");
            return (Criteria) this;
        }

        public Criteria andApproveCycleTimeIsNotNull() {
            addCriterion("approve_cycle_time is not null");
            return (Criteria) this;
        }

        public Criteria andApproveCycleTimeEqualTo(Long value) {
            addCriterion("approve_cycle_time =", value, "approveCycleTime");
            return (Criteria) this;
        }

        public Criteria andApproveCycleTimeNotEqualTo(Long value) {
            addCriterion("approve_cycle_time <>", value, "approveCycleTime");
            return (Criteria) this;
        }

        public Criteria andApproveCycleTimeGreaterThan(Long value) {
            addCriterion("approve_cycle_time >", value, "approveCycleTime");
            return (Criteria) this;
        }

        public Criteria andApproveCycleTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("approve_cycle_time >=", value, "approveCycleTime");
            return (Criteria) this;
        }

        public Criteria andApproveCycleTimeLessThan(Long value) {
            addCriterion("approve_cycle_time <", value, "approveCycleTime");
            return (Criteria) this;
        }

        public Criteria andApproveCycleTimeLessThanOrEqualTo(Long value) {
            addCriterion("approve_cycle_time <=", value, "approveCycleTime");
            return (Criteria) this;
        }

        public Criteria andApproveCycleTimeIn(List<Long> values) {
            addCriterion("approve_cycle_time in", values, "approveCycleTime");
            return (Criteria) this;
        }

        public Criteria andApproveCycleTimeNotIn(List<Long> values) {
            addCriterion("approve_cycle_time not in", values, "approveCycleTime");
            return (Criteria) this;
        }

        public Criteria andApproveCycleTimeBetween(Long value1, Long value2) {
            addCriterion("approve_cycle_time between", value1, value2, "approveCycleTime");
            return (Criteria) this;
        }

        public Criteria andApproveCycleTimeNotBetween(Long value1, Long value2) {
            addCriterion("approve_cycle_time not between", value1, value2, "approveCycleTime");
            return (Criteria) this;
        }

        public Criteria andApproveDatetimeIsNull() {
            addCriterion("approve_datetime is null");
            return (Criteria) this;
        }

        public Criteria andApproveDatetimeIsNotNull() {
            addCriterion("approve_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andApproveDatetimeEqualTo(Date value) {
            addCriterion("approve_datetime =", value, "approveDatetime");
            return (Criteria) this;
        }

        public Criteria andApproveDatetimeNotEqualTo(Date value) {
            addCriterion("approve_datetime <>", value, "approveDatetime");
            return (Criteria) this;
        }

        public Criteria andApproveDatetimeGreaterThan(Date value) {
            addCriterion("approve_datetime >", value, "approveDatetime");
            return (Criteria) this;
        }

        public Criteria andApproveDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("approve_datetime >=", value, "approveDatetime");
            return (Criteria) this;
        }

        public Criteria andApproveDatetimeLessThan(Date value) {
            addCriterion("approve_datetime <", value, "approveDatetime");
            return (Criteria) this;
        }

        public Criteria andApproveDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("approve_datetime <=", value, "approveDatetime");
            return (Criteria) this;
        }

        public Criteria andApproveDatetimeIn(List<Date> values) {
            addCriterion("approve_datetime in", values, "approveDatetime");
            return (Criteria) this;
        }

        public Criteria andApproveDatetimeNotIn(List<Date> values) {
            addCriterion("approve_datetime not in", values, "approveDatetime");
            return (Criteria) this;
        }

        public Criteria andApproveDatetimeBetween(Date value1, Date value2) {
            addCriterion("approve_datetime between", value1, value2, "approveDatetime");
            return (Criteria) this;
        }

        public Criteria andApproveDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("approve_datetime not between", value1, value2, "approveDatetime");
            return (Criteria) this;
        }

        public Criteria andOperationStatusIsNull() {
            addCriterion("operation_status is null");
            return (Criteria) this;
        }

        public Criteria andOperationStatusIsNotNull() {
            addCriterion("operation_status is not null");
            return (Criteria) this;
        }

        public Criteria andOperationStatusEqualTo(String value) {
            addCriterion("operation_status =", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusNotEqualTo(String value) {
            addCriterion("operation_status <>", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusGreaterThan(String value) {
            addCriterion("operation_status >", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusGreaterThanOrEqualTo(String value) {
            addCriterion("operation_status >=", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusLessThan(String value) {
            addCriterion("operation_status <", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusLessThanOrEqualTo(String value) {
            addCriterion("operation_status <=", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusLike(String value) {
            addCriterion("operation_status like", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusNotLike(String value) {
            addCriterion("operation_status not like", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusIn(List<String> values) {
            addCriterion("operation_status in", values, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusNotIn(List<String> values) {
            addCriterion("operation_status not in", values, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusBetween(String value1, String value2) {
            addCriterion("operation_status between", value1, value2, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusNotBetween(String value1, String value2) {
            addCriterion("operation_status not between", value1, value2, "operationStatus");
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