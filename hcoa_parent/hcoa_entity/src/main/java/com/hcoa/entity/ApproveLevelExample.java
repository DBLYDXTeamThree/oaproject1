package com.hcoa.entity;

import java.util.ArrayList;
import java.util.List;

public class ApproveLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApproveLevelExample() {
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

        public Criteria andRuleCaptionIsNull() {
            addCriterion("rule_caption is null");
            return (Criteria) this;
        }

        public Criteria andRuleCaptionIsNotNull() {
            addCriterion("rule_caption is not null");
            return (Criteria) this;
        }

        public Criteria andRuleCaptionEqualTo(String value) {
            addCriterion("rule_caption =", value, "ruleCaption");
            return (Criteria) this;
        }

        public Criteria andRuleCaptionNotEqualTo(String value) {
            addCriterion("rule_caption <>", value, "ruleCaption");
            return (Criteria) this;
        }

        public Criteria andRuleCaptionGreaterThan(String value) {
            addCriterion("rule_caption >", value, "ruleCaption");
            return (Criteria) this;
        }

        public Criteria andRuleCaptionGreaterThanOrEqualTo(String value) {
            addCriterion("rule_caption >=", value, "ruleCaption");
            return (Criteria) this;
        }

        public Criteria andRuleCaptionLessThan(String value) {
            addCriterion("rule_caption <", value, "ruleCaption");
            return (Criteria) this;
        }

        public Criteria andRuleCaptionLessThanOrEqualTo(String value) {
            addCriterion("rule_caption <=", value, "ruleCaption");
            return (Criteria) this;
        }

        public Criteria andRuleCaptionLike(String value) {
            addCriterion("rule_caption like", value, "ruleCaption");
            return (Criteria) this;
        }

        public Criteria andRuleCaptionNotLike(String value) {
            addCriterion("rule_caption not like", value, "ruleCaption");
            return (Criteria) this;
        }

        public Criteria andRuleCaptionIn(List<String> values) {
            addCriterion("rule_caption in", values, "ruleCaption");
            return (Criteria) this;
        }

        public Criteria andRuleCaptionNotIn(List<String> values) {
            addCriterion("rule_caption not in", values, "ruleCaption");
            return (Criteria) this;
        }

        public Criteria andRuleCaptionBetween(String value1, String value2) {
            addCriterion("rule_caption between", value1, value2, "ruleCaption");
            return (Criteria) this;
        }

        public Criteria andRuleCaptionNotBetween(String value1, String value2) {
            addCriterion("rule_caption not between", value1, value2, "ruleCaption");
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

        public Criteria andApproveLevelEqualTo(Integer value) {
            addCriterion("approve_level =", value, "approveLevel");
            return (Criteria) this;
        }

        public Criteria andApproveLevelNotEqualTo(Integer value) {
            addCriterion("approve_level <>", value, "approveLevel");
            return (Criteria) this;
        }

        public Criteria andApproveLevelGreaterThan(Integer value) {
            addCriterion("approve_level >", value, "approveLevel");
            return (Criteria) this;
        }

        public Criteria andApproveLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("approve_level >=", value, "approveLevel");
            return (Criteria) this;
        }

        public Criteria andApproveLevelLessThan(Integer value) {
            addCriterion("approve_level <", value, "approveLevel");
            return (Criteria) this;
        }

        public Criteria andApproveLevelLessThanOrEqualTo(Integer value) {
            addCriterion("approve_level <=", value, "approveLevel");
            return (Criteria) this;
        }

        public Criteria andApproveLevelIn(List<Integer> values) {
            addCriterion("approve_level in", values, "approveLevel");
            return (Criteria) this;
        }

        public Criteria andApproveLevelNotIn(List<Integer> values) {
            addCriterion("approve_level not in", values, "approveLevel");
            return (Criteria) this;
        }

        public Criteria andApproveLevelBetween(Integer value1, Integer value2) {
            addCriterion("approve_level between", value1, value2, "approveLevel");
            return (Criteria) this;
        }

        public Criteria andApproveLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("approve_level not between", value1, value2, "approveLevel");
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