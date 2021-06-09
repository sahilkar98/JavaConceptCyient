package com.cyient.loop;

public class LoopTest {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50, 60, 80, 55, 42, 8, 64, 25, 35 };
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] <= 50) {
				System.out.println(numbers[i]);
			}
		}
	}

}
