package com.timsy.practice;

import java.util.Scanner;

/**
* 7. Write a Java program that takes a number as input and prints its multiplication table upto 10. 
*  </u></b>Test Data:<br/> </u></b>
* <u><b> Input a number:</u> 8 <br/></b>
*  <u><b>Expected Output :<br/> </u></b>
* 8 x 1 = 8<br/>
* 8 x 2 = 16<br/>
* 8 x 3 = 24<br/>
* 8 x 10 = 80<br/>
* <a href="https://www.w3resource.com/java-exercises/basic/index.php">voir exo</a>
 * @author fatim
 *
 */

public class Exo7TabledeMultiplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println( "Donner un nombre de votre choix");
		int input = scanner.nextInt();
		for(int i = 1; i<= 10 ; i++ ){
			System.out.println(input + "*" + i +"=" + input * i);
			
		}
		
		

	}

}
