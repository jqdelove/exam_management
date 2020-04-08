package com.jinqi.exam.service;

import com.jinqi.exam.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAll(int page,int size);

    Course getCourse(Integer courseId);
}
