package MuiltiThreading;

import java.awt.*;
import java.awt.event.*;

class PRP_301 extends Frame{
	PRP_301 (){
//		Button b = new Button("Click Me");
//		b.setBounds(30, 100, 80, 30);
//		add(b);
//		
//		setSize(300,300);
//		setLayout(null);
//		setVisible(true);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
class PanelMake extends Frame{
	Label l;
	PanelMake(){
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				
				System.exit(0);
				
			}
		});
		
		l = new Label("This is the Window Closing Example");
		this.add(l);
		
		setTitle("Window Closing");
		setSize(300,300);
		setVisible(true);
	}
}
public class AWTS {

	public static void main(String[] args) {
		
		new PanelMake();

	}

}
package com.dsa;

import java.util.*;

public class Problem {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size and elements
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        // Number of queries
        int q = sc.nextInt();
        long totalSum = 0;

        // Process queries
        for (int k = 0; k < q; k++) {
            int type = sc.nextInt();
            int l = sc.nextInt() - 1; // converting to 0-based
            int r = sc.nextInt() - 1; // converting to 0-based

            if (type == 1) {
                // Type 1: Update range
                long[] copy = arr.clone(); // keep original values for correct updates
                for (int i = l; i <= r; i++) {
                    arr[i] = ((i - l + 1) * copy[i]) % MOD;
                }
            } 
            else if (type == 2) {
                // Type 2: Sum range
                long sum = 0;
                for (int i = l; i <= r; i++) {
                    sum = (sum + arr[i]) % MOD;
                }
                totalSum = (totalSum + sum) % MOD;
            }
        }

        // Final result
        System.out.println(totalSum % MOD);
        sc.close();
    }
}
