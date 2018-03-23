package com.it.java.junit;

import java.util.List;

import javax.swing.plaf.synth.SynthSliderUI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.it.java.dao.InstanceMapper;
import com.it.java.dao.TestQuestionsMapper;
import com.it.java.pojo.Instance;
import com.it.java.pojo.QuestionBank;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class QuestionBankMapper {
	
	@Autowired
	private TestQuestionsMapper testQuestionsMapper;
	
	@Test
	public void TestQuestionsMapperTest1(){
		
		QuestionBank questionBank = new QuestionBank(1,13,"q","q","q","q","q","q",1);
		
		testQuestionsMapper.AddTestQuestions(questionBank);
		
	}
	
}
