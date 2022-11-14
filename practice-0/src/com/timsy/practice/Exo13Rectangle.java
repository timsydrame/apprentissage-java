package com.timsy.practice;

import java.util.Scanner;

/**
 * 13. Write a Java program to print the area and perimeter of a rectangle.
 *<a href="https://www.w3resource.com/java-exercises/basic/index.php">voir exo</a>
 * @author fatim
 */

public class Exo13Rectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("entrer la longueur du rectangle");
		double longueur = scanner.nextDouble();
		
		System.out.println("entrer la largeur du rectangle");
		double largeur = scanner.nextDouble();
		System.out.println(" la sur face du rectangle  " + "= " +( (longueur* largeur)));
		System.out.println("le perimetre du rectangle "+ "= " +( 2*(longueur+ largeur)));
	}

}
