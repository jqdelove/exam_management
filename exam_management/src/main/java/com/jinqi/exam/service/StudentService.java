package com.jinqi.exam.service;

import com.jinqi.exam.entity.Student;
import com.jinqi.exam.exception.DuplicateEmailException;
import com.jinqi.exam.exception.StudentDisableException;
import com.jinqi.exam.exception.StudentNotFoundException;

/**
 * 处理学生信息
 */
public interface StudentService {

    Integer register(Student student) throws DuplicateEmailException;

    Student login(Student student) throws StudentNotFoundException, StudentDisableException;

    Student checkInfo(Integer studentId);

    Integer updateInfo(Student student);
}
