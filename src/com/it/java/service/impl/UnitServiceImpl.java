package com.it.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.java.dao.UnitMapper;
import com.it.java.pojo.Unit;
import com.it.java.pojo.User;
import com.it.java.service.UnitService;
import com.it.java.service.UserService;

/**
 * 单元表
 * @author hasee
 *
 */
@Service
public class UnitServiceImpl implements UnitService{

	@Autowired
	private UnitMapper unitMapper;
	
	public List<Unit> FindModuleId(int module_id) {
		
		List<Unit> list = unitMapper.FindModuleId(module_id);
		
		return list;
	}



}
