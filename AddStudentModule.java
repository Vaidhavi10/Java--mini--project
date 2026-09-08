import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int age;
    String course;

    // Constructor
    Student(int rollNo, String name, int age, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Display student details
    void displayStudent() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Course      : " + course);
    }
}

public class AddStudentModule {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("     ADD STUDENT MODULE");
        System.out.println("================================");

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        // Create Student object
        Student student = new Student(rollNo, name, age, course);

        System.out.println("\nStudent Added Successfully!");

        // Display entered details
        student.displayStudent();

        sc.close();
    }
}