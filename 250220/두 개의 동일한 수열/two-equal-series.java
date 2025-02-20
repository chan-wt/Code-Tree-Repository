 import java.util.Scanner;
  import java.util.Arrays;

public class Main {
    public static final int MAX_N = 100;
    public static int [] A = new int [MAX_N];
    public static int [] B = new int [MAX_N];
    public static boolean Function(int n){
          for(int i=0; i<n; i++)
        if(A[i]!=B[i])
        return false;
          
        
        return true;
       
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=0; i<n; i++){
        A[i]=sc.nextInt();
       }

       for(int i=0; i<n; i++){
        B[i]=sc.nextInt();
       }
       Arrays.sort(A,0,n);
       Arrays.sort(B,0,n);
      

       if(Function(n))
       {
        System.out.print("Yes");
       }
       else{
        System.out.print("No");
       }
     
    }
}