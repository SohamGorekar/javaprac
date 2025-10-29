import java.util.Scanner;

class UseCourse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter department (e.g., ENG, BIO, CHM, CIS, PHY): ");
        String department = input.nextLine().toUpperCase();
        
        System.out.print("Enter course number: ");
        int courseNumber = input.nextInt();
        
        System.out.print("Enter credits: ");
        int credits = input.nextInt();
        
        if (department.equals("BIO") || department.equals("CHM") || 
            department.equals("CIS") || department.equals("PHY")) {
            LabCourse course = new LabCourse(department, courseNumber, credits);
            course.display();
        } else {
            CollegeCourse course = new CollegeCourse(department, courseNumber, credits);
            course.display();
        }
        
        input.close();
    }
}