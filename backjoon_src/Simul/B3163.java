package Simul;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B3163 {
	static int n;
	static int k;
	static int l;
	static int ant[][];
	static int time = 0;
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
	    
	    for(int i=0; i<2; i++) {
	    	n=sc.nextInt();//N마리의 개미	    	
	    	l=sc.nextInt();//막대의 길이
	    	k=sc.nextInt();//N번째 개미
	    	ant=new int [n][2];
	    	//3번엔 등수 혹은 시간을 기록
	    	for(int j=0; j<n; j++) {
	    		ant[j][0] = sc.nextInt();//위치
	    		ant[j][1] = sc.nextInt();//방향
	    		//ant[j][2] = -1;
	    	}
	    	//자료형 완성	  
	    	//System.out.println();
//		    System.out.println("==============자료형 출력================");
//
//	    	for(int j=0; j<n; j++) {
//		    	System.out.print(ant[j][0]+" ");
//		    	System.out.print(ant[j][1]+" ");
//		    	System.out.println(ant[j][2]);
//		    }
	    	//time=0;
	    	antDrop();
	    	k=0;
	    	l=0;
	    	n=0;
//	    	System.out.println("==============ant가 빠져나온 시간================");
//	    	for(int j=0; j<n; j++) {
//	    		System.out.println(ant[j][0]+" "+ant[j][1]+" "+ant[j][2]);
//	    	}
	    	
	    	
	    	
	    }
	    
	    
	    
    
    }
    public static void antDrop() {
    	int tmpant[][] =new int[n][2];
    	int change = 0 ;
    	int checkUp=0;
    	for(int j=0; j<n; j++) {
    		tmpant[j][0] = ant[j][0];//위치
    		tmpant[j][1] = ant[j][1];//방향(ID)
    	}
    	while(true) {
    		//time++;
    		for(int i=0; i<n; i++) {
				if(tmpant[i][1] != 0 || tmpant[i][1] != l+1 ) {

    			if(tmpant[i][1]<0) {   				
    				tmpant[i][0]=tmpant[i][0]-1;
    				if(i!=0) {
    					if(tmpant[i][0]==tmpant[i-1][0]) {
    						change=ant[i][1];
    						tmpant[i][1]=tmpant[i-1][1];
    						tmpant[i-1][1]=change;
    					}
    				}
    				if(tmpant[i][0]==0) {
    					//ant[i][2]=time;
    					checkUp++;
    					if(checkUp==k) {

    						System.out.println(ant[i][1]);
    						break;
    					}
    					
    				}
    				
    				
    			}else if(tmpant[i][1]>0) {//ant의 방향이 양수일 경우
    				tmpant[i][0]=tmpant[i][0]+1;
    				if(i!=n-1) {
    					if(tmpant[i][0]==tmpant[i+1][0]) {
    						change=tmpant[i][1];
    						tmpant[i][1]=tmpant[i+1][1];
    						tmpant[i+1][1]=change;
    					}
    				}
    				if(tmpant[i][0]==l+1){
    					//ant[i][2]=time;
    					checkUp++;
    					if(checkUp==k) {

    						System.out.println(ant[i][1]);
    						break;
    					}
    				}
    				
    			
    		}
    		}
				
    		}
    		if(checkUp==k) {
    			break;
    		}
	    	
    	}
    }
}
