package com.jinqi.exam.service.impl;

import com.jinqi.exam.dao.ClazzStudentMapper;
import com.jinqi.exam.entity.ClazzStudent;
import com.jinqi.exam.service.ClazzStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("clazzStudentService")
@Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
public class ClazzStudentServiceImpl implements ClazzStudentService {

    @Autowired
    private ClazzStudentMapper clazzStudentMapper;

    @Override
    public List<ClazzStudent> getClazzStudent(Integer classId) {
        return clazzStudentMapper.selectByClassId(classId);
    }

    @Override
    public List<ClazzStudent> getClazzStudent(Integer classId, Integer courseId) {
        return clazzStudentMapper.selectByClassIdAndCourseId(classId,courseId);
    }

    @Override
    public ClazzStudent getClazzStudent2(Integer studentId) {
        return clazzStudentMapper.selectByStudentId(studentId);
    }

    @Override
    public Integer setClass(Integer studentId, Integer classId) {
        ClazzStudent clazzStudent = new ClazzStudent();
        clazzStudent.setClassId(classId);
        clazzStudent.setStudentId(studentId);
        return clazzStudentMapper.insertSelective(clazzStudent);
    }
}
