package prac;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String input2 = "";
		input2 =input.toUpperCase();		//System.out.println(input2);//�켱 �빮�� ������ �Ϸ�
		char output =' ';
		int max =0;
		int[] count = new int[26];
		for(int i=0; i<input2.length(); i++) {
			count[input2.charAt(i)-65]++;//�� ������� �κ�		
		}//�켱 ���ĺ� ī��Ʈ�� �迭 ������ش�.
		for(int i=0; i<count.length; i++) {
			if(count[i]>max) {
				max = count[i];
				output=(char)(i+65);
			}else if(count[i]==max) {
				output='?';
			}
		}		
		System.out.println(output);		
	}
}