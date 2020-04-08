package com.jinqi.exam.entity;

import java.io.Serializable;
import java.util.Date;

public class Course implements Serializable {
    private Integer courseId;

    private String courseName;

    private Integer courseAmount;

    private Date courseBeginTime;

    private Date courseEndTime;

    private String courseMajor;

    private String teacherName;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    private static final long serialVersionUID = 1L;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Integer getCourseAmount() {
        return courseAmount;
    }

    public void setCourseAmount(Integer courseAmount) {
        this.courseAmount = courseAmount;
    }

    public Date getCourseBeginTime() {
        return courseBeginTime;
    }

    public void setCourseBeginTime(Date courseBeginTime) {
        this.courseBeginTime = courseBeginTime;
    }

    public Date getCourseEndTime() {
        return courseEndTime;
    }

    public void setCourseEndTime(Date courseEndTime) {
        this.courseEndTime = courseEndTime;
    }

    public String getCourseMajor() {
        return courseMajor;
    }

    public void setCourseMajor(String courseMajor) {
        this.courseMajor = courseMajor == null ? null : courseMajor.trim();
    }
}