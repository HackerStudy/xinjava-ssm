package com.it.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.it.java.pojo.Instance;
import com.it.java.service.InstanceService;

/**
 * 实例教程表
 * 每一个实例教程包含实例题目、实例内容、实例讲解、运行结果和代码附件
 * @author hasee
 *
 */
@Controller
public class InstanceController {
	
	@Autowired
	private InstanceService insanceService;
	
	
	//上传
	@RequestMapping(value = "/uploadInstance.action")
	public ModelAndView UploadInstance(String subtitletext/*标题*/,String stringdata/*内容*/){
		
		insanceService.UploadInstance(subtitletext,stringdata);
		
		
		return null;
	}
	
	//搜索小标题
	@RequestMapping(value = "/findinstanceName.action")
	public ModelAndView FindInstanceName(){
		
		List<Instance> list = insanceService.FindInstanceName();
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("instanceList", list);
		mav.setViewName("leftInstance");
		
		return mav;
	}
	
	//查找content
	@RequestMapping(value = "/findInstanceContent.action")
	public ModelAndView FindInstanceContent(int id){
		
		String Content = insanceService.FindInstanceContent(id);
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("content", Content);
		mav.setViewName("bodyInstance");
		
		
		return mav;
	}
	
	
}
