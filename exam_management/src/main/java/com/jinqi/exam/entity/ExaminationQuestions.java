package com.jinqi.exam.entity;

import java.io.Serializable;

public class ExaminationQuestions implements Serializable {
    private Integer examinationQuestionsId;

    private String examinationQuestionsContent;

    private String examinationQuestionsAnswer;

    private static final long serialVersionUID = 1L;

    public Integer getExaminationQuestionsId() {
        return examinationQuestionsId;
    }

    public void setExaminationQuestionsId(Integer examinationQuestionsId) {
        this.examinationQuestionsId = examinationQuestionsId;
    }

    public String getExaminationQuestionsContent() {
        return examinationQuestionsContent;
    }

    public void setExaminationQuestionsContent(String examinationQuestionsContent) {
        this.examinationQuestionsContent = examinationQuestionsContent == null ? null : examinationQuestionsContent.trim();
    }

    public String getExaminationQuestionsAnswer() {
        return examinationQuestionsAnswer;
    }

    public void setExaminationQuestionsAnswer(String examinationQuestionsAnswer) {
        this.examinationQuestionsAnswer = examinationQuestionsAnswer == null ? null : examinationQuestionsAnswer.trim();
    }
}