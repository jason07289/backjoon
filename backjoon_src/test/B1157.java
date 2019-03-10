package test;

import java.util.Scanner;

public class B1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String input2 = "";
		input2 =input.toUpperCase();		//System.out.println(input2);//우선 대문자 변경은 완료
		char output =' ';
		int max =0;
		int[] count = new int[26];
		for(int i=0; i<input2.length(); i++) {
			count[input2.charAt(i)-65]++;//젤 어려웠던 부분		
		}//우선 알파벳 카운트할 배열 만들어준다.
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
