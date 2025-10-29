class Student {
    private int idNumber;
    private int creditHours;
    private int points;
    private double gradePointAverage;
    
    public Student() {
        this.idNumber = 9999;
        this.points = 12;
        this.creditHours = 3;
        computeGradePointAverage();
    }
    
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
    
    public void setPoints(int points) {
        this.points = points;
    }
    
    public void computeGradePointAverage() {
        if (creditHours > 0) {
            this.gradePointAverage = (double) points / creditHours;
        } else {
            this.gradePointAverage = 0.0;
        }
    }
    
    public void displayStudent() {
        System.out.println("Student ID: " + idNumber);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Points Earned: " + points);
        System.out.println("Grade Point Average: " + gradePointAverage);
        System.out.println("------------------------");
    }
    
    // ADD THIS MAIN METHOD
    public static void main(String[] args) {
        System.out.println("=== STUDENT GRADE MANAGEMENT SYSTEM ===\n");
        
        // Test default constructor
        Student student1 = new Student();
        System.out.println("Student 1 (Default values):");
        student1.displayStudent();
        
        // Test with setter methods
        Student student2 = new Student();
        student2.setIdNumber(1234);
        student2.setCreditHours(15);
        student2.setPoints(45);
        student2.computeGradePointAverage();
        System.out.println("Student 2 (Custom values):");
        student2.displayStudent();
        
        // Another test case
        Student student3 = new Student();
        student3.setIdNumber(5678);
        student3.setCreditHours(12);
        student3.setPoints(36);
        student3.computeGradePointAverage();
        System.out.println("Student 3 (Another example):");
        student3.displayStudent();
        
        // Edge case: zero credit hours
        Student student4 = new Student();
        student4.setIdNumber(9999);
        student4.setCreditHours(0);
        student4.setPoints(10);
        student4.computeGradePointAverage();
        System.out.println("Student 4 (Zero credit hours):");
        student4.displayStudent();
    }
}