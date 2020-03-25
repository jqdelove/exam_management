package com.jinqi.exam.service;

import com.jinqi.exam.entity.ClazzTeacher;

import java.util.List;

/**
 * 教师与班级的中间表
 */
public interface ClazzTeacherService {

    List<ClazzTeacher> getClazzTeacher(Integer teacherId,int page,int size);
}
