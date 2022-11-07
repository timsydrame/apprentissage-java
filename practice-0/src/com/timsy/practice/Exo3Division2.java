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
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("Entrer le second nombre entier different de zero");
		int b = scanner.nextInt();
		if (b == 0 ){
			System.err.println(" la division par zero est impossible");	
		} else {
			int d = a/b;
			System.out.println("la division de " + a + " par " +  b + " = " + d);
		}	
	}
}
