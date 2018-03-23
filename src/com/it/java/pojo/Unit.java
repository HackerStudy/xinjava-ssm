package com.it.java.pojo;

public class Unit {
	private int id;
	private String name;
	private int module_id;
	
	
	
	public Unit() {
		super();
	}
	public Unit(int id, String name, int module_id) {
		super();
		this.id = id;
		this.name = name;
		this.module_id = module_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getModule_id() {
		return module_id;
	}
	public void setModule_id(int module_id) {
		this.module_id = module_id;
	}
	@Override
	public String toString() {
		return "Unit [id=" + id + ", name=" + name + ", module_id=" + module_id + "]";
	}
	
	
	
}
