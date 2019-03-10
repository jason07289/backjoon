package DivAndCon;

import java.io.IOException;
import java.util.Scanner;

public class B1074 {
  
   static long count=0;
   static int r ;
   static int c ;
    public static void main(String[] args) throws IOException {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      r = sc.nextInt();
      c = sc.nextInt();
      
      int arridx=1;
      for(int i=0; i<n; i++) {
         arridx = arridx*2;
      }     
      int startX=0;
      int startY=0;
      int endX=arridx;
      int endY=arridx;
      z(startX,startY,endX,endY,arridx);
      
      
    }
    public static void z(int sx,int sy,int ex,int ey, int x) {
       
       if(x==2) {
          for(int i=sx; i<ex; i++) {
             for(int j=sy; j<ey; j++) {             
                count++;
                if(r==i&&c==j) {
                	System.out.println(count-1);
                }
             }
          }
       }else {
          z(sx,sy,ex-x/2,ey-x/2,x/2);
         z(sx,sy+x/2,ex-x/2,ey,x/2);
         z(sx+x/2,sy,ex,ey-x/2,x/2);                                                               
          z(sx+x/2,sy+x/2,ex,ey,x/2);   
          
       }
    
    }
}