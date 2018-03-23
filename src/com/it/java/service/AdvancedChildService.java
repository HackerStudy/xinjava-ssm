package com.it.java.service;

import com.it.java.pojo.AdvancedChild;

/**
 * 进阶知识子表
 * @author hasee
 *
 */
public interface AdvancedChildService {

	void PreservationAdvancedChild( String subtitletext, String stringdata,int thematicid);

	AdvancedChild FindAdvancedChildAll(int id);

	void UpdateAttachment(String attachment, int id);

	String FindAttachment(int id);

}
