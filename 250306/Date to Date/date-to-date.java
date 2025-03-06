import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int CountDay=0;
       int [] Month_Day=new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
       if(m1==m2 && d1==d2){
        CountDay=1;
       }
       else{
       while(true){
        if(m1==m2 && d1==d2){
            break;
        }
       CountDay++;
       d1++;
       if(d1>Month_Day[m1]){
        m1++;
        d1=0;
       }
       }
       }
       System.out.print(CountDay);
    }
}