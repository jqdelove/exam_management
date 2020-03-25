package com.jinqi.exam.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStudentIdIsNull() {
            addCriterion("STUDENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("STUDENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("STUDENT_ID =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("STUDENT_ID <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("STUDENT_ID >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STUDENT_ID >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("STUDENT_ID <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("STUDENT_ID <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("STUDENT_ID in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("STUDENT_ID not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("STUDENT_ID between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STUDENT_ID not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("STUDENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("STUDENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("STUDENT_NAME =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("STUDENT_NAME <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("STUDENT_NAME >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_NAME >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("STUDENT_NAME <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_NAME <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("STUDENT_NAME like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("STUDENT_NAME not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("STUDENT_NAME in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("STUDENT_NAME not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("STUDENT_NAME between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("STUDENT_NAME not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentBirthIsNull() {
            addCriterion("STUDENT_BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andStudentBirthIsNotNull() {
            addCriterion("STUDENT_BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andStudentBirthEqualTo(Date value) {
            addCriterionForJDBCDate("STUDENT_BIRTH =", value, "studentBirth");
            return (Criteria) this;
        }

        public Criteria andStudentBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("STUDENT_BIRTH <>", value, "studentBirth");
            return (Criteria) this;
        }

        public Criteria andStudentBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("STUDENT_BIRTH >", value, "studentBirth");
            return (Criteria) this;
        }

        public Criteria andStudentBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STUDENT_BIRTH >=", value, "studentBirth");
            return (Criteria) this;
        }

        public Criteria andStudentBirthLessThan(Date value) {
            addCriterionForJDBCDate("STUDENT_BIRTH <", value, "studentBirth");
            return (Criteria) this;
        }

        public Criteria andStudentBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STUDENT_BIRTH <=", value, "studentBirth");
            return (Criteria) this;
        }

        public Criteria andStudentBirthIn(List<Date> values) {
            addCriterionForJDBCDate("STUDENT_BIRTH in", values, "studentBirth");
            return (Criteria) this;
        }

        public Criteria andStudentBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("STUDENT_BIRTH not in", values, "studentBirth");
            return (Criteria) this;
        }

        public Criteria andStudentBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STUDENT_BIRTH between", value1, value2, "studentBirth");
            return (Criteria) this;
        }

        public Criteria andStudentBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STUDENT_BIRTH not between", value1, value2, "studentBirth");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNull() {
            addCriterion("STUDENT_SEX is null");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNotNull() {
            addCriterion("STUDENT_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSexEqualTo(String value) {
            addCriterion("STUDENT_SEX =", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotEqualTo(String value) {
            addCriterion("STUDENT_SEX <>", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThan(String value) {
            addCriterion("STUDENT_SEX >", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_SEX >=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThan(String value) {
            addCriterion("STUDENT_SEX <", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_SEX <=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLike(String value) {
            addCriterion("STUDENT_SEX like", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotLike(String value) {
            addCriterion("STUDENT_SEX not like", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexIn(List<String> values) {
            addCriterion("STUDENT_SEX in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotIn(List<String> values) {
            addCriterion("STUDENT_SEX not in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexBetween(String value1, String value2) {
            addCriterion("STUDENT_SEX between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotBetween(String value1, String value2) {
            addCriterion("STUDENT_SEX not between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIsNull() {
            addCriterion("STUDENT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIsNotNull() {
            addCriterion("STUDENT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAddressEqualTo(String value) {
            addCriterion("STUDENT_ADDRESS =", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotEqualTo(String value) {
            addCriterion("STUDENT_ADDRESS <>", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressGreaterThan(String value) {
            addCriterion("STUDENT_ADDRESS >", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_ADDRESS >=", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLessThan(String value) {
            addCriterion("STUDENT_ADDRESS <", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_ADDRESS <=", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLike(String value) {
            addCriterion("STUDENT_ADDRESS like", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotLike(String value) {
            addCriterion("STUDENT_ADDRESS not like", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIn(List<String> values) {
            addCriterion("STUDENT_ADDRESS in", values, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotIn(List<String> values) {
            addCriterion("STUDENT_ADDRESS not in", values, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressBetween(String value1, String value2) {
            addCriterion("STUDENT_ADDRESS between", value1, value2, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotBetween(String value1, String value2) {
            addCriterion("STUDENT_ADDRESS not between", value1, value2, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIsNull() {
            addCriterion("STUDENT_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIsNotNull() {
            addCriterion("STUDENT_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEmailEqualTo(String value) {
            addCriterion("STUDENT_EMAIL =", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotEqualTo(String value) {
            addCriterion("STUDENT_EMAIL <>", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailGreaterThan(String value) {
            addCriterion("STUDENT_EMAIL >", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_EMAIL >=", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLessThan(String value) {
            addCriterion("STUDENT_EMAIL <", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_EMAIL <=", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLike(String value) {
            addCriterion("STUDENT_EMAIL like", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotLike(String value) {
            addCriterion("STUDENT_EMAIL not like", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIn(List<String> values) {
            addCriterion("STUDENT_EMAIL in", values, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotIn(List<String> values) {
            addCriterion("STUDENT_EMAIL not in", values, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailBetween(String value1, String value2) {
            addCriterion("STUDENT_EMAIL between", value1, value2, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotBetween(String value1, String value2) {
            addCriterion("STUDENT_EMAIL not between", value1, value2, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIsNull() {
            addCriterion("STUDENT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIsNotNull() {
            addCriterion("STUDENT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneEqualTo(String value) {
            addCriterion("STUDENT_PHONE =", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotEqualTo(String value) {
            addCriterion("STUDENT_PHONE <>", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneGreaterThan(String value) {
            addCriterion("STUDENT_PHONE >", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_PHONE >=", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLessThan(String value) {
            addCriterion("STUDENT_PHONE <", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_PHONE <=", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLike(String value) {
            addCriterion("STUDENT_PHONE like", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotLike(String value) {
            addCriterion("STUDENT_PHONE not like", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIn(List<String> values) {
            addCriterion("STUDENT_PHONE in", values, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotIn(List<String> values) {
            addCriterion("STUDENT_PHONE not in", values, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneBetween(String value1, String value2) {
            addCriterion("STUDENT_PHONE between", value1, value2, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotBetween(String value1, String value2) {
            addCriterion("STUDENT_PHONE not between", value1, value2, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentMajorIsNull() {
            addCriterion("STUDENT_MAJOR is null");
            return (Criteria) this;
        }

        public Criteria andStudentMajorIsNotNull() {
            addCriterion("STUDENT_MAJOR is not null");
            return (Criteria) this;
        }

        public Criteria andStudentMajorEqualTo(String value) {
            addCriterion("STUDENT_MAJOR =", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorNotEqualTo(String value) {
            addCriterion("STUDENT_MAJOR <>", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorGreaterThan(String value) {
            addCriterion("STUDENT_MAJOR >", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_MAJOR >=", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorLessThan(String value) {
            addCriterion("STUDENT_MAJOR <", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_MAJOR <=", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorLike(String value) {
            addCriterion("STUDENT_MAJOR like", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorNotLike(String value) {
            addCriterion("STUDENT_MAJOR not like", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorIn(List<String> values) {
            addCriterion("STUDENT_MAJOR in", values, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorNotIn(List<String> values) {
            addCriterion("STUDENT_MAJOR not in", values, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorBetween(String value1, String value2) {
            addCriterion("STUDENT_MAJOR between", value1, value2, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorNotBetween(String value1, String value2) {
            addCriterion("STUDENT_MAJOR not between", value1, value2, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentCollageIsNull() {
            addCriterion("STUDENT_COLLAGE is null");
            return (Criteria) this;
        }

        public Criteria andStudentCollageIsNotNull() {
            addCriterion("STUDENT_COLLAGE is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCollageEqualTo(String value) {
            addCriterion("STUDENT_COLLAGE =", value, "studentCollage");
            return (Criteria) this;
        }

        public Criteria andStudentCollageNotEqualTo(String value) {
            addCriterion("STUDENT_COLLAGE <>", value, "studentCollage");
            return (Criteria) this;
        }

        public Criteria andStudentCollageGreaterThan(String value) {
            addCriterion("STUDENT_COLLAGE >", value, "studentCollage");
            return (Criteria) this;
        }

        public Criteria andStudentCollageGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_COLLAGE >=", value, "studentCollage");
            return (Criteria) this;
        }

        public Criteria andStudentCollageLessThan(String value) {
            addCriterion("STUDENT_COLLAGE <", value, "studentCollage");
            return (Criteria) this;
        }

        public Criteria andStudentCollageLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_COLLAGE <=", value, "studentCollage");
            return (Criteria) this;
        }

        public Criteria andStudentCollageLike(String value) {
            addCriterion("STUDENT_COLLAGE like", value, "studentCollage");
            return (Criteria) this;
        }

        public Criteria andStudentCollageNotLike(String value) {
            addCriterion("STUDENT_COLLAGE not like", value, "studentCollage");
            return (Criteria) this;
        }

        public Criteria andStudentCollageIn(List<String> values) {
            addCriterion("STUDENT_COLLAGE in", values, "studentCollage");
            return (Criteria) this;
        }

        public Criteria andStudentCollageNotIn(List<String> values) {
            addCriterion("STUDENT_COLLAGE not in", values, "studentCollage");
            return (Criteria) this;
        }

        public Criteria andStudentCollageBetween(String value1, String value2) {
            addCriterion("STUDENT_COLLAGE between", value1, value2, "studentCollage");
            return (Criteria) this;
        }

        public Criteria andStudentCollageNotBetween(String value1, String value2) {
            addCriterion("STUDENT_COLLAGE not between", value1, value2, "studentCollage");
            return (Criteria) this;
        }

        public Criteria andStudentPwdIsNull() {
            addCriterion("STUDENT_PWD is null");
            return (Criteria) this;
        }

        public Criteria andStudentPwdIsNotNull() {
            addCriterion("STUDENT_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPwdEqualTo(String value) {
            addCriterion("STUDENT_PWD =", value, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdNotEqualTo(String value) {
            addCriterion("STUDENT_PWD <>", value, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdGreaterThan(String value) {
            addCriterion("STUDENT_PWD >", value, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_PWD >=", value, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdLessThan(String value) {
            addCriterion("STUDENT_PWD <", value, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_PWD <=", value, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdLike(String value) {
            addCriterion("STUDENT_PWD like", value, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdNotLike(String value) {
            addCriterion("STUDENT_PWD not like", value, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdIn(List<String> values) {
            addCriterion("STUDENT_PWD in", values, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdNotIn(List<String> values) {
            addCriterion("STUDENT_PWD not in", values, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdBetween(String value1, String value2) {
            addCriterion("STUDENT_PWD between", value1, value2, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdNotBetween(String value1, String value2) {
            addCriterion("STUDENT_PWD not between", value1, value2, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentStatusIsNull() {
            addCriterion("STUDENT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStudentStatusIsNotNull() {
            addCriterion("STUDENT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStudentStatusEqualTo(Integer value) {
            addCriterion("STUDENT_STATUS =", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotEqualTo(Integer value) {
            addCriterion("STUDENT_STATUS <>", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusGreaterThan(Integer value) {
            addCriterion("STUDENT_STATUS >", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STUDENT_STATUS >=", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusLessThan(Integer value) {
            addCriterion("STUDENT_STATUS <", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STUDENT_STATUS <=", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusIn(List<Integer> values) {
            addCriterion("STUDENT_STATUS in", values, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotIn(List<Integer> values) {
            addCriterion("STUDENT_STATUS not in", values, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusBetween(Integer value1, Integer value2) {
            addCriterion("STUDENT_STATUS between", value1, value2, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STUDENT_STATUS not between", value1, value2, "studentStatus");
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