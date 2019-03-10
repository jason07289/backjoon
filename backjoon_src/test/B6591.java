package test;

import java.util.Scanner;

public class B6591 {
	public static int[][] memo =new int[10001][10001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		while(true) {   	
    	int n = sc.nextInt();
    	int r = sc.nextInt();
        if (n!=0) { 
        	long result = combination(n, r);            
        	System.out.println(result);
        }
        else {
        	break;
        }
        
        }
		sc.close();
	}
	public static long combination(int n, int r) {
		if(memo[n][r]>0) {
			//System.out.println(memo[n][r]);

			return memo[n][r];
		}
		if(r==0||n==r) {
			//System.out.println(memo[n][r]);
	
			return memo[n][r]=1;
			
		}
		//System.out.println(memo[n][r]);
		return memo[n][r] =(int) (combination(n-1,r-1) + combination(n-1,r));
	}
}
