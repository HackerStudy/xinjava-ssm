package com.it.java.service;

import java.util.List;

import com.it.java.pojo.TestPaper;

/**
 * 试卷
 * @author ASUS
 *
 */
public interface ExaminationPaperService {

	void AddExaminationPaper(String topic);

	List<TestPaper> FindExaminationPaperTopic();

	
	
}
