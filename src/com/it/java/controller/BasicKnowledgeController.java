package com.it.java.controller;

import java.io.IOException;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.it.java.pojo.BasicKowleage;
import com.it.java.pojo.FileUser;
import com.it.java.service.BasicKnowledgeService;
import com.it.java.utility.FileUtility;

/**
 * 基础知识
 * @author hasee
 *
 */
@Controller
public class BasicKnowledgeController {
	
	@Autowired
	private BasicKnowledgeService basicKnowledgeService;
	
	@Autowired
	private FileUtility fileUtility;
	
	
	//查找所有
	@RequestMapping(value = "/BasicKnowledgeFindAll.action")
	public ModelAndView FindAll(){
		
		
		List<BasicKowleage> list = basicKnowledgeService.FindAll();
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("listbasicKowleage",list);
		
		mav.setViewName("leftBasicKnowledge");
		
		return mav;
	}
	
	//转发
	@RequestMapping(value = "/forwardbodyjsp.action")
	public ModelAndView ForwardBodyJsp(int id) {
		
		BasicKowleage basickowleage = basicKnowledgeService.findAllid(id);
		
		ModelAndView mav = new ModelAndView();
		System.out.println("进来了");
		System.out.println(basickowleage);
		
		mav.addObject("basickowleage", basickowleage);
		mav.setViewName("body");
		
		return mav;
	}
	
	//根据id查找标题
	@RequestMapping(value = "/findheadings.action")
	public ModelAndView FindHeadings(){
		List<String> list = basicKnowledgeService.FindHeadings();
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("headingslist", list);
		
		mav.setViewName("left");
		
		return mav;
	}
	
	//插入数据
	@RequestMapping(value = "/inserIntoBasicKnowledge.action")
	public @ResponseBody String InserIntoBasicKnowledge(String subtitletext,String stringdata) {
		System.out.println("数据是："+subtitletext+"          "+stringdata);
		
		basicKnowledgeService.InserIntoBasicKnowledge(subtitletext,stringdata);
		Boolean isSuccess = true;
		String success = "{\"success\":" + isSuccess + "}";
		return success;
	}
	
	//根据id删除
	@RequestMapping(value = "/modificationBasicKnowledgeId.action")
	public String ModificationBasicKnowledgeId(int id){
		
		basicKnowledgeService.ModificationBasicKnowledgeId(id);
		
		return "success";
	}
	
	//文件上传
	@RequestMapping(value = "/fileupload.action")
	public String FileUpload(@ModelAttribute FileUser user, int id){
		
		
		
		String attachment = fileUtility.FileUpload(user);//接受返回的名字
		
		if(attachment!=null){
			
			//把附件名存入数据库
			basicKnowledgeService.UpdateAttachment(attachment,id);
			
			
		}else{
			
			return "error";
		}
		
		return "success";
	}
	
	//文件下载
	@RequestMapping(value = "/filedownload.action")
	public ResponseEntity<byte[]> FileDownload(int id){
		
		//查找数据库中的附件名字
		String findAttachment = basicKnowledgeService.FindAttachment(id);
		
		
		ResponseEntity<byte[]> fileDownload = null;
		try {
			fileDownload = fileUtility.FileDownload(findAttachment);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fileDownload;
	}
	
}
