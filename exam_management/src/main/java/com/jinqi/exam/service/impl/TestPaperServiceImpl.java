package com.jinqi.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.jinqi.exam.dao.TestPaperMapper;
import com.jinqi.exam.entity.TestPaper;
import com.jinqi.exam.service.TestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("testPaperService")
@Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
public class TestPaperServiceImpl implements TestPaperService {

    @Autowired
    private TestPaperMapper testPaperMapper;

    @Override
    public List<TestPaper> getAll(int page, int size) {
        PageHelper.startPage(page,size);
        return testPaperMapper.selectAll();
    }

    @Override
    public Integer deleteTestPaper(Integer testPaperId) {
        return testPaperMapper.deleteByPrimaryKey(testPaperId);
    }

    @Override
    public Integer createTestPaper(TestPaper testPaper) {
        return testPaperMapper.insertSelective(testPaper);
    }
}
