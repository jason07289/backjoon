package Samsung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class B15686 {
	static int[][] city;
	static int n;
	static int m;
	
	static int shop[] = new int[13];
	public static void combination(int[] arr, int index, int n, int r, int target) {
		if      (r == 0) System.out.println(index);
		else if (target == n) return;
		else {
			arr[index] = target;
			combination(arr, index + 1, n, r - 1, target + 1);
			combination(arr, index, n, r, target + 1);
		}
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
//		for (int i = 0; i < 13; i++) {
//			shop[i] = 2;
//		}
		ArrayList<String> home =new ArrayList<String>();
		ArrayList<String> chick =new ArrayList<String>();

		city = new int[n][n];
		int cntt=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				city[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(city[i][j]==1) {
					home.add((i+1)+","+(j+1));
				}
			}
		}
		for (String str : home) {
			System.out.println("홈좌표 : "+str);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(city[i][j]==2) {
					chick.add((i+1)+","+(j+1));
				}
			}
		}
		for (String str : chick) {
			System.out.println("치킨좌표 : "+str);
		}
		
		ArrayList<Integer> dis = new ArrayList<Integer>();//거리값저장
		ArrayList<String> c = new ArrayList<String>();//치킨최소좌표
	
		
		for(int i=0; i<home.size(); i++) {
			for (int j = 0; j < chick.size(); j++) {				
			
				
				int x1 = Integer.parseInt(home.get(i).split(",")[0]);
				int y1= Integer.parseInt(home.get(i).split(",")[1]);
				int x2 = Integer.parseInt(chick.get(j).split(",")[0]);
				int y2 = Integer.parseInt(chick.get(j).split(",")[1]);
				int resultdis=Math.abs(x1-x2)+Math.abs(y1-y2);
				dis.add(resultdis);
				c.add(x2+","+y2);
				

				
			}
			
		}
		
		for (Integer str : dis) {
			System.out.println("도시와 치킨집의 거리: "+str);
				
		}
		
		int[] tmphomeSet = new int[chick.size()];
		int cnt2 = 0;
		int cnt1 = 0;
		
		int[] homeSet = new int[home.size()];// 각집에서 가장 가까운 치킨집의 거리 저장
		for(int i=0; i<dis.size(); i++) {
			 System.out.println("for문 i: "+i);
			 System.out.println("if문 cnt2: "+cnt2);
			 tmphomeSet[cnt2]=dis.get(i);
			 if((i+1)%chick.size()==0) {
				 System.out.println("===================");

				 System.out.println("if문 cnt1: "+cnt1);

				 Arrays.sort(tmphomeSet);
				 homeSet[cnt1]=tmphomeSet[0];
				 System.out.println(tmphomeSet[0]);

				 cnt2=-1;
				 cnt1++;
			 }
			
			 cnt2++;
		}
		
		for(int i=0; i<homeSet.length; i++) {
			System.out.println("최단거리들"+homeSet[i]);
		}
		
		
		
		int result=0;
		for(int i=0; i<home.size(); i++) {
			result +=homeSet[i];
		}
		
		System.out.println(result);
		


//    	for(int i=0; i<n; i++) {
//    		for(int j=0; j<n; j++) {
//    			System.out.print(city[i][j]+" ");
//    			if(j==n-1)
//    			System.out.println();
//    		}
//    	}

//    	int closecount=0;
//    	if(close>0) {
//    			for(int i=0; i<n; i++) {
//    				for(int j=0; j<n; j++) {
//    					shop[i]=0;
//    					shop[j]=0;
//    				}
//    			}
//        	}
//		int result=	citychickdis();

//		System.out.println(result);

	}


}
