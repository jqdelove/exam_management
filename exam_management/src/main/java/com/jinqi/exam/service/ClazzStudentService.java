package com.jinqi.exam.service;

import com.jinqi.exam.entity.ClazzStudent;

import java.util.List;

/**
 * 班级学生关系
 */
public interface ClazzStudentService {

    List<ClazzStudent> getClazzStudent(Integer classId);

    List<ClazzStudent> getClazzStudent(Integer classId,Integer courseId);
}
