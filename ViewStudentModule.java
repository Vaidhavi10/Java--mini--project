import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int age;
    String course;

    Student(int rollNo, String name, int age, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void displayStudent() {
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Course      : " + course);
        System.out.println("-----------------------------");
    }
}

public class ViewStudentModule {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        // Sample students
        students.add(new Student(101, "Tanisha", 19, "B.Tech"));
        students.add(new Student(102, "Shruti", 19, "B.Tech"));
        students.add(new Student(103, "Vaidhavi", 20, "B.Tech"));

        System.out.println("================================");
        System.out.println("       VIEW STUDENTS MODULE");
        System.out.println("================================");

        if (students.isEmpty()) {
            System.out.println("No student records available.");
        } else {

            System.out.println("\nStudent Records:\n");

            for (Student student : students) {
                student.displayStudent();
            }
        }

        sc.close();
    }
}