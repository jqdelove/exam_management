package com.jinqi.exam.service;

import com.jinqi.exam.entity.Score;

import java.util.List;

/**
 * 成绩信息，学生与课程的中间表
 */
public interface ScoreService {
    List<Score> getScore(Integer studentId,int page,int size);

    List<Score> getScore(Integer studentId);

    List<Score> getScores(Integer courseId);
}
