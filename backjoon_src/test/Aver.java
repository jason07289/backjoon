package test;

import java.util.Arrays;
import java.util.Scanner;

public class Aver {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		float[] arr = new float[n];
		for (int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		sc.close();
		float result = 0;
		Arrays.sort(arr);
		//System.out.println(arr[n-1]);
		float max = arr[n-1];
		


		for (int i=0; i<arr.length; i++) {
			arr[i]= arr[i]/max*100;
		}
		
		for (int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		System.out.println(result/n);

		
    }
}