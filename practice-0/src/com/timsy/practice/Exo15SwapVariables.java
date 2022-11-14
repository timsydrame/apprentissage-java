package com.timsy.practice;

import java.util.Scanner;

/**
 * 15. Write a Java program to swap two variables. 
 *  <a href="https://www.w3resource.com/java-exercises/basic/index.php">voir exo</a>
 * @author fatim
 */

public class Exo15SwapVariables {

	public static void main(String[] args) {
		int variable3 = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrer votre première variable");
		int variable1 = scanner.nextInt();
		System.out.println("Entrer votre seconde variable");
		int variable2 = scanner.nextInt();
		System.out.println("variable 1 = " + variable1 + " variable2 = " + variable2);
		 variable3 = variable1;
		variable1 =variable2;
		variable2 = variable3;
		System.out.println("variable 1 = " + variable1  +" " + "variable2 = " + variable2);

	}

}
