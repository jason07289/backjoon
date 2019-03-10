package bruteForce;

import java.io.IOException;
import java.util.Scanner;

public class B7568 {
	static int[] x;//키
	static int[] y;//몸무게
	static int[] z;//등수
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		x= new int[n];
		y= new int[n];
		z= new int[n];
		for (int i=0; i<n; i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
	
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if((x[i]>x[j])&&(y[i]>y[j])) {
					z[j]++;
				}
			}
		}
		for(int i=0; i<n; i++) {
			System.out.print((z[i]+1)+" ");
		}
		
		
	}
}
