package com.jinqi.exam.entity;

import java.io.Serializable;

public class SyllabusKnowledge implements Serializable {
    private Integer syllabusKnowledgeId;

    private Integer examinationSyllabusId;

    private Integer knowledgePointsId;

    private KnowledgePoints knowledgePoints;

    public KnowledgePoints getKnowledgePoints() {
        return knowledgePoints;
    }

    public void setKnowledgePoints(KnowledgePoints knowledgePoints) {
        this.knowledgePoints = knowledgePoints;
    }

    private static final long serialVersionUID = 1L;

    public Integer getSyllabusKnowledgeId() {
        return syllabusKnowledgeId;
    }

    public void setSyllabusKnowledgeId(Integer syllabusKnowledgeId) {
        this.syllabusKnowledgeId = syllabusKnowledgeId;
    }

    public Integer getExaminationSyllabusId() {
        return examinationSyllabusId;
    }

    public void setExaminationSyllabusId(Integer examinationSyllabusId) {
        this.examinationSyllabusId = examinationSyllabusId;
    }

    public Integer getKnowledgePointsId() {
        return knowledgePointsId;
    }

    public void setKnowledgePointsId(Integer knowledgePointsId) {
        this.knowledgePointsId = knowledgePointsId;
    }
}