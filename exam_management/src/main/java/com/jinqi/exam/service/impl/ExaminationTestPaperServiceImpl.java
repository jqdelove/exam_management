package com.jinqi.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.jinqi.exam.dao.ExaminationTestPaperMapper;
import com.jinqi.exam.entity.ExaminationTestPaper;
import com.jinqi.exam.service.ExaminationTestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("examinationTestPaperService")
@Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
public class ExaminationTestPaperServiceImpl implements ExaminationTestPaperService {

    @Autowired
    private ExaminationTestPaperMapper examinationTestPaperMapper;

    @Override
    public List<ExaminationTestPaper> getAll(int page, int size) {
        PageHelper.startPage(page,size);
        return examinationTestPaperMapper.selectAll();
    }

    @Override
    public List<ExaminationTestPaper> getByTestPaperId(Integer testPaperId) {
        return examinationTestPaperMapper.selectByTestPaperId(testPaperId);
    }

    @Override
    public void createExaminationTestPaper(List<ExaminationTestPaper> examinationTestPapers) {
        for (ExaminationTestPaper examinationTestPaper : examinationTestPapers) {
            examinationTestPaperMapper.insertSelective(examinationTestPaper);
        }
    }
}
