package DSA;

import java.util.Scanner;

public class Que_31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"Monday", "Tueday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday"};
		
		System.out.println("Enter start day 0=Monday,: ");
		int start = sc.nextInt();
		System.out.println("Enter Number of days: ");
		int n = sc.nextInt();
		
		int count = 0;
		for(int i = 0; i <= n;i++) {
			if((start + i) % 7 == 6) {
				count++;
			}
		}
		System.out.println("Number: "+count);	
	}
}
