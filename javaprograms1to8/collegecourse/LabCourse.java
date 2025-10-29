class LabCourse extends CollegeCourse {
    public LabCourse(String department, int courseNumber, int credits) {
        super(department, courseNumber, credits);
        this.fee = this.fee + 50;
    }
    
    @Override
    public void display() {
        System.out.println("\n=== Lab Course Information ===");
        System.out.println("Department: " + department);
        System.out.println("Course Number: " + courseNumber);
        System.out.println("Credits: " + credits);
        System.out.println("Fee: $" + fee);
    }
}