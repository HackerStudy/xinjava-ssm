package com.it.java.junit;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.it.java.dao.BasicKowleageMapper;
import com.it.java.pojo.BasicKowleage;
import com.it.java.service.UnitService;


/**
 * 基础知识表的单元测试
 * 
 * @author hasee
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class BasicKowleageTest {
	
	@Autowired
	private BasicKowleageMapper basicKowleageMapper;
	
	
	@Test
	public void Mybatistest1(){
		
		List<BasicKowleage> all = basicKowleageMapper.FindAll();
		for (BasicKowleage basicKowleage : all) {
			System.out.println(basicKowleage);
		}
//		System.out.println(all.getUnit_id());
		
	}
	@Test
	public void test1(){
		
		List<BasicKowleage> list = basicKowleageMapper.FindAlltest(1);
		for (BasicKowleage basicKowleage : list) {
			System.out.println(basicKowleage);
		}
		
		
	}
	
	
	@Test
	public void Mybatistest2(){
		basicKowleageMapper.UpdateAttachment("aaa", 1);
	}
	@Test
	public void Mybatistest3(){
		String findAttachment = basicKowleageMapper.FindAttachment(1);
		System.out.println(findAttachment);
	}
	@Test
	public void Mybatistest4(){
		List<String> list = basicKowleageMapper.FindHeadings();
		for (String liString : list) {
			System.out.println(liString);
		}
		
	}
	@Test
	public void Mybatistest5() {
		basicKowleageMapper.InserIntoBasicKnowledge("JAVA编程思想", "简述");
		
		
	}
	
}
