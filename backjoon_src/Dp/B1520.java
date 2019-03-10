package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B1520 {
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, -1, 0, 1 };
	static int[][] map, dp;
	static int m, n;
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    m = sc.nextInt();
	    n = sc.nextInt();
	    map = new int[m][n];
	    dp = new int[m][n];
	 
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            map[i][j] = sc.nextInt();
	            dp[i][j] = -1;
	        }
	    }
	    System.out.println(dfs(m - 1, n - 1));
	}
	 
	public static int dfs(int y, int x) {
	    if (y == 0 && x == 0) {
	        return 1;
	    }
	 
	    if (dp[y][x] == -1) {
	        dp[y][x] = 0;
	        for (int i = 0; i < 4; i++) {
	            int nx = dx[i] + x;
	            int ny = dy[i] + y;
	 
	            if (0 <= nx && nx < n && 0 <= ny && ny < m) {
	                if (map[y][x] < map[ny][nx]) {
	                    dp[y][x] += dfs(ny, nx);
	                }
	            }
	        }
	    }
	    return dp[y][x];
	}



}
