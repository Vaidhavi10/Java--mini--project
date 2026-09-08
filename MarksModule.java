import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int[] marks;

    Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void displayMarks() {
        int total = 0;

        System.out.println("\n--- Student Marks ---");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + " : " + marks[i]);
            total += marks[i];
        }

        double percentage = total / 5.0;

        System.out.println("Total Marks : " + total + "/500");
        System.out.println("Percentage  : " + percentage + "%");
    }
}

public class MarksModule {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        System.out.println("================================");
        System.out.println("          MARKS MODULE");
        System.out.println("================================");

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];

        System.out.println("\nEnter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        Student student = new Student(rollNo, name, marks);
        students.add(student);

        System.out.println("\nMarks Added Successfully!");

        student.displayMarks();

        sc.close();
    }
}