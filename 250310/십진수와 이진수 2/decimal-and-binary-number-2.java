import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String n =sc.next();
       int length=n.length();
       int num=0;
       for(int i=0; i<length; i++){
          num=2*num+(n.charAt(i)-'0');
       }
        int anum=num*17;
       int [] arr = new int[100];
       int cnt=0;
       while(true){
        if(anum<2){
            arr[cnt++]=anum;
            break;
        }
        arr[cnt++]=anum%2;
        anum=anum/2;
       }
       for(int i=cnt-1; i>=0; i--){
        System.out.print(arr[i]);
       }
    }
}