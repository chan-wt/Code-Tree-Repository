 import java.util.Scanner;
 import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
     String str=sc.next(); //문자열 입력
     char [] arr= str.toCharArray();  //문자열을 배열로 변환
     Arrays.sort(arr);   //배열 정렬(오름차순)
     String strString=new String(arr);    //new String을 이용하여 배열을 문자열로 변환
     System.out.println(strString);

    }
}