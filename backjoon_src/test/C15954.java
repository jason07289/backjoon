package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class C15954 {
 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        double A[] = new double[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i < N; i++) {
            A[i] = Double.parseDouble(st.nextToken());
        }
        //입력 완료
        double result = Double.MAX_VALUE;
        while(K <= N) {
            for(int i = 0; i <= N-K; i++) {
                //m 구하기
                double m = getM(A, i, N, K);
 
                //b 구하기(표준편차)
                double b = getB(A, m, i, N, K);
                
                result = Math.min(result, b);
            }
            K += 1;
        }
 
        double newResult = Double.parseDouble(String.format("%.11f", result));
        System.out.println(newResult);
    }
    
    public static double getM (double[] A, int idx, int N, int K) {
        double sum = 0.0;
        for(int i = 0; i < K; i++) {
            sum += A[idx+i];
        }
        return sum / K;
    }
    
    public static double getB(double[] A, double m, int idx, int N, int K) {
        double sum = 0.0;
        for(int i=0; i < K; i++) {
            sum += (Math.pow(A[idx+i]-m, 2));
        }
        return Math.sqrt(sum/K);
    }
}
