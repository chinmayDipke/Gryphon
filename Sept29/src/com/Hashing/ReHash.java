package com.Hashing;

import java.util.ArrayList;
import java.util.List;

public class ReHash {

	public static void main(String[] args) {
		
		List<List<Integer>> table = new ArrayList<>();;
		int[] keys = {10, 11, 12, 13};	
		int bucketCount = 4;
			
		for(int i = 0; i < bucketCount; i++) {
			table.add(new ArrayList<>());
		}

		for(int key: keys) {
			if ()
			int index = key % bucketCount;
			table.get(index).add(key);	
		}
		
		
		for(int i = 0; i < bucketCount; i++) {
			System.out.print(i);
			for(int key: table.get(i)) {
				System.out.print("-->" + key);
				
			}
			System.out.println();
		}
	}

}
