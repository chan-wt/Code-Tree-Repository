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
       for(int i=0; i<5; i++){
        if(students[i].score>max){
           max=students[i].score ;
            int k=i;
        }
       }
       System.out.print(students[k].name+" "+students[k].score);
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