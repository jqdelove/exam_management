package com.jinqi.exam.service;

import com.jinqi.exam.entity.TestPaper;

import java.util.List;

public interface TestPaperService {

    List<TestPaper> getAll(int page,int size);

    List<TestPaper> getAllAvailable(int page,int size);

    Integer deleteTestPaper(Integer testPaperId);

    Integer createTestPaper(TestPaper testPaper);

    Integer modify(TestPaper testPaper);

    TestPaper getTestPaper(Integer testPaperId);
}
