package DSA;

public class Que_34 {

	public static void main(String[] args) {
		
		int n = 123;  
        int product = 1;

        while (n != 0) {
            int digit = n % 10;  
            product *= digit;    
            n /= 10;             
        }

        System.out.println("Product of digits: " + product);

	}

}
