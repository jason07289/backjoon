package kakao;

import java.io.IOException;
import java.util.Scanner;

public class B15997 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String[] nameSet= new String[4];//나라 이름이 들어간다.
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			nameSet[i] = sc.next();
		}
		for(int i=0; i<4; i++) {
			System.out.println(nameSet[i]);
		}
		String[] inputSet1= new String[5];
		for(int i=0; i<5; i++) {
			inputSet1[i]= sc.next();
		}
		String[] inputSet2= new String[5];
		for(int i=0; i<5; i++) {
			inputSet2[i]= sc.next();
		}
		String[] inputSet3= new String[5];
		for(int i=0; i<5; i++) {
			inputSet3[i]= sc.next();
		}
		String[] inputSet4= new String[5];
		for(int i=0; i<5; i++) {
			inputSet4[i]= sc.next();
		}
		String[] inputSet5= new String[5];
		for(int i=0; i<5; i++) {
			inputSet5[i]= sc.next();
		}
		String[] inputSet6= new String[5];
		for(int i=0; i<5; i++) {
			inputSet6[i]= sc.next();
		}
		
		
		
		for(int i=0; i<5; i++) {
			System.out.println(inputSet1[i]);
		}
		
	}
}
