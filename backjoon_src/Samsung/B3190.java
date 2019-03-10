package Samsung;
import java.util.*;
public class B3190 {
	static int[][] map;
	static int[][] applemap;
	static int n;
	static int dir;// 1, 2, 3, 4로 나누자 동서남북 어디로 갈지 방향에 대한 변수
	static int dir2;
	static int headx=0, heady=0, tailx=0, taily=0;
	static int time1=0;
	static int time2=-1;
	static int delay=1;
	static int dotail=0;
	static ArrayList<String> move;
	static int domove[];
	static char dodir[];
	static int l;
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
    	map = new int[n][n];
    	applemap =new int[n][n];
    	map[0][0]=0;
    	//Arrays.fill(map, 0);
    	dir = 1;
    	dir2 = 1;
    	int k = sc.nextInt();
    	int x;
    	int y;
    	for(int i=0; i<k; i++) {
    		x = sc.nextInt();
    		y = sc.nextInt();
    		applemap[x-1][y-1] = 1;
    	}
    	//System.out.println();

//    	System.out.println("=======applemap========");
//    	for(int i=0; i<n; i++) {
//		for(int j=0; j<n; j++) {
//			System.out.print(applemap[i][j]+" ");
//			if(j==n-1) {
//				System.out.println();
//			}
//		}
//    	}   
//    	System.out.println("=======applemap========");
    	l = sc.nextInt();		
    	domove=new int[l];
    	dodir=new char[l];
    	for(int i=0; i<l; i++) {
    		int x2= sc.nextInt();
    		char c =sc.next().charAt(0);
    		domove[i]= x2;
    		dodir[i] = c;
    	}
    	int re;
//    	time2= time1-delay+1;
    	time2=0;
    	if(applemap[0][1]!=1) {//원래 짰는거.. applemap[0][1]에 사과가 없다면 문제가 없었음
    	while(true) {
    		//System.out.println(headx+","+heady);
    		
    		dir=dirchecker(time1,dir);
    		
    		re=headmoving();
    		appmapmove();
    		time1++;
    		//time2= time1-delay;
    		
    		if(re==-1) {
    			break;
    		}
    		if(time1>=2) {
    		if(dotail==0) {
    			
    			dir2=dirchecker(time2,dir2);
    			
    			tailmoving();
    			time2++;
    			//System.out.println("dotail이 0이므로 tail이움직임");
    			
    		}else if(dotail==1){
    			//System.out.println("dotail초기화전:"+dotail);

    			dotail=0;
    			//System.out.println("dotail초기화후:"+dotail);

    		}
    		}
//    		for(int i=0; i<n; i++) {
//        		for(int j=0; j<n; j++) {
//        			System.out.print(map[i][j]+" ");
//        			if(j==n-1) {
//        				System.out.println();
//        			}
//        		}
//        	}
//    		
//    		System.out.println("====================================");
    		
        	
    	}
    	}else {
    		while(true) {//대체법... 애플을 바로 먹으면 자꾸 뱀이 한칸짧기에 애플을 바로 먹는경우는
    					 //그냥 꼬리를 한번 더 늦게 출발 시킨다..
        		//System.out.println(headx+","+heady);
        		
        		dir=dirchecker(time1,dir);
        		
        		re=headmoving();
        		appmapmove();
        		time1++;
        		//time2= time1-delay;
        		
        		if(re==-1) {
        			break;
        		}
        		if(time1>=3) {//꼬리를 한번 더 늦게 출발시킬 경우
        		if(dotail==0) {
        			
        			dir2=dirchecker(time2,dir2);
        			
        			tailmoving();
        			time2++;
        			//System.out.println("dotail이 0이므로 tail이움직임");
        			
        		}else if(dotail==1){
        			//System.out.println("dotail초기화전:"+dotail);

        			dotail=0;
        			//System.out.println("dotail초기화후:"+dotail);

        		}
        		}
//        		for(int i=0; i<n; i++) {
//            		for(int j=0; j<n; j++) {
//            			System.out.print(map[i][j]+" ");
//            			if(j==n-1) {
//            				System.out.println();
//            			}
//            		}
//            	}
        		
        		//System.out.println("====================================");
        		
            	
        	}
    	}
    	System.out.println(time1);
    
    	
    	
    }
    
    
    public static int headmoving() {
    	if(dir==1) {
    		//System.out.println("방향은 1입니다.");
    		if(heady+1==n) {
    			//System.out.println("heady+1이?"+heady+1);
    			return -1;
    		}
    		
    		if(map[headx][heady+1]==1) {    			
    			//System.out.println("니가문제니?");
    			return -1;
    		}
    		map[headx][heady+1]=1;
    		
//    		if(applemap[headx][heady+1]==1) {
//    			//System.out.println(applemap[headx][heady+1]);
//    			applemap[headx][heady+1]=0;
//    			System.out.println("동쪽으로 가다가applemap을 만났습니다."+applemap[headx][heady+1]);
//    			delay+=1;
//    			dotail=1;
//    		}
    		heady+=1;
    		
    	}else if(dir==2) {
    		if(heady-1==-1) {
    			return -1;
    		}
    		
    		if(map[headx][heady-1]==1) {
    			return -1;
    		}
    		map[headx][heady-1]=1;
    		
//    		if(applemap[headx][heady-1]==1) {
//    			applemap[headx][heady-1]=0;
//    			System.out.println("서쪽으로 가다가applemap을 만났습니다."+applemap[headx][heady+1]);
//
//    			delay+=1;
//    			dotail=1;
//
//    		}
    		heady-=1;
    		
    	}else if(dir==3) {
    		if(headx+1==n) {
    			return -1;
    		}
    		
    		if(map[headx+1][heady]==1) {
    			return -1;
    		}
    		map[headx+1][heady]=1;
    		
//    		if(applemap[headx+1][heady]==1) {
//    			applemap[headx+1][heady]=0;
//    			System.out.println("남쪽으로 가다가applemap을 만났습니다."+applemap[headx][heady+1]);
//
//    			delay+=1;
//    			dotail=1;
//    			System.out.println("apple을 먹은 뒤dotail의 값: "+dotail);
//
//    		}
    		headx+=1;
    	
    	}else if(dir==4) {
    		if(headx-1==-1) {
    			return -1;
    		}
    		
    		if(map[headx-1][heady]==1) {
    			return -1;
    		}
    		map[headx-1][heady]=1;
    		
//    		if(applemap[headx-1][heady]==1) {
//    			applemap[headx-1][heady]=0;
//    			System.out.println("북쪽으로 가다가applemap을 만났습니다."+applemap[headx][heady+1]);
//
//    			delay+=1;
//    			dotail=1;
//
//    		}
    		headx-=1;
    		
    	}
    	return 0;
    	
    
    }
    public static void appmapmove() {
    	if(applemap[headx][heady]==1) {
			applemap[headx][heady]=0;
			delay+=1;
			dotail=1;
		}
    }
    
    public static void tailmoving() {
    	
    	if(dir2==1) {
    		map[tailx][taily+1]=2;
    		taily +=1;
    	}else if(dir2==2) {
    		map[tailx][taily-1]=2;
    		taily -=1;
    	}else if(dir2==3) {
    		map[tailx+1][taily]=2;
    		tailx +=1;
    	}else if(dir2==4) {
    		map[tailx-1][taily]=2;
    		tailx -=1;
    	}
    }
    public static int dirchecker(int time, int dir) {
    	//System.out.println("체커 안의 시간: "+time);
    	for(int i=0; i<l; i++) {
    		if(time==domove[i]) {
    	    	//System.out.println("타임이걸렸을때: "+time);

    			if(dodir[i]=='L') {
    				if(dir==1) {
    					dir=4;
    				}else if(dir==2) {
    					dir = 3;
    				}else if(dir==3) {
    					dir=1;
    				}else if(dir==4){
    					dir = 2;
    				}
    			}else if(dodir[i]=='D'){
        	    	//System.out.println("방향전환: "+time);

    				if(dir==1){
    					dir=3;
    				}else if(dir==2) {
    					dir =4;
    				}else if(dir==3) {
    					dir =2;
    				}else{
    					dir =1;
    				}
    			}
    			
    			
    		}
    	}
    	return dir;
    }
    
}
