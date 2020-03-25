package com.jinqi.exam.entity;

import java.io.Serializable;
import java.util.Date;

public class TestPaper implements Serializable {
    private Integer testPaperId;

    private Integer examinationSyllabusId;

    private Date examinationSyllabusBeginTime;

    private Date examinationSyllabusEndTime;

    private String examinationSyllabusTitle;

    private static final long serialVersionUID = 1L;

    public Integer getTestPaperId() {
        return testPaperId;
    }

    public void setTestPaperId(Integer testPaperId) {
        this.testPaperId = testPaperId;
    }

    public Integer getExaminationSyllabusId() {
        return examinationSyllabusId;
    }

    public void setExaminationSyllabusId(Integer examinationSyllabusId) {
        this.examinationSyllabusId = examinationSyllabusId;
    }

    public Date getExaminationSyllabusBeginTime() {
        return examinationSyllabusBeginTime;
    }

    public void setExaminationSyllabusBeginTime(Date examinationSyllabusBeginTime) {
        this.examinationSyllabusBeginTime = examinationSyllabusBeginTime;
    }

    public Date getExaminationSyllabusEndTime() {
        return examinationSyllabusEndTime;
    }

    public void setExaminationSyllabusEndTime(Date examinationSyllabusEndTime) {
        this.examinationSyllabusEndTime = examinationSyllabusEndTime;
    }

    public String getExaminationSyllabusTitle() {
        return examinationSyllabusTitle;
    }

    public void setExaminationSyllabusTitle(String examinationSyllabusTitle) {
        this.examinationSyllabusTitle = examinationSyllabusTitle == null ? null : examinationSyllabusTitle.trim();
    }
}