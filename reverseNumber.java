package com.bridgelabz;
import java.util.*;
public class reverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	       int number = sc.nextInt();  
	       int reverse = 0;
		while(number != 0)   
		{  
		int remainder = number % 10;  //First, we find the remainder of the given number by using the modulo (%) operator.
		reverse = reverse * 10 + remainder;  //Multiply the variable reverse by 10 and add the remainder into it.
		number = number/10;  //Divide the number by 10.
		}  
		System.out.println("The reverse of the given number is: " + reverse); 
	}

}
