package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2490 {
	public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      
	      int[][] map = new int[3][4];
		  for(int i = 0 ; i < 3 ; i ++) {
			  StringTokenizer st = new StringTokenizer(br.readLine()," ");
		   	for(int j = 0; j < 4; j++) {
	    		map[i][j] = Integer.parseInt(st.nextToken());
	    	}
		  }
		  
		  int[] count = new int[3];
		  int tmp = 0;
		  int c=0;
		  for(int i = 0 ; i <3 ; i ++) {
			   	for(int j = 0; j < 4; j++) {
		    		//System.out.print(map[i][j]+" ");
		    		c++;
		    		if(map[i][j]==0) {
		    		tmp++;
		    		}
		    		}
		    		if(0==(c%4)) {
		    			if(tmp==0) {
			    			System.out.println("E");
		    			}else if(tmp==1) {
			    			System.out.println("A");
		    			}else if(tmp==2) {
			    			System.out.println("B");
		    			}else if(tmp==3) {
			    			System.out.println("C");
		    			}else if(tmp==4) {
			    			System.out.println("D");
		    			}
		    			
		    			tmp=0;		    			
			   	}
			  }
		  
		//System.out.println(map[3][2]);

	}
}
