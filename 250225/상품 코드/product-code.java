import java.util.Scanner;
class Stuff{
    String id2;
    int code2;
    public Stuff(String id2, int code2){
        this.id2=id2;
        this.code2=code2;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
       Stuff stuff=new Stuff("codetree",50);
       System.out.println("product "+stuff.code2+" is "+stuff.id2);
       Stuff stuff2 =new Stuff(id2, code2);
       System.out.println("product "+stuff2.code2+" is "+stuff2.id2);
    }
}