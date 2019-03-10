package bruteForce;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class B2309 {
	static int dwarf[] = new int [9];
    static int harp;
	static int realdwarf[] = new int [9];

	public static void main(String[] args) throws IOException {
    	Scanner sc=new Scanner(System.in);
    	for(int i =0; i<9; i++) {
    		dwarf[i]=sc.nextInt();
    	}
    	
    	
    	Arrays.sort(dwarf);
    	findDwarf();
    	
    	for(int i =0; i<9; i++) {   		
    		if(realdwarf[i]!=-1)
    		System.out.println(realdwarf[i]);
    	}
    }
    
    public static int findDwarf() {
    	for(int i=0; i<9; i++) {
    		harp+=dwarf[i];
    	}
    	
    	for(int i=0; i<9; i++) {
    		realdwarf[i]=dwarf[i];
    	}
    	int num=harp-100;
    	for(int i=0; i<9; i++) {
    		for(int j=0; j<9; j++) {
    			
    			if(dwarf[i]!=dwarf[j]&&(dwarf[i]+dwarf[j]==num)) {
    				realdwarf[i]=-1;
    				realdwarf[j]=-1;    
    				
    				
    				return 0;
    			}
    			
    		}
    		
    	}
		return -1;
    	
    
    	
    }
}
