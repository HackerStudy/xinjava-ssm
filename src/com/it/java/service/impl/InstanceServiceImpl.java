package com.it.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.java.dao.InstanceMapper;
import com.it.java.pojo.Instance;
import com.it.java.service.InstanceService;

/**
 * 实例教程
 * @author hasee
 *
 */
@Service
public class InstanceServiceImpl implements InstanceService {

	@Autowired
	private InstanceMapper instanceMapper;
	
	public void UploadInstance(String subtitletext, String stringdata) {
		instanceMapper.UploadInstance(subtitletext,stringdata);
	}

	public List<Instance> FindInstanceName() {
		
		List<Instance> list = instanceMapper.FindInstanceName();
		return list;
	}

	public String FindInstanceContent(int id) {
		return instanceMapper.FindInstanceContent(id);
	}

}
