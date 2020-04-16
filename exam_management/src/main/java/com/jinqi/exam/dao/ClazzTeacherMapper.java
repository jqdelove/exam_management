package com.jinqi.exam.dao;

import com.jinqi.exam.entity.ClazzTeacher;
import com.jinqi.exam.entity.ClazzTeacherExample;
import java.util.List;

import com.jinqi.exam.entity.Score;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ClazzTeacherMapper {
    int countByExample(ClazzTeacherExample example);

    int deleteByExample(ClazzTeacherExample example);

    int deleteByPrimaryKey(Integer classTeacherId);

    int insert(ClazzTeacher record);

    int insertSelective(ClazzTeacher record);

    List<ClazzTeacher> selectByExampleWithRowbounds(ClazzTeacherExample example, RowBounds rowBounds);

    List<ClazzTeacher> selectByExample(ClazzTeacherExample example);

    ClazzTeacher selectByPrimaryKey(Integer classTeacherId);

    List<ClazzTeacher> selectByTeacherId(Integer teacherId);

    List<ClazzTeacher> selectByClazzId(@Param("classId") Integer classId);

    int updateByExampleSelective(@Param("record") ClazzTeacher record, @Param("example") ClazzTeacherExample example);

    int updateByExample(@Param("record") ClazzTeacher record, @Param("example") ClazzTeacherExample example);

    int updateByPrimaryKeySelective(ClazzTeacher record);

    int updateByPrimaryKey(ClazzTeacher record);
}