package com.jinqi.exam.entity;

import java.io.Serializable;
import java.util.List;

public class ClazzStudent implements Serializable {
    private Integer classStudentId;

    private Integer classId;

    private Integer studentId;

    private Clazz clazz;

    private Student student;

    private Integer scoreNumber;

    public Integer getScoreNumber() {
        return scoreNumber;
    }

    public void setScoreNumber(Integer scoreNumber) {
        this.scoreNumber = scoreNumber;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    private static final long serialVersionUID = 1L;

    public Integer getClassStudentId() {
        return classStudentId;
    }

    public void setClassStudentId(Integer classStudentId) {
        this.classStudentId = classStudentId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}