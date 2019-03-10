package treeuse;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class B1167 {
	static int[] search;
	static int[][] DFS;
    public static void main(String[] args) throws IOException{
    	Scanner sc =new Scanner(System.in);
    	int n = sc.nextInt();
    	search = new int[100001];
    	DFS = new int[100001][100001];
    	
    	for(int i=0; i<n; i++) {
    		int x= sc.nextInt();
    		while(true) {
    			int y = sc.nextInt();
    			if(y != -1) {
    			DFS[x][y]=sc.nextInt();
    			}else {
    				break;
    			}
    		}
    	}
    	System.out.println("x");
//    	for(int i=0; i<10; i++) {
//    		for(int j=0; j<10; j++) {
//    			System.out.print(DFS[i][j]+" ");
//    			if(j==9) {
//    				System.out.println();
//    			}
//    		}
//    	}
    }
    
    public static void DFS(int n) {
    	search[n] = 1;
    	for(int i=1; i<=n; i++) {
    		int tmp[] = new int[n];
    		Arrays.fill(tmp, 0);
    		if(search[i] != 1 && DFS[n][i]>0) {
    			
    			tmp[i]=DFS[n][i];
    		}
    		
    	}
    }
}
