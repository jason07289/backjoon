package Simul;

import java.util.Scanner;

public class B1057 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		int tmp;
		if(a>b) {
			tmp=b;
			b=a;
			a=tmp;
		}//이제 a는 항상 작은수
		int round =0;
		int tmp2;
		while(true) {
			round++;
			if((a%2==1)&&(a+1==b)) {
				break;
			}else {
				a=tournament(a);
				b=tournament(b);
			}									
		}
		System.out.println(round);
		
    }
    public static int tournament(int a) {
    	if(a%2==1) {
    		a=(a+1)/2;
    	}else {
    		a=a/2;
    	}
    	
    	
		return a;
    	
    }
    

}
