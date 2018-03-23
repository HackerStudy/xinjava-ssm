package com.it.java.service;

import java.util.List;

import com.it.java.pojo.RelatedResources;

public interface RelatedResourcesService {

	List<RelatedResources> findByType(int software);

	void add(RelatedResources resources);

}
