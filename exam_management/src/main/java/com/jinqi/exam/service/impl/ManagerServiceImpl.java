package com.jinqi.exam.service.impl;

import com.jinqi.exam.dao.ManagerMapper;
import com.jinqi.exam.entity.Manager;
import com.jinqi.exam.entity.Teacher;
import com.jinqi.exam.exception.ManagerNotFoundException;
import com.jinqi.exam.exception.TeacherNotFoundException;
import com.jinqi.exam.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("managerService")
@Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public Manager login(Manager manager) throws ManagerNotFoundException {
        Manager man = managerMapper.selectByEmailAndPwd(manager.getManagerEmail(), manager.getManagerPwd());
        if (null == man){
            throw new ManagerNotFoundException("用户名或密码错误");
        }
        return man;
    }

    @Override
    public Manager checkInfo(Integer managerId) {
        return managerMapper.selectByPrimaryKey(managerId);
    }

    @Override
    public Integer updateInfo(Manager manager) {
        return managerMapper.updateByPrimaryKeySelective(manager);
    }
}
