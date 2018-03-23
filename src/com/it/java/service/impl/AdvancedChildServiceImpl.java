package com.it.java.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.java.dao.AdvancedChildMapper;
import com.it.java.pojo.AdvancedChild;
import com.it.java.service.AdvancedChildService;
/**
 * 进阶知识子表
 * @author hasee
 *
 */
@Service
public class AdvancedChildServiceImpl implements AdvancedChildService {

	@Autowired
	private AdvancedChildMapper advancedChildMapper;
	
	public void PreservationAdvancedChild( String subtitletext, String stringdata,int thematicid) {
		advancedChildMapper.PreservationAdvancedChild(subtitletext,stringdata,thematicid);
	}

	public AdvancedChild FindAdvancedChildAll(int id) {
		
		AdvancedChild advancedChild = advancedChildMapper.FindAdvancedChildAll(id);
		
		return advancedChild;
	}

	public void UpdateAttachment(String attachment, int id) {
		advancedChildMapper.UpdateAttachment(attachment,id);
	}

	public String FindAttachment(int id) {
		return advancedChildMapper.FindAttachment(id);
	}

}
