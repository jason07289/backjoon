package GCDLCM;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B1850 {
	 public static long getGCD(long a, long b) {
	        while(b > 0) {
	            long tmp = a;
	            a = b;
	            b = tmp%b;
	        }
	        return a;
	    }
	public static void main(String[] args) throws IOException {
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		  Scanner sc = new Scanner(System.in);
		  long a = sc.nextLong();
		  long b = sc.nextLong();
		  long gcd =getGCD(Math.max(a, b), Math.min(a,b));
		  String result="";
		  String text2="1";
		  
//		  long t =0;
//		  long x = 1;;
		  for(long i=0; i<gcd; i++) {
//			  t +=x;
//			  x=x*10;
			  bw.write("1");			  
		  }
		  //bw.write(result);
//		  System.out.println(t);
		  bw.flush();
	      bw.close();		  		 	      
	}
}
