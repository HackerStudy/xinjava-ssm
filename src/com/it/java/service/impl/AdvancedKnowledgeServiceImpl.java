package com.it.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.java.dao.AdvancedKnowledgeMapper;
import com.it.java.pojo.AdvancedKnowledge;
import com.it.java.service.AdvancedKnowledgeService;

/**
 * 进阶知识
 * @author hasee
 *
 */
@Service
public class AdvancedKnowledgeServiceImpl implements AdvancedKnowledgeService{

	@Autowired
	private AdvancedKnowledgeMapper advancedKnowledgeMapper;
	
	public void UpdateAttachment(String attachment, int id) {
		
		
		
		
	}

	public List<AdvancedKnowledge> FindAdvancedKnowledgeAll() {
		
		return advancedKnowledgeMapper.FindAdvancedKnowledgeAll();
	}

	@Override
	public List<AdvancedKnowledge> FindProject() {
		return advancedKnowledgeMapper.FindProject();
	}

	public String FindAdvancedChildByid(int id) {
		return advancedKnowledgeMapper.FindAdvancedChildByid(id);
	}

}
