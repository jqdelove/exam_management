package com.jinqi.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.jinqi.exam.dao.CourseMapper;
import com.jinqi.exam.entity.Course;
import com.jinqi.exam.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("courseService")
@Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> getAll(int page, int size) {
        PageHelper.startPage(page,size);
        return courseMapper.selectAll();
    }

    @Override
    public Course getCourse(Integer courseId) {
        return courseMapper.selectByPrimaryKey(courseId);
    }

    @Override
    public Integer updateInfo(Course course) {
        return courseMapper.updateByPrimaryKeySelective(course);
    }
}
