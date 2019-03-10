package Samsung;

import java.util.Scanner;

public class B12100 {
	static int board[][];
	static int n;
	static int cnt;
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	n =sc.nextInt();
    	board=new int[n+2][n+2];
    	for(int i=0; i<n;i++) {
    		for(int j=0; j<n; j++) {
    			board[i+1][j+1]=sc.nextInt();
    		}
    	}
    	for(int x=0; x<n+2;x++) {
			
    		for(int y=0; y<n+2; y++) {
    			System.out.print(board[x][y]+" ");
    			if(y==n+1) {
    				System.out.println();
    			}
    		}
    	}
    	while(cnt<5) {
    		moveBlock();
    	}
    	
    	System.out.println(maxBlock());
    
    }
    public static void moveBlock() {
    	boolean move = false;
    	for(int i=0; i<n+2; i++) {
    		for(int j=0; j<n+2; j++) {//왼쪽이동
    			if(j!=0&&j!=n+1) {
    				if(board[i][j]==board[i][j+1]) {
    					board[i][j]+=board[i][j+1];
    					for(int x=2; x<n+1; x++) {
    						board[i][x]=board[i][x+1];
    					}
    					move=true;
    				}
    					
    			}
    		}
    	}
    	if(move==true) {
//    		System.out.println("case1");
//        	for(int x=0; x<n+2;x++) {
//    			
//        		for(int y=0; y<n+2; y++) {
//        			System.out.print(board[x][y]+" ");
//        			if(y==n+1) {
//        				System.out.println();
//        			}
//        		}
//        	}
    		cnt++;
    		move = false;
    		return;
    	}
    	for(int i=0; i<n+2; i++) {
    		for(int j=0; j<n+2; j++) {//오른쪽
    			if(i!=0&&i!=n+1) {
    				if(board[i][j]==board[i][j-1]) {
    					board[i][j]+=board[i][j-1];
    					for(int x=n; x>2; x--) {
    						board[i][x]=board[i][x-1];
    					}
    					move=true;
    				}
    					
    			}
    		}
    	}
    	if(move==true) {
    		System.out.println("case2");
        	for(int x=0; x<n+2;x++) {
    			
        		for(int y=0; y<n+2; y++) {
        			System.out.print(board[x][y]+" ");
        			if(y==n+1) {
        				System.out.println();
        			}
        		}
        	}
    		cnt++;
    		move = false;
    		return;
    	}
    	for(int j=0; j<n+2; j++) {
    		for(int i=0; i<n+2; i++) {//하
    			if(i!=0&&i!=n+1) {
    				if(board[i][j]==board[i+1][j]) {
    					board[i][j]+=board[i+1][j];
    					for(int x=2; x<n+1; x++) {
    						board[x][j]=board[x+1][j];
    					}
    					move=true;
    				}
    					
    			}
    		}
    	}
    	if(move==true) {
    		System.out.println("case3");
        	for(int x=0; x<n+2;x++) {
    			
        		for(int y=0; y<n+2; y++) {
        			System.out.print(board[x][y]+" ");
        			if(y==n+1) {
        				System.out.println();
        			}
        		}
        	}
    		cnt++;
    		move = false;
    		return;
    	}
    	for(int j=0; j<n+2; j++) {
    		for(int i=0; i<n+2; i++) {//상
    			if(i!=0&&i!=n+1) {
    				if(board[i][j]==board[i-1][j]) {
    					board[i][j]+=board[i-1][j];
    					for(int x=2; x<n+1; x++) {
    						board[x][j]=board[x-1][j];
    					}
    					move=true;
    				}
    					
    			}
    		}
    	}
    	if(move==true) {
    		System.out.println("case4");
        	for(int x=0; x<n+2;x++) {
    			
        		for(int y=0; y<n+2; y++) {
        			System.out.print(board[x][y]+" ");
        			if(y==n+1) {
        				System.out.println();
        			}
        		}
        	}
    		cnt++;
    		move = false;
    		return;
    	}
    }
    
    public static int maxBlock() {
    	int result=0;
    	for(int i=1; i<n+2;i++) {
    		for(int j=1; j<n+2; j++) {
    			
    			if(board[i][j]>result) {
    				result=board[i][j];
    			}
    		}
    	}
    	
    	return result;
    }
}
