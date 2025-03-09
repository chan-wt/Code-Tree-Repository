import java.util.Scanner;

public class Main {
    public static int [] arr= new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
    public static int Function(int m, int d){
        int totalDay=0;
        for(int i=1; i<m; i++){
            totalDay+=arr[i];
        }
        totalDay+=d;
        return totalDay;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int m1=sc.nextInt();
       int d1=sc.nextInt();
       int m2=sc.nextInt();
       int d2=sc.nextInt();
       String A=sc.next();
       int diff=Function(m2,d2)-Function(m1,d1);
       String [] week =new String[]{"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
       int CountNum= diff%7;
       if(week[CountNum].equals(A)){
         System.out.print(diff/7+1);
       }
       else
       {
        System.out.print(diff/7);
       }
   
    }
}