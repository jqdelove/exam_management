package com.jinqi.exam.service;

import com.jinqi.exam.entity.ExaminationSyllabus;

import java.util.List;

public interface ExaminationSyllabusService {
    List<ExaminationSyllabus> getAll(Integer teacherId,int page,int size);

    List<ExaminationSyllabus> getAll(Integer teacherId);

    Integer deleteExaminationSyllabus(Integer examinationSyllabusId);

    List<ExaminationSyllabus> getExaminationSyllabus(Integer examinationSyllabusId);

    Integer createExaminationSyllabus(ExaminationSyllabus examinationSyllabus);
}
