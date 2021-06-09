package com.cyient.loop;

public class AdvanceForLoopTest {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50, 60, 80, 55, 42, 8, 64, 25, 35 };
		for (int number : numbers) {
			if (number <= 50) {
				System.out.println(number);
			}
		}

		String[] colors = { "Red", "Yellow", "Blue" };
		for (String color : colors) {
			System.out.println(color);

		}

	}

}
