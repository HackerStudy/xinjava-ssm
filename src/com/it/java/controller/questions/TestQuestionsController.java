package com.it.java.controller.questions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.it.java.pojo.QuestionBank;
import com.it.java.pojo.TestPaper;
import com.it.java.service.TestQuestionsService;

/**
 * 试题类
 * @author ASUS
 *
 */
@Controller
public class TestQuestionsController {

	@Autowired
	private TestQuestionsService testQuestionsService;
	
	//增加试题
	@RequestMapping(value = "/addTestQuestions.action")
	private String AddTestQuestions(QuestionBank questionBank){
		
//		System.out.println(questionBank);
//		System.out.println(tid);
		testQuestionsService.AddTestQuestions(questionBank);
		
		return "success";
	}
	
	//查找与试卷名对应的试题
	@RequestMapping(value = "/findTestQuestionsControllerBytid.action")
	public ModelAndView FindTestQuestionsControllerBytid(int tid){
		
		List<QuestionBank> list = testQuestionsService.FindTestQuestionsControllerBytid(tid);
		
		for (QuestionBank testPaper : list) {
			System.out.println(testPaper);
		}
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("listTestPaper", list);
		mav.setViewName("bodytesting");
		
		return mav;
	}
	
}
