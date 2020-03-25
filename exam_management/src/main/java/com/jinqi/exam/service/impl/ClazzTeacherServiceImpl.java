package com.jinqi.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.jinqi.exam.dao.ClazzTeacherMapper;
import com.jinqi.exam.entity.ClazzTeacher;
import com.jinqi.exam.service.ClazzTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("clazzTeacherService")
@Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
public class ClazzTeacherServiceImpl implements ClazzTeacherService {

    @Autowired
    private ClazzTeacherMapper clazzTeacherMapper;


    @Override
    public List<ClazzTeacher> getClazzTeacher(Integer teacherId, int page, int size) {
        //使用分页插件，必须写在dao执行之前
        PageHelper.startPage(page,size);
        return clazzTeacherMapper.selectByTeacherId(teacherId);
    }
}
