package com.jinqi.exam.service.impl;

import com.jinqi.exam.dao.AdminMapper;
import com.jinqi.exam.entity.Admin;
import com.jinqi.exam.service.AdminService;
import com.jinqi.exam.vo.AdminVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("adminService")
//注解事务
@Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    //仅查询的事务
    @Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
    public Admin login(AdminVo adminVo) {
        return adminMapper.login(adminVo);
    }

    @Override
    public Admin select(Integer adminId) {
        return adminMapper.selectByPrimaryKey(adminId);
    }
}
