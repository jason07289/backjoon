package Simul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B10219 {
	static char[][] gril;
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	    

    	int t = Integer.parseInt(BR.readLine());
    	for(int k=0; k<t; k++) {
    	StringTokenizer s = new StringTokenizer(BR.readLine()," ");
	   	//s = new StringTokenizer(BR.readLine()," ");
	   	int h=Integer.parseInt(s.nextToken());
	   	int w=Integer.parseInt(s.nextToken());
	    
	   	
	   	//System.out.println(h);
	   	//System.out.println(w);
	    gril = new char[h][w];
		
		for(int i =0; i<h; i++) {			
			String str= BR.readLine();
				for(int j=0; j<w; j++) {
					gril[i][j]=(char) (str.charAt(j));
				}
			
		}
    	
		
		
    	for(int i=h-1; i>=0; i--) {
    		for(int j=0; j<w; j++) {
    			System.out.print(gril[i][j]);
    			if(j==w-1) {
    				System.out.println();
    			}
    		}
    	}
		
    }
    }
}
