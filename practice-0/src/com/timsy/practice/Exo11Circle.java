package com.timsy.practice;

import java.util.Scanner;

/**
 * 11. Write a Java program to print the area and perimeter of a circle. <br/>
 *<b>Test Data:<br/></b>
 * <b>Radius = 7.5 <br/></b>
 * <u><b>Expected Output <br/> </u></b>
 * Perimeter is = 47.12388980384689<br/>
 * Area is = 176.71458676442586<br/>
 * <a href="https://www.w3resource.com/java-exercises/basic/index.php">voir exo</a>
 * @author fatim
 */
public class Exo11Circle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input the radius");
		double radius = scanner.nextDouble();
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;

		System.out.println("Perimetre is " + perimeter);
		System.out.println(" Area is " + area);
	}
}
