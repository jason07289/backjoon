package Simul;

import java.util.Scanner;

public class B1024 {
	static int n;
	static int l;
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 n = sc.nextInt();
    	 l = sc. nextInt();
    	 
    	 int x=find();
    	 if(x==-1) {
    		 System.out.println(-1);
    	 }
    }
    
    public static int find() {  
    	for(int i=l; i<=100; i++) {
    		
    			for(int a=n/i-i; a< n/i+i; a++) {
    				
    				int check=i*(2*a+i-1)/2;//등비가 1인등차수열의 합
    				if(a>=0) {
    				if(check == n) {
    					int x=a;
    					
    					for(int j=0; j<i; j++) {
    						
    						System.out.print(x+" ");
    						x++;
    						
    					}
    					return 0;
    				}
    			
    			}
    			
    			}
    		}
    		
    	
    	return -1;	
    	
    	
    }
}
