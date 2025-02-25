import java.util.Scanner;
class Student{
    String name;
    int score;
    public Student(String name, int score){
        this.name=name;
        this.score=score;
    }
}
public class Main {
    public static int max=0;
    public static int k=0;
    public static Student [] students= new Student[5];
    public static void Function(){
       for(int i=1; i<5; i++){
        if(students[max].score>students[i].score){
           max=i;
            
        }
       }
       System.out.print(students[max].name+" "+students[max].score);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
         for(int i=0; i<5; i++){
            String name=sc.next();
            int k=sc.nextInt();
            students[i]=new Student(name,k);
         }
         Function();
    }
}