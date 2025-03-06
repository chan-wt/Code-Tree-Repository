import java.util.Scanner;
import java.util.Arrays;
class Distance implements Comparable<Distance> {
    int x;
    int y;
    int number;
    int sum;
    public Distance(int x, int y, int number,int sum){
        this.x=x;
        this.y=y;
        this.number=number;
        this.sum=sum;
    }
    @Override
    public int compareTo(Distance distance){
      if(this.sum != distance.sum)
      return this.sum-distance.sum;
      
      return this.number-distance.number;

    }

}
public class Main {
    public static int Function(int x, int y){
     if(x>=0 && y>=0)
      return x+y;
      else if(x>=0 && y<0)
      return x+y*(-1);
      else if(x<0 && y>=0)
      return x*(-1)+y;
      else
      return x*(-1)+y*(-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Distance [] distance = new Distance[n]; //객체 배열 생성
        for(int i=0; i<n; i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
           int sum=Function(x,y);
            distance[i]=new Distance(x,y,i+1,sum);//객체 배열에 x,y순번 넣어줌.
        }
        Arrays.sort(distance);
        for(int i=0; i<n; i++){
            System.out.println(distance[i].number);
        }
  
    }
}