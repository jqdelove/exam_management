package com.jinqi.exam.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestPaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestPaperExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTestPaperIdIsNull() {
            addCriterion("TEST_PAPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdIsNotNull() {
            addCriterion("TEST_PAPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdEqualTo(Integer value) {
            addCriterion("TEST_PAPER_ID =", value, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdNotEqualTo(Integer value) {
            addCriterion("TEST_PAPER_ID <>", value, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdGreaterThan(Integer value) {
            addCriterion("TEST_PAPER_ID >", value, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEST_PAPER_ID >=", value, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdLessThan(Integer value) {
            addCriterion("TEST_PAPER_ID <", value, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("TEST_PAPER_ID <=", value, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdIn(List<Integer> values) {
            addCriterion("TEST_PAPER_ID in", values, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdNotIn(List<Integer> values) {
            addCriterion("TEST_PAPER_ID not in", values, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdBetween(Integer value1, Integer value2) {
            addCriterion("TEST_PAPER_ID between", value1, value2, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TEST_PAPER_ID not between", value1, value2, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdIsNull() {
            addCriterion("EXAMINATION_SYLLABUS_ID is null");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdIsNotNull() {
            addCriterion("EXAMINATION_SYLLABUS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdEqualTo(Integer value) {
            addCriterion("EXAMINATION_SYLLABUS_ID =", value, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdNotEqualTo(Integer value) {
            addCriterion("EXAMINATION_SYLLABUS_ID <>", value, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdGreaterThan(Integer value) {
            addCriterion("EXAMINATION_SYLLABUS_ID >", value, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXAMINATION_SYLLABUS_ID >=", value, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdLessThan(Integer value) {
            addCriterion("EXAMINATION_SYLLABUS_ID <", value, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXAMINATION_SYLLABUS_ID <=", value, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdIn(List<Integer> values) {
            addCriterion("EXAMINATION_SYLLABUS_ID in", values, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdNotIn(List<Integer> values) {
            addCriterion("EXAMINATION_SYLLABUS_ID not in", values, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdBetween(Integer value1, Integer value2) {
            addCriterion("EXAMINATION_SYLLABUS_ID between", value1, value2, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXAMINATION_SYLLABUS_ID not between", value1, value2, "examinationSyllabusId");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusBeginTimeIsNull() {
            addCriterion("EXAMINATION_SYLLABUS_BEGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusBeginTimeIsNotNull() {
            addCriterion("EXAMINATION_SYLLABUS_BEGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusBeginTimeEqualTo(Date value) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_BEGIN_TIME =", value, "examinationSyllabusBeginTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusBeginTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_BEGIN_TIME <>", value, "examinationSyllabusBeginTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusBeginTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_BEGIN_TIME >", value, "examinationSyllabusBeginTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_BEGIN_TIME >=", value, "examinationSyllabusBeginTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusBeginTimeLessThan(Date value) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_BEGIN_TIME <", value, "examinationSyllabusBeginTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusBeginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_BEGIN_TIME <=", value, "examinationSyllabusBeginTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusBeginTimeIn(List<Date> values) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_BEGIN_TIME in", values, "examinationSyllabusBeginTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusBeginTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_BEGIN_TIME not in", values, "examinationSyllabusBeginTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusBeginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_BEGIN_TIME between", value1, value2, "examinationSyllabusBeginTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusBeginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_BEGIN_TIME not between", value1, value2, "examinationSyllabusBeginTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusEndTimeIsNull() {
            addCriterion("EXAMINATION_SYLLABUS_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusEndTimeIsNotNull() {
            addCriterion("EXAMINATION_SYLLABUS_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_END_TIME =", value, "examinationSyllabusEndTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_END_TIME <>", value, "examinationSyllabusEndTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_END_TIME >", value, "examinationSyllabusEndTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_END_TIME >=", value, "examinationSyllabusEndTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_END_TIME <", value, "examinationSyllabusEndTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_END_TIME <=", value, "examinationSyllabusEndTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_END_TIME in", values, "examinationSyllabusEndTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_END_TIME not in", values, "examinationSyllabusEndTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_END_TIME between", value1, value2, "examinationSyllabusEndTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXAMINATION_SYLLABUS_END_TIME not between", value1, value2, "examinationSyllabusEndTime");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusTitleIsNull() {
            addCriterion("EXAMINATION_SYLLABUS_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusTitleIsNotNull() {
            addCriterion("EXAMINATION_SYLLABUS_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusTitleEqualTo(String value) {
            addCriterion("EXAMINATION_SYLLABUS_TITLE =", value, "examinationSyllabusTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusTitleNotEqualTo(String value) {
            addCriterion("EXAMINATION_SYLLABUS_TITLE <>", value, "examinationSyllabusTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusTitleGreaterThan(String value) {
            addCriterion("EXAMINATION_SYLLABUS_TITLE >", value, "examinationSyllabusTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusTitleGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINATION_SYLLABUS_TITLE >=", value, "examinationSyllabusTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusTitleLessThan(String value) {
            addCriterion("EXAMINATION_SYLLABUS_TITLE <", value, "examinationSyllabusTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusTitleLessThanOrEqualTo(String value) {
            addCriterion("EXAMINATION_SYLLABUS_TITLE <=", value, "examinationSyllabusTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusTitleLike(String value) {
            addCriterion("EXAMINATION_SYLLABUS_TITLE like", value, "examinationSyllabusTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusTitleNotLike(String value) {
            addCriterion("EXAMINATION_SYLLABUS_TITLE not like", value, "examinationSyllabusTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusTitleIn(List<String> values) {
            addCriterion("EXAMINATION_SYLLABUS_TITLE in", values, "examinationSyllabusTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusTitleNotIn(List<String> values) {
            addCriterion("EXAMINATION_SYLLABUS_TITLE not in", values, "examinationSyllabusTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusTitleBetween(String value1, String value2) {
            addCriterion("EXAMINATION_SYLLABUS_TITLE between", value1, value2, "examinationSyllabusTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationSyllabusTitleNotBetween(String value1, String value2) {
            addCriterion("EXAMINATION_SYLLABUS_TITLE not between", value1, value2, "examinationSyllabusTitle");
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