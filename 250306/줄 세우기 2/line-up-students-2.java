import java.util.Scanner;
import java.util.Arrays;
class Student implements Comparable<Student>{
    int h;
    int w;
    int number;
    public Student(int h, int w, int number){
        this.h=h;
        this.w=w;
        this.number=number;
    }
    @Override
    public int compareTo(Student student){
        if(this.h!=student.h)
        return this.h-student.h;
        return student.w-this.w;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Student [] student = new Student[n];
        for(int i=0; i<n; i++){
            int h=sc.nextInt();
            int w=sc.nextInt();
            student[i]=new Student(h,w,i+1);
        }
        Arrays.sort(student);
        for(int i=0; i<n; i++){
            System.out.println(student[i].h+" "+student[i].w+" "+student[i].number);
        }
    }
}