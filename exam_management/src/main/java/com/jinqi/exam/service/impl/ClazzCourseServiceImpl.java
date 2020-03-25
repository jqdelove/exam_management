package com.jinqi.exam.service.impl;

import com.jinqi.exam.dao.ClazzCourseMapper;
import com.jinqi.exam.entity.ClazzCourse;
import com.jinqi.exam.service.ClazzCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
public class ClazzCourseServiceImpl implements ClazzCourseService {

    @Autowired
    private ClazzCourseMapper clazzCourseMapper;

    @Override
    public List<ClazzCourse> getClazzCourse(Integer courseId) {
        return clazzCourseMapper.selectByCourseId(courseId);
    }
}
