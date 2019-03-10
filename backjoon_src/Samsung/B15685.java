package Samsung;

import java.util.Scanner;

public class B15685 {
	static boolean[][] map= new boolean[101][101];  
	static int generation[]=new int[1024];
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[][] point = new int[n][4];
    	for(int i= 0; i<n; i++) {
    		point[i][0]= sc.nextInt();
    		point[i][1]= sc.nextInt();
    		point[i][2]= sc.nextInt();
    		point[i][3]= sc.nextInt();

    	}
    }
    
    
    
    
}
