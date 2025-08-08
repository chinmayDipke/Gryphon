package DSA;

import java.util.Scanner;
public class Que_Interview {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the length of the Array: ");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the elements: ");
		for(int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter Query: ");
		int query = sc.nextInt();
		
		System.out.println("Enter l value: ");
		int l = sc.nextInt();		
		
		System.out.println("Enter r value: ");
		int r = sc.nextInt();		
		
		int result = functionQuery(query, l, r, arr);
		System.out.println(result);
	}
	
	private static int functionQuery(int query, int left, int right, int[] arr) {
		int sum = 0;
		if(query == 1) {
			for(int i = 0; i < arr.length; i++) {
				arr[i] = (i-left+1)*arr[left];
				sum += arr[i];
			}
			
		}
		else if(query == 2) {
			for(int i = left; i <= right; i++) {
				sum += arr[i];
			}
		}
		return sum;
	}

	
}
