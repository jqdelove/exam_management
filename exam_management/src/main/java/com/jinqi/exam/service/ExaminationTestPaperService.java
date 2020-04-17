package com.jinqi.exam.service;

import com.jinqi.exam.entity.ExaminationTestPaper;

import java.util.List;

public interface ExaminationTestPaperService {

    List<ExaminationTestPaper> getAll(int page,int size);

    List<ExaminationTestPaper> getByTestPaperId(Integer testPaperId);

    void createExaminationTestPaper(List<ExaminationTestPaper> examinationTestPapers);
}
