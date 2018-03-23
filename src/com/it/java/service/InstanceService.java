package com.it.java.service;

import java.util.List;

import com.it.java.pojo.Instance;

/**
 * 实例教程
 * @author hasee
 *
 */
public interface InstanceService {

	void UploadInstance(String subtitletext, String stringdata);

	List<Instance> FindInstanceName();

	String FindInstanceContent(int id);

}
