package Simul;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BBB3163 {
	static int n;
	static int k;
	static int l;
	static int ant[][];
	static int resultID=Integer.MAX_VALUE;
	//static int time = 0;
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
	    
	    for(int i=0; i<t; i++) {
	    	n=sc.nextInt();//N������ ����	    	
	    	l=sc.nextInt();//������ ����
	    	k=sc.nextInt();//N��° ����
	    	ant=new int [n][3];
	    	//3���� ��� Ȥ�� �ð��� ���
	    	for(int j=0; j<n; j++) {
	    		ant[j][0] = sc.nextInt();//��ġ
	    		ant[j][1] = sc.nextInt();//����
	    		//ant[j][2] = -1;
	    	}
	    	//�ڷ��� �ϼ�	  
	    	//System.out.println();
		   // System.out.println("==============�ڷ��� ���================");

//	    	for(int j=0; j<n; j++) {
//		    	System.out.print(ant[j][0]+" ");
//		    	System.out.print(ant[j][1]+" ");
//		    	System.out.println(ant[j][2]);
//		    }
	    	//time=0;
	    	antDrop2();
	    	
	    	//System.out.println("==============ant�� �������� �ð�================");
//	    	for(int j=0; j<n; j++) {
//	    		System.out.println(ant[j][0]+" "+ant[j][1]+" "+ant[j][2]);
//	    	}
	    	int minval=Integer.MAX_VALUE;
	    	int count=0;
	    	//int resultID=Integer.MAX_VALUE;
	    	
	    	while(true) {
    			//System.out.println("while��while��while��while��while��");
	    		count++;
	    		for(int j=0; j<n; j++) {
	    			if(minval>ant[j][2]) {
	    				minval=ant[j][2];
	    			}	    			
	    		}
	    		for(int j=0; j<n; j++) {
	    			
	    				if(minval==ant[j][2]) {
	    	    			//System.out.println("for��");

	    	    			//System.out.println(minval);

	    					ant[j][2]=ant[j][2]+l;
	    					minval=ant[j][2];
	    				}
	    				    			
	    		}
	    		
	    		if(count==k-1) {
	    			
	    			for(int j=0; j<n; j++) {
		    			if(minval>ant[j][2]) {
		    				minval=ant[j][2];
		    			}	    			
		    		}
	    			//System.out.println(minval);
		    		for(int j=0; j<n; j++) {
		    			
		    				if(minval==ant[j][2]) {
		    					if(ant[j][1]<resultID) {
		    					resultID= ant[j][1];
		    					
		    					}
		    				}
		    				    			
		    		}
		    		break;
	    		}
	    		
	    	}
	    	//System.out.println("==============gdsgsgsggsggsgggsg��================");

	    System.out.println(resultID);
	    resultID=Integer.MAX_VALUE;
	    minval=Integer.MAX_VALUE;
	    }   
    }
    
    
    public static void antDrop2() {
//    	int tmpant[][] =new int[n][3];//3���� distance�� �־��
    	int change= 0;   	
    	for(int i=0; i<n; i++) {
    		if(ant[i][1]>0) {
    			ant[i][2]=l+1-ant[i][0];
    		}else {
    			ant[i][2]=ant[i][0]+1;  //distance�� �������,, ���� �ε����� �ٲ��ָ� �ɵ�...
    		}
    	}
   	
    	for(int i=0; i<n; i++) {
    		if(ant[i][1]>0) {
    			if(i !=n-1) {
    				if(ant[i+1][1]<0) {
    					change=ant[i][1];
    					ant[i][1]=ant[i+1][1];
    					ant[i+1][1]=change;
    				}
    			}
    		}else {//���� ������ ������
    			if(i !=0) {
    				if(ant[i-1][1]>0) {
    					change=ant[i][1];
    					ant[i][1]=ant[i-1][1];
    					ant[i-1][1]=change;
    				}
    			}
    		}
    	}

    }
   
}
