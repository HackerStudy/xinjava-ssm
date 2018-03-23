package com.it.java.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.it.java.pojo.Instance;

public interface InstanceMapper {

	void UploadInstance(@Param("subtitletext") String subtitletext,@Param("stringdata") String stringdata);

	List<Instance> FindInstanceName();

	String FindInstanceContent(int id);

}
