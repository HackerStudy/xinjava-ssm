package com.it.java.service.impl;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.java.dao.BasicKowleageMapper;
import com.it.java.pojo.BasicKowleage;
import com.it.java.service.BasicKnowledgeService;

/**
 * 基础知识
 * @author hasee
 *
 */
@Service
public class BasicKnowledgeServiceImpl implements BasicKnowledgeService{

	@Autowired
	private BasicKowleageMapper basicKowleageMapper;
	
	
	public List<BasicKowleage> FindAll() {
		
		return basicKowleageMapper.FindAll();
	}


	public void UpdateAttachment(String attachment,int id) {
		basicKowleageMapper.UpdateAttachment(attachment,id);
	}


	public String FindAttachment(int id) {
		return basicKowleageMapper.FindAttachment(id);
	}


	public List<String> FindHeadings() {
		return basicKowleageMapper.FindHeadings();
	}


	public BasicKowleage findAllid(int id) {
		return basicKowleageMapper.findAllid(id);
	}


	public void InserIntoBasicKnowledge(String subtitletext, String content) {
		basicKowleageMapper.InserIntoBasicKnowledge(subtitletext,content);
	}


	public void ModificationBasicKnowledgeId(int id) {
		basicKowleageMapper.ModificationBasicKnowledgeId(id);
	}
}	
