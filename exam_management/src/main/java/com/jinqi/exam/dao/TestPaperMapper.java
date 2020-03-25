package com.jinqi.exam.dao;

import com.jinqi.exam.entity.TestPaper;
import com.jinqi.exam.entity.TestPaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TestPaperMapper {
    int countByExample(TestPaperExample example);

    int deleteByExample(TestPaperExample example);

    int deleteByPrimaryKey(Integer testPaperId);

    int insert(TestPaper record);

    int insertSelective(TestPaper record);

    List<TestPaper> selectByExampleWithRowbounds(TestPaperExample example, RowBounds rowBounds);

    List<TestPaper> selectByExample(TestPaperExample example);

    TestPaper selectByPrimaryKey(Integer testPaperId);

    int updateByExampleSelective(@Param("record") TestPaper record, @Param("example") TestPaperExample example);

    int updateByExample(@Param("record") TestPaper record, @Param("example") TestPaperExample example);

    int updateByPrimaryKeySelective(TestPaper record);

    int updateByPrimaryKey(TestPaper record);
}