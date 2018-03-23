package com.it.java.junit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.it.java.dao.UnitMapper;
import com.it.java.pojo.Unit;
import com.it.java.service.UnitService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UnitTest {
	
	@Autowired
	private UnitMapper unitService;
	
	@Test
	public void test1(){
		List<Unit> list = unitService.FindModuleId(1);
		
		for (Unit string : list) {
			System.out.println(string);
		}
		
	}

}
