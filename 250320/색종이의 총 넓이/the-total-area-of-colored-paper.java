import java.util.Scanner;
public class Main {
    public static final int OFFSET=100;
    public static final int MAX_N=200;
    public static final int MAX=100;
    public static int [][] checkBox=new int[MAX_N+1][MAX_N+1];
    public static int [] x1=new int[MAX+1];
    public static int [] y1=new int[MAX+1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
      for(int i=0; i<n; i++){
        x1[i]=sc.nextInt();
        y1[i]=sc.nextInt();

        x1[i]+=OFFSET;
        y1[i]+=OFFSET;
      }
      for(int i=0; i<n; i++){
        for(int x=x1[i]; x<x1[i]+8; x++)
        for(int y=y1[i]; y<y1[i]+8; y++)
        checkBox[x][y]++;
      }
      int area=0;
      for(int i=0; i<MAX_N+1; i++){
        for(int j=0; j<MAX_N+1; j++){
            if(checkBox[i][j]>=1){
                area++;
            }
        }
      }
      System.out.println(area);
    }
}