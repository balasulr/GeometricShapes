package com.maxtrain.bootcamp;

public class Program {

	public static void main(String[] args) {
		
		var s1 = new Square(5);
		System.out.println("A Square where all sides are equal to 5 has a perimeter of: ");
		System.out.println(s1.perimeter() + ".");
		System.out.println("\nA Square where all sides are equal to 5 has a area of: ");
		System.out.println(s1.area() + ".");
		
		System.out.println("----------------------------------------------------------------------------");
		
		var s2 = new Square();
		System.out.println("A Second Square where with a default side length of 5 has a perimeter of: ");
		System.out.println(s2.perimeter() + ".");
		System.out.println("\nA Second Square where with a default side length of 5 has an area of: ");
		System.out.println(s2.area() + ".");
		
		System.out.println("----------------------------------------------------------------------------");
		
		var r1 = new Rect(3,5);
		System.out.println("A Rectangle with 2 side lengths each of 3 & 5 has a perimeter of: ");
		System.out.println(r1.perimeter() + ".");
		System.out.println("\nA Rectangle with 2 side lengths each of 3 & 5 has an area of: ");
		System.out.println(r1.area() + ".");
		
		System.out.println("----------------------------------------------------------------------------");
		
		var q1 = new Quad(2, 3, 4, 5);
		System.out.println("A Quadrilateral with side lengths of 2, 3, 4 & 5 has a perimeter of: ");
		System.out.println(q1.perimeter() + ".");

	}

}
