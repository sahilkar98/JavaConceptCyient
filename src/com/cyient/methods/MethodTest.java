package com.cyient.methods;

public class MethodTest {
	
	public static void main(String[] args) {
		
		int height=5;
		int base = 5;
		double area =Area.areaOfTriangle(height, base);
		System.out.println(area);
		
		int side=10;
		Area obj = new Area();
		
		double area1=obj.areaOfSquare(side);
		System.out.println(area1);
		
		int a=10;
		int b=20;
		int h=30;
		double area2 = Area.areaOfTrapezium(a, b, h);
		System.out.println(area2);
	}

}
