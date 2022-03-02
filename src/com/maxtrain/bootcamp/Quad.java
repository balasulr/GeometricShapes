package com.maxtrain.bootcamp;

public class Quad {
	
	private int side1;
	private int side2;
	private int side3;
	private int side4;
	
	// Calculate Perimeter
	public int perimeter() {
		return getSide1() + getSide2() + getSide3() + getSide4();
	}
	
	// Constructor
	public Quad(int side1, int side2, int side3, int side4) {
		this.setSide1(side1);
		this.setSide2(side2);
		this.setSide3(side3);
		this.setSide4(side4);
	}
	
	// get & set for all sides
	public int getSide1() {
		return side1;
	}
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	public int getSide2() {
		return side2;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	public int getSide3() {
		return side3;
	}
	public void setSide3(int side3) {
		this.side3 = side3;
	}
	public int getSide4() {
		return side4;
	}
	public void setSide4(int side4) {
		this.side4 = side4;
	}
	
	
}
