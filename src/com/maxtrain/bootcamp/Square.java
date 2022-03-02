package com.maxtrain.bootcamp;

public class Square extends Rect {
	
	public Square(int sides) {
		super(sides, sides);
	}
	
// Default Constructor that calls the above constructor if square created without sides
	public Square() {
		this(5);
	}
	
}
