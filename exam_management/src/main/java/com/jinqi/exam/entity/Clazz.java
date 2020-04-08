package com.jinqi.exam.entity;

import java.io.Serializable;
import java.util.List;

public class Clazz implements Serializable {
    private Integer classId;

    private String className;

    private Integer classAmount;

    private List<ClazzTeacher> clazzTeachers;

    private String teacherName;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    private static final long serialVersionUID = 1L;

    public List<ClazzTeacher> getClazzTeachers() {
        return clazzTeachers;
    }

    public void setClazzTeachers(List<ClazzTeacher> clazzTeachers) {
        this.clazzTeachers = clazzTeachers;
    }

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