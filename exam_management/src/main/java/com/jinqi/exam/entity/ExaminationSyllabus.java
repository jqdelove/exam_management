package com.jinqi.exam.entity;

import java.io.Serializable;
import java.util.List;

public class ExaminationSyllabus implements Serializable {
    private Integer examinationSyllabusId;

    private Integer courseId;

    private List<KnowledgePoints> knowledgePointses;

    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void addKnowledgePoints(KnowledgePoints knowledgePoints){
        knowledgePointses.add(knowledgePoints);
    }

    public List<KnowledgePoints> getKnowledgePointses() {
        return knowledgePointses;
    }

    public void setKnowledgePointses(List<KnowledgePoints> knowledgePointses) {
        this.knowledgePointses = knowledgePointses;
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