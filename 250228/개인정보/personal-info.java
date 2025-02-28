import java.util.Scanner;
 import java.util.Arrays;
 import java.util.Comparator;

 class Person implements Comparable<Person>{
      String name;
      int height;
      double weight;
      public Person(String name, int height, double weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
      }
      @Override
      public int compareTo(Person person){
        return person.height-this.height;
      }
 }
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person [] person= new Person[5];
        for(int i=0; i<5; i++){
            String name=sc.next();
            int height=sc.nextInt();
            double weight=sc.nextDouble();
            person[i]=new Person(name,height,weight);
        }
        Arrays.sort(person, new Comparator<Person>(){
            @Override
            public int compare(Person a, Person b){
                return a.name.compareTo(b.name);
            }
        });
        System.out.println("name");
         for(int i=0; i<5; i++){
            System.out.print(person[i].name+" "+person[i].height+" ");
            System.out.printf("%.1f",person[i].weight);
            System.out.println();
        }
        System.out.println();
        
        Arrays.sort(person);
        System.out.println("height");

        for(int i=0; i<5; i++){
            System.out.print(person[i].name+" "+person[i].height+" ");
            System.out.printf("%.1f",person[i].weight);
            System.out.println();
        }
        
        

    }
}