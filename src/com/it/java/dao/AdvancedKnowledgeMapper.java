package com.it.java.dao;

import java.util.List;

import com.it.java.pojo.AdvancedKnowledge;

/**
 * 
 * 进阶知识
 * 
 * @author hasee
 *
 */
public interface AdvancedKnowledgeMapper {

	List<AdvancedKnowledge> FindAdvancedKnowledgeAll();

	List<AdvancedKnowledge> FindProject();

	String FindAdvancedChildByid(int id);
}
