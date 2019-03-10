package DivAndCon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1992 {
	static int[][] arr;
    public static void main(String[] args) throws IOException {
		
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(BR.readLine());

		arr = new int[n][n];
		
		for(int i =0; i<n; i++) {			
			String str= BR.readLine();
				for(int j=0; j<n; j++) {
					arr[i][j]=str.charAt(j) - '0';
				}
			
		}
						
//		for(int i =0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				System.out.print(arr[i][j]+" ");
//				if(j==n-1) {
//					System.out.println();
//				}
//			}
//		}
		int startX=0;
		int startY=0;
		int endX=n;
		int endY=n;

		quad(startX,startY,endX,endY,n);

    
    }
    
    public static int quad(int x, int y, int ex, int ey, int n) {
		int result = 0;
    	for(int i=x; i<ex; i++) {
			for(int j=y; j<ey; j++) {
				
					result += arr[i][j];
										
				}
			}
    	
    	if(result==0) {
    		System.out.print(0);
    	}else if(result==n*n) {
    		System.out.print(1);

    	}else{
    		System.out.print("(");
			quad(x,y,ex-n/2,ey-n/2,n/2);
			quad(x,y+n/2,ex-n/2,ey,n/2);
			quad(x+n/2,y,ex,ey-n/2,n/2);
									    		    		   		    	
    		quad(x+n/2,y+n/2,ex,ey,n/2);   			
    		System.out.print(")");
//    		for(int i=0; i<n/2; i++) {
//    			for(int j=0; j<n/2; j++) {
//    				tmp1[i][j]=arr[i][j+n/2];
//    				quad(tmp4,n/2);
//    			}
//    		}
    		
    	}
    		
    		
    		
    	
    	
    	return 0;
    	
    }
}
