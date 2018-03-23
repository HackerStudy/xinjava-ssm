package com.it.java.service;

import java.util.List;

import com.it.java.pojo.Unit;

/**
 * 单元表
 * @author hasee
 *
 */
public interface UnitService {

	List<Unit> FindModuleId(int module_id);
	
}
