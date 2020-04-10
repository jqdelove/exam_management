package com.jinqi.exam.entity;

import java.io.Serializable;
import java.util.List;

public class ExaminationSyllabus implements Serializable {
    private Integer examinationSyllabusId;

    private Integer courseId;

    private String courseName;

    private List<SyllabusKnowledge> syllabusKnowledges;

    public List<SyllabusKnowledge> getSyllabusKnowledges() {
        return syllabusKnowledges;
    }

    public void setSyllabusKnowledges(List<SyllabusKnowledge> syllabusKnowledges) {
        this.syllabusKnowledges = syllabusKnowledges;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


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