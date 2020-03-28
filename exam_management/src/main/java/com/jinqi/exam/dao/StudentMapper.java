package com.jinqi.exam.dao;

import com.jinqi.exam.entity.Student;
import com.jinqi.exam.entity.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StudentMapper {
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer studentId);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExampleWithRowbounds(StudentExample example, RowBounds rowBounds);

    List<Student> selectByExample(StudentExample example);

    List<Student> selectAll();

    Student selectByPrimaryKey(Integer studentId);

    Student selectByEmail(String studentEmail);

    Student selectByEmailAndPwd(@Param("studentEmail")String studentEmail,@Param("studentPwd") String studentPwd);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}