package com.it.java.pojo;

import java.io.Serializable;

public class WorkDisplay implements Serializable {
	private int id;
	private String title;
	private String userName;
	private String profile;
	private String picture;
	private String attachment;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
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
	public WorkDisplay(int id, String title, String userName, String profile, String picture, String attachment) {
		super();
		this.id = id;
		this.title = title;
		this.userName = userName;
		this.profile = profile;
		this.picture = picture;
		this.attachment = attachment;
	}
	public WorkDisplay() {
		super();
	}
	@Override
	public String toString() {
		return "WorkDisplay [id=" + id + ", title=" + title + ", userName=" + userName + ", profile=" + profile
				+ ", picture=" + picture + ", attachment=" + attachment + "]";
	}
	


}
