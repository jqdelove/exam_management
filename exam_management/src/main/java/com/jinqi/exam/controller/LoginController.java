package com.jinqi.exam.controller;

import com.jinqi.exam.entity.Admin;
import com.jinqi.exam.service.AdminService;
import com.jinqi.exam.vo.AdminVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/login.do")
    public String login(HttpServletRequest request){
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        AdminVo adminVo = new AdminVo();
        adminVo.setName(name);
        adminVo.setPwd(pwd);
        Admin admin = adminService.login(adminVo);
        if (admin!=null){
            return "jsp/success";
        }
        return "jsp/fail";
    }

    @RequestMapping("/select.do")
    public String select(){
        Admin admin = adminService.select(1);
        System.out.println(admin.getAdminName()+" "+admin.getAdminPwd());
        return "jsp/success";
    }
}
