package com.jinqi.exam.entity;

import java.util.ArrayList;
import java.util.List;

public class SyllabusKnowledgeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyllabusKnowledgeExample() {
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

        public Criteria andSyllabusKnowledgeIdIsNull() {
            addCriterion("syllabus_knowledge_id is null");
            return (Criteria) this;
        }

        public Criteria andSyllabusKnowledgeIdIsNotNull() {
            addCriterion("syllabus_knowledge_id is not null");
            return (Criteria) this;
        }

        public Criteria andSyllabusKnowledgeIdEqualTo(Integer value) {
            addCriterion("syllabus_knowledge_id =", value, "syllabusKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andSyllabusKnowledgeIdNotEqualTo(Integer value) {
            addCriterion("syllabus_knowledge_id <>", value, "syllabusKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andSyllabusKnowledgeIdGreaterThan(Integer value) {
            addCriterion("syllabus_knowledge_id >", value, "syllabusKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andSyllabusKnowledgeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("syllabus_knowledge_id >=", value, "syllabusKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andSyllabusKnowledgeIdLessThan(Integer value) {
            addCriterion("syllabus_knowledge_id <", value, "syllabusKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andSyllabusKnowledgeIdLessThanOrEqualTo(Integer value) {
            addCriterion("syllabus_knowledge_id <=", value, "syllabusKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andSyllabusKnowledgeIdIn(List<Integer> values) {
            addCriterion("syllabus_knowledge_id in", values, "syllabusKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andSyllabusKnowledgeIdNotIn(List<Integer> values) {
            addCriterion("syllabus_knowledge_id not in", values, "syllabusKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andSyllabusKnowledgeIdBetween(Integer value1, Integer value2) {
            addCriterion("syllabus_knowledge_id between", value1, value2, "syllabusKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andSyllabusKnowledgeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("syllabus_knowledge_id not between", value1, value2, "syllabusKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdIsNull() {
            addCriterion("examination_syllabus_id is null");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdIsNotNull() {
            addCriterion("examination_syllabus_id is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdEqualTo(Integer value) {
            addCriterion("examination_syllabus_id =", value, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdNotEqualTo(Integer value) {
            addCriterion("examination_syllabus_id <>", value, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdGreaterThan(Integer value) {
            addCriterion("examination_syllabus_id >", value, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("examination_syllabus_id >=", value, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdLessThan(Integer value) {
            addCriterion("examination_syllabus_id <", value, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdLessThanOrEqualTo(Integer value) {
            addCriterion("examination_syllabus_id <=", value, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdIn(List<Integer> values) {
            addCriterion("examination_syllabus_id in", values, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdNotIn(List<Integer> values) {
            addCriterion("examination_syllabus_id not in", values, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdBetween(Integer value1, Integer value2) {
            addCriterion("examination_syllabus_id between", value1, value2, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("examination_syllabus_id not between", value1, value2, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointsIdIsNull() {
            addCriterion("knowledge_points_id is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointsIdIsNotNull() {
            addCriterion("knowledge_points_id is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointsIdEqualTo(Integer value) {
            addCriterion("knowledge_points_id =", value, "knowledgePointsId");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointsIdNotEqualTo(Integer value) {
            addCriterion("knowledge_points_id <>", value, "knowledgePointsId");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointsIdGreaterThan(Integer value) {
            addCriterion("knowledge_points_id >", value, "knowledgePointsId");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("knowledge_points_id >=", value, "knowledgePointsId");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointsIdLessThan(Integer value) {
            addCriterion("knowledge_points_id <", value, "knowledgePointsId");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointsIdLessThanOrEqualTo(Integer value) {
            addCriterion("knowledge_points_id <=", value, "knowledgePointsId");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointsIdIn(List<Integer> values) {
            addCriterion("knowledge_points_id in", values, "knowledgePointsId");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointsIdNotIn(List<Integer> values) {
            addCriterion("knowledge_points_id not in", values, "knowledgePointsId");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointsIdBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_points_id between", value1, value2, "knowledgePointsId");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_points_id not between", value1, value2, "knowledgePointsId");
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