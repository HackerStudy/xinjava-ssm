package com.it.java.junit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.it.java.dao.AdvancedChildMapper;
import com.it.java.dao.AdvancedKnowledgeMapper;
import com.it.java.pojo.AdvancedChild;
import com.it.java.pojo.AdvancedKnowledge;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class AdvancedChildTest {
	
	@Autowired
	private AdvancedChildMapper advancedChildMapper;
	@Autowired
	private AdvancedKnowledgeMapper advancedKnowledgeMapper;
	
	
	@Test
	public void Mybatistest1(){
		
		advancedChildMapper.PreservationAdvancedChild("aaa", "ccc",1);
//		System.out.println(all.getUnit_id());
		
	}
	
	@Test
	public void Mybatistest2(){
		List<AdvancedKnowledge> list = advancedKnowledgeMapper.FindAdvancedKnowledgeAll();
		for (AdvancedKnowledge advancedKnowledge : list) {
			System.out.println(advancedKnowledge);
			for (com.it.java.pojo.AdvancedChild knowledge : advancedKnowledge.getAdvancedChildList()) {
				System.out.println(knowledge);
			}
		}
	
	}
	@Test
	public void Mybatistest3(){
		AdvancedChild findAdvancedChildAll = advancedChildMapper.FindAdvancedChildAll(1);
		System.out.println(findAdvancedChildAll);
	}
	
}
