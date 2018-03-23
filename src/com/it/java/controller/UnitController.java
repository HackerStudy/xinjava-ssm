package com.it.java.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.it.java.pojo.Unit;
import com.it.java.service.UnitService;


/**
 * 
 * 单元表
 * @author hasee
 *
 */
@Controller
public class UnitController {
	
	@Autowired
	private UnitService unitService;
	
	//查找所有得小标题
	@RequestMapping(value = "/unitall.action")
	public ModelAndView FindAll(int module_id,HttpServletRequest request,HttpServletResponse response){
		
		List<Unit> list = unitService.FindModuleId(module_id);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("unitList", list);
		mav.setViewName("leftBasicKnowledge");
		return mav;
	}
	
}
