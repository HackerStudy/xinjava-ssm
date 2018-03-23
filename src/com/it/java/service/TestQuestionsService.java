package com.it.java.service;

import java.util.List;

import com.it.java.pojo.QuestionBank;
import com.it.java.pojo.TestPaper;

public interface TestQuestionsService {

	public void AddTestQuestions(QuestionBank questionBank);

	public List<QuestionBank> FindTestQuestionsControllerBytid(int tid);

}
