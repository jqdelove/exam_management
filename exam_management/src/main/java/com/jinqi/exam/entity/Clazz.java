package com.jinqi.exam.entity;

import java.io.Serializable;

public class Clazz implements Serializable {
    private Integer classId;

    private String className;

    private Integer classAmount;

    private static final long serialVersionUID = 1L;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Integer getClassAmount() {
        return classAmount;
    }

    public void setClassAmount(Integer classAmount) {
        this.classAmount = classAmount;
    }
}