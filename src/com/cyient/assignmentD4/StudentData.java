package com.cyient.assignmentD4;

public class StudentData {

	public static void main(String[] args) {
		Student.sNum=456;
		
		Student s1 = new Student();
		s1.sID = 1001;
		s1.sName = "jack";
		s1.sEmail ="jack@gmail.com";
		s1.sSName ="Global school,Global school,45";
				
		Student.printStudentDetails(s1);
		
		Student s2 = new Student();
		s2.sID = 1002;
		s2.sName = "peter";
		s2.sEmail ="peter@gmail.com";
		s1.sSName ="Global school,Global school,96";
		Student.printStudentDetails(s2);
		
		Student s3 = new Student();
		s3.sID = 1003;
		s3.sName = "mark";
		s3.sEmail ="mark@gmail.com";
		s1.sSName ="Global school,Global school,89";
		Student.printStudentDetails(s3);
	}

}
