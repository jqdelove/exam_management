package com.jinqi.exam.dao;

import com.jinqi.exam.entity.SyllabusKnowledge;
import com.jinqi.exam.entity.SyllabusKnowledgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SyllabusKnowledgeMapper {
    int countByExample(SyllabusKnowledgeExample example);

    int deleteByExample(SyllabusKnowledgeExample example);

    int deleteByPrimaryKey(Integer syllabusKnowledgeId);

    int insert(SyllabusKnowledge record);

    int insertSelective(SyllabusKnowledge record);

    List<SyllabusKnowledge> selectByExampleWithRowbounds(SyllabusKnowledgeExample example, RowBounds rowBounds);

    List<SyllabusKnowledge> selectByExample(SyllabusKnowledgeExample example);

    SyllabusKnowledge selectByPrimaryKey(Integer syllabusKnowledgeId);

    List<SyllabusKnowledge> selectByExaminationSyllabusId(@Param("examinationSyllabusId") Integer examinationSyllabusId);

    int updateByExampleSelective(@Param("record") SyllabusKnowledge record, @Param("example") SyllabusKnowledgeExample example);

    int updateByExample(@Param("record") SyllabusKnowledge record, @Param("example") SyllabusKnowledgeExample example);

    int updateByPrimaryKeySelective(SyllabusKnowledge record);

    int updateByPrimaryKey(SyllabusKnowledge record);
}