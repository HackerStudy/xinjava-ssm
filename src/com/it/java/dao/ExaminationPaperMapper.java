package com.it.java.dao;

import java.util.List;

import com.it.java.pojo.TestPaper;

public interface ExaminationPaperMapper {

	void AddExaminationPaper(String topic);

	List<TestPaper> FindExaminationPaperTopic();

}
