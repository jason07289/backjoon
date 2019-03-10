package Samsung;

import java.util.Scanner;

public class B16234 {
		
	static int n;
	static int l;
	static int r;
	static int[][] A;
	static boolean[][] cA;
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
    	l = sc.nextInt();
    	r = sc.nextInt();
    	
    	A = new int[n][n];
    	cA =new boolean[n][n];
    	for(int i = 0; i<n; i++) {
    		for(int j=0; j<n; j++) {
    			A[i][j]= sc.nextInt();
    		}
    	}
    	for(int i = 0; i<n; i++) {
    		for(int j=0; j<n; j++) {
    			
    			System.out.print(A[i][j]+" ");
    			if(j==n-1) {
        			System.out.println();

    			}
    		}
    	}
    	System.out.println(A[0][0]);
    	System.out.println(A[0][1]);
    	System.out.println(A[1][0]);
    	System.out.println(A[1][1]);
    	move();
    
    }
    
    public static int move2() {
		int a[][] =new int[n*n][n*n];
		
    	
    	return 0;
    	
    }
    public static int move() {
		for(int i= 0; i<n; i++) {
			for(int j=0; j<n; j++) {//cA를 체크해주기 위한 for문
				if(i==0 && j==0) {
					if(l<=Math.abs(A[i][j]-A[i+1][j])&&Math.abs(A[i][j]-A[i+1][j])<=r) {
						cA[i][j]=true;
						cA[i+1][j]=true;
						System.out.println("오류0-1");

					}
					if(l<=Math.abs(A[i][j+1]-A[i][j])&&Math.abs(A[i][j]-A[i][j+1])<=r) {
						cA[i][j]=true;
						cA[i][j+1]=true;
						System.out.println("오류0-2");

					}
				}else if(i==0 && j!=0 && j!=n-1&&i!=n-1) {
					if(l<=Math.abs(A[i][j]-A[i][j+1])&&Math.abs(A[i][j]-A[i][j+1])<=r) {
						cA[i][j]=true;
						cA[i][j+1]=true;
						System.out.println("오류1-1");
					}
					if(l<=Math.abs(A[i][j]-A[i][j-1])&&Math.abs(A[i][j]-A[i][j-1])<=r) {
						cA[i][j]=true;
						cA[i][j-1]=true;
						System.out.println("오류1-2");
					}
					if(l<=Math.abs(A[i][j]-A[i+1][j])&&Math.abs(A[i][j]-A[i+1][j])<=r) {
						cA[i][j]=true;
						cA[i+1][j]=true;
						System.out.println("오류1-3");
					}
				}else if(j==0&& i!=0 && j!=n-1&&i!=n-1) {
					if(l<=Math.abs(A[i][j]-A[i][j+1])&&Math.abs(A[i][j]-A[i][j+1])<=r) {
						cA[i][j]=true;
						cA[i][j+1]=true;
						System.out.println("오류2-1");
					}
					if(l<=Math.abs(A[i-1][j]-A[i][j])&&Math.abs(A[i][j]-A[i-1][j])<=r) {
						cA[i][j]=true;
						cA[i-1][j]=true;
						System.out.println("오류2-2");
					}
					if(l<=Math.abs(A[i+1][j]-A[i][j])&&Math.abs(A[i][j]-A[i+1][j])<=r) {
						cA[i][j]=true;
						cA[i+1][j]=true;
						System.out.println("오류2-3");
					}
				}else if(i==n-1&&j==n-1) {
					if(l<=Math.abs(A[i][j]-A[i-1][j])&&Math.abs(A[i][j]-A[i-1][j])<=r) {
						cA[i][j]=true;
						cA[i-1][j]=true;
						System.out.println("오류3-1");
					}
					if(l<=Math.abs(A[i][j-1]-A[i][j])&&Math.abs(A[i][j]-A[i][j-1])<=r) {
						cA[i][j]=true;
						cA[i][j-1]=true;
						System.out.println("오류3-2");
					}
				}else if(i!=0 && j !=0 && i==n-1&&j==n-1){
					if(l<=Math.abs(A[i][j]-A[i][j+1])&&Math.abs(A[i][j]-A[i][j+1])<=r) {
						cA[i][j]=true;
						cA[i][j+1]=true;
						System.out.println("오류4-1");
					}
					if(l<=Math.abs(A[i-1][j]-A[i][j])&&Math.abs(A[i][j]-A[i-1][j])<=r) {
						cA[i][j]=true;
						cA[i-1][j]=true;
						System.out.println("오류4-2");
					}
					if(l<=Math.abs(A[i+1][j]-A[i][j])&&Math.abs(A[i][j]-A[i+1][j])<=r) {
						cA[i][j]=true;
						cA[i+1][j]=true;
						System.out.println("오류4-3");
					}
					if(l<=Math.abs(A[i][j-1]-A[i][j])&&Math.abs(A[i][j]-A[i][j-1])<=r) {
						cA[i][j]=true;
						cA[i][j-1]=true;
						System.out.println("오류4-4");
					}
				}else if(i==0 && j==n-1) {
					if(l<=Math.abs(A[i][j-1]-A[i][j])&&Math.abs(A[i][j]-A[i][j-1])<=r) {
						cA[i][j]=true;
						cA[i][j-1]=true;
						System.out.println("[0][1]");
					}
					if(l<=Math.abs(A[i+1][j]-A[i][j])&&Math.abs(A[i][j]-A[i+1][j])<=r) {
						cA[i][j]=true;
						cA[i+1][j]=true;
						System.out.println("[0][1]");
					}
					
				}else if(i==n-1 && j==0) {
					if(l<=Math.abs(A[i-1][j]-A[i][j])&&Math.abs(A[i][j]-A[i-1][j])<=r) {
						cA[i][j]=true;
						cA[i-1][j]=true;
						System.out.println("[1][0]");
					}
					if(l<=Math.abs(A[i][j]-A[i][j+1])&&Math.abs(A[i][j]-A[i][j+1])<=r) {
						cA[i][j]=true;
						cA[i][j+1]=true;
						System.out.println("[1][0]");
					}
				}
				
			}
		}
    	
		for(int i= 0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(cA[i][j]+" ");
				if(j==n-1) {
        			System.out.println();

    			}
			}
			}
    	
    	return 0;
    	
    }
    
    
    
}
