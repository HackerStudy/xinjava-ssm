package com.it.java.dao;

import java.util.List;

import com.it.java.pojo.RelatedResources;

public interface RelatedResourcesMapper {

	public List<RelatedResources> findByUid(int uid);

	public void add(RelatedResources relatedResources);

	public void delete(int id);

	public List<RelatedResources> findAll();

	public List<RelatedResources> findByType(int type);

}
