package com.jinqi.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.jinqi.exam.dao.TeacherCourseMapper;
import com.jinqi.exam.entity.TeacherCourse;
import com.jinqi.exam.service.TeacherCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("teacherCourseService")
@Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
public class TeacherCourseServiceImpl implements TeacherCourseService {

    @Autowired
    private TeacherCourseMapper teacherCourseMapper;

    @Override
    public List<TeacherCourse> getTeacherCourse(Integer teacherId, int page, int size) {
        PageHelper.startPage(page,size);
        return teacherCourseMapper.selectByTeacherId(teacherId);
    }

    @Override
    public List<TeacherCourse> getTeacherCourse(Integer teacherId) {
        return teacherCourseMapper.selectByTeacherId(teacherId);
    }
}
