package com.it.java.pojo;

import java.io.Serializable;

public class RelatedResources implements Serializable {
	private int id;
	private int uid;
	private String name;
	private String href;
	private int type;
	public static final int SOFTWARE = 0;// (0,�����Դ,1��վ��Դ,2�鼮��Դ)
	public static final int WEBSITE = 1;
	public static final int BOOK = 2;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public static int getSoftware() {
		return SOFTWARE;
	}

	public static int getWebsite() {
		return WEBSITE;
	}

	public static int getBook() {
		return BOOK;
	}

	public RelatedResources(int id, int uid, String name, String href, int type) {
		super();
		this.id = id;
		this.uid = uid;
		this.name = name;
		this.href = href;
		this.type = type;
	}

	public RelatedResources() {
		super();
	}

	public String toString() {
		return "RelatedResources [id=" + id + ", uid=" + uid + ", name=" + name + ", href=" + href + ", type=" + type
				+ "]";
	}

}
