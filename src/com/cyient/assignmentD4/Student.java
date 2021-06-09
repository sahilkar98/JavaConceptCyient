package com.cyient.assignmentD4;

public class Student {
	public int sID;
	public String sName;
	public String sEmail;
	public static int sNum;
	public String sSName;
	
	public static void printStudentDetails(Student s) {
		System.out.println(s.sID);
		System.out.println(s.sName);
		System.out.println(s.sEmail);
		System.out.println(Student.sNum);
		System.out.println(s.sSName);
	}
}
