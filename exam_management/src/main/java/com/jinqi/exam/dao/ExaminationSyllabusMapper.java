package com.jinqi.exam.dao;

import com.jinqi.exam.entity.ExaminationSyllabus;
import com.jinqi.exam.entity.ExaminationSyllabusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ExaminationSyllabusMapper {
    int countByExample(ExaminationSyllabusExample example);

    int deleteByExample(ExaminationSyllabusExample example);

    int deleteByPrimaryKey(Integer examinationSyllabusId);

    int insert(ExaminationSyllabus record);

    int insertSelective(ExaminationSyllabus record);

    List<ExaminationSyllabus> selectByExampleWithRowbounds(ExaminationSyllabusExample example, RowBounds rowBounds);

    List<ExaminationSyllabus> selectByExample(ExaminationSyllabusExample example);

    List<ExaminationSyllabus> selectByPrimaryKey(Integer examinationSyllabusId);

    List<ExaminationSyllabus> selectAll(Integer teacherId);

    int updateByExampleSelective(@Param("record") ExaminationSyllabus record, @Param("example") ExaminationSyllabusExample example);

    int updateByExample(@Param("record") ExaminationSyllabus record, @Param("example") ExaminationSyllabusExample example);

    int updateByPrimaryKeySelective(ExaminationSyllabus record);

    int updateByPrimaryKey(ExaminationSyllabus record);
}