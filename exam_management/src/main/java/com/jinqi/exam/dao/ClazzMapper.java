package com.jinqi.exam.dao;

import com.jinqi.exam.entity.Clazz;
import com.jinqi.exam.entity.ClazzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ClazzMapper {
    int countByExample(ClazzExample example);

    int deleteByExample(ClazzExample example);

    int deleteByPrimaryKey(Integer classId);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    List<Clazz> selectByExampleWithRowbounds(ClazzExample example, RowBounds rowBounds);

    List<Clazz> selectByExample(ClazzExample example);

    List<Clazz> selectAll();

    Clazz selectByPrimaryKey(Integer classId);

    List<Clazz> selectByClassId(Integer classId);

    int updateByExampleSelective(@Param("record") Clazz record, @Param("example") ClazzExample example);

    int updateByExample(@Param("record") Clazz record, @Param("example") ClazzExample example);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
}