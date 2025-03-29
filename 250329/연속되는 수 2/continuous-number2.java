import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int cnt=1;
        int max=1;
        int check=0;
        int [] checkBox= new int[n];

         for(int i=1; i<n; i++){
            if(arr[i-1]==arr[i]){
            cnt++;
            if(cnt>max){
                max=cnt;
                }
            }
            else if( i==0 ||arr[i]!=arr[i-1])
            {   
                checkBox[check]=cnt;
                check++;
                if(cnt>max){
                max=cnt;
                }
                cnt=1;
            }
         }
         System.out.print(max);

    
    }
}