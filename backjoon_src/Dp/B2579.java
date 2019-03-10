package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2579 {
	public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int n = Integer.parseInt(br.readLine().trim());
	      int[] stair = new int[301];
	      int[] point=new int[301];
	      for(int i=0; i<n;i++) {
	    	  stair[i]=Integer.parseInt(br.readLine().trim());
	      }
	      point[0]=stair[0];
	      point[1]=Math.max(stair[0]+stair[1],stair[1]);
	      point[2]=Math.max(stair[0]+stair[2], stair[1]+stair[2]);
	      
	      for(int i=3; i<n; i++) {
	    	  point[i] =Math.max(point[i-2]+stair[i], stair[i-1]+stair[i]+point[i-3]);
	      }
	      
	      System.out.println(point[n-1]);
	}
	
}
