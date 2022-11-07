package com.timsy.practice;

/**
* 4. Write a Java program to print the result of the following operations. <br/>
* a. -5 + 8 * 6<br/>
* b. (55+9) % 9 <br/>
* c. 20 + -3*5 / 8 <br/>
* d. 5 + 15 / 3 * 2 - 8 % 3<br/>
* <u><b>Expected Output :</u></b><br/>
* 43 <br/>
* 1<br/>
* 19<br/>
* 13 <br/>
* <a href="https://www.w3resource.com/java-exercises/basic/index.php">voir exo</a>
 * @author fatim
 */
public class Exo4OperationMath {
	public static void main(String[] args) {
		System.out.println(-5+8*6);
		System.out.println((55+9)%8);
		System.out.println((20+(-3*5/8)));
		System.out.println(5+15/3*2-8%3);
	}
}
