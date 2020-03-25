package com.jinqi.exam.entity;

import java.io.Serializable;

public class ExaminationTestPaper implements Serializable {
    private Integer examinationTestPaperId;

    private Integer testPaperId;

    private Integer examinationQuestionsId;

    private static final long serialVersionUID = 1L;

    public Integer getExaminationTestPaperId() {
        return examinationTestPaperId;
    }

    public void setExaminationTestPaperId(Integer examinationTestPaperId) {
        this.examinationTestPaperId = examinationTestPaperId;
    }

    public Integer getTestPaperId() {
        return testPaperId;
    }

    public void setTestPaperId(Integer testPaperId) {
        this.testPaperId = testPaperId;
    }

    public Integer getExaminationQuestionsId() {
        return examinationQuestionsId;
    }

    public void setExaminationQuestionsId(Integer examinationQuestionsId) {
        this.examinationQuestionsId = examinationQuestionsId;
    }
}