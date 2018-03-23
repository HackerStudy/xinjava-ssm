package com.it.java.dao;

import java.util.List;

import com.it.java.pojo.QuestionBank;
import com.it.java.pojo.TestPaper;

public interface TestQuestionsMapper {

	void AddTestQuestions(QuestionBank questionBank);

	List<QuestionBank> FindTestQuestionsControllerBytid(int tid);

}
