package com.jinqi.exam.dao;

import com.jinqi.exam.entity.TeacherStudent;
import com.jinqi.exam.entity.TeacherStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TeacherStudentMapper {
    int countByExample(TeacherStudentExample example);

    int deleteByExample(TeacherStudentExample example);

    int deleteByPrimaryKey(Integer teacherStudentId);

    int insert(TeacherStudent record);

    int insertSelective(TeacherStudent record);

    List<TeacherStudent> selectByExampleWithRowbounds(TeacherStudentExample example, RowBounds rowBounds);

    List<TeacherStudent> selectByExample(TeacherStudentExample example);

    TeacherStudent selectByPrimaryKey(Integer teacherStudentId);

    int updateByExampleSelective(@Param("record") TeacherStudent record, @Param("example") TeacherStudentExample example);

    int updateByExample(@Param("record") TeacherStudent record, @Param("example") TeacherStudentExample example);

    int updateByPrimaryKeySelective(TeacherStudent record);

    int updateByPrimaryKey(TeacherStudent record);
}