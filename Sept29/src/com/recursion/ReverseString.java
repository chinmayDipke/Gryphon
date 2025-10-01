package com.recursion;

//find the sum of digits of a number using recursion

import java.util.Scanner;

public class ReverseString {
	
	public static String reverse(String rev) {
		if(rev == null || rev.length() < 1)
			return rev;
		
		return reverse(rev.substring(1)) + rev.charAt(0);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		
		String inp = "hello";
		String reve = reverse(inp);
		System.out.println(reve);
	}
}
