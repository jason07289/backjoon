package Dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1003 {

	public static int[] arr= new int[41];

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int tc = Integer.parseInt(br.readLine().trim());
        
	    int a;
		arr[0]=0;
		arr[1] =1;
	    for(int i=0; i<tc; i++) {
	      a = Integer.parseInt(br.readLine());
	      if(a==0) {
		      System.out.println(1+" "+0);
  
	      }else {
	    	  System.out.println(fibonacci(a-1)+" "+fibonacci(a));
	      }
	
	    }
	}	
	
	
	
	
	public static int fibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		for(int i =2; i<n+1; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		return arr[n-1]+arr[n-2];	
		
	}
	
}
