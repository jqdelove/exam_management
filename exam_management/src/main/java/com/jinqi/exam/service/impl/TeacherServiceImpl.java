package com.jinqi.exam.service.impl;

import com.jinqi.exam.dao.TeacherMapper;
import com.jinqi.exam.entity.Teacher;
import com.jinqi.exam.exception.*;
import com.jinqi.exam.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("teacherService")
@Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Integer register(Teacher teacher) throws TeacherDuplicateEmailException {
        Teacher tea = teacherMapper.selectByEmail(teacher.getTeacherEmail());
        if (null != tea){
            throw new TeacherDuplicateEmailException("邮箱已经被使用");
        }

        return teacherMapper.insertSelective(teacher);
    }

    @Override
    public Teacher login(Teacher teacher) throws TeacherNotFoundException, TeacherDisableException {
        Teacher tea = teacherMapper.selectByEmailAndPwd(teacher.getTeacherEmail(), teacher.getTeacherPwd());
        if (null == tea){
            throw new TeacherNotFoundException("用户名或密码错误");
        }
        if (2 == tea.getTeacherStatus()){
            throw new TeacherDisableException("未通过审核，不能登录");
        }
        return tea;
    }

    @Override
    public Teacher checkInfo(Integer teacherId) {
        return teacherMapper.selectByPrimaryKey(teacherId);
    }

    @Override
    public Integer updateInfo(Teacher teacher) {
        return teacherMapper.updateByPrimaryKeySelective(teacher);
    }
}
