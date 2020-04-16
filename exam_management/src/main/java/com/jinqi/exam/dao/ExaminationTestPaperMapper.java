package com.jinqi.exam.dao;

import com.jinqi.exam.entity.ExaminationTestPaper;
import com.jinqi.exam.entity.ExaminationTestPaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ExaminationTestPaperMapper {
    int countByExample(ExaminationTestPaperExample example);

    int deleteByExample(ExaminationTestPaperExample example);

    int deleteByPrimaryKey(Integer examinationTestPaperId);

    int insert(ExaminationTestPaper record);

    int insertSelective(ExaminationTestPaper record);

    List<ExaminationTestPaper> selectByExampleWithRowbounds(ExaminationTestPaperExample example, RowBounds rowBounds);

    List<ExaminationTestPaper> selectByExample(ExaminationTestPaperExample example);

    ExaminationTestPaper selectByPrimaryKey(Integer examinationTestPaperId);

    List<ExaminationTestPaper> selectAll();

    List<ExaminationTestPaper> selectByTestPaperId(Integer testPaperId);

    int updateByExampleSelective(@Param("record") ExaminationTestPaper record, @Param("example") ExaminationTestPaperExample example);

    int updateByExample(@Param("record") ExaminationTestPaper record, @Param("example") ExaminationTestPaperExample example);

    int updateByPrimaryKeySelective(ExaminationTestPaper record);

    int updateByPrimaryKey(ExaminationTestPaper record);
}