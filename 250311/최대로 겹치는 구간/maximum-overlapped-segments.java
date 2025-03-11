import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int N=sc.nextInt();
       int [] arr= new int[300];
       int maxNum=0;
       for(int i=0; i<N; i++){
         int x1=sc.nextInt();
         int x2=sc.nextInt();
            x1=x1+100;
            x2=x2+100;
         
         if(x2>maxNum){
            maxNum=x2;
         }
         int cnt=1;
         for(int j=x1; j<x2; j++){
            arr[j]=arr[j]+cnt;
         }
       }
       int result=0;
       for(int i=0; i<maxNum; i++){
        if(arr[i]>result){
            result=arr[i];
        }
       }
       System.out.print(result);
       
    }
}