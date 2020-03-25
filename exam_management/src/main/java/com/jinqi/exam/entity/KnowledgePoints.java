package com.jinqi.exam.entity;

import java.io.Serializable;

public class KnowledgePoints implements Serializable {
    private Integer knowledgePointsId;

    private Integer courseId;

    private Integer examinationSyllabusId;

    private String knowledgePointsContent;

    private static final long serialVersionUID = 1L;

    public Integer getKnowledgePointsId() {
        return knowledgePointsId;
    }

    public void setKnowledgePointsId(Integer knowledgePointsId) {
        this.knowledgePointsId = knowledgePointsId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getExaminationSyllabusId() {
        return examinationSyllabusId;
    }

    public void setExaminationSyllabusId(Integer examinationSyllabusId) {
        this.examinationSyllabusId = examinationSyllabusId;
    }

    public String getKnowledgePointsContent() {
        return knowledgePointsContent;
    }

    public void setKnowledgePointsContent(String knowledgePointsContent) {
        this.knowledgePointsContent = knowledgePointsContent == null ? null : knowledgePointsContent.trim();
    }
}