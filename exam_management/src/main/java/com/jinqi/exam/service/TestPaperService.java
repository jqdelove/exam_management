package com.jinqi.exam.service;

import com.jinqi.exam.entity.TestPaper;

import java.util.List;

public interface TestPaperService {

    List<TestPaper> getAll(int page,int size);

    Integer deleteTestPaper(Integer testPaperId);

    Integer createTestPaper(TestPaper testPaper);
}
