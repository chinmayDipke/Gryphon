/* Searching Prime number based on the Time Complexity
* 	
* Time Complexity = O(n^2)
* 
* 
* 
* */

package DSA;



import java.util.*;

class First{
	
	public boolean prime(int num) {
		int c = 2;
		while(c < num)
		{
			if(num%c == 0)
			{
				return false;
			}
			c++;
		}
		return true;
	}
}

class Second{
	
	public boolean prime(int num) {
		int c = 2;
		while(c*c <= num)
		{
			if(num%c == 0)
			{
				return false;
			}
			c++;
		}
		return true;
	}
}

class Third {
	
	public void third() {
		
	}
}

public class BasicPrimeNumber {

	
	public static void main(String[] args) {
	
		int n = 214748364;
		//int n = 40;;
		boolean[] arr = new boolean[n+1];
		sieve(arr, n);
		
	
	
		
	}
	static void sieve(boolean[] arr, int num)//n(log(log n))
	{
		for(int i = 2;i*i <= num; i++) 
		{
			if(!arr[i])
			{
				for(int j = i*2;j<=num;j+=i)
				{
					arr[j]=true;
				}
			}
		}
		for(int i = 1;i<arr.length;i++) {
			if(!arr[i])
			{
				System.out.println(i);
			}
		}
		
		
	}

}
