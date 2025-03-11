import java.util.Scanner;
public class Main {
    public static final int MAX_N=100;
    public static int [] x1= new int[MAX_N+1];
    public static int [] x2= new int[MAX_N+1];
    public static int [] CheckBox= new int[MAX_N+1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=0; i<n; i++){
        x1[i]=sc.nextInt();
        x2[i]=sc.nextInt();
       }
       for(int i=0; i<n; i++){
        for(int j=x1[i]; j<=x2[i]; j++){
            CheckBox[j]=CheckBox[j]+1;
        }
       }
       int max=0;
       for(int i=0; i<MAX_N+1; i++){
        if(CheckBox[i]>max){
            max=CheckBox[i];
        }
       }
       System.out.print(max);
    }
}