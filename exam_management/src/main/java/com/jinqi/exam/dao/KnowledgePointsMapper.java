package com.jinqi.exam.dao;

import com.jinqi.exam.entity.KnowledgePoints;
import com.jinqi.exam.entity.KnowledgePointsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface KnowledgePointsMapper {
    int countByExample(KnowledgePointsExample example);

    int deleteByExample(KnowledgePointsExample example);

    int deleteByPrimaryKey(Integer knowledgePointsId);

    int insert(KnowledgePoints record);

    int insertSelective(KnowledgePoints record);

    List<KnowledgePoints> selectByExampleWithRowbounds(KnowledgePointsExample example, RowBounds rowBounds);

    List<KnowledgePoints> selectByExample(KnowledgePointsExample example);

    KnowledgePoints selectByPrimaryKey(Integer knowledgePointsId);

    List<KnowledgePoints> selectAll(Integer teacherId);

    List<KnowledgePoints> selectByExaminationSyllabusId(@Param("examinationSyllabusId") Integer examinationSyllabusId);

    int updateByExampleSelective(@Param("record") KnowledgePoints record, @Param("example") KnowledgePointsExample example);

    int updateByExample(@Param("record") KnowledgePoints record, @Param("example") KnowledgePointsExample example);

    int updateByPrimaryKeySelective(KnowledgePoints record);

    int updateByPrimaryKey(KnowledgePoints record);
}