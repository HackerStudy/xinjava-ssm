package com.it.java.pojo;

public class Instance {
	private int id;
	private String instancename; //标题
	private String content;		 //内容
	private String attachment;	 //附件名
	
	
	
	public Instance() {
		super();
	}
	public Instance(int id, String instancename, String content, String attachment) {
		super();
		this.id = id;
		this.instancename = instancename;
		this.content = content;
		this.attachment = attachment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInstancename() {
		return instancename;
	}
	public void setInstancename(String instancename) {
		this.instancename = instancename;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	@Override
	public String toString() {
		return "Instance [id=" + id + ", instancename=" + instancename + ", content=" + content + ", attachment="
				+ attachment + "]";
	}
}
