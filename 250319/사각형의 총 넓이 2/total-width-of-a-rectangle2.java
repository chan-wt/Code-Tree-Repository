import java.util.Scanner;
public class Main {
    public static final int MAX_N=100;
    public static final int D=10;
    public static int[] x1=new int[MAX_N];
    public static int[] x1=new int[MAX_N];

    int [][] sqaure=new int[2*MAX_N+1][2*MAX_N+1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=x1[i]; j<x2[i]; j++)
            for(int k=y1[i]; k<y2[i]; k++)
            sqaure[j][k]++;
        }
    }
}