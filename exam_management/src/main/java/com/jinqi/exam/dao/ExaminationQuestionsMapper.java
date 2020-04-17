package com.jinqi.exam.dao;

import com.jinqi.exam.entity.ExaminationQuestions;
import com.jinqi.exam.entity.ExaminationQuestionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ExaminationQuestionsMapper {
    int countByExample(ExaminationQuestionsExample example);

    int deleteByExample(ExaminationQuestionsExample example);

    int deleteByPrimaryKey(Integer examinationQuestionsId);

    int insert(ExaminationQuestions record);

    int insertSelective(ExaminationQuestions record);

    List<ExaminationQuestions> selectByExampleWithRowbounds(ExaminationQuestionsExample example, RowBounds rowBounds);

    List<ExaminationQuestions> selectByExample(ExaminationQuestionsExample example);

    ExaminationQuestions selectByPrimaryKey(Integer examinationQuestionsId);

    List<ExaminationQuestions> selectAll();

    int updateByExampleSelective(@Param("record") ExaminationQuestions record, @Param("example") ExaminationQuestionsExample example);

    int updateByExample(@Param("record") ExaminationQuestions record, @Param("example") ExaminationQuestionsExample example);

    int updateByPrimaryKeySelective(ExaminationQuestions record);

    int updateByPrimaryKey(ExaminationQuestions record);
}