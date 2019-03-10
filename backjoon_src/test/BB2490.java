package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BB2490 {
	 static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      StringTokenizer s = new StringTokenizer(br.readLine()," ");


	      
	      int[][] map = new int[2][3];
		  for(int i = 0 ; i < 2 ; i ++) {
		   	s = new StringTokenizer(br.readLine()," ");
		   	for(int j = 0; j < 3; j++) {
	    		map[i][j] = Integer.parseInt(s.nextToken());
	    	}
		  }
		  int c=0;

		  for(int i = 0 ; i < 2 ; i ++) {
		   	for(int j = 0; j < 3; j++) {
	    		System.out.print(map[i][j]+" ");
	    		c++;
	    		if(0==(c%3)) {
	    			System.out.println();
	    		}
		   	}
		  }
	
	}
}
