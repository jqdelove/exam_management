package com.jinqi.exam.service;

import com.jinqi.exam.entity.Clazz;

public interface ClazzService {

    Clazz getClazz(Integer classId);

    Integer editClass(Clazz clazz);
}
