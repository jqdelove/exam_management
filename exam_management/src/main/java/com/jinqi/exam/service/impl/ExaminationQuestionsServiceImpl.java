package com.jinqi.exam.service.impl;

import com.jinqi.exam.dao.ExaminationQuestionsMapper;
import com.jinqi.exam.entity.ExaminationQuestions;
import com.jinqi.exam.service.ExaminationQuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("examinationQuestionsService")
@Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
public class ExaminationQuestionsServiceImpl implements ExaminationQuestionsService {

    @Autowired
    private ExaminationQuestionsMapper examinationQuestionsMapper;

    @Override
    public List<ExaminationQuestions> getAll() {
        return examinationQuestionsMapper.selectAll();
    }

    @Override
    public Integer checkAnswer(Integer examinationQuestionsId,String examinationQuestionAnswer) {
        ExaminationQuestions examinationQuestions =
                examinationQuestionsMapper.selectByPrimaryKey(examinationQuestionsId);
        if (examinationQuestionAnswer.equals(examinationQuestions.getExaminationQuestionsAnswer())){
            return 1;
        }else {
            return 2;
        }
    }
}
