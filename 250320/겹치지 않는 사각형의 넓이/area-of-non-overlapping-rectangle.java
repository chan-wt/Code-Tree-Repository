import java.util.Scanner;
public class Main {
    public static final int MAX_N=2000;
    public static final int OFFSET=1000;
    public static final int n=3;
    public static int [] x1=new int[n];
    public static int [] y1=new int[n];
    public static int [] x2=new int[n];
    public static int [] y2= new int[n];
    public static int [][] checkBox= new int[MAX_N+1][MAX_N+1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<3; i++)
        {
            x1[i]=sc.nextInt();
            y1[i]=sc.nextInt();
            x2[i]=sc.nextInt();
            y2[i]=sc.nextInt();

            x1[i]+=OFFSET;
            y1[i]+=OFFSET;
            x2[i]+=OFFSET;
            y2[i]+=OFFSET;
        }
       for(int i=0; i<3; i++){
        for(int x=x1[i]; x<x2[i]; x++)
         for(int y=y1[i]; y<y2[i]; y++)
        checkBox[x][y]++;
       }
       //A,B,M 직사각형 그리기
       int area=0;
       int AllS=0;
     for(int i=0; i<MAX_N+1; i++){
       for(int j=0; j<MAX_N+1; j++){
        if(checkBox[i][j]>=1){
            area++;
        }
       }
     }    //직사각형 색깔 칠하는 과정. 해당 좌표들에 1씩 넣어줌
    AllS=area;
    int extraarea=0;
    for(int x=x1[2]; x<x2[2]; x++){
        for(int y=y1[2]; y<y2[2]; y++)
        if(checkBox[x][y]>=1)
        extraarea++;
    }       // 직사각형 M에 대한 넓이 구하는 과정

     System.out.println(AllS-extraarea);  //A+B-M
     
    }
}