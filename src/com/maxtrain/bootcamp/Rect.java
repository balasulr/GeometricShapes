package com.maxtrain.bootcamp;

public class Rect extends Quad {
	// Method
	public int area() {
		return super.getSide1() * super.getSide2();
	}
	
	// Rectangle constructor which takes 2 sides instead of the 4 in Quad
	public Rect(int side1, int side2) {
		super(side1, side2, side1, side2);
	}
}
