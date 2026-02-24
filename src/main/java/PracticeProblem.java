/**
 * File Name: errors.java
 * Author: Mr. Kalisz
 * Date Created: March 29, 2019
 * Date Last Edited: March 29, 2019
 */

import java.util.Scanner;
class PracticeProblem {

	Scanner s = new Scanner(System.in);
  	public static void main(String[] args) {
		
		q1();
		q2();
		q3();
		q4();
  	}
  	public static void q1() {
		// From input, recieve two integers from the user and add them together.  Output the result.
		Scanner s = new Scanner(System.in);
		int num1;
		int num2;
		System.out.print("Input a number: ");
		num1 = s.nextInt();
		System.out.print("Input a number: ");
		num2 = s.nextInt();
		System.out.println(num1 + num2);
  	}

	public static void q2() {
		// From input recieve two integers.  Output the quotient rounded down.
		Scanner s = new Scanner(System.in);
		int num1;
		int num2;
		System.out.print("Input a number: ");
		num1 = s.nextInt();
		System.out.print("Input a number: ");
		num2 = s.nextInt();
		System.out.println(num1/num2);
	}

	public static void q3() {
		// Output the phrase "hello "Mr. Kalisz" have you seen my work yet?" 
		Scanner s = new Scanner(System.in);
		System.out.println("hello \"Mr. Kalisz\" have you seen my work yet?");
	}

	public static void q4() {
		// From input recieve two numbers (can be decimal fractions).  
		// Output the first number plus two, then multiplied by the second number.
		Scanner s = new Scanner(System.in);
		double num2;
		double num1;
		System.out.print("Input a number: ");
		num1 = s.nextDouble();
		System.out.print("Input a number: ");
		num2 = s.nextDouble();
		System.out.println((num1 + 2) * num2);
	}
}