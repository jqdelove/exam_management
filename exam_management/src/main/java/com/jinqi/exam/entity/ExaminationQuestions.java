package com.jinqi.exam.entity;

import java.io.Serializable;

public class ExaminationQuestions implements Serializable {
    private Integer examinationQuestionsId;

    private String examinationQuestionsContent;

    private String examinationQuestionsAnswer;

    private String examinationSelect1;

    private String examinationSelect2;

    private String examinationSelect3;

    private String examinationSelect4;

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

    public String getExaminationSelect1() {
        return examinationSelect1;
    }

    public void setExaminationSelect1(String examinationSelect1) {
        this.examinationSelect1 = examinationSelect1 == null ? null : examinationSelect1.trim();
    }

    public String getExaminationSelect2() {
        return examinationSelect2;
    }

    public void setExaminationSelect2(String examinationSelect2) {
        this.examinationSelect2 = examinationSelect2 == null ? null : examinationSelect2.trim();
    }

    public String getExaminationSelect3() {
        return examinationSelect3;
    }

    public void setExaminationSelect3(String examinationSelect3) {
        this.examinationSelect3 = examinationSelect3 == null ? null : examinationSelect3.trim();
    }

    public String getExaminationSelect4() {
        return examinationSelect4;
    }

    public void setExaminationSelect4(String examinationSelect4) {
        this.examinationSelect4 = examinationSelect4 == null ? null : examinationSelect4.trim();
    }
}