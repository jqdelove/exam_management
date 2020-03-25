package com.jinqi.exam.service;

import com.jinqi.exam.entity.Student;
import com.jinqi.exam.entity.Teacher;
import com.jinqi.exam.exception.*;

/**
 * 处理教师信息
 */
public interface TeacherService {

    Integer register(Teacher teacher) throws TeacherDuplicateEmailException;

    Teacher login(Teacher teacher) throws TeacherNotFoundException, TeacherDisableException;

    Teacher checkInfo(Integer teacherId);

    Integer updateInfo(Teacher teacher);
}
