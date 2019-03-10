package test;

import java.util.Scanner;

public class B6064 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int m[] = new int[tc];
		int n[] = new int[tc];
		int x[] = new int[tc];
		int y[] = new int[tc];

		for(int i=0; i<tc; i++) {
			 m[i]=sc.nextInt();
			 n[i]=sc.nextInt();
			 x[i]=sc.nextInt();
			 y[i]=sc.nextInt();
		}
		for(int i=0; i<tc; i++) {
			ka(m[i], n[i], x[i], y[i]);
		}
						
		//System.out.println(gcd(a,b));
		//System.out.println(lcm(a,b));
	}
	
	static void ka(int m, int n, int x, int y) {	
		int lcmNum =lcm(m,n);
		while(x!=y&&x<=lcmNum) {
			if(x<y) {
				x+=m;
			}else {
				y+=n;
			}
		}
		if(x!=y) { 
			System.out.println("-1");
		}else {
			System.out.println(x);
		}
		
		
	}
	
	
	static int gcd(int a, int b) {
		int tmp;
		while(a !=0) {
			if(a<b) {
				tmp=a;
				a=b;
				b=tmp; //a가 항상 클 수 있게
			}
			a=a%b;
		}
		return b;
	}
	
	static int lcm(int a, int b) {
		return a*b/gcd(a,b);
	}
}
