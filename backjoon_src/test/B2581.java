package test;

import java.util.Arrays;
import java.util.Scanner;

public class B2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		boolean[] check= new boolean[n+1];
		int result=0;
		Arrays.fill(check, true);

		check[1] = false;
	
		for (int i=2; i<n; i++) {			
				for(int j=2; i*j<n+1; j++) {
					check[i*j] = false;				
				}
			
		}

//		for(int i=m; i<n+1; i++) {
//			System.out.println(check[i]);
//		}
		for (int i = m; i <n+1; i++) {
	        if (check[i] == true) {
	            result = result+i;
	        }
	    }
		
		for (int i = m; i <n+1; i++) {
	        if (check[i] == true) {
	        	System.out.println(result);
	    		System.out.println(i); 		
	    		System.exit(0);
	        }	        
	    }
		for (int i = m; i <n+1; i++) {
	        if (check[i] == false) {
	    		System.out.println("-1");
	    		System.exit(0);
	        }
	        
	    }
	}
}
