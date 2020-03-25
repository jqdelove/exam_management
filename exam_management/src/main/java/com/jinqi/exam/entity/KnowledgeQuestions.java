package com.jinqi.exam.entity;

import java.io.Serializable;

public class KnowledgeQuestions implements Serializable {
    private Integer knowledgeQuestionsId;

    private Integer knowledgePointsId;

    private Integer examinationQuestionsId;

    private static final long serialVersionUID = 1L;

    public Integer getKnowledgeQuestionsId() {
        return knowledgeQuestionsId;
    }

    public void setKnowledgeQuestionsId(Integer knowledgeQuestionsId) {
        this.knowledgeQuestionsId = knowledgeQuestionsId;
    }

    public Integer getKnowledgePointsId() {
        return knowledgePointsId;
    }

    public void setKnowledgePointsId(Integer knowledgePointsId) {
        this.knowledgePointsId = knowledgePointsId;
    }

    public Integer getExaminationQuestionsId() {
        return examinationQuestionsId;
    }

    public void setExaminationQuestionsId(Integer examinationQuestionsId) {
        this.examinationQuestionsId = examinationQuestionsId;
    }
}