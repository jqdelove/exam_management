package com.jinqi.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.jinqi.exam.dao.StudentMapper;
import com.jinqi.exam.entity.Student;
import com.jinqi.exam.exception.DuplicateEmailException;
import com.jinqi.exam.exception.StudentDisableException;
import com.jinqi.exam.exception.StudentNotFoundException;
import com.jinqi.exam.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("studentService")
@Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Integer register(Student student) throws DuplicateEmailException {
        Student stu = studentMapper.selectByEmail(student.getStudentEmail());
        if (null != stu){
            throw new DuplicateEmailException("邮箱已经被使用");
        }

        return studentMapper.insertSelective(student);
    }

    @Override
    public Student login(Student student) throws StudentNotFoundException, StudentDisableException {

        Student stu = studentMapper.selectByEmailAndPwd(student.getStudentEmail(), student.getStudentPwd());
        if (null == stu){
            throw new StudentNotFoundException("用户名或密码错误");
        }
        if (2 == stu.getStudentStatus()){
            throw new StudentDisableException("未通过审核，不能登录");
        }
        return stu;
    }

    @Override
    public Student checkInfo(Integer studentId) {
        return studentMapper.selectByPrimaryKey(studentId);
    }

    @Override
    public Integer updateInfo(Student student) {
        return studentMapper.updateByPrimaryKeySelective(student);
    }

    @Override
    public List<Student> getAll(Integer page,Integer size) {
        PageHelper.startPage(page,size);
        return studentMapper.selectAll();
    }
}
