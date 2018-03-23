package com.it.java.controller.questions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.it.java.pojo.TestPaper;
import com.it.java.service.ExaminationPaperService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import com.sun.org.glassfish.gmbal.ParameterNames;

/**
 * 试卷类
 * @author ASUS
 *
 */
@Controller
public class ExaminationPaperController {
	
	
	@Autowired
	private ExaminationPaperService examinationPaperService;
	
	//增加试卷名
	@RequestMapping(value = "/addExaminationPaper.action")
	public String AddExaminationPaper(String topic){
		
		examinationPaperService.AddExaminationPaper(topic);
		
		//返回原界面
		return "success";
	}
	
	//查找试卷名
	@RequestMapping(value = "/findExaminationPaperTopic.action")
	public ModelAndView FindExaminationPaperTopic(int judgment/*判断条件*/){
		
		List<TestPaper> list = examinationPaperService.FindExaminationPaperTopic();
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("listExaminationPaperTopic", list);
		
		//加判断条件决定跳转
		if(judgment == 1){
			mav.setViewName("addpaper");
		}else{
			mav.setViewName("leftExaminationPaper");
		}
		
		return mav;
	}

}
