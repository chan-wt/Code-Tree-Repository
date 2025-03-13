import java.util.Scanner;
public class Main {
    public static final int MAX_N=2000;
    public static int [] arr= new int[MAX_N+1];
    public static int [] x= new int[101];
    public static String [] direction= new String[101];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
      for(int i=1; i<=N; i++){
        x[i]=sc.nextInt();
        direction[i]=sc.next();
      }
     for(int i=0; i<N; i++){
        if(direction[i+1].charAt(0)=='R'){
        for(int j=1000+x[i]; j<=1000+x[i+1]; j++){
            arr[j]=arr[j]+1;
        }
        }
        else{
            for(int j=1000+x[i]; j>=1000-x[i+1]; j--){
                arr[j]=arr[j]+1;
            }
        }
     }
     int cnt=0;
     for(int i=0; i<1000; i++){
        if(arr[i]>=2){
            cnt++;
        }
     }
     System.out.print(cnt);
}
}