import java.util.Scanner;
import java.util.Arrays;
class Student implements Comparable<Student>{
    String name;
    int kor;
    int eng;
    int math;

    public Student(String name, int kor, int eng, int math){
        this.name=name;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
    }
    @Override
    public int compareTo(Student student){
        return (this.kor + this.eng + this. math)-(student.kor + student.eng + student. math);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       Student [] student= new Student[n];
       for(int i=0; i<n; i++){
        String name=sc.next();
        int kor= sc.nextInt();
        int eng= sc.nextInt();
        int math= sc.nextInt();
        student[i]=new Student(name,kor,eng,math);
       }
       Arrays.sort(student);
       
       for(int i=0; i<n; i++){
        System.out.println(student[i].name+" "+student[i].kor+" "+student[i].eng+" "+student[i].math);
       }
    }
}