class CollegeCourse {
    protected String department;
    protected int courseNumber;
    protected int credits;
    protected double fee;
    
    public CollegeCourse(String department, int courseNumber, int credits) {
        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.fee = credits * 120;
    }
    
    public void display() {
        System.out.println("\n=== Course Information ===");
        System.out.println("Department: " + department);
        System.out.println("Course Number: " + courseNumber);
        System.out.println("Credits: " + credits);
        System.out.println("Fee: $" + fee);
    }
}