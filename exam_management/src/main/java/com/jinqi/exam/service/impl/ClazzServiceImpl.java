package com.jinqi.exam.service.impl;


import com.github.pagehelper.PageHelper;
import com.jinqi.exam.dao.ClazzMapper;
import com.jinqi.exam.entity.Clazz;
import com.jinqi.exam.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("clazzService")
@Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
public class ClazzServiceImpl implements ClazzService {

    @Autowired
    private ClazzMapper clazzMapper;

    @Override
    public Clazz getClazz(Integer classId) {
        return clazzMapper.selectByPrimaryKey(classId);
    }

    @Override
    public Integer editClass(Clazz clazz) {
        return clazzMapper.updateByPrimaryKeySelective(clazz);
    }

    @Override
    public List<Clazz> getAll() {
        return clazzMapper.selectAll();
    }

    @Override
    public List<Clazz> getAll(int page, int size) {
        PageHelper.startPage(page,size);
        return clazzMapper.selectAll();
    }

}
