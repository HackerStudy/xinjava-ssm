package com.it.java.dao;

import org.apache.ibatis.annotations.Param;

import com.it.java.pojo.AdvancedChild;

/**
 * 进阶知识子表
 * @author hasee
 *
 */
public interface AdvancedChildMapper {

	public void PreservationAdvancedChild(
			@Param("teachingresources_name") String subtitletext,
			@Param("documents") String stringdata,
			@Param("advancedknowledge_id") int thematicid);

	public AdvancedChild FindAdvancedChildAll(int id);

	public void UpdateAttachment(@Param("attachment") String attachment,@Param("id") int id);

	public String FindAttachment(int id);

}
