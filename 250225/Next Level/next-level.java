import java.util.Scanner;
class User{
    String id;
    int level;
    
    public User(){
        this.id="codetree";
        this.level=10;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();

        User user= new User();
        System.out.println("user "+user.id+" lv "+user.level);
        user.id="hello";
        user.level=28;
          System.out.println("user "+user.id+" lv "+user.level);

          
    }
}