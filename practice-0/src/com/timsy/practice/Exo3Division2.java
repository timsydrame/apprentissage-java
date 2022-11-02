package com.timsy.practice;

import java.util.Scanner;
/**
 * 3. Write a Java program to divide two numbers and print on the screen. 
:<u><b><br/>Test Data :</u></b><br/>
50/3 <br/>
:<u><b><i/>Expected Output :</u></b><br/>
16
 <a href="https://www.w3resource.com/java-exercises/basic/index.php">voir exo</a>
 * @author fatim
 */

public class Exo3Division2 {

	public static void main(String[] args) {
		System.out.println("Entrer le premier nombre entier");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("Entrerle second nombre entier");
		int b = input.nextInt();
		int d = a/b;
		System.out.println("la division de " + a + " par " +  b + " = " + a/b);

		 
		 
		 
		 
				

	}

}
