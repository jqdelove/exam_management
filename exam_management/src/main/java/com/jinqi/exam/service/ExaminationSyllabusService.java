package com.jinqi.exam.service;

import com.jinqi.exam.entity.ExaminationSyllabus;

import java.util.List;

public interface ExaminationSyllabusService {
    List<ExaminationSyllabus> getAll(Integer teacherId,int page,int size);

    Integer deleteExaminationSyllabus(Integer examinationSyllabusId);
}
