import java.util.Scanner;
class Student{
    String code;
    String place;
    int time;
    public Student(String code, String place, int time){
        this.code=code;
        this.place=place;
        this.time=time;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int c=sc.nextInt();
        Student student=new Student(a,b,c);
        System.out.println("secret code : "+student.code);
        System.out.println("meeting point : "+ student.place);
        System.out.println("time : "+ student.time);

    }
}