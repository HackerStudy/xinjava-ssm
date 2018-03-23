package com.it.java.controller.advancedknowledge;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.it.java.pojo.AdvancedChild;
import com.it.java.pojo.FileUser;
import com.it.java.service.AdvancedChildService;
import com.it.java.utility.FileUtility;

/**
 * 进阶知识子表
 * @author hasee
 *
 */


@Controller
public class AdvancedChildController {
	
	@Autowired
	private AdvancedChildService advancedChildService;
	
	@Autowired
	private FileUtility fileUtility;
	
	//保存
	@RequestMapping(value = "/preservationadvancedchild.action")
	public String PreservationAdvancedChild(int thematicid/*专题id*/,String subtitletext/*标题*/,String stringdata/*文本*/){
		
		System.out.println("数据是："+stringdata+"    "+subtitletext);
		
		advancedChildService.PreservationAdvancedChild(subtitletext,stringdata,thematicid);
		
		
		
		return "success";
	}
	
	//查找所有数据
	@RequestMapping(value = "/findAdvancedChildAll.action")
	public ModelAndView FindAdvancedChildAll(int id){
		
		AdvancedChild advancedChild = advancedChildService.FindAdvancedChildAll(id);
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("advancedchild", advancedChild);
		mav.setViewName("bodyAdvancedChild");
		
		return mav;
	}
	
	//文件上传
		@RequestMapping(value = "/fileuploadAdvancedChild.action")
		public String FileUpload(@ModelAttribute FileUser user, int id){
			
			
			
			String attachment = fileUtility.FileUpload(user);//接受返回的名字
			
			if(attachment!=null){
				
				//把附件名存入数据库
				advancedChildService.UpdateAttachment(attachment,id);
				
				
			}else{
				
				return "error";
			}
			
			return "success";
		}
		
		//文件下载
		@RequestMapping(value = "/filedownloadAdvancedChild.action")
		public ResponseEntity<byte[]> FileDownload(int id){
			
			//查找数据库中的附件名字
			String findAttachment = advancedChildService.FindAttachment(id);
			
			
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
