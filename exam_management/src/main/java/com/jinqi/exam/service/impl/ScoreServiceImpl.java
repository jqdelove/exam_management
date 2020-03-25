package com.jinqi.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.jinqi.exam.dao.ScoreMapper;
import com.jinqi.exam.entity.Score;
import com.jinqi.exam.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("scoreService")
@Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public List<Score> getScore(Integer studentId,int page,int size) {
        //使用分页插件，必须写在dao执行之前
        PageHelper.startPage(page,size);
        return scoreMapper.selectByStudentId(studentId);
    }

    @Override
    public List<Score> getScore(Integer studentId) {
        return scoreMapper.selectByStudentId(studentId);
    }

    @Override
    public List<Score> getScores(Integer courseId) {
        return scoreMapper.selectByCourseId(courseId);
    }
}
