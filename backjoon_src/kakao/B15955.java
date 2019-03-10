package kakao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B15955 {
	
	static int[] dx = new int[44650007];
	static int[] dy = new int[44650007];
	static int[] tmp = new int[2];
	static int[] target = new int[2];
	static int n;

	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		// st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			dx[i] = Integer.parseInt(st.nextToken());
			dy[i] = Integer.parseInt(st.nextToken());

		}
		// int[] dx= {1,3,4,6,3};
		// int[] dy= {2,2,4,2,9};
		boolean result = false;

		for (int i = 0; i < n; i++) {
			System.out.print("dx["+i+"]="+dx[i] + " ");
			System.out.println("dy["+i+"]="+dy[i]);

		}
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < q; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = sc.nextInt();
			result = game(a, b, x);
			if (result == true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");

			}
		}

		// �Լ������ temp�� target�� for�� �ȿ��� �ѹ��� ������

	}

	public static boolean game(int a, int b, int hp) throws InterruptedException {
		System.out.println("--------------------");
		System.out.println("���� �Լ��� ���Խ��ϴ�~");
		tmp[0]=dx[a-1];
		tmp[1]=dy[a-1];
		System.out.println("tmp�� ��ǥ: "+tmp[0]+" "+tmp[1]);
		target[0]=dx[b-1];
		target[1]=dy[b-1];
		System.out.println("target�� ��ǥ: "+target[0]+" "+target[1]);
		while(true) {
			if(hp<distance(tmp, target)) {//�ѹ� �̵��ϸ� tmp�� ���� ���� ��������
				System.out.println("�Ÿ��� HP���� ũ�׿�. Booster�� ���ڽ��ϴ�.");

				booster(tmp, dx, dy);			
			}else {// �ν��͸� ���� Ȥ�� �׳�... hp�ȿ� �� �Ÿ��� �ִٸ� �̵� Ȥ�� ���Ḧ ���Ѿ���.
				System.out.println("�Ÿ��� HP�� ���ų� �۳׿�. ��ǥ���� ���� �����մϴ�!");

				return true;				
			}
			
			if(hp<distance(tmp, target)&&(tmp[0]!=target[0])&&(tmp[1]!=target[1])){
				System.out.println("�̵��� �Ұ��մϴ�.");

				return false;
			}
			
		}//while��ȣ

	}
	
	public static int distance(int tmp[], int target[]) {
		System.out.println("--------------------");
		System.out.println("�Ÿ��� ���ϴ� �Լ� �Դϴ�.");
		int x = (int) Math.pow(tmp[0]-target[0],2);
		int y = (int) Math.pow(tmp[1]-target[1],2);
		int d= (int) Math.sqrt(x+y);
		System.out.println("��ǥ ������ �Ÿ��� ["+d+"] �Դϴ�.");

		return d;
		
	}
	public static int[] booster(int[] tmp,int[] dx, int[] dy) throws InterruptedException {
		boolean[] boostSet= new boolean[n+1];
		System.out.println("--------------------");
		System.out.println("�ν��� �Լ��� ���Խ��ϴ�~");
		System.out.println();
	
		for(int i=0; i<n; i++) {
			if(tmp[0]==dx[i]&&tmp[1]!=dy[i]) { //x��ǥ�� ���� ���
				boostSet[i] =true;
				System.out.println(i+"�� ��ǥ�� x ���� �����մϴ�.");
				Thread.sleep(1000);
			}else if(tmp[1]==dy[i]&&tmp[0]!=dx[i]){// y��ǥ�� ���� ���
				boostSet[i] =true;
				System.out.println(i+"�� ��ǥ�� y ���� �����մϴ�.");
				Thread.sleep(1000);
			}
		}
		System.out.println("������� ��Ű");
		System.out.println("-----�ν�Ʈ �� ���-----");
		Thread.sleep(1000);
		for(int i=0; i<n; i++) {
			System.out.println(i+"��° �ν�Ʈ �� = "+boostSet[i]);
		}
		int tmpD=Integer.MAX_VALUE;
		int[] tmparr = new int[2];
		for(int i=0; i<n; i++) {
			if(boostSet[i]==true) {
				tmparr[0]= dx[i];
				tmparr[1]= dy[i];
				System.out.println("tmparr ������"+tmparr[0]+" "+tmparr[1]);
				
				if(distance(tmparr, target)<tmpD) {
					System.out.println("��ǥ �̵� �غ���... ���� ��ǥ: "+tmp[0]+" "+tmp[1]);
					tmp[0]=dx[i];
					tmp[1]=dy[i];
					tmpD=distance(tmparr, target);
					System.out.println("��ǥ�� �̵��Ǿ����ϴ�. �̵��� ��ǥ: "+tmp[0]+" "+tmp[1]);
					System.out.println();
				}
				
			}
		}
		
		return tmp;
		
		
	}
}
