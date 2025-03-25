import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int cnt=0;
        int [] check = new int[1000];
        for(int i=0; i<n; i++){ 
            if(i==0 || arr[i]!=arr[i-1]){
            check[cnt]=i;
            cnt++;
            }
        }
        check[cnt]=n+1;

        int max=1;
        for(int i=0; i<cnt; i++){
            int size=check[i+1]-check[i];
            if(size>max){
                max=size;
            }
        }
        System.out.print(max);
    }
}