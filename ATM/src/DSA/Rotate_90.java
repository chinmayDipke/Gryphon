package DSA;

public class Rotate_90 {

	public static void main(String[] args) {
		
		
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
		};
		
		rotate(arr);
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				
				System.out.print(arr[i][j]+" ");
				
				
			}
			System.out.println();
		}
		
	}

	private static void rotate(int[][] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr[0].length; j++) {
				
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
				
			}
		}
		
		System.out.println("=====Transpose======");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				
				System.out.print(arr[i][j]+" ");
				
				
			}
			System.out.println();
		}
		System.out.println("=====Rotate======");
		
		for(int i = 0; i < arr.length; i++) {
			int start = 0;
			int end = arr[0].length - 1;

			while(start < end) {				
				int temp = arr[i][start];
				arr[i][start] = arr[i][end];
				arr[i][end] = temp;
				start++;
				end--;
				
			}
		}
		
	}
	
	
}



/*
1️⃣ Bubble Sort  




2️⃣ Selection Sort  
👉 Find the minimum and swap with the current index.  
java
void selectionSort(int[] arr) {
  for (int i = 0; i < arr.length; i++) {
    int min = i;
    for (int j = i + 1; j < arr.length; j++) {
      if (arr[j] < arr[min]) min = j;
    }
    int temp = arr[i];
    arr[i] = arr[min];
    arr[min] = temp;
  }
}


3️⃣ Insertion Sort  
👉 Insert each element into its correct position.  
java
void insertionSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    int current = arr[i];
    int j = i - 1;
    while (j >= 0 && arr[j] > current) {
      arr[j + 1] = arr[j];
      j--;
    }
    arr[j + 1] = current;
  }
}




 */