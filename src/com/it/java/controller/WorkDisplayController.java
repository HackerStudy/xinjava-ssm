package com.it.java.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.it.java.pojo.WorkDisplay;
import com.it.java.service.WorkDisplayService;

/**
 * 作品展示
 * 有标题、作者名、内容介绍、效果展示、附件(相关文档、源代码或发布文件)等内容。
 * @author hasee
 *
 */
@Controller
public class WorkDisplayController {
	
	@Autowired
	private WorkDisplayService service;

	//上传作品
	@RequestMapping("/addWorkDisplay.action")
	public String addWorkDisplay(WorkDisplay workDisplay, @RequestParam("pics") MultipartFile[] pics,
			MultipartFile file, HttpSession session) {
		// 获取上传目录
		String path = "E://工具软件/apace-tomcat-7.0.76/webapps/resouces";
		String picture = "";
		if (pics.length > 0) {
			for (MultipartFile p : pics) {
				String uuid = UUID.randomUUID().toString().replaceAll("-", "");
				String name = p.getOriginalFilename();
				name = name.substring(name.indexOf("."), name.length());
				String fileName = uuid + name;
				System.out.println(fileName);
				File filePath = new File(path, fileName);
				if (!filePath.getParentFile().exists()) {
					filePath.getParentFile().mkdirs();
				}
				try {
					p.transferTo(new File(path + File.separator + fileName));
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				picture += fileName + ",";
			}
		}
		if (!file.isEmpty()) {
			String fileName = file.getOriginalFilename();
			File filePath = new File(path, fileName);
			// 判断路径是否存在，如果不存在就创建
			if (!filePath.getParentFile().exists()) {
				filePath.getParentFile().mkdirs();
			}
			workDisplay.setAttachment(fileName);
			try {
				file.transferTo(new File(path + File.separator + fileName));
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(picture);
		String pictures = picture.substring(0, picture.length() - 1);
		workDisplay.setPicture(pictures);
		service.add(workDisplay);
		return "success";
	}

	//搜索所有作品
	@RequestMapping("/leftWorkDisplay.action")
	public String showWorkDisplayList(HttpSession session) {
		List<WorkDisplay> list = service.show();
		session.setAttribute("list", list);
		return "leftWorkDisplay";
	}

	//根据id所有作品
	@RequestMapping("/showWorkDisplay.action")
	public String showWorkDisplay(int id, HttpSession session) {
		WorkDisplay workDisplay = service.find(id);
		String pictures = workDisplay.getPicture();
		String[] picture = pictures.split(",");
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < picture.length; i++) {
			list.add(picture[i]);
		}
		session.setAttribute("list", list);
		session.setAttribute("workDisplay", workDisplay);
		return "workdisplay";
	}

	@RequestMapping("/downWorkDisplay.action")
	public ResponseEntity<byte[]> downWorkDisplay(String fileName) throws IOException {
		// 获取下载目录
		String path = "D:/apache-tomcat-7.0.75/webapps/resouces";
		String downloadFielName = new String(fileName.getBytes("ISO-8859-1"), "UTF-8");
		File file = new File(path + File.separator + downloadFielName);
		HttpHeaders headers = new HttpHeaders();
		// 通知浏览器以attchment(下载方式)打开图片
		// application_octet_stream ： 二进制流数据（最常见的文件下载）。

		// MediaType:互联网媒体类型，也叫做MIME类型,在Http协议消息头中，使用Content-Type来表示具体请求中的媒体类型信息
		headers.setContentDispositionFormData("attchment", downloadFielName);
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
	}
	
	
}
