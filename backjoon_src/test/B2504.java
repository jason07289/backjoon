package test;

import java.util.Scanner;
import java.util.Stack;

public class B2504 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Stack<String> s = new Stack<>();
	
		
		if(func(input)==false) {
			System.out.println(0);
		}else {
			for(int i=0; i<input.length(); i++) {
				
			}
		}
		
		
		
		
		
		//System.out.println(func(input));
		
		
	}
	public static boolean func(String x ) {
		int cnt=0;
		for(int i=0; i<x.length();i++) {
			switch (x.charAt(i)) {
			case '(':
				cnt++;
				break;
			case '[':
				cnt++;
				break;
			case ')':
				cnt--;
			case ']':
				cnt--;
				break;	
			}
		}
		if(cnt !=0)
			return true;
		else 
			return false;		
	}
	
}
