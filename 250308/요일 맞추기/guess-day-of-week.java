import java.util.Scanner;
public class Main {

     public static int [] Month_Day= new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static int Function(int m, int d){
        int totalDay=0;
        for(int i=1; i<m; i++){
             totalDay+= Month_Day[i];
        }
        totalDay+=d;
        return totalDay;
    }
    public static String WhichDay(int m2, int d2, int m1, int d1){
        if(Function(m2,d2)>Function(m1,d1)){
        if((Function(m2,d2)- Function(m1,d1))%7==0)
       return "Mon";
       else if((Function(m2,d2)- Function(m1,d1))%7==1)
       return "Tue";
       else if((Function(m2,d2)- Function(m1,d1))%7==2)
       return "Wed";
       else if((Function(m2,d2)- Function(m1,d1))%7==3)
       return "Thu";
       else if((Function(m2,d2)- Function(m1,d1))%7==4)
       return "Fri";
       else if((Function(m2,d2)- Function(m1,d1))%7==5)
       return "Sat";
       else 
       return "Sun";
        }
        else{
            if((Function(m1,d1)- Function(m2,d2))%7==0)
       return "Mon";
       else if((Function(m1,d1)- Function(m2,d2))%7==1)
       return "Sun";
       else if((Function(m1,d1)- Function(m2,d2))%7==2)
       return "Sat";
       else if((Function(m1,d1)- Function(m2,d2))%7==3)
       return "Fri";
       else if((Function(m1,d1)- Function(m2,d2))%7==4)
       return "Thu";
       else if((Function(m1,d1)- Function(m2,d2))%7==5)
       return "Wed";
       else 
       return "Tue";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
       System.out.print(WhichDay(m2,d2,m1,d1));
    }
}