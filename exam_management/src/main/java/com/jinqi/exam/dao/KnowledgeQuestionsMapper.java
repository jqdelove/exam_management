package com.jinqi.exam.dao;

import com.jinqi.exam.entity.KnowledgeQuestions;
import com.jinqi.exam.entity.KnowledgeQuestionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface KnowledgeQuestionsMapper {
    int countByExample(KnowledgeQuestionsExample example);

    int deleteByExample(KnowledgeQuestionsExample example);

    int deleteByPrimaryKey(Integer knowledgeQuestionsId);

    int insert(KnowledgeQuestions record);

    int insertSelective(KnowledgeQuestions record);

    List<KnowledgeQuestions> selectByExampleWithRowbounds(KnowledgeQuestionsExample example, RowBounds rowBounds);

    List<KnowledgeQuestions> selectByExample(KnowledgeQuestionsExample example);

    KnowledgeQuestions selectByPrimaryKey(Integer knowledgeQuestionsId);

    int updateByExampleSelective(@Param("record") KnowledgeQuestions record, @Param("example") KnowledgeQuestionsExample example);

    int updateByExample(@Param("record") KnowledgeQuestions record, @Param("example") KnowledgeQuestionsExample example);

    int updateByPrimaryKeySelective(KnowledgeQuestions record);

    int updateByPrimaryKey(KnowledgeQuestions record);
}