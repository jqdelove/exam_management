package com.jinqi.exam.entity;

import java.util.ArrayList;
import java.util.List;

public class ExaminationQuestionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExaminationQuestionsExample() {
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

        public Criteria andExaminationQuestionsIdIsNull() {
            addCriterion("EXAMINATION_QUESTIONS_ID is null");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsIdIsNotNull() {
            addCriterion("EXAMINATION_QUESTIONS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsIdEqualTo(Integer value) {
            addCriterion("EXAMINATION_QUESTIONS_ID =", value, "examinationQuestionsId");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsIdNotEqualTo(Integer value) {
            addCriterion("EXAMINATION_QUESTIONS_ID <>", value, "examinationQuestionsId");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsIdGreaterThan(Integer value) {
            addCriterion("EXAMINATION_QUESTIONS_ID >", value, "examinationQuestionsId");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXAMINATION_QUESTIONS_ID >=", value, "examinationQuestionsId");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsIdLessThan(Integer value) {
            addCriterion("EXAMINATION_QUESTIONS_ID <", value, "examinationQuestionsId");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXAMINATION_QUESTIONS_ID <=", value, "examinationQuestionsId");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsIdIn(List<Integer> values) {
            addCriterion("EXAMINATION_QUESTIONS_ID in", values, "examinationQuestionsId");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsIdNotIn(List<Integer> values) {
            addCriterion("EXAMINATION_QUESTIONS_ID not in", values, "examinationQuestionsId");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsIdBetween(Integer value1, Integer value2) {
            addCriterion("EXAMINATION_QUESTIONS_ID between", value1, value2, "examinationQuestionsId");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXAMINATION_QUESTIONS_ID not between", value1, value2, "examinationQuestionsId");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsContentIsNull() {
            addCriterion("EXAMINATION_QUESTIONS_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsContentIsNotNull() {
            addCriterion("EXAMINATION_QUESTIONS_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsContentEqualTo(String value) {
            addCriterion("EXAMINATION_QUESTIONS_CONTENT =", value, "examinationQuestionsContent");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsContentNotEqualTo(String value) {
            addCriterion("EXAMINATION_QUESTIONS_CONTENT <>", value, "examinationQuestionsContent");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsContentGreaterThan(String value) {
            addCriterion("EXAMINATION_QUESTIONS_CONTENT >", value, "examinationQuestionsContent");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsContentGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINATION_QUESTIONS_CONTENT >=", value, "examinationQuestionsContent");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsContentLessThan(String value) {
            addCriterion("EXAMINATION_QUESTIONS_CONTENT <", value, "examinationQuestionsContent");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsContentLessThanOrEqualTo(String value) {
            addCriterion("EXAMINATION_QUESTIONS_CONTENT <=", value, "examinationQuestionsContent");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsContentLike(String value) {
            addCriterion("EXAMINATION_QUESTIONS_CONTENT like", value, "examinationQuestionsContent");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsContentNotLike(String value) {
            addCriterion("EXAMINATION_QUESTIONS_CONTENT not like", value, "examinationQuestionsContent");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsContentIn(List<String> values) {
            addCriterion("EXAMINATION_QUESTIONS_CONTENT in", values, "examinationQuestionsContent");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsContentNotIn(List<String> values) {
            addCriterion("EXAMINATION_QUESTIONS_CONTENT not in", values, "examinationQuestionsContent");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsContentBetween(String value1, String value2) {
            addCriterion("EXAMINATION_QUESTIONS_CONTENT between", value1, value2, "examinationQuestionsContent");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsContentNotBetween(String value1, String value2) {
            addCriterion("EXAMINATION_QUESTIONS_CONTENT not between", value1, value2, "examinationQuestionsContent");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsAnswerIsNull() {
            addCriterion("EXAMINATION_QUESTIONS_ANSWER is null");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsAnswerIsNotNull() {
            addCriterion("EXAMINATION_QUESTIONS_ANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsAnswerEqualTo(String value) {
            addCriterion("EXAMINATION_QUESTIONS_ANSWER =", value, "examinationQuestionsAnswer");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsAnswerNotEqualTo(String value) {
            addCriterion("EXAMINATION_QUESTIONS_ANSWER <>", value, "examinationQuestionsAnswer");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsAnswerGreaterThan(String value) {
            addCriterion("EXAMINATION_QUESTIONS_ANSWER >", value, "examinationQuestionsAnswer");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINATION_QUESTIONS_ANSWER >=", value, "examinationQuestionsAnswer");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsAnswerLessThan(String value) {
            addCriterion("EXAMINATION_QUESTIONS_ANSWER <", value, "examinationQuestionsAnswer");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsAnswerLessThanOrEqualTo(String value) {
            addCriterion("EXAMINATION_QUESTIONS_ANSWER <=", value, "examinationQuestionsAnswer");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsAnswerLike(String value) {
            addCriterion("EXAMINATION_QUESTIONS_ANSWER like", value, "examinationQuestionsAnswer");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsAnswerNotLike(String value) {
            addCriterion("EXAMINATION_QUESTIONS_ANSWER not like", value, "examinationQuestionsAnswer");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsAnswerIn(List<String> values) {
            addCriterion("EXAMINATION_QUESTIONS_ANSWER in", values, "examinationQuestionsAnswer");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsAnswerNotIn(List<String> values) {
            addCriterion("EXAMINATION_QUESTIONS_ANSWER not in", values, "examinationQuestionsAnswer");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsAnswerBetween(String value1, String value2) {
            addCriterion("EXAMINATION_QUESTIONS_ANSWER between", value1, value2, "examinationQuestionsAnswer");
            return (Criteria) this;
        }

        public Criteria andExaminationQuestionsAnswerNotBetween(String value1, String value2) {
            addCriterion("EXAMINATION_QUESTIONS_ANSWER not between", value1, value2, "examinationQuestionsAnswer");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect1IsNull() {
            addCriterion("EXAMINATION_SELECT_1 is null");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect1IsNotNull() {
            addCriterion("EXAMINATION_SELECT_1 is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect1EqualTo(String value) {
            addCriterion("EXAMINATION_SELECT_1 =", value, "examinationSelect1");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect1NotEqualTo(String value) {
            addCriterion("EXAMINATION_SELECT_1 <>", value, "examinationSelect1");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect1GreaterThan(String value) {
            addCriterion("EXAMINATION_SELECT_1 >", value, "examinationSelect1");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect1GreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINATION_SELECT_1 >=", value, "examinationSelect1");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect1LessThan(String value) {
            addCriterion("EXAMINATION_SELECT_1 <", value, "examinationSelect1");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect1LessThanOrEqualTo(String value) {
            addCriterion("EXAMINATION_SELECT_1 <=", value, "examinationSelect1");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect1Like(String value) {
            addCriterion("EXAMINATION_SELECT_1 like", value, "examinationSelect1");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect1NotLike(String value) {
            addCriterion("EXAMINATION_SELECT_1 not like", value, "examinationSelect1");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect1In(List<String> values) {
            addCriterion("EXAMINATION_SELECT_1 in", values, "examinationSelect1");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect1NotIn(List<String> values) {
            addCriterion("EXAMINATION_SELECT_1 not in", values, "examinationSelect1");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect1Between(String value1, String value2) {
            addCriterion("EXAMINATION_SELECT_1 between", value1, value2, "examinationSelect1");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect1NotBetween(String value1, String value2) {
            addCriterion("EXAMINATION_SELECT_1 not between", value1, value2, "examinationSelect1");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect2IsNull() {
            addCriterion("EXAMINATION_SELECT_2 is null");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect2IsNotNull() {
            addCriterion("EXAMINATION_SELECT_2 is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect2EqualTo(String value) {
            addCriterion("EXAMINATION_SELECT_2 =", value, "examinationSelect2");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect2NotEqualTo(String value) {
            addCriterion("EXAMINATION_SELECT_2 <>", value, "examinationSelect2");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect2GreaterThan(String value) {
            addCriterion("EXAMINATION_SELECT_2 >", value, "examinationSelect2");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect2GreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINATION_SELECT_2 >=", value, "examinationSelect2");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect2LessThan(String value) {
            addCriterion("EXAMINATION_SELECT_2 <", value, "examinationSelect2");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect2LessThanOrEqualTo(String value) {
            addCriterion("EXAMINATION_SELECT_2 <=", value, "examinationSelect2");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect2Like(String value) {
            addCriterion("EXAMINATION_SELECT_2 like", value, "examinationSelect2");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect2NotLike(String value) {
            addCriterion("EXAMINATION_SELECT_2 not like", value, "examinationSelect2");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect2In(List<String> values) {
            addCriterion("EXAMINATION_SELECT_2 in", values, "examinationSelect2");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect2NotIn(List<String> values) {
            addCriterion("EXAMINATION_SELECT_2 not in", values, "examinationSelect2");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect2Between(String value1, String value2) {
            addCriterion("EXAMINATION_SELECT_2 between", value1, value2, "examinationSelect2");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect2NotBetween(String value1, String value2) {
            addCriterion("EXAMINATION_SELECT_2 not between", value1, value2, "examinationSelect2");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect3IsNull() {
            addCriterion("EXAMINATION_SELECT_3 is null");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect3IsNotNull() {
            addCriterion("EXAMINATION_SELECT_3 is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect3EqualTo(String value) {
            addCriterion("EXAMINATION_SELECT_3 =", value, "examinationSelect3");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect3NotEqualTo(String value) {
            addCriterion("EXAMINATION_SELECT_3 <>", value, "examinationSelect3");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect3GreaterThan(String value) {
            addCriterion("EXAMINATION_SELECT_3 >", value, "examinationSelect3");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect3GreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINATION_SELECT_3 >=", value, "examinationSelect3");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect3LessThan(String value) {
            addCriterion("EXAMINATION_SELECT_3 <", value, "examinationSelect3");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect3LessThanOrEqualTo(String value) {
            addCriterion("EXAMINATION_SELECT_3 <=", value, "examinationSelect3");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect3Like(String value) {
            addCriterion("EXAMINATION_SELECT_3 like", value, "examinationSelect3");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect3NotLike(String value) {
            addCriterion("EXAMINATION_SELECT_3 not like", value, "examinationSelect3");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect3In(List<String> values) {
            addCriterion("EXAMINATION_SELECT_3 in", values, "examinationSelect3");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect3NotIn(List<String> values) {
            addCriterion("EXAMINATION_SELECT_3 not in", values, "examinationSelect3");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect3Between(String value1, String value2) {
            addCriterion("EXAMINATION_SELECT_3 between", value1, value2, "examinationSelect3");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect3NotBetween(String value1, String value2) {
            addCriterion("EXAMINATION_SELECT_3 not between", value1, value2, "examinationSelect3");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect4IsNull() {
            addCriterion("EXAMINATION_SELECT_4 is null");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect4IsNotNull() {
            addCriterion("EXAMINATION_SELECT_4 is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect4EqualTo(String value) {
            addCriterion("EXAMINATION_SELECT_4 =", value, "examinationSelect4");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect4NotEqualTo(String value) {
            addCriterion("EXAMINATION_SELECT_4 <>", value, "examinationSelect4");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect4GreaterThan(String value) {
            addCriterion("EXAMINATION_SELECT_4 >", value, "examinationSelect4");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect4GreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINATION_SELECT_4 >=", value, "examinationSelect4");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect4LessThan(String value) {
            addCriterion("EXAMINATION_SELECT_4 <", value, "examinationSelect4");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect4LessThanOrEqualTo(String value) {
            addCriterion("EXAMINATION_SELECT_4 <=", value, "examinationSelect4");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect4Like(String value) {
            addCriterion("EXAMINATION_SELECT_4 like", value, "examinationSelect4");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect4NotLike(String value) {
            addCriterion("EXAMINATION_SELECT_4 not like", value, "examinationSelect4");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect4In(List<String> values) {
            addCriterion("EXAMINATION_SELECT_4 in", values, "examinationSelect4");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect4NotIn(List<String> values) {
            addCriterion("EXAMINATION_SELECT_4 not in", values, "examinationSelect4");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect4Between(String value1, String value2) {
            addCriterion("EXAMINATION_SELECT_4 between", value1, value2, "examinationSelect4");
            return (Criteria) this;
        }

        public Criteria andExaminationSelect4NotBetween(String value1, String value2) {
            addCriterion("EXAMINATION_SELECT_4 not between", value1, value2, "examinationSelect4");
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