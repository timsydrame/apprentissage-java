package com.timsy.practice;

import java.util.Scanner;
/**
* 5.Write a Java program that takes two numbers as input and display the product of two numbers. <br/>
* Test Data:<br/>
* Input first number: 25
* Input second number: 5 <br/>
* <u><b>Expected Output :<br/></u></b/>
* 25 x 5 = 125
* <a href="https://www.w3resource.com/java-exercises/basic/index.php">voir exo</a>
 * @author fatim
 */

public class Exo5Produit {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Entrer le premier numero");
		int num1 = scan.nextInt();
		System.out.println("Entrer le deuxieme numero");
        int num2 = scan.nextInt();
		System.out.println(num1*num2);
		 
	}

}
