package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2178 {
    static int[][] map= new int[100][100];
    static boolean[][] search =new boolean[100][100];
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};//dx,dy로 좌표 이동
    static int n,m;
	public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer s = new StringTokenizer(BR.readLine()," ");
    	n = Integer.parseInt(s.nextToken());
    	m = Integer.parseInt(s.nextToken());
    	
    	
    	for(int i =0; i<n; i++) {			
			String str= BR.readLine();
				for(int j=0; j<m; j++) {
					map[i][j]=(int) (str.charAt(j)-'0');
				}
			
		}
    	bfs(0,0);
    	System.out.println(map[n-1][m-1]);
    	
    	for(int i=0; i<n; i++) {
    		for(int j=0; j<m; j++) {
				System.out.print(map[i][j]);
				if(m-1==j) {
					System.out.println();
				}
    		}
    	}
    	
    	
    }
	public static void bfs(int x, int y) {
		Queue<Integer> qx= new LinkedList<Integer>();
		Queue<Integer> qy= new LinkedList<Integer>();
		
		qx.add(x);
		qy.add(y);
		
		while(!qx.isEmpty() && !qy.isEmpty()) {
			x = qx.poll();
			y = qy.poll();
			search[x][y] = true;
			for(int i=0; i<4; i++) {//여기서 동서남북 검색
				int nx =x+dx[i];
				int ny =y+dy[i];
				if(nx>=0 && ny>=0&&nx<n&&ny<m) {
					if(map[nx][ny]==1 &&search[nx][ny]==false) {
						qx.add(nx);
						qy.add(ny);
						search[nx][ny]=true;
						map[nx][ny]=map[x][y]+1;
					}
				}
			}
		}
	}
	
}
