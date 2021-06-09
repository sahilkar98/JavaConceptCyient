package com.cyient.logics;

public class CreateTest {

	public static void main(String[] args) {

		int mark = 80;

		if (mark >= 90 && mark <= 100) {
			System.out.println("GRADE==A");
		} else if (mark >= 80 && mark <= 89) {
			System.out.println("GRADE==B");
		} else if (mark >= 60 && mark <= 79) {
			System.out.println("GRADE==C");
		} else if (mark >= 33 && mark <= 59) {
			System.out.println("GRADE==D");
		} else if (mark < 33 && mark >= 0) {
			System.out.println("GRADE==E");
		}

	}

}
