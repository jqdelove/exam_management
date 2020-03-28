package com.jinqi.exam.dao;

import com.jinqi.exam.entity.Manager;
import com.jinqi.exam.entity.ManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ManagerMapper {
    int countByExample(ManagerExample example);

    int deleteByExample(ManagerExample example);

    int deleteByPrimaryKey(Integer managerId);

    int insert(Manager record);

    int insertSelective(Manager record);

    List<Manager> selectByExampleWithRowbounds(ManagerExample example, RowBounds rowBounds);

    List<Manager> selectByExample(ManagerExample example);

    Manager selectByPrimaryKey(Integer managerId);

    Manager selectByEmailAndPwd(@Param("managerEmail")String managerEmail, @Param("managerPwd") String managerPwd);

    int updateByExampleSelective(@Param("record") Manager record, @Param("example") ManagerExample example);

    int updateByExample(@Param("record") Manager record, @Param("example") ManagerExample example);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}