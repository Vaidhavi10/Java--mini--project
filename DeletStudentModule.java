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

public class DeleteStudentModule {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        // Existing student records
        students.add(new Student(101, "Tanisha", 19, "B.Tech"));
        students.add(new Student(102, "Shruti", 19, "B.Tech"));
        students.add(new Student(103, "Vaidhavi", 20, "B.Tech"));

        System.out.println("================================");
        System.out.println("       DELETE STUDENT MODULE");
        System.out.println("================================");

        System.out.print("Enter Roll Number to Delete: ");
        int rollNo = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).rollNo == rollNo) {

                found = true;

                System.out.println("\nStudent Found:");
                students.get(i).displayStudent();

                students.remove(i);

                System.out.println("\nStudent Deleted Successfully!");

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