package com.jinqi.exam.service;

import com.jinqi.exam.entity.KnowledgePoints;

import java.util.List;

public interface KnowledgePointsService {

    List<KnowledgePoints> getAll(Integer teacherId,int page,int size);

    KnowledgePoints getKnowledge(Integer knowledgePointsId);

    Integer updateInfo(KnowledgePoints knowledgePoints);

    Integer addKnowledge(KnowledgePoints knowledgePoints);

    Integer deleteKnowledge(Integer knowledgePointsId);
}
