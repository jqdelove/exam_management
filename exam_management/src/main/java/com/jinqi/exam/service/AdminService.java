package com.jinqi.exam.service;

import com.jinqi.exam.entity.Admin;
import com.jinqi.exam.vo.AdminVo;

public interface AdminService {
//    public Admin login(String name,String pwd);

    public Admin login(AdminVo adminVo);

    Admin select(Integer adminId);
}
