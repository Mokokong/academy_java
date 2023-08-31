package com.bptn.course.week2.wednesday.ObjectSuperClass;

//Complete building up this class
public class APStudent extends Student {
	
	private int apScore;
	
	APStudent(String name, int id , int apscore){
		super(name,id);
		this.apScore = apscore;
		
	}
	
	 public String toString() {
	       return super.toString() + " " + this.apScore;
	}

}