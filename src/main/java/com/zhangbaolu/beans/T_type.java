package com.zhangbaolu.beans;

public class T_type {

	private Integer type_id;
	private String cname;
	public T_type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public T_type(Integer type_id, String cname) {
		super();
		this.type_id = type_id;
		this.cname = cname;
	}
	public Integer getType_id() {
		return type_id;
	}
	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "T_type [type_id=" + type_id + ", cname=" + cname + "]";
	}
	
}
