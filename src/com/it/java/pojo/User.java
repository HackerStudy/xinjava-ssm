package com.it.java.pojo;

import java.io.Serializable;

public class User implements Serializable{
	private int id;
	private String name;
	private String account;
	private String password;
	private int position;
	public static final int MANAGER = 1;// (0,����Ա,1��ʦ,2ѧ��)
	public static final int TEACHER = 2;// (0,����Ա,1��ʦ,2ѧ��)
	public static final int STUDENT = 3;// (0,����Ա,1��ʦ,2ѧ��)

	
	
	
	public User(int id, String name, String account, String password, int position) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
		this.password = password;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
		super();
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", account=" + account + ", password=" + password + ", position="
				+ position + "]";
	}

}
