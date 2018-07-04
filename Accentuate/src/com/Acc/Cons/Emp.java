package com.Acc.Cons;

public class Emp {
	private int id;
	private String name;
	private String mob;
	public Emp(int id,String name,String mob){
		this.id=id;
		this.name=name;
		this.mob=mob;
	}
void show(){
	System.out.println("Your ID:"+id+"Your Name:"+name+"Your Mob:"+mob);
}
}
