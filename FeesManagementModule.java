import java.util.Scanner;

class StudentFees {
    int rollNo;
    String name;
    double totalFees;
    double paidFees;

    StudentFees(int rollNo, String name, double totalFees, double paidFees) {
        this.rollNo = rollNo;
        this.name = name;
        this.totalFees = totalFees;
        this.paidFees = paidFees;
    }

    void displayFees() {
        double remainingFees = totalFees - paidFees;

        System.out.println("\n--- Fees Details ---");
        System.out.println("Roll Number   : " + rollNo);
        System.out.println("Student Name  : " + name);
        System.out.println("Total Fees    : ₹" + totalFees);
        System.out.println("Paid Fees     : ₹" + paidFees);
        System.out.println("Remaining Fees: ₹" + remainingFees);

        if (remainingFees == 0) {
            System.out.println("Status        : Fees Paid");
        } else {
            System.out.println("Status        : Fees Pending");
        }
    }
}

public class FeesManagementModule {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       FEES MANAGEMENT MODULE");
        System.out.println("================================");

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Total Fees: ₹");
        double totalFees = sc.nextDouble();

        System.out.print("Enter Paid Fees: ₹");
        double paidFees = sc.nextDouble();

        if (paidFees > totalFees) {
            System.out.println("\nError: Paid fees cannot be greater than total fees.");
        } else {
            StudentFees student = new StudentFees(
                rollNo, name, totalFees, paidFees
            );

            System.out.println("\nFees Details Added Successfully!");

            student.displayFees();
        }

        sc.close();
    }
}