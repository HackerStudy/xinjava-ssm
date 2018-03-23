package com.it.java.pojo;

public class AdvancedChild {
	private int id;
	private String teachingresources_name;	//小标题
	private String documents;				//内容文本
	private String attachment;				//附件名
	private int advancedknowledge_id;		//父表id
	
	private AdvancedKnowledge advancedKnowledge; //表示父表
	
	public AdvancedChild() {
		super();
	}
	
	public AdvancedChild(int id, String teachingresources_name, String documents, String attachment,
			int advancedknowledge_id, AdvancedKnowledge advancedKnowledge) {
		super();
		this.id = id;
		this.teachingresources_name = teachingresources_name;
		this.documents = documents;
		this.attachment = attachment;
		this.advancedknowledge_id = advancedknowledge_id;
		this.advancedKnowledge = advancedKnowledge;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeachingresources_name() {
		return teachingresources_name;
	}
	public void setTeachingresources_name(String teachingresources_name) {
		this.teachingresources_name = teachingresources_name;
	}
	public String getDocuments() {
		return documents;
	}
	public void setDocuments(String documents) {
		this.documents = documents;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public int getAdvancedknowledge_id() {
		return advancedknowledge_id;
	}
	public void setAdvancedknowledge_id(int advancedknowledge_id) {
		this.advancedknowledge_id = advancedknowledge_id;
	}
	
	
	public AdvancedKnowledge getAdvancedKnowledge() {
		return advancedKnowledge;
	}

	public void setAdvancedKnowledge(AdvancedKnowledge advancedKnowledge) {
		this.advancedKnowledge = advancedKnowledge;
	}

	@Override
	public String toString() {
		return "AdvancedChild [id=" + id + ", teachingresources_name=" + teachingresources_name + ", documents="
				+ documents + ", attachment=" + attachment + ", advancedknowledge_id=" + advancedknowledge_id
				+ ", advancedKnowledge=" + advancedKnowledge + "]";
	}

	
	
	

}
