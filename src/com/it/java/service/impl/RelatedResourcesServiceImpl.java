package com.it.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.java.dao.RelatedResourcesMapper;
import com.it.java.pojo.RelatedResources;
import com.it.java.service.RelatedResourcesService;


@Service
public class RelatedResourcesServiceImpl implements RelatedResourcesService {

	@Autowired
	private RelatedResourcesMapper mapper;

	public List<RelatedResources> findByUid(int uid) {
		return mapper.findByUid(uid);
	}

	public void add(RelatedResources relatedResources) {
		mapper.add(relatedResources);
	}

	public void delete(int id) {
		mapper.delete(id);
	}

	public List<RelatedResources> findAll() {
		return mapper.findAll();
	}

	public List<RelatedResources> findByType(int type) {
		return mapper.findByType(type);
	}

}

