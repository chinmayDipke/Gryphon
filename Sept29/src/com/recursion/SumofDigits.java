package com.recursion;

import java.util.Scanner;

public class SumofDigits {

	public static int sum(int n) {
		if(n == 0)
			return 0;
		
		return (n%10) + sum(n/10); 
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		System.out.println(sum(n));
	}
}
