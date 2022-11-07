package com.timsy.practice;

import java.util.Scanner;
/**
 * 2. Write a Java program to print the sum of two numbers. 
* <u><b><br/>Test Data::</u></b><br/>
* 74 + 36
* <u><b><br/>Expected Output :</u></b><br/>
* 110<br/>
*  <a href="https://www.w3resource.com/java-exercises/basic/index.php">voir exo</a>
 * @author fatim
 *
 */

public class Exo2SumInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bonjour! veillez nous fournir votre premier nombre entier");
		int first = scanner.nextInt();
		
		System.out.println(" Veillez nous fournir votre second nombre entier");
		int secnd = scanner.nextInt();
	
		System.out.println("la somme = " +  first + secnd);
	}
}
