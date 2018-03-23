package com.it.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.java.dao.TestQuestionsMapper;
import com.it.java.pojo.QuestionBank;
import com.it.java.pojo.TestPaper;
import com.it.java.service.TestQuestionsService;

/**
 * 试题类
 * @author ASUS
 *
 */
@Service
public class TestQuestionsServiceImpl implements TestQuestionsService {

	@Autowired
	private TestQuestionsMapper testQuestionsMapper;
	
	
	public void AddTestQuestions(QuestionBank questionBank) {
		testQuestionsMapper.AddTestQuestions(questionBank);
		
	}


	public List<QuestionBank> FindTestQuestionsControllerBytid(int tid) {
		return testQuestionsMapper.FindTestQuestionsControllerBytid(tid);
	}

}
