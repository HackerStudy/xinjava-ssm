package com.it.java.pojo;

import java.util.List;

/**
 * 进阶知识
 * @author hasee
 *
 */
public class AdvancedKnowledge {
	private int id;   		//id
	private String projectname; //专题
	
	private List<AdvancedChild> advancedChildList;//教学文档类
	public AdvancedKnowledge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdvancedKnowledge(int id, String projectname, List<AdvancedChild> advancedChildList) {
		super();
		this.id = id;
		this.projectname = projectname;
		this.advancedChildList = advancedChildList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	
	public List<AdvancedChild> getAdvancedChildList() {
		return advancedChildList;
	}
	public void setAdvancedChildList(List<AdvancedChild> advancedChildList) {
		this.advancedChildList = advancedChildList;
	}
	@Override
	public String toString() {
		return "AdvancedKnowledge [id=" + id + ", projectname=" + projectname + ", advancedChildList="
				+ advancedChildList + "]";
	}
	
}
