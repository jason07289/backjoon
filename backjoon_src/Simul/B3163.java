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
	    	n=sc.nextInt();//N������ ����	    	
	    	l=sc.nextInt();//������ ����
	    	k=sc.nextInt();//N��° ����
	    	ant=new int [n][2];
	    	//3���� ��� Ȥ�� �ð��� ���
	    	for(int j=0; j<n; j++) {
	    		ant[j][0] = sc.nextInt();//��ġ
	    		ant[j][1] = sc.nextInt();//����
	    		//ant[j][2] = -1;
	    	}
	    	//�ڷ��� �ϼ�	  
	    	//System.out.println();
//		    System.out.println("==============�ڷ��� ���================");
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
//	    	System.out.println("==============ant�� �������� �ð�================");
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
    		tmpant[j][0] = ant[j][0];//��ġ
    		tmpant[j][1] = ant[j][1];//����(ID)
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
    				
    				
    			}else if(tmpant[i][1]>0) {//ant�� ������ ����� ���
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
