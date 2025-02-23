 import java.util.Scanner;
 import java.util.Arrays;
public class Main {
    public static boolean Function(String s1, String s2){
        char [] str= s1.toCharArray();
        char [] str2=s2.toCharArray();
        Arrays.sort(str);
        Arrays.sort(str2);
        String S3=new String(str);
        String S4= new String(str2);
        if(S3.equals(S4))
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       String s1= sc.next();
       String s2= sc.next();
       if(Function(s1,s2)){
        System.out.print("Yes");
       }
       else
       {
        System.out.print("No");
       }
    }
}