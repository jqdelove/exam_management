package com.jinqi.exam.dao;

import com.jinqi.exam.entity.ClazzStudent;
import com.jinqi.exam.entity.ClazzStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ClazzStudentMapper {
    int countByExample(ClazzStudentExample example);

    int deleteByExample(ClazzStudentExample example);

    int deleteByPrimaryKey(Integer classStudentId);

    int insert(ClazzStudent record);

    int insertSelective(ClazzStudent record);

    List<ClazzStudent> selectByExampleWithRowbounds(ClazzStudentExample example, RowBounds rowBounds);

    List<ClazzStudent> selectByExample(ClazzStudentExample example);

    ClazzStudent selectByPrimaryKey(Integer classStudentId);

    List<ClazzStudent> selectByClassId(Integer classId);

    List<ClazzStudent> selectByClassIdAndCourseId(@Param("classId") Integer classId,@Param("courseId") Integer courseId);

    int updateByExampleSelective(@Param("record") ClazzStudent record, @Param("example") ClazzStudentExample example);

    int updateByExample(@Param("record") ClazzStudent record, @Param("example") ClazzStudentExample example);

    int updateByPrimaryKeySelective(ClazzStudent record);

    int updateByPrimaryKey(ClazzStudent record);
}