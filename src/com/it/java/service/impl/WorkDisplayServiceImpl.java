package com.it.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.java.dao.WorkDisplayMapper;
import com.it.java.pojo.WorkDisplay;
import com.it.java.service.WorkDisplayService;

/**
 * 作品展示
 * @author hasee
 *
 */
@Service
public class WorkDisplayServiceImpl implements WorkDisplayService{
	@Autowired
	private WorkDisplayMapper mapper;

	public void add(WorkDisplay workDisplay) {
		mapper.add(workDisplay);
	}
	public List<WorkDisplay> show() {
		return mapper.show();
	}
	public WorkDisplay find(int id) {
		return mapper.find(id);
	}

}
