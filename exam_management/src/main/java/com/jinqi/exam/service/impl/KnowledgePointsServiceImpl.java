package com.jinqi.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.jinqi.exam.dao.KnowledgePointsMapper;
import com.jinqi.exam.entity.KnowledgePoints;
import com.jinqi.exam.service.KnowledgePointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("knowledgePointsService")
@Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
public class KnowledgePointsServiceImpl implements KnowledgePointsService {

    @Autowired
    private KnowledgePointsMapper knowledgePointsMapper;

    @Override
    public List<KnowledgePoints> getAll(Integer teacherId,int page, int size) {
        PageHelper.startPage(page,size);
        return knowledgePointsMapper.selectAll(teacherId);
    }

    @Override
    public KnowledgePoints getKnowledge(Integer knowledgePointsId) {
        return knowledgePointsMapper.selectByPrimaryKey(knowledgePointsId);
    }
}
