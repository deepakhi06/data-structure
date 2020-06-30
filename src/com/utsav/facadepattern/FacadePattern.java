package com.utsav.facadepattern;

public class FacadePattern {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
