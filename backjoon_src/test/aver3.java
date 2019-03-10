package test;
import java.util.Scanner;

public class aver3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ca =new int[5];
		
		for (int i =0; i<5; i++) {
			ca[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i<5; i++) {
			if(ca[i]<40) {
				ca[i]=40;
			}
		}
		int sum=0;
		for (int i =0; i<ca.length; i++) {
			sum+=ca[i];
		}
		System.out.println(sum/5);
	}
}
