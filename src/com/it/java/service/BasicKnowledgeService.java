package com.it.java.service;


import java.util.List;

import com.it.java.pojo.BasicKowleage;

/**
 * 基础知识
 * @author hasee
 *
 */
public interface BasicKnowledgeService {
	public List<BasicKowleage> FindAll();

	public void UpdateAttachment(String attachment, int id);

	public String FindAttachment(int id);

	public List<String> FindHeadings();

	public BasicKowleage findAllid(int id);

	public void InserIntoBasicKnowledge(String subtitletext, String content);

	public void ModificationBasicKnowledgeId(int id);
}
