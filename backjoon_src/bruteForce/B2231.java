package bruteForce;

import java.io.IOException;
import java.util.Scanner;

public class B2231 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int m=0; m<n; m++) {
        	if(n==findM(m)) {
        		System.out.println(m);

        		break;
        	}else if(m==n-1){
        		System.out.println(0);
        	}
        }        
    }
    public static int findM(int m) {
		int result=m;
		int tmp=m;
		while(true) {
			result=result+tmp%10;
			tmp=tmp/10;
			if(tmp<1) {
				break;
			}
			
		}
		
    	
    	
    	
    	
    	return result;
    	
    }
}
