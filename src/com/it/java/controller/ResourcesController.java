package com.it.java.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.it.java.pojo.RelatedResources;
import com.it.java.service.RelatedResourcesService;


@Controller
public class ResourcesController {
	@Autowired
	private RelatedResourcesService resourcesService;


	@RequestMapping("/addRelatedResource.action")
	public String addRelatedResource(RelatedResources resources, MultipartFile file) {
		if (resources.getType() == 1) {
			resourcesService.add(resources);
		} else if (resources.getType() == 0 || resources.getType() == 2) {
			String fileName = file.getOriginalFilename();
			resources.setHref(fileName);
			// 获取上传目录
			String path = "D:/apache-tomcat-7.0.75/webapps/resouces";
			if (!file.isEmpty()) {
				// 获取上传的文件名
				File filePath = new File(path, fileName);
				// 判断路径是否存在，如果不存在就创建
				if (!filePath.getParentFile().exists()) {
					filePath.getParentFile().mkdirs();
				}
			}
			try {
				file.transferTo(new File(path + File.separator + fileName));
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(resources);
			resourcesService.add(resources);
		}
		return "success";
	}

	@RequestMapping("/showRelatedResource.action")
	public String showRelatedResource(Model model) {
		List<RelatedResources> softwareList = resourcesService.findByType(RelatedResources.SOFTWARE);
		List<RelatedResources> websiteList = resourcesService.findByType(RelatedResources.WEBSITE);
		List<RelatedResources> bookList = resourcesService.findByType(RelatedResources.BOOK);
		model.addAttribute("softwareList", softwareList);
		model.addAttribute("websiteList", websiteList);
		model.addAttribute("bookList", bookList);
		return "relatedresources";

	}
}
