import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=0;
       int [] arr =new int[100];
        while(true){
            if(n<2){
            arr[cnt++]=n;
            break;
            }
            arr[cnt++]=n%2;
            n=n/2;
        }
        for(int i=cnt-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}