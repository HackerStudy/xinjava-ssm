package com.it.java.pojo;

import java.io.Serializable;

/**
 * 试卷
 * @author ASUS
 *
 */
public class TestPaper implements Serializable {
	private int id;
	private String topic;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public TestPaper(int id, String topic) {
		super();
		this.id = id;
		this.topic = topic;
	}

	public TestPaper() {
		super();
	}

	public String toString() {
		return "TestPaper [id=" + id + ", topic=" + topic + "]";
	}

}
