package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class B10989 {
	public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      //int n = br.read();
	      int n = Integer.parseInt(br.readLine());
	      //System.out.println(n);
	      int num[] = new int [n];
	      
	      for(int i=0; i<n; i++) {
	    	  num[i] = Integer.parseInt(br.readLine());
	      }
	      
	      CountingSort(num, n);
	      
	      for(int i=0; i<n; i++) {
	    	 bw.write(String.valueOf(num[i]));
	    	 bw.newLine();
	      }
	      bw.flush();
	      bw.close();
	      	      
	}
	
	static void CountingSort (int[] num, int n) throws IOException{
		int result[] =new int[n];
		int count[] = new int[10001];
		
		
		for(int i=0; i<n; i++) {
			count[num[i]]++;
		}
		for(int i=1; i<count.length; i++) {
			
			count[i] += count[i-1];
			
		}
		for(int i=0; i<n; i++) {
			result[count[num[i]]-1] = num[i];
			count[num[i]]--;
		}
		for(int i=0; i<n; i++) {
			num[i] = result[i];
		}
		
		
	}
}
