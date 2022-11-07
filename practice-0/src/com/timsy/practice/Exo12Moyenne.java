package com.timsy.practice;

import java.util.Scanner;

/**
 * 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.<br/>
 *  <a href="https://www.w3resource.com/java-exercises/basic/index.php">voir exo</a>
 * @author fatim
 */

public class Exo12Moyenne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input first number");
		int input1  = scanner.nextInt();
		System.out.println("input second number");
		int input2  = scanner.nextInt();
		System.out.println("input third number");
		int input3  = scanner.nextInt();
		
		double average = (input1 + input2 + input3) / 3d;
		System.out.println("the average is: " + average);
	}
}
