package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2293 {
	static int[] memo = new int[10001];
	static int[] coin = new int[100];
	static int n;
	static int point;

	// static int dpcase=0;
	public static int func(int point, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= point; j++) {
				if (j >= coin[i]) {
					memo[j] = memo[j] + memo[j - coin[i]];
				}
			}
		}

		return memo[point];

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int point = Integer.parseInt(st.nextToken());
		memo[0] = 1;

		for (int i = 0; i < n; i++) {
			coin[i] = Integer.parseInt(br.readLine().trim());
		}
//        for(int i=0; i<n; i++) {
//        	System.out.print(coin[i]+" ");
//        }
		System.out.println(func(point, n));

	}
}
