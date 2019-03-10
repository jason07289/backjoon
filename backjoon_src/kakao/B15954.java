package kakao;

import java.util.Arrays;
import java.util.Scanner;

public class B15954 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();//k°³¾¿ ²÷¾î¼­
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
//		for(int i=0; i<n; i++) {
//			System.out.println(arr[i]);
//		}
		int[] m=new int[n+1-k];
		double[] result=new double[n+1-k];
		int[] arr2 = new int[n+1-k];
		double result2=100;
		Arrays.fill(arr2, 0);
		
		
		for(int i=0; i+k<n+1; i++) {
			for(int j=0; j<k; j++) {
			arr2[i]=arr2[i]+arr[j+i];

			}
		}
		for(int i=0; i<k; i++) {
			m[i]=arr2[i] / k;
		}
		for(int i=0; i<k; i++) {
			for(int j=0; j<k; j++) {
			result[i]=result[i]+(int) Math.pow(arr[j]-m[i], 2);
			}
		}
		for(int i=0; i<k; i++) {
			result[i]=Math.sqrt(result[i]/k);
		}
		for(int i=0; i<result.length; i++) {
			if(result2>result[i]) {
				result2=result[i];
			}
			
		}
		//k++;
		
		
		
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("==========");
		for(int i=0; i<n+1-k; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("==========");
		for(int i=0; i<k; i++) {
			System.out.println(m[i]);
		}
		System.out.println("==========");
		
		for(int i=0; i<k; i++) {
			System.out.println(result[i]);
		}
		System.out.println("==========");
		System.out.println(result2);
	}
}
