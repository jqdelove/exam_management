package com.jinqi.exam.dao;

import com.jinqi.exam.entity.TeacherCourse;
import com.jinqi.exam.entity.TeacherCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TeacherCourseMapper {
    int countByExample(TeacherCourseExample example);

    int deleteByExample(TeacherCourseExample example);

    int deleteByPrimaryKey(Integer teacherCourseId);

    int insert(TeacherCourse record);

    int insertSelective(TeacherCourse record);

    List<TeacherCourse> selectByExampleWithRowbounds(TeacherCourseExample example, RowBounds rowBounds);

    List<TeacherCourse> selectByExample(TeacherCourseExample example);

    TeacherCourse selectByPrimaryKey(Integer teacherCourseId);

    List<TeacherCourse> selectByTeacherId(Integer teacherId);

    int updateByExampleSelective(@Param("record") TeacherCourse record, @Param("example") TeacherCourseExample example);

    int updateByExample(@Param("record") TeacherCourse record, @Param("example") TeacherCourseExample example);

    int updateByPrimaryKeySelective(TeacherCourse record);

    int updateByPrimaryKey(TeacherCourse record);
}