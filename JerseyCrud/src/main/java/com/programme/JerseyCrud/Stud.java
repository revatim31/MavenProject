package com.programme.JerseyCrud;

public class Stud {
private int studRollno;
private String studName; 




	public int getStudRollno() {
	return studRollno;
    }


public String getStudName() {
	return studName;
     }

public Stud() {System.out.println("calling");}


  public void setStudRollno(int studRollno) {
	this.studRollno = studRollno;
}


public void setStudName(String studName) {
	this.studName = studName;
}


public Stud(int studRollno,String studName) {
		super();
		this.studRollno=studRollno;
		this.studName=studName;
	}






}
