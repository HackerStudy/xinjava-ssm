package com.it.java.controller.advancedknowledge;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.it.java.pojo.AdvancedKnowledge;
import com.it.java.pojo.FileUser;
import com.it.java.service.AdvancedKnowledgeService;
import com.it.java.utility.FileUtility;

/**
 * 进阶知识
 * @author hasee
 *
 */

@Controller
public class AdvancedKnowledgeController {
	
	
	@Autowired
	private AdvancedKnowledgeService advancedKnowledgeService;
	
	@Autowired
	private FileUtility fileUtility;
	
	//查找所有数据
	@RequestMapping(value = "/findAdvancedKnowledgeAll.action")
	public ModelAndView FindAdvancedKnowledgeAll(){
		
		List<AdvancedKnowledge> list = advancedKnowledgeService.FindAdvancedKnowledgeAll();
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("advancedKnowledgeList", list);
		
		mav.setViewName("leftAdvancedKnowledge");
		
		
		return mav;
	}
	
	//查找所有专题
	@RequestMapping(value = "/findProject.action")
	public ModelAndView FindProject(){
		
		List<AdvancedKnowledge> list = advancedKnowledgeService.FindProject();
		
		
		for (AdvancedKnowledge advancedKnowledge : list) {
			System.out.println(advancedKnowledge);
		}
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("thematicList", list);
		
		mav.setViewName("advancedKnowledge_ueditor");
		
		
		return mav;
	}
	
	
	
	
	//上传文件
	@RequestMapping(value = "/uploadAdvancedKnowledge.action")
	public String FileUpload(@ModelAttribute FileUser user, int id){
		String attachment = fileUtility.FileUpload(user);//接受返回的名字
		
		if(attachment!=null){
			
			//把附件名存入数据库
			advancedKnowledgeService.UpdateAttachment(attachment,id);
			
			
		}else{
			
			return "error";
		}
		
		return "success";
	}
	
	//下载文件
	@RequestMapping(value = "/fileAdvancedKnowledgeDownload.action")
	public ResponseEntity<byte[]> FileDownload(int id){
		
		//查找数据库中的附件名字
		String name = advancedKnowledgeService.FindAdvancedChildByid(id);
		
		ResponseEntity<byte[]> fileDownload = null;
		try {
			fileDownload = fileUtility.FileDownload(name);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		return fileDownload;
	}
	
}
