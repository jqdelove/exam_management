package com.jinqi.exam.dao;

import com.jinqi.exam.entity.Score;
import com.jinqi.exam.entity.ScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ScoreMapper {
    int countByExample(ScoreExample example);

    int deleteByExample(ScoreExample example);

    int deleteByPrimaryKey(Integer scoreId);

    int insert(Score record);

    int insertSelective(Score record);

    List<Score> selectByExampleWithRowbounds(ScoreExample example, RowBounds rowBounds);

    List<Score> selectByExample(ScoreExample example);

    Score selectByPrimaryKey(Integer scoreId);

    List<Score> selectByStudentId(Integer studentId);

    List<Score> selectByCourseId(Integer courseId);

    int updateByExampleSelective(@Param("record") Score record, @Param("example") ScoreExample example);

    int updateByExample(@Param("record") Score record, @Param("example") ScoreExample example);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}