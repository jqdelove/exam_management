package com.jinqi.exam.dao;

import com.jinqi.exam.entity.Admin;
import com.jinqi.exam.vo.AdminVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AdminMapper {

//    @Select("select * from t_admin where admin_name = #{name} and admin_pwd = #{pwd}")
//    Admin login(@Param("name") String name,@Param("pwd") String pwd);

    Admin login(AdminVo adminVo);

    Admin selectByPrimaryKey(Integer adminId);
}

