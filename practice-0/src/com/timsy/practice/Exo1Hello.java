package com.timsy.practice;

import java.util.Scanner;

/**
 * 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.<br/>
 * <u><b>Expected Output :<br/></b></u>
 * <i>Hello<br/>
 * Alexandra Abramov<br/></i>
 * <a href="https://www.w3resource.com/java-exercises/basic/index.php">voir exo</a>
 * @author fatim
 */
public class Exo1Hello {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("veillez rentrer votre nom");
		String name = scanner.nextLine();
		System.out.println("veillez entrer votre prenom");
		String firstName = scanner.nextLine();
		String nomComplet = firstName + " " + name.toUpperCase();
		
		System.out.println("Hello\n" + nomComplet);		
	}	
}
