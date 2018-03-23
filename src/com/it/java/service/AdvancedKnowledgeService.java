package com.it.java.service;

import java.util.List;

import com.it.java.pojo.AdvancedKnowledge;

/**
 * 进阶知识
 * @author hasee
 *
 */
public interface AdvancedKnowledgeService {

	void UpdateAttachment(String attachment, int id);

	List<AdvancedKnowledge> FindAdvancedKnowledgeAll();

	List<AdvancedKnowledge> FindProject();

	String FindAdvancedChildByid(int id);

}
