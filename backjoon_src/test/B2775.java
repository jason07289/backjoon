package test;

import java.util.Scanner;

public class B2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();//�׽�Ʈ���̽��� �?
		int k[] = new int[tc];
		int n[] = new int[tc];
		int ho[][] = new int[15][14];		
		int sum=0;//�迭�ȿ� ���� ���� ����ϱ� ���� sum
		for(int i=0; i<tc; i++) {
			 k[i]=sc.nextInt();
			 n[i]=sc.nextInt();
		}
		
		for(int i=0; i<14; i++) {//0���� �켱 ������ش�.
			ho[0][i] = i+1;
		}
		for(int x=1; x<15; x++){//�״��� 1������ �������
			
			for(int y=0; y<14; y++){//2���� �迭 ����
				sum = 0;
				for(int z=0; z<=y; z++){//y, �� ȣ(n)�� ��ŭ ������Ű��
					sum = sum + ho[x-1][z]; //x-1���� ����� ȣ����ŭ ����
					} 
				ho[x][y] = sum;
			}
			
		}//�켱 ����Ʈ ȣ���� �� ä��ǰ�?
		
		for(int i=0; i<tc; i++) {
			System.out.println(ho[k[i]][n[i]-1]);
			
		}
//		for(int i = 0 ; i<15;i++){
//			for(int j = 0; j<14; j++){
//				System.out.printf("%9d"+" ",ho[i][j]);
//			}
//			System.out.println();
//		} //����Ʈ test�ϴ� �ڵ�
		  //���� �뷮�� 15������ �ֳĸ� 0�����ʹϱ�
	}
	
}

