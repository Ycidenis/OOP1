package com.gmail.ycidenis;

public class Main {

	public static void main(String[] args) {
		Triangle trOne = new Triangle(4, 5, 3);
		Triangle trTwo = new Triangle(2, 6, 3);
		double a = 4;
		double b = 5;
		double c = 3;
		double p = (a * b * c)/3;
		System.out.println("Площадь первого треугольника:" + trOne.vol());
		System.out.println("Площадь второго треугольника:" + trTwo.vol());
		double vol = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("Площадь треугольника:" + vol);
	}

}
