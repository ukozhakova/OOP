import java.util.Scanner;
public class Main {
    public static class Student{
        private String name;
        private String id;
        private int year_of_study;
        Student(String name, String id, int year_of_study){
            this.name=name;
            this.id=id;
            this.year_of_study= year_of_study;
        }
        public void incrementYear(){
            this.year_of_study++;
        }
        public String GetInfo(){
            return name+" "+ id+" "+ year_of_study;
        }
    }
    public static void main(String[] args) {
        // write your code here
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();
        String id= sc.nextLine();
        int year= sc.nextInt();
        Student s= new Student(name, id, year);
        s.incrementYear();
        System.out.println(s.GetInfo());
    }
}
