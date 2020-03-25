package com.zhangbaolu.beans;

public class T_goods {

	private Integer id;
	private String name;
	private Integer type_id;
	private String price;
	private String status;
	private String datea;
	private String cname;
	public T_goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public T_goods(Integer id, String name, Integer type_id, String price, String status, String datea, String cname) {
		super();
		this.id = id;
		this.name = name;
		this.type_id = type_id;
		this.price = price;
		this.status = status;
		this.datea = datea;
		this.cname = cname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getType_id() {
		return type_id;
	}
	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDatea() {
		return datea;
	}
	public void setDatea(String datea) {
		this.datea = datea;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "T_goods [id=" + id + ", name=" + name + ", type_id=" + type_id + ", price=" + price + ", status="
				+ status + ", datea=" + datea + ", cname=" + cname + "]";
	}
	
}
