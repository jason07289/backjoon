package test;

import java.util.Scanner;

public class B2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();//테스트케이스를 몇개?
		int k[] = new int[tc];
		int n[] = new int[tc];
		int ho[][] = new int[15][14];		
		int sum=0;//배열안에 넣을 값을 계산하기 위한 sum
		for(int i=0; i<tc; i++) {
			 k[i]=sc.nextInt();
			 n[i]=sc.nextInt();
		}
		
		for(int i=0; i<14; i++) {//0층을 우선 만들어준다.
			ho[0][i] = i+1;
		}
		for(int x=1; x<15; x++){//그다음 1층부터 연산시작
			
			for(int y=0; y<14; y++){//2차원 배열 ㅇㅇ
				sum = 0;
				for(int z=0; z<=y; z++){//y, 즉 호(n)수 만큼 증가시키고
					sum = sum + ho[x-1][z]; //x-1층의 놈들을 호수만큼 더함
					} 
				ho[x][y] = sum;
			}
			
		}//우선 아파트 호수는 다 채운건가?
		
		for(int i=0; i<tc; i++) {
			System.out.println(ho[k[i]][n[i]-1]);
			
		}
//		for(int i = 0 ; i<15;i++){
//			for(int j = 0; j<14; j++){
//				System.out.printf("%9d"+" ",ho[i][j]);
//			}
//			System.out.println();
//		} //아파트 test하는 코드
		  //층은 용량이 15여야함 왜냐면 0층부터니까
	}
	
}

