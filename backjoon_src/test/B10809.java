package test;
import java.util.Arrays;
import java.util.Scanner;
public class B10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int[] al = new int[26];
		Arrays.fill(al, -1);
		
		char[] in = s.toCharArray();
		for(int i =0; i<in.length; ++i) {
			int tmp = in[i]-97;
			if(al[tmp]==-1)
			{al[tmp]=i;
			}
		}
		
		for(int i =0; i<al.length; ++i) {
			System.out.print(al[i]+" ");
		}
		
		
	}
}
