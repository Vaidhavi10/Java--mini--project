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
    }
}

public class UpdateStudentModule {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        // Existing student records
        students.add(new Student(101, "Tanisha", 19, "B.Tech"));
        students.add(new Student(102, "Shruti", 19, "B.Tech"));
        students.add(new Student(103, "Vaidhavi", 20, "B.Tech"));

        System.out.println("================================");
        System.out.println("      UPDATE STUDENT MODULE");
        System.out.println("================================");

        System.out.print("Enter Roll Number to Update: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        for (Student student : students) {

            if (student.rollNo == rollNo) {

                found = true;

                System.out.println("\nStudent Found!");

                System.out.print("Enter New Name: ");
                student.name = sc.nextLine();

                System.out.print("Enter New Age: ");
                student.age = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter New Course: ");
                student.course = sc.nextLine();

                System.out.println("\nStudent Details Updated Successfully!");

                System.out.println("\nUpdated Details:");
                student.displayStudent();

                break;
            }
        }

        if (!found) {
            System.out.println("\nStudent with Roll Number "
                    + rollNo + " not found!");
        }

        sc.close();
    }
}