import java.util.Scanner;
public class Main {
    public static int Function(int a, int b, int c){
      int countMin=0;
      countMin=1440*a+60*b+c-(11*(1440+60+1));
      return  countMin ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A==11 && B==11 && C<11){
           System.out.print(-1);
        }
        else if(A==11 && B<11){
            System.out.print(-1);
        }
        else
        System.out.print(Function(A,B,C));
    }
}