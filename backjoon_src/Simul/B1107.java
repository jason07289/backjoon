package Simul;

import java.util.Scanner;

public class B1107 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int x =sc.nextInt();
	int[] button = new int[x];
	for(int i=0; i<x; i++) {
		button[i] = sc.nextInt();
	}
	
    int click = 1;
    int tmpnum=num;
    while(true) {
    	if(num<10) {
    		click=1;
    		break;
    	}else {
    	click++;
    	if(tmpnum/10<10) {
    		break;
    	}
    	tmpnum=tmpnum/10;
    
    	}
    }
    //System.out.println(click);
    
    
    
    
    }
}
