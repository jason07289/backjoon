
package kakao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bsubmit15955 {
	static int[] dx;
	static int[] dy;
	
	
	static int[] tmp = new int[2];
	static int[] target = new int[2];
	static int n;

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		dx = new int[n+1];
		dy = new int[n+1];
		int q = sc.nextInt();
		// st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			
			dx[i] = sc.nextInt();
			dy[i] = sc.nextInt();

		}
		// int[] dx= {1,3,4,6,3};
		// int[] dy= {2,2,4,2,9};
		boolean result = false;
		int[][] qqq = new int[q][3];
		for (int i = 0; i < q; i++) {
			for(int j=0; j<3; j++) {
				qqq[i][j]=sc.nextInt();
			}
		}
		for (int j = 0; j < q; j++) {
			result = game(qqq[j][0], qqq[j][1], qqq[j][2]);
			if (result == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");

		}		
		}
//		
//		for (int i = 0; i < q; i++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			int x = sc.nextInt();
//			result = game(a, b, x);
//			if (result == true) {
//				System.out.println("YES");
//			} else {
//				System.out.println("NO");
//
//			}
//		}
	}

	public static boolean game(int a, int b, int hp) throws InterruptedException {
		
		tmp[0]=dx[a-1];
		tmp[1]=dy[a-1];
		
		target[0]=dx[b-1];
		target[1]=dy[b-1];
		
		while(true) {
			if(hp<distance(tmp, target)) {//한번 이동하면 tmp에 대해 새로 돌려야함
				

				booster(tmp, dx, dy);			
			}else {// 부스터를 쓰고 혹은 그냥... hp안에 그 거리가 있다면 이동 혹은 종료를 시켜야함.

				return true;				
			}
			
			if(hp<distance(tmp, target)&&(tmp[0]!=target[0])&&(tmp[1]!=target[1])){

				return false;
			}
			
		}//while괄호

	}
	
	public static int distance(int tmp[], int target[]) {
		int x = (int) Math.pow(tmp[0]-target[0],2);
		int y = (int) Math.pow(tmp[1]-target[1],2);
		int d= (int) Math.sqrt(x+y);

		return d;
		
	}
	public static int[] booster(int[] tmp,int[] dx, int[] dy) throws InterruptedException {
		boolean[] boostSet= new boolean[n+1];
		for(int i = 0; i<n; i++) {
			boostSet[n]=false;
		}
		for(int i=0; i<n; i++) {
			if(tmp[0]==dx[i]&&tmp[1]!=dy[i]) { //x좌표만 같을 경우
				boostSet[i] =true;
			}else if(tmp[1]==dy[i]&&tmp[0]!=dx[i]){// y좌표만 같을 경우
				boostSet[i] =true;
			}
		}
		
		int tmpD=Integer.MAX_VALUE;
		int[] tmparr = new int[2];
		for(int i=0; i<n; i++) {
			if(boostSet[i]==true) {
				tmparr[0]= dx[i];
				tmparr[1]= dy[i];
				
				if(distance(tmparr, target)<tmpD) {
					tmp[0]=dx[i];
					tmp[1]=dy[i];
					tmpD=distance(tmparr, target);
				}
				
			}
		}
		
		return tmp;
		
		
	}
}
