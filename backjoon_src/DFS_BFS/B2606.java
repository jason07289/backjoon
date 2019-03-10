package DFS_BFS;
import java.util.*;
public class B2606 {
	static int[] search;
	static int[][] DFS;
	static int cnt;
	static int linkNum;
	static int comNum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		comNum =sc.nextInt();
		DFS=new int [comNum+1][comNum+1];
		search = new int[comNum+1];
		linkNum = sc. nextInt();
		for(int i=0; i<linkNum; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			DFS[x][y]=1;
			DFS[y][x]=1;
		}	
//		for(int i=0; i<comNum+1; i++){
//			for(int j=0; j<comNum+1; j++) {
//				System.out.print(DFS[i][j]+" ");
//				if(j==comNum) {
//					System.out.println();
//				}
//			}
//		}
		
		Arrays.fill(search, 0);
		comCount(1);
		System.out.println(cnt);
	}
	
	
	public static void comCount(int start) {
		search[start] = 1;
    	for(int i=1; i<=comNum; i++) {   
    		
    		if(search[i] != 1 && DFS[start][i]==1) {
    			
    			comCount(i);    	
    			cnt++;
    		} 
    		
    	}
    	
	}
}
