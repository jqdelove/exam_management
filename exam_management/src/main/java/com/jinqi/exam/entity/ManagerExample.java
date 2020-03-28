package com.jinqi.exam.entity;

import java.util.ArrayList;
import java.util.List;

public class ManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerExample() {
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

        public Criteria andManagerIdIsNull() {
            addCriterion("MANAGER_ID is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("MANAGER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(Integer value) {
            addCriterion("MANAGER_ID =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(Integer value) {
            addCriterion("MANAGER_ID <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(Integer value) {
            addCriterion("MANAGER_ID >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MANAGER_ID >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(Integer value) {
            addCriterion("MANAGER_ID <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("MANAGER_ID <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<Integer> values) {
            addCriterion("MANAGER_ID in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<Integer> values) {
            addCriterion("MANAGER_ID not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("MANAGER_ID between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MANAGER_ID not between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerNameIsNull() {
            addCriterion("MANAGER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andManagerNameIsNotNull() {
            addCriterion("MANAGER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andManagerNameEqualTo(String value) {
            addCriterion("MANAGER_NAME =", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotEqualTo(String value) {
            addCriterion("MANAGER_NAME <>", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameGreaterThan(String value) {
            addCriterion("MANAGER_NAME >", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGER_NAME >=", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLessThan(String value) {
            addCriterion("MANAGER_NAME <", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLessThanOrEqualTo(String value) {
            addCriterion("MANAGER_NAME <=", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLike(String value) {
            addCriterion("MANAGER_NAME like", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotLike(String value) {
            addCriterion("MANAGER_NAME not like", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameIn(List<String> values) {
            addCriterion("MANAGER_NAME in", values, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotIn(List<String> values) {
            addCriterion("MANAGER_NAME not in", values, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameBetween(String value1, String value2) {
            addCriterion("MANAGER_NAME between", value1, value2, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotBetween(String value1, String value2) {
            addCriterion("MANAGER_NAME not between", value1, value2, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerEmailIsNull() {
            addCriterion("MANAGER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andManagerEmailIsNotNull() {
            addCriterion("MANAGER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andManagerEmailEqualTo(String value) {
            addCriterion("MANAGER_EMAIL =", value, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailNotEqualTo(String value) {
            addCriterion("MANAGER_EMAIL <>", value, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailGreaterThan(String value) {
            addCriterion("MANAGER_EMAIL >", value, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGER_EMAIL >=", value, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailLessThan(String value) {
            addCriterion("MANAGER_EMAIL <", value, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailLessThanOrEqualTo(String value) {
            addCriterion("MANAGER_EMAIL <=", value, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailLike(String value) {
            addCriterion("MANAGER_EMAIL like", value, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailNotLike(String value) {
            addCriterion("MANAGER_EMAIL not like", value, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailIn(List<String> values) {
            addCriterion("MANAGER_EMAIL in", values, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailNotIn(List<String> values) {
            addCriterion("MANAGER_EMAIL not in", values, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailBetween(String value1, String value2) {
            addCriterion("MANAGER_EMAIL between", value1, value2, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailNotBetween(String value1, String value2) {
            addCriterion("MANAGER_EMAIL not between", value1, value2, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneIsNull() {
            addCriterion("MANAGER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneIsNotNull() {
            addCriterion("MANAGER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneEqualTo(String value) {
            addCriterion("MANAGER_PHONE =", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneNotEqualTo(String value) {
            addCriterion("MANAGER_PHONE <>", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneGreaterThan(String value) {
            addCriterion("MANAGER_PHONE >", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGER_PHONE >=", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneLessThan(String value) {
            addCriterion("MANAGER_PHONE <", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneLessThanOrEqualTo(String value) {
            addCriterion("MANAGER_PHONE <=", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneLike(String value) {
            addCriterion("MANAGER_PHONE like", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneNotLike(String value) {
            addCriterion("MANAGER_PHONE not like", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneIn(List<String> values) {
            addCriterion("MANAGER_PHONE in", values, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneNotIn(List<String> values) {
            addCriterion("MANAGER_PHONE not in", values, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneBetween(String value1, String value2) {
            addCriterion("MANAGER_PHONE between", value1, value2, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneNotBetween(String value1, String value2) {
            addCriterion("MANAGER_PHONE not between", value1, value2, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPwdIsNull() {
            addCriterion("MANAGER_PWD is null");
            return (Criteria) this;
        }

        public Criteria andManagerPwdIsNotNull() {
            addCriterion("MANAGER_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andManagerPwdEqualTo(String value) {
            addCriterion("MANAGER_PWD =", value, "managerPwd");
            return (Criteria) this;
        }

        public Criteria andManagerPwdNotEqualTo(String value) {
            addCriterion("MANAGER_PWD <>", value, "managerPwd");
            return (Criteria) this;
        }

        public Criteria andManagerPwdGreaterThan(String value) {
            addCriterion("MANAGER_PWD >", value, "managerPwd");
            return (Criteria) this;
        }

        public Criteria andManagerPwdGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGER_PWD >=", value, "managerPwd");
            return (Criteria) this;
        }

        public Criteria andManagerPwdLessThan(String value) {
            addCriterion("MANAGER_PWD <", value, "managerPwd");
            return (Criteria) this;
        }

        public Criteria andManagerPwdLessThanOrEqualTo(String value) {
            addCriterion("MANAGER_PWD <=", value, "managerPwd");
            return (Criteria) this;
        }

        public Criteria andManagerPwdLike(String value) {
            addCriterion("MANAGER_PWD like", value, "managerPwd");
            return (Criteria) this;
        }

        public Criteria andManagerPwdNotLike(String value) {
            addCriterion("MANAGER_PWD not like", value, "managerPwd");
            return (Criteria) this;
        }

        public Criteria andManagerPwdIn(List<String> values) {
            addCriterion("MANAGER_PWD in", values, "managerPwd");
            return (Criteria) this;
        }

        public Criteria andManagerPwdNotIn(List<String> values) {
            addCriterion("MANAGER_PWD not in", values, "managerPwd");
            return (Criteria) this;
        }

        public Criteria andManagerPwdBetween(String value1, String value2) {
            addCriterion("MANAGER_PWD between", value1, value2, "managerPwd");
            return (Criteria) this;
        }

        public Criteria andManagerPwdNotBetween(String value1, String value2) {
            addCriterion("MANAGER_PWD not between", value1, value2, "managerPwd");
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