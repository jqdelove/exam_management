package com.jinqi.exam.service.impl;

import com.jinqi.exam.dao.SyllabusKnowledgeMapper;
import com.jinqi.exam.entity.SyllabusKnowledge;
import com.jinqi.exam.service.SyllabusKnowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("syllabusKnowledgeService")
@Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
public class SyllabusKnowledgeServiceImpl implements SyllabusKnowledgeService {

        @Autowired
        private SyllabusKnowledgeMapper syllabusKnowledgeMapper;

        @Override
        public Integer createSyllabusKnowledge(List<SyllabusKnowledge> syllabusKnowledges) {
            for (SyllabusKnowledge syllabusKnowledge : syllabusKnowledges) {
                syllabusKnowledgeMapper.insertSelective(syllabusKnowledge);
            }
        return 1;
    }
}
