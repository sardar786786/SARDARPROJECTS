package com.Acc;

public class Student {
	
	private String name,mobile,add;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}
	public void show(){
		System.out.println("Your Name:"+name+"Your Mobile :"+mobile+"Your Address :"+add);
	}

}
