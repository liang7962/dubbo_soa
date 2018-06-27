package com.jin.pojo;


import java.io.Serializable;



public class Register implements Serializable {

    private static final long serialVersionUID = 1028650561;

    private Integer registerno;
    private String  registername;
    private Integer role;
    private Integer age;
    private String  address;
    private Integer status;
	public Integer getRegisterno() {
		return registerno;
	}
	public void setRegisterno(Integer registerno) {
		this.registerno = registerno;
	}
	public String getRegistername() {
		return registername;
	}
	public void setRegistername(String registername) {
		this.registername = registername;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Register [registerno=" + registerno + ", registername=" + registername + ", role=" + role + ", age="
				+ age + ", address=" + address + ", status=" + status + "]";
	}
	public Register(Integer registerno, String registername, Integer role, Integer age, String address,
			Integer status) {
		super();
		this.registerno = registerno;
		this.registername = registername;
		this.role = role;
		this.age = age;
		this.address = address;
		this.status = status;
	}
	public Register() {
		// TODO Auto-generated constructor stub
	}
    
}
