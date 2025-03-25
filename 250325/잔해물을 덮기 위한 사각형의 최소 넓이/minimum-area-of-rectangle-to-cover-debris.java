import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static final int OFFSET=1000;
    public static final int MAX_N=2000;
    public static int n=2;

    public static int [][] CheckBox = new int[MAX_N+1][MAX_N+1];
    public static int [] x1 =new int[n];
    public static int [] x2=new int[n];
    public static int [] y1=new int[n];
    public static int [] y2= new int[n];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       for(int i=0; i<n; i++){
        x1[i]=sc.nextInt();
        y1[i]=sc.nextInt();
        x2[i]=sc.nextInt();
        y2[i]=sc.nextInt();

        x1[i]+=OFFSET;
        y1[i]+=OFFSET;
        x2[i]+=OFFSET;
        y2[i]+=OFFSET;

       }
       for(int i=0; i<n; i++){
        for(int x=x1[i]; x<x2[i]; x++)
         for(int y=y1[i]; y<y2[i]; y++)
          CheckBox[x][y]=i+1;
       }  
    /////////이 아래부분을 구현하다 실패함.
       int minX=MAX_N, maxX=0, minY=MAX_N, maxY=0;
       boolean firstRectExist= false;
       for(int x=0; x<=MAX_N; x++)
        for(int y=0; y<=MAX_N; y++)
         if(CheckBox[x][y] ==1 ){
            firstRectExist=true;
            minX=Math.min(minX,x); // minX와 x를 비교해서 더 작은 값은 반환함.
            maxX=Math.max(maxX,x);
            minY=Math.min(minY,y);
            maxY=Math.max(maxY,y);
         }
     int area;
     if(!firstRectExist)
     area=0;
     else
     area=(maxX-minX+1)*(maxY-minY+1);
     System.out.print(area);
    }
}