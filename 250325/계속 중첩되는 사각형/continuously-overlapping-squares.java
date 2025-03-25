import java.util.Scanner;
public class Main {
   public static final int OFFSET=100;
   public static final int MAX_N=200;
   public static final int n=10;
   public static int [][] arr= new int[MAX_N+1][MAX_N+1];
   public static int [] x1 = new int[n];
   public static int [] x2= new int[n];
   public static int [] y1= new int[n];
   public static int [] y2= new int[n];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
      for(int i=0; i<N; i++){
         x1[i]=sc.nextInt();
         y1[i]=sc.nextInt();
         x2[i]=sc.nextInt();
         y2[i]=sc.nextInt();

         x1[i]+=OFFSET;
         y1[i]+=OFFSET;
         x2[i]+=OFFSET;
         y2[i]+=OFFSET;

      }
      for(int i=0; i<N; i++){
         for(int x=x1[i]; x<x2[i]; x++)
          for(int y=y1[i]; y<y2[i]; y++)
          if(i%2==0){
           arr[x][y]=1;
          }
          else
          arr[x][y]=2;
      }
      int area=0;
      for(int i=0; i<=MAX_N; i++)
       for(int j=0; j<=MAX_N; j++){
         if(arr[i][j]==2){
            area++;
         }
       }
      
      System.out.print(area);
    }
}