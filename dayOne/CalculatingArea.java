/**
 * 
 */
package com.Training.dayOne;

/**
 * 
 */
public class CalculatingArea {
	
	public void area(float radius) {
		final float PI = 3.14f;
		System.out.println("It is a circle");
		System.out.println(PI*radius*radius);
	}
	public void area(int side) {
		System.out.println("It is a square");
		 System.out.println(side*side);
		
	}
	public void area(int length, int breadth) {
		System.out.println("It is a rectangle");
		System.out.println(length*breadth);
	}
	public void area(float base, float height) {
		System.out.println("It is a triangle");
		System.out.println(0.5f*base*height);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int side = 2;
		float radius = 3f;
		int length = 3;
		int breadth = 5;
		float base = 2.0f;
		float height = 3.0f;
		CalculatingArea calc = new CalculatingArea();
		calc.area(radius);
		calc.area(length,breadth);
		calc.area(side);
		calc.area(base,height);
	}

}
