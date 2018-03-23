package com.it.java.service;

import java.util.List;

import com.it.java.pojo.WorkDisplay;

/**
 * 作品展示
 * @author hasee
 *
 */
public interface WorkDisplayService {

	WorkDisplay find(int id);

	List<WorkDisplay> show();

	void add(WorkDisplay workDisplay);

}
