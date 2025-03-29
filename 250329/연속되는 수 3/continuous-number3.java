import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int  [] arr= new int[n];
        for(int i=0; i<n; i++){
           arr[i]=sc.nextInt();
        }
        int cnt=0;
         int cnt1=0;
         int max=0;
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                cnt++;
                cnt1=0;
            }
            else{
                cnt1++;
                cnt=0;
               }
    if(cnt>cnt1){
     max=Math.max(max,cnt);
    }
    else{
        max=Math.max(max,cnt1);
    }
    
    }
   
    
    System.out.print(max);
    }
}