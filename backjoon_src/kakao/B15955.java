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

		// 함수만들고 temp와 target은 for문 안에서 한번씩 써주자

	}

	public static boolean game(int a, int b, int hp) throws InterruptedException {
		System.out.println("--------------------");
		System.out.println("게임 함수로 들어왔습니다~");
		tmp[0]=dx[a-1];
		tmp[1]=dy[a-1];
		System.out.println("tmp의 좌표: "+tmp[0]+" "+tmp[1]);
		target[0]=dx[b-1];
		target[1]=dy[b-1];
		System.out.println("target의 좌표: "+target[0]+" "+target[1]);
		while(true) {
			if(hp<distance(tmp, target)) {//한번 이동하면 tmp에 대해 새로 돌려야함
				System.out.println("거리가 HP보다 크네요. Booster를 쓰겠습니다.");

				booster(tmp, dx, dy);			
			}else {// 부스터를 쓰고 혹은 그냥... hp안에 그 거리가 있다면 이동 혹은 종료를 시켜야함.
				System.out.println("거리가 HP와 같거나 작네요. 목표물에 도달 가능합니다!");

				return true;				
			}
			
			if(hp<distance(tmp, target)&&(tmp[0]!=target[0])&&(tmp[1]!=target[1])){
				System.out.println("이동이 불가합니다.");

				return false;
			}
			
		}//while괄호

	}
	
	public static int distance(int tmp[], int target[]) {
		System.out.println("--------------------");
		System.out.println("거리를 구하는 함수 입니다.");
		int x = (int) Math.pow(tmp[0]-target[0],2);
		int y = (int) Math.pow(tmp[1]-target[1],2);
		int d= (int) Math.sqrt(x+y);
		System.out.println("좌표 사이의 거리는 ["+d+"] 입니다.");

		return d;
		
	}
	public static int[] booster(int[] tmp,int[] dx, int[] dy) throws InterruptedException {
		boolean[] boostSet= new boolean[n+1];
		System.out.println("--------------------");
		System.out.println("부스터 함수로 들어왔습니다~");
		System.out.println();
	
		for(int i=0; i<n; i++) {
			if(tmp[0]==dx[i]&&tmp[1]!=dy[i]) { //x좌표만 같을 경우
				boostSet[i] =true;
				System.out.println(i+"번 좌표의 x 값만 동일합니다.");
				Thread.sleep(1000);
			}else if(tmp[1]==dy[i]&&tmp[0]!=dx[i]){// y좌표만 같을 경우
				boostSet[i] =true;
				System.out.println(i+"번 좌표의 y 값만 동일합니다.");
				Thread.sleep(1000);
			}
		}
		System.out.println("여기까진 오키");
		System.out.println("-----부스트 셋 출력-----");
		Thread.sleep(1000);
		for(int i=0; i<n; i++) {
			System.out.println(i+"번째 부스트 셋 = "+boostSet[i]);
		}
		int tmpD=Integer.MAX_VALUE;
		int[] tmparr = new int[2];
		for(int i=0; i<n; i++) {
			if(boostSet[i]==true) {
				tmparr[0]= dx[i];
				tmparr[1]= dy[i];
				System.out.println("tmparr 갱신중"+tmparr[0]+" "+tmparr[1]);
				
				if(distance(tmparr, target)<tmpD) {
					System.out.println("좌표 이동 준비중... 이전 좌표: "+tmp[0]+" "+tmp[1]);
					tmp[0]=dx[i];
					tmp[1]=dy[i];
					tmpD=distance(tmparr, target);
					System.out.println("좌표가 이동되었습니다. 이동된 좌표: "+tmp[0]+" "+tmp[1]);
					System.out.println();
				}
				
			}
		}
		
		return tmp;
		
		
	}
}
