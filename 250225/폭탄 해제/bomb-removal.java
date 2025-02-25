import java.util.Scanner;
class Mission{
    String uCode;
    char lColor;
    int time;
    public Mission(String uCode, char lColor, int time){
        this.uCode=uCode;
        this.lColor=lColor;
        this.time=time;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        Mission mission = new Mission(uCode, lColor,time);
        System.out.println("code : "+mission.uCode);
        System.out.println("color : "+mission.lColor);
        System.out.println("second : "+mission.time);
       
    }
}