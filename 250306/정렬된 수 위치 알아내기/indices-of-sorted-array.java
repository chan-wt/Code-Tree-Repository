import java.util.Scanner;
import java.util.Arrays;
class Clear implements Comparable<Clear>{
    int x;
    int number;
public Clear(int x, int number){
    this.x=x;
    this.number=number;
}
@Override
public int compareTo(Clear clear){
    if(this.number!=clear.number)
    return this.x-clear.x;
    return this.number-clear.number;
}

}
public class Main {
    public static final int MAX_NUM = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
         Clear [] clear =new Clear[MAX_NUM];
         int [] arr= new int[MAX_NUM];

         for(int i=0; i<n; i++){
            int x=sc.nextInt();
            clear[i]=new Clear(x,i);
         }
       
         Arrays.sort(clear,0,n);

          for(int i=0; i<n; i++){
            arr[clear[i].number]=i+1;
         }
         for(int i=0; i<n; i++){
           System.out.print(arr[i]+ " ");
         }
       
    
    }
}