 import java.util.Scanner;
 import java.util.Arrays;

public class Main {
    public static int cnt=0;
    public static final int MAX_N = 100;
    public static int [] arr= new int[MAX_N];
    public static void Function(int k){
          Arrays.sort(arr, 0, k+1);
          System.out.print(arr[cnt]+" ");
          cnt++;
          
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(i%2==0){
                Function(i);
            }
        }
        
    }
}