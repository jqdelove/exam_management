package com.jinqi.exam.service;

import com.jinqi.exam.entity.Teacher;
import com.jinqi.exam.exception.*;

import java.util.List;

/**
 * 处理教师信息
 */
public interface TeacherService {

    Integer register(Teacher teacher) throws TeacherDuplicateEmailException;

    Teacher login(Teacher teacher) throws TeacherNotFoundException, TeacherDisableException;

    Teacher checkInfo(Integer teacherId);

    Integer updateInfo(Teacher teacher);

    List<Teacher> getAll(Integer page,Integer size);

    List<Teacher> getAll();
}
