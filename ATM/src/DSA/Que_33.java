package DSA;

public class Que_33 {

	public static void main(String[] args) {
		 int[] arr = {3, 4, 2, 5, 1, 6};  
		 int count = 1; 
	     int maxSoFar = arr[0]; 

	     for (int i = 1; i < arr.length; i++) {
	    	if (arr[i] > maxSoFar) {
	    		count++;              
	            maxSoFar = arr[i];   
	        }
	     }

	        System.out.println("Maximum Number are: "+count);

	}

}
