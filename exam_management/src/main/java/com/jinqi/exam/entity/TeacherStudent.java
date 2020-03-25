package com.jinqi.exam.entity;

import java.io.Serializable;

public class TeacherStudent implements Serializable {
    private Integer teacherStudentId;

    private Integer teacherId;

    private Integer studentId;

    private static final long serialVersionUID = 1L;

    public Integer getTeacherStudentId() {
        return teacherStudentId;
    }

    public void setTeacherStudentId(Integer teacherStudentId) {
        this.teacherStudentId = teacherStudentId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}