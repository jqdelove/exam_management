package com.jinqi.exam.dao;

import com.jinqi.exam.entity.Student;
import com.jinqi.exam.entity.Teacher;
import com.jinqi.exam.entity.TeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TeacherMapper {
    int countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(Integer teacherId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByEmail(String teacherEmail);

    Teacher selectByEmailAndPwd(@Param("teacherEmail")String teacherEmail, @Param("teacherPwd") String teacherPwd);

    List<Teacher> selectByExampleWithRowbounds(TeacherExample example, RowBounds rowBounds);

    List<Teacher> selectByExample(TeacherExample example);

    List<Teacher> selectAll();

    Teacher selectByPrimaryKey(Integer teacherId);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}