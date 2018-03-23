package com.it.java.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.it.java.pojo.BasicKowleage;

public interface BasicKowleageMapper {
	
	List<BasicKowleage> FindAll();
	
	List<BasicKowleage> FindAlltest(int unit_id);

	void UpdateAttachment(@Param("attachment") String attachment, @Param("id") int id);

	String FindAttachment(int id);

	List<String> FindHeadings();

	BasicKowleage findAllid(int id);

	void InserIntoBasicKnowledge(@Param("subtitletext") String subtitletext,@Param("content") String content);

	void ModificationBasicKnowledgeId(int id);
	
}
