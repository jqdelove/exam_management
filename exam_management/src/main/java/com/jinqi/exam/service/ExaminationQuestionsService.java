package com.jinqi.exam.service;

import com.jinqi.exam.entity.ExaminationQuestions;

import java.util.List;

public interface ExaminationQuestionsService {

    List<ExaminationQuestions> getAll();

    Integer checkAnswer(Integer examinationQuestionsId,String examinationQuestionAnswer);
}
