package com.jinqi.exam.service;

import com.jinqi.exam.entity.Clazz;

import java.util.List;

public interface ClazzService {

    List<Clazz> getClazz(Integer classId);

    Integer editClass(Clazz clazz);

    List<Clazz> getAll();

    List<Clazz> getAll(int page,int size);
}
