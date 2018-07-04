package com.Acc.APP;

public class Patient {
	private int id;
	private String name;
	private String add;
	public Patient(int id,String name,String add){
	this.id=id;
	this.name=name;
	this.add=add;
	}
void display(){
	System.out.println("Your Id:"+id+"Your Name :"+name+"Your Add:"+add);
}
}
