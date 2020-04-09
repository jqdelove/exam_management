package com.jinqi.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.jinqi.exam.dao.ExaminationSyllabusMapper;
import com.jinqi.exam.entity.ExaminationSyllabus;
import com.jinqi.exam.service.ExaminationSyllabusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("examinationSyllabusService")
@Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
public class ExaminationSyllabusServiceImpl implements ExaminationSyllabusService {

    @Autowired
    private ExaminationSyllabusMapper examinationSyllabusMapper;

    @Override
    public List<ExaminationSyllabus> getAll(Integer teacherId, int page, int size) {
        PageHelper.startPage(page,size);
        return examinationSyllabusMapper.selectAll(teacherId);
    }

    @Override
    public Integer deleteExaminationSyllabus(Integer examinationSyllabusId) {
        return examinationSyllabusMapper.deleteByPrimaryKey(examinationSyllabusId);
    }
}
