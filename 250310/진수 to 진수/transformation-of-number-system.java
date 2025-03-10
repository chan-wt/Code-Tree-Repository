import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        int length1= N.length();
        int num=0;
        for(int i=0; i<length1; i++){
            num=num*A+(N.charAt(i)-'0');
        }
        int NewN=num;
        int[] arr= new int[100];
        int cnt=0;
        while(true){
            if(NewN<B){
                arr[cnt++]=NewN;
                break;
            }
            arr[cnt++]=NewN%B;
            NewN=NewN/B;
        }
        for(int i=cnt-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}