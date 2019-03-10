package shortestPath;

import java.util.Scanner;

public class B11657 {
	static int n;
	static int[][] map;
	static int m;
	static int[] visit;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		map=new int[n][n];
		visit=new int[n];
		m=sc.nextInt();
		
		
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if((map[a-1][b-1]!=0)&&c>0) {
				if(map[a-1][b-1]>c) {
					map[a-1][b-1]=c;
				}
			}else {
			map[a-1][b-1] = c;		
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(map[i][j]+" ");
				if(j==n-1) {
					System.out.println();
				}
			}
		}
		
		
		
	}
}
