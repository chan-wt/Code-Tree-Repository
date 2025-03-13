import java.util.Scanner;
public class Main {
    public static final int MAX_N=2500;
    public static int [] arr= new int[MAX_N+1];
    public static int [] x= new int[101];
    public static String [] direction= new String[101];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();

      for(int i=0; i<N; i++){
        x[i]=sc.nextInt();
        direction[i]=sc.next();
      }
       int [] A= new int[10000];
       for(int i=0; i<N; i++){
        A[0]=1000;
        if(direction[i].charAt(0)=='R'){
          A[i+1]=A[i]+x[i];
        }
        else{
          A[i+1]=A[i]+(x[i]*(-1));
        }
        
      }
     for(int i=0; i<N; i++){
        if(direction[i].charAt(0)=='R'){
        for(int j=A[i]; j<A[i+1]; j++){
            arr[j]=arr[j]+1;
        }
        }
        else{
            for(int j=A[i]; j>A[i+1]; j--){
                arr[j]=arr[j]+1;
            }
        }
     }
     int cnt=0;
     for(int i=0; i<=2001; i++){
        if(arr[i]>=2){
            cnt++;
        }
     }
     System.out.print(cnt);
}
}