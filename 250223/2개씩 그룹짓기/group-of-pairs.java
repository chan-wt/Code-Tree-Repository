import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static final int MAX_N = 2000;
  public static int [] arr= new int [MAX_N];
  public static int [] str= new int[MAX_N];
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      int n=sc.nextInt();
      int k=2*n;
      for(int i=0; i<k; i++){
        arr[i]=sc.nextInt();
      }
      Arrays.sort(arr,0,k);
      for(int i=0; i<n; i++){
        str[i]=arr[i]+arr[k-1-i];
      }
      Arrays.sort(str,0,n);
      System.out.print(str[n-1]);
      
    }
}