package com.jinqi.exam.entity;

import java.io.Serializable;

public class ExaminationSyllabus implements Serializable {
    private Integer examinationSyllabusId;

    private Integer courseId;

    private static final long serialVersionUID = 1L;

    public Integer getExaminationSyllabusId() {
        return examinationSyllabusId;
    }

    public void setExaminationSyllabusId(Integer examinationSyllabusId) {
        this.examinationSyllabusId = examinationSyllabusId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}