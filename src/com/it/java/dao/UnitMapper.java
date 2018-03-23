package com.it.java.dao;

import java.util.List;

import com.it.java.pojo.Unit;

public interface UnitMapper {
	List<Unit> FindModuleId(int module_id);
}
