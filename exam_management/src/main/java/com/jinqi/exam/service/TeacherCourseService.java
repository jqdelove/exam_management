package com.jinqi.exam.service;

import com.jinqi.exam.entity.TeacherCourse;

import java.util.List;

public interface TeacherCourseService {

    List<TeacherCourse> getTeacherCourse(Integer teacherId,int page,int size);

    List<TeacherCourse> getTeacherCourse(Integer teacherId);
}

