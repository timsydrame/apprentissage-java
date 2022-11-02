package com.timsy.practice;

import java.util.Scanner;
/**
 * 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. 
* <u><b>Test Data:<br/> </u></b>
* Input first number: 125 <br/>
* Input second number: 24 <br/>
* <u><b> Expected Output :<br/> </u></b>
* 125 + 24 = 149<br/>
* 125 - 24 = 101<br/>
* 125 x 24 = 3000<br/>
* 125 / 24 = 5<br/>
* 125 mod 24 = 5<br/>
* <a href="https://www.w3resource.com/java-exercises/basic/index.php">voir exo</a>
 * @author fatim
 *
 */
public class Exo6CalculMath {

public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 System.out.println("Donner le premier nombre entier");
		 int numb1 = in.nextInt();
		 System.out.println("Donner le dexième nombre entier");
		 int numb2 = in.nextInt();
		 System.out.println(numb1  + "+" + numb2 + "=" + (numb1 + numb2));
		 System.out.println(numb1  + "-" + numb2 + "=" + (numb1 - numb2));
		 System.out.println(numb1  + "x" + numb2 + "=" + (numb1 * numb2));
		 System.out.println(numb1  + "/" + numb2 + "=" + (numb1 / numb2));
		 System.out.println(numb1  + "%" + numb2 + "=" + (numb1 % numb2));

	}

}
