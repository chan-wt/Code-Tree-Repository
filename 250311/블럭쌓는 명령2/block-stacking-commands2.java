import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int N=sc.nextInt();
       int K=sc.nextInt();
       int [] arr= new int[N];
       for(int i=0; i<K; i++){
        int A=sc.nextInt();
        int B=sc.nextInt();
        int cnt=1;
        for(int j=A-1; j<B; j++){
            arr[j]=arr[j]+cnt;
        }
       }
       int max=0;
       for(int i=0; i<N; i++){
        if(arr[i]>max){
            max=arr[i];
        }
       }
       System.out.print(max);
    }
}