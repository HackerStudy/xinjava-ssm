package com.it.java.dao;

import java.util.List;

import com.it.java.pojo.WorkDisplay;

public interface WorkDisplayMapper {

	public void add(WorkDisplay workDisplay);

	public List<WorkDisplay> show();

	public WorkDisplay find(int id);

}
