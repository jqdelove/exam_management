package com.jinqi.exam.dao;

import com.jinqi.exam.entity.ClazzCourse;
import com.jinqi.exam.entity.ClazzCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ClazzCourseMapper {
    int countByExample(ClazzCourseExample example);

    int deleteByExample(ClazzCourseExample example);

    int deleteByPrimaryKey(Integer classCourseId);

    int insert(ClazzCourse record);

    int insertSelective(ClazzCourse record);

    List<ClazzCourse> selectByExampleWithRowbounds(ClazzCourseExample example, RowBounds rowBounds);

    List<ClazzCourse> selectByExample(ClazzCourseExample example);

    ClazzCourse selectByPrimaryKey(Integer classCourseId);

    List<ClazzCourse> selectByCourseId(Integer courseId);

    int updateByExampleSelective(@Param("record") ClazzCourse record, @Param("example") ClazzCourseExample example);

    int updateByExample(@Param("record") ClazzCourse record, @Param("example") ClazzCourseExample example);

    int updateByPrimaryKeySelective(ClazzCourse record);

    int updateByPrimaryKey(ClazzCourse record);
}