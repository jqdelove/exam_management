package com.jinqi.exam.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCourseIdIsNull() {
            addCriterion("COURSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("COURSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("COURSE_ID =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("COURSE_ID <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("COURSE_ID >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COURSE_ID >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("COURSE_ID <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("COURSE_ID <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("COURSE_ID in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("COURSE_ID not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("COURSE_ID between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COURSE_ID not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("COURSE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("COURSE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("COURSE_NAME =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("COURSE_NAME <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("COURSE_NAME >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("COURSE_NAME >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("COURSE_NAME <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("COURSE_NAME <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("COURSE_NAME like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("COURSE_NAME not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("COURSE_NAME in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("COURSE_NAME not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("COURSE_NAME between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("COURSE_NAME not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseAmountIsNull() {
            addCriterion("COURSE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCourseAmountIsNotNull() {
            addCriterion("COURSE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCourseAmountEqualTo(Integer value) {
            addCriterion("COURSE_AMOUNT =", value, "courseAmount");
            return (Criteria) this;
        }

        public Criteria andCourseAmountNotEqualTo(Integer value) {
            addCriterion("COURSE_AMOUNT <>", value, "courseAmount");
            return (Criteria) this;
        }

        public Criteria andCourseAmountGreaterThan(Integer value) {
            addCriterion("COURSE_AMOUNT >", value, "courseAmount");
            return (Criteria) this;
        }

        public Criteria andCourseAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("COURSE_AMOUNT >=", value, "courseAmount");
            return (Criteria) this;
        }

        public Criteria andCourseAmountLessThan(Integer value) {
            addCriterion("COURSE_AMOUNT <", value, "courseAmount");
            return (Criteria) this;
        }

        public Criteria andCourseAmountLessThanOrEqualTo(Integer value) {
            addCriterion("COURSE_AMOUNT <=", value, "courseAmount");
            return (Criteria) this;
        }

        public Criteria andCourseAmountIn(List<Integer> values) {
            addCriterion("COURSE_AMOUNT in", values, "courseAmount");
            return (Criteria) this;
        }

        public Criteria andCourseAmountNotIn(List<Integer> values) {
            addCriterion("COURSE_AMOUNT not in", values, "courseAmount");
            return (Criteria) this;
        }

        public Criteria andCourseAmountBetween(Integer value1, Integer value2) {
            addCriterion("COURSE_AMOUNT between", value1, value2, "courseAmount");
            return (Criteria) this;
        }

        public Criteria andCourseAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("COURSE_AMOUNT not between", value1, value2, "courseAmount");
            return (Criteria) this;
        }

        public Criteria andCourseBeginTimeIsNull() {
            addCriterion("COURSE_BEGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCourseBeginTimeIsNotNull() {
            addCriterion("COURSE_BEGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCourseBeginTimeEqualTo(Date value) {
            addCriterionForJDBCDate("COURSE_BEGIN_TIME =", value, "courseBeginTime");
            return (Criteria) this;
        }

        public Criteria andCourseBeginTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("COURSE_BEGIN_TIME <>", value, "courseBeginTime");
            return (Criteria) this;
        }

        public Criteria andCourseBeginTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("COURSE_BEGIN_TIME >", value, "courseBeginTime");
            return (Criteria) this;
        }

        public Criteria andCourseBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COURSE_BEGIN_TIME >=", value, "courseBeginTime");
            return (Criteria) this;
        }

        public Criteria andCourseBeginTimeLessThan(Date value) {
            addCriterionForJDBCDate("COURSE_BEGIN_TIME <", value, "courseBeginTime");
            return (Criteria) this;
        }

        public Criteria andCourseBeginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COURSE_BEGIN_TIME <=", value, "courseBeginTime");
            return (Criteria) this;
        }

        public Criteria andCourseBeginTimeIn(List<Date> values) {
            addCriterionForJDBCDate("COURSE_BEGIN_TIME in", values, "courseBeginTime");
            return (Criteria) this;
        }

        public Criteria andCourseBeginTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("COURSE_BEGIN_TIME not in", values, "courseBeginTime");
            return (Criteria) this;
        }

        public Criteria andCourseBeginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COURSE_BEGIN_TIME between", value1, value2, "courseBeginTime");
            return (Criteria) this;
        }

        public Criteria andCourseBeginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COURSE_BEGIN_TIME not between", value1, value2, "courseBeginTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeIsNull() {
            addCriterion("COURSE_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeIsNotNull() {
            addCriterion("COURSE_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("COURSE_END_TIME =", value, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("COURSE_END_TIME <>", value, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("COURSE_END_TIME >", value, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COURSE_END_TIME >=", value, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("COURSE_END_TIME <", value, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COURSE_END_TIME <=", value, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("COURSE_END_TIME in", values, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("COURSE_END_TIME not in", values, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COURSE_END_TIME between", value1, value2, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COURSE_END_TIME not between", value1, value2, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseMajorIsNull() {
            addCriterion("COURSE_MAJOR is null");
            return (Criteria) this;
        }

        public Criteria andCourseMajorIsNotNull() {
            addCriterion("COURSE_MAJOR is not null");
            return (Criteria) this;
        }

        public Criteria andCourseMajorEqualTo(String value) {
            addCriterion("COURSE_MAJOR =", value, "courseMajor");
            return (Criteria) this;
        }

        public Criteria andCourseMajorNotEqualTo(String value) {
            addCriterion("COURSE_MAJOR <>", value, "courseMajor");
            return (Criteria) this;
        }

        public Criteria andCourseMajorGreaterThan(String value) {
            addCriterion("COURSE_MAJOR >", value, "courseMajor");
            return (Criteria) this;
        }

        public Criteria andCourseMajorGreaterThanOrEqualTo(String value) {
            addCriterion("COURSE_MAJOR >=", value, "courseMajor");
            return (Criteria) this;
        }

        public Criteria andCourseMajorLessThan(String value) {
            addCriterion("COURSE_MAJOR <", value, "courseMajor");
            return (Criteria) this;
        }

        public Criteria andCourseMajorLessThanOrEqualTo(String value) {
            addCriterion("COURSE_MAJOR <=", value, "courseMajor");
            return (Criteria) this;
        }

        public Criteria andCourseMajorLike(String value) {
            addCriterion("COURSE_MAJOR like", value, "courseMajor");
            return (Criteria) this;
        }

        public Criteria andCourseMajorNotLike(String value) {
            addCriterion("COURSE_MAJOR not like", value, "courseMajor");
            return (Criteria) this;
        }

        public Criteria andCourseMajorIn(List<String> values) {
            addCriterion("COURSE_MAJOR in", values, "courseMajor");
            return (Criteria) this;
        }

        public Criteria andCourseMajorNotIn(List<String> values) {
            addCriterion("COURSE_MAJOR not in", values, "courseMajor");
            return (Criteria) this;
        }

        public Criteria andCourseMajorBetween(String value1, String value2) {
            addCriterion("COURSE_MAJOR between", value1, value2, "courseMajor");
            return (Criteria) this;
        }

        public Criteria andCourseMajorNotBetween(String value1, String value2) {
            addCriterion("COURSE_MAJOR not between", value1, value2, "courseMajor");
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