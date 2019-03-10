package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10844 {
	static int[][] dp= new int[10][101];
	
	public static void main(String[] args) throws IOException {
		dp[0][0]=0;
		for(int i=1; i<10; i++) {
			dp[i][0] = 1;
		}
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine().trim());
	    int input = n-1;
	    long output = func(input)%1000000000;
	    System.out.println(output);
		
	}
	
	public static long func(int input) {
		long result = 0;
		
		for(int i=1; i<input+1; i++) {
			for(int j=0; j<10; j++) {
				if(j==0) {
					dp[j][i] = dp[j+1][i-1]% 1000000000;
				}else if(j==9){
					dp[j][i] = dp[j-1][i-1]% 1000000000;
				}else {
					dp[j][i] = (dp[j+1][i-1]+dp[j-1][i-1])% 1000000000;
				}
				
			}
		}
		
		for(int i=0; i<10; i++) {
			result +=dp[i][input]% 1000000000;
		    //System.out.println(dp[i][input]);

		}
		
		
		return result;
		
	}
	
}
