package com.it.java.pojo;

import java.io.Serializable;

public class BasicKowleage implements Serializable{
	
	private int id;				//id
	private String headings;	//标题
	private String text;		//文本
	private String picture;		//图片路径
	private String attachment;  //附件名
//	private int unit_id;
	
	
	public BasicKowleage() {
		super();
	}
	
	
	
	
	public BasicKowleage(int id, String headings, String text, String picture, String attachment) {
		super();
		this.id = id;
		this.headings = headings;
		this.text = text;
		this.picture = picture;
		this.attachment = attachment;
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHeadings() {
		return headings;
	}
	public void setHeadings(String headings) {
		this.headings = headings;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	
	@Override
	public String toString() {
		return "BasicKowleage [id=" + id + ", headings=" + headings + ", text=" + text + ", picture=" + picture
				+ ", attachment=" + attachment + "]";
	}
	
	
	
}
