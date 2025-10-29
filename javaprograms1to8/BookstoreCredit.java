import java.util.Scanner;
public class BookstoreCredit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter grade point average: ");
        double gpa = scanner.nextDouble();
        displayCredit(name, gpa);
    }
    public static void displayCredit(String name, double gpa) {
        double credit = gpa * 10;
        System.out.println("Student: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println("Bookstore Credit: $" + credit);
    }
}