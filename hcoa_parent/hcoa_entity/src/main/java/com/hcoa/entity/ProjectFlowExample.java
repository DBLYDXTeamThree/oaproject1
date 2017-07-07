package com.hcoa.entity;

import java.util.ArrayList;
import java.util.List;

public class ProjectFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectFlowExample() {
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

        public Criteria andFlowNodeIdIsNull() {
            addCriterion("flow_node_id is null");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdIsNotNull() {
            addCriterion("flow_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdEqualTo(Long value) {
            addCriterion("flow_node_id =", value, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdNotEqualTo(Long value) {
            addCriterion("flow_node_id <>", value, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdGreaterThan(Long value) {
            addCriterion("flow_node_id >", value, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("flow_node_id >=", value, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdLessThan(Long value) {
            addCriterion("flow_node_id <", value, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdLessThanOrEqualTo(Long value) {
            addCriterion("flow_node_id <=", value, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdIn(List<Long> values) {
            addCriterion("flow_node_id in", values, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdNotIn(List<Long> values) {
            addCriterion("flow_node_id not in", values, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdBetween(Long value1, Long value2) {
            addCriterion("flow_node_id between", value1, value2, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdNotBetween(Long value1, Long value2) {
            addCriterion("flow_node_id not between", value1, value2, "flowNodeId");
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

        public Criteria andNodeStatusIsNull() {
            addCriterion("node_status is null");
            return (Criteria) this;
        }

        public Criteria andNodeStatusIsNotNull() {
            addCriterion("node_status is not null");
            return (Criteria) this;
        }

        public Criteria andNodeStatusEqualTo(String value) {
            addCriterion("node_status =", value, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusNotEqualTo(String value) {
            addCriterion("node_status <>", value, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusGreaterThan(String value) {
            addCriterion("node_status >", value, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("node_status >=", value, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusLessThan(String value) {
            addCriterion("node_status <", value, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusLessThanOrEqualTo(String value) {
            addCriterion("node_status <=", value, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusLike(String value) {
            addCriterion("node_status like", value, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusNotLike(String value) {
            addCriterion("node_status not like", value, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusIn(List<String> values) {
            addCriterion("node_status in", values, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusNotIn(List<String> values) {
            addCriterion("node_status not in", values, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusBetween(String value1, String value2) {
            addCriterion("node_status between", value1, value2, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusNotBetween(String value1, String value2) {
            addCriterion("node_status not between", value1, value2, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentApproveLevelIsNull() {
            addCriterion("current_approve_level is null");
            return (Criteria) this;
        }

        public Criteria andCurrentApproveLevelIsNotNull() {
            addCriterion("current_approve_level is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentApproveLevelEqualTo(Integer value) {
            addCriterion("current_approve_level =", value, "currentApproveLevel");
            return (Criteria) this;
        }

        public Criteria andCurrentApproveLevelNotEqualTo(Integer value) {
            addCriterion("current_approve_level <>", value, "currentApproveLevel");
            return (Criteria) this;
        }

        public Criteria andCurrentApproveLevelGreaterThan(Integer value) {
            addCriterion("current_approve_level >", value, "currentApproveLevel");
            return (Criteria) this;
        }

        public Criteria andCurrentApproveLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_approve_level >=", value, "currentApproveLevel");
            return (Criteria) this;
        }

        public Criteria andCurrentApproveLevelLessThan(Integer value) {
            addCriterion("current_approve_level <", value, "currentApproveLevel");
            return (Criteria) this;
        }

        public Criteria andCurrentApproveLevelLessThanOrEqualTo(Integer value) {
            addCriterion("current_approve_level <=", value, "currentApproveLevel");
            return (Criteria) this;
        }

        public Criteria andCurrentApproveLevelIn(List<Integer> values) {
            addCriterion("current_approve_level in", values, "currentApproveLevel");
            return (Criteria) this;
        }

        public Criteria andCurrentApproveLevelNotIn(List<Integer> values) {
            addCriterion("current_approve_level not in", values, "currentApproveLevel");
            return (Criteria) this;
        }

        public Criteria andCurrentApproveLevelBetween(Integer value1, Integer value2) {
            addCriterion("current_approve_level between", value1, value2, "currentApproveLevel");
            return (Criteria) this;
        }

        public Criteria andCurrentApproveLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("current_approve_level not between", value1, value2, "currentApproveLevel");
            return (Criteria) this;
        }

        public Criteria andCurrentCycleTimeIsNull() {
            addCriterion("current_cycle_time is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCycleTimeIsNotNull() {
            addCriterion("current_cycle_time is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCycleTimeEqualTo(Integer value) {
            addCriterion("current_cycle_time =", value, "currentCycleTime");
            return (Criteria) this;
        }

        public Criteria andCurrentCycleTimeNotEqualTo(Integer value) {
            addCriterion("current_cycle_time <>", value, "currentCycleTime");
            return (Criteria) this;
        }

        public Criteria andCurrentCycleTimeGreaterThan(Integer value) {
            addCriterion("current_cycle_time >", value, "currentCycleTime");
            return (Criteria) this;
        }

        public Criteria andCurrentCycleTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_cycle_time >=", value, "currentCycleTime");
            return (Criteria) this;
        }

        public Criteria andCurrentCycleTimeLessThan(Integer value) {
            addCriterion("current_cycle_time <", value, "currentCycleTime");
            return (Criteria) this;
        }

        public Criteria andCurrentCycleTimeLessThanOrEqualTo(Integer value) {
            addCriterion("current_cycle_time <=", value, "currentCycleTime");
            return (Criteria) this;
        }

        public Criteria andCurrentCycleTimeIn(List<Integer> values) {
            addCriterion("current_cycle_time in", values, "currentCycleTime");
            return (Criteria) this;
        }

        public Criteria andCurrentCycleTimeNotIn(List<Integer> values) {
            addCriterion("current_cycle_time not in", values, "currentCycleTime");
            return (Criteria) this;
        }

        public Criteria andCurrentCycleTimeBetween(Integer value1, Integer value2) {
            addCriterion("current_cycle_time between", value1, value2, "currentCycleTime");
            return (Criteria) this;
        }

        public Criteria andCurrentCycleTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("current_cycle_time not between", value1, value2, "currentCycleTime");
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