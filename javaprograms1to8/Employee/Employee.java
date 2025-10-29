class Employee {
    private int empId;
    private String empName;
    private double salary;
    
    public Employee() {
        this.empId = 0;
        this.empName = "Unknown";
        this.salary = 0.0;
    }
    
    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        this.salary = 0.0;
    }
    
    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
    
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: $" + salary);
        System.out.println("------------------------");
    }
}