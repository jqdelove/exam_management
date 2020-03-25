package com.jinqi.exam.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeacherIdIsNull() {
            addCriterion("TEACHER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("TEACHER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("TEACHER_ID =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("TEACHER_ID <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("TEACHER_ID >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEACHER_ID >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("TEACHER_ID <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("TEACHER_ID <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("TEACHER_ID in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("TEACHER_ID not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("TEACHER_ID between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TEACHER_ID not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("TEACHER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("TEACHER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("TEACHER_NAME =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("TEACHER_NAME <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("TEACHER_NAME >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_NAME >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("TEACHER_NAME <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_NAME <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("TEACHER_NAME like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("TEACHER_NAME not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("TEACHER_NAME in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("TEACHER_NAME not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("TEACHER_NAME between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("TEACHER_NAME not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthIsNull() {
            addCriterion("TEACHER_BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthIsNotNull() {
            addCriterion("TEACHER_BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthEqualTo(Date value) {
            addCriterionForJDBCDate("TEACHER_BIRTH =", value, "teacherBirth");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("TEACHER_BIRTH <>", value, "teacherBirth");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("TEACHER_BIRTH >", value, "teacherBirth");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TEACHER_BIRTH >=", value, "teacherBirth");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthLessThan(Date value) {
            addCriterionForJDBCDate("TEACHER_BIRTH <", value, "teacherBirth");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TEACHER_BIRTH <=", value, "teacherBirth");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthIn(List<Date> values) {
            addCriterionForJDBCDate("TEACHER_BIRTH in", values, "teacherBirth");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("TEACHER_BIRTH not in", values, "teacherBirth");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TEACHER_BIRTH between", value1, value2, "teacherBirth");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TEACHER_BIRTH not between", value1, value2, "teacherBirth");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIsNull() {
            addCriterion("TEACHER_SEX is null");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIsNotNull() {
            addCriterion("TEACHER_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherSexEqualTo(String value) {
            addCriterion("TEACHER_SEX =", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotEqualTo(String value) {
            addCriterion("TEACHER_SEX <>", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexGreaterThan(String value) {
            addCriterion("TEACHER_SEX >", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_SEX >=", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexLessThan(String value) {
            addCriterion("TEACHER_SEX <", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_SEX <=", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexLike(String value) {
            addCriterion("TEACHER_SEX like", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotLike(String value) {
            addCriterion("TEACHER_SEX not like", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIn(List<String> values) {
            addCriterion("TEACHER_SEX in", values, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotIn(List<String> values) {
            addCriterion("TEACHER_SEX not in", values, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexBetween(String value1, String value2) {
            addCriterion("TEACHER_SEX between", value1, value2, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotBetween(String value1, String value2) {
            addCriterion("TEACHER_SEX not between", value1, value2, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailIsNull() {
            addCriterion("TEACHER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailIsNotNull() {
            addCriterion("TEACHER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailEqualTo(String value) {
            addCriterion("TEACHER_EMAIL =", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotEqualTo(String value) {
            addCriterion("TEACHER_EMAIL <>", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailGreaterThan(String value) {
            addCriterion("TEACHER_EMAIL >", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_EMAIL >=", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailLessThan(String value) {
            addCriterion("TEACHER_EMAIL <", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_EMAIL <=", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailLike(String value) {
            addCriterion("TEACHER_EMAIL like", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotLike(String value) {
            addCriterion("TEACHER_EMAIL not like", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailIn(List<String> values) {
            addCriterion("TEACHER_EMAIL in", values, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotIn(List<String> values) {
            addCriterion("TEACHER_EMAIL not in", values, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailBetween(String value1, String value2) {
            addCriterion("TEACHER_EMAIL between", value1, value2, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotBetween(String value1, String value2) {
            addCriterion("TEACHER_EMAIL not between", value1, value2, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIsNull() {
            addCriterion("TEACHER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIsNotNull() {
            addCriterion("TEACHER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneEqualTo(String value) {
            addCriterion("TEACHER_PHONE =", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotEqualTo(String value) {
            addCriterion("TEACHER_PHONE <>", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneGreaterThan(String value) {
            addCriterion("TEACHER_PHONE >", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_PHONE >=", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLessThan(String value) {
            addCriterion("TEACHER_PHONE <", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_PHONE <=", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLike(String value) {
            addCriterion("TEACHER_PHONE like", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotLike(String value) {
            addCriterion("TEACHER_PHONE not like", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIn(List<String> values) {
            addCriterion("TEACHER_PHONE in", values, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotIn(List<String> values) {
            addCriterion("TEACHER_PHONE not in", values, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneBetween(String value1, String value2) {
            addCriterion("TEACHER_PHONE between", value1, value2, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotBetween(String value1, String value2) {
            addCriterion("TEACHER_PHONE not between", value1, value2, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressIsNull() {
            addCriterion("TEACHER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressIsNotNull() {
            addCriterion("TEACHER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressEqualTo(String value) {
            addCriterion("TEACHER_ADDRESS =", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressNotEqualTo(String value) {
            addCriterion("TEACHER_ADDRESS <>", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressGreaterThan(String value) {
            addCriterion("TEACHER_ADDRESS >", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_ADDRESS >=", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressLessThan(String value) {
            addCriterion("TEACHER_ADDRESS <", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_ADDRESS <=", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressLike(String value) {
            addCriterion("TEACHER_ADDRESS like", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressNotLike(String value) {
            addCriterion("TEACHER_ADDRESS not like", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressIn(List<String> values) {
            addCriterion("TEACHER_ADDRESS in", values, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressNotIn(List<String> values) {
            addCriterion("TEACHER_ADDRESS not in", values, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressBetween(String value1, String value2) {
            addCriterion("TEACHER_ADDRESS between", value1, value2, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressNotBetween(String value1, String value2) {
            addCriterion("TEACHER_ADDRESS not between", value1, value2, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherCollageIsNull() {
            addCriterion("TEACHER_COLLAGE is null");
            return (Criteria) this;
        }

        public Criteria andTeacherCollageIsNotNull() {
            addCriterion("TEACHER_COLLAGE is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherCollageEqualTo(String value) {
            addCriterion("TEACHER_COLLAGE =", value, "teacherCollage");
            return (Criteria) this;
        }

        public Criteria andTeacherCollageNotEqualTo(String value) {
            addCriterion("TEACHER_COLLAGE <>", value, "teacherCollage");
            return (Criteria) this;
        }

        public Criteria andTeacherCollageGreaterThan(String value) {
            addCriterion("TEACHER_COLLAGE >", value, "teacherCollage");
            return (Criteria) this;
        }

        public Criteria andTeacherCollageGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_COLLAGE >=", value, "teacherCollage");
            return (Criteria) this;
        }

        public Criteria andTeacherCollageLessThan(String value) {
            addCriterion("TEACHER_COLLAGE <", value, "teacherCollage");
            return (Criteria) this;
        }

        public Criteria andTeacherCollageLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_COLLAGE <=", value, "teacherCollage");
            return (Criteria) this;
        }

        public Criteria andTeacherCollageLike(String value) {
            addCriterion("TEACHER_COLLAGE like", value, "teacherCollage");
            return (Criteria) this;
        }

        public Criteria andTeacherCollageNotLike(String value) {
            addCriterion("TEACHER_COLLAGE not like", value, "teacherCollage");
            return (Criteria) this;
        }

        public Criteria andTeacherCollageIn(List<String> values) {
            addCriterion("TEACHER_COLLAGE in", values, "teacherCollage");
            return (Criteria) this;
        }

        public Criteria andTeacherCollageNotIn(List<String> values) {
            addCriterion("TEACHER_COLLAGE not in", values, "teacherCollage");
            return (Criteria) this;
        }

        public Criteria andTeacherCollageBetween(String value1, String value2) {
            addCriterion("TEACHER_COLLAGE between", value1, value2, "teacherCollage");
            return (Criteria) this;
        }

        public Criteria andTeacherCollageNotBetween(String value1, String value2) {
            addCriterion("TEACHER_COLLAGE not between", value1, value2, "teacherCollage");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdIsNull() {
            addCriterion("TEACHER_PWD is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdIsNotNull() {
            addCriterion("TEACHER_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdEqualTo(String value) {
            addCriterion("TEACHER_PWD =", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdNotEqualTo(String value) {
            addCriterion("TEACHER_PWD <>", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdGreaterThan(String value) {
            addCriterion("TEACHER_PWD >", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_PWD >=", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdLessThan(String value) {
            addCriterion("TEACHER_PWD <", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_PWD <=", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdLike(String value) {
            addCriterion("TEACHER_PWD like", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdNotLike(String value) {
            addCriterion("TEACHER_PWD not like", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdIn(List<String> values) {
            addCriterion("TEACHER_PWD in", values, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdNotIn(List<String> values) {
            addCriterion("TEACHER_PWD not in", values, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdBetween(String value1, String value2) {
            addCriterion("TEACHER_PWD between", value1, value2, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdNotBetween(String value1, String value2) {
            addCriterion("TEACHER_PWD not between", value1, value2, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusIsNull() {
            addCriterion("TEACHER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusIsNotNull() {
            addCriterion("TEACHER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusEqualTo(Integer value) {
            addCriterion("TEACHER_STATUS =", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusNotEqualTo(Integer value) {
            addCriterion("TEACHER_STATUS <>", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusGreaterThan(Integer value) {
            addCriterion("TEACHER_STATUS >", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEACHER_STATUS >=", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusLessThan(Integer value) {
            addCriterion("TEACHER_STATUS <", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusLessThanOrEqualTo(Integer value) {
            addCriterion("TEACHER_STATUS <=", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusIn(List<Integer> values) {
            addCriterion("TEACHER_STATUS in", values, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusNotIn(List<Integer> values) {
            addCriterion("TEACHER_STATUS not in", values, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusBetween(Integer value1, Integer value2) {
            addCriterion("TEACHER_STATUS between", value1, value2, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("TEACHER_STATUS not between", value1, value2, "teacherStatus");
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