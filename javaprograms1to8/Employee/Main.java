public class Main {
    public static void main(String[] args) {
        System.out.println("=== EMPLOYEE CONSTRUCTOR OVERLOADING DEMO ===\n");
        
        Employee emp1 = new Employee();
        System.out.println("Employee 1 (No-argument constructor):");
        emp1.display();
        
        Employee emp2 = new Employee(101, "John Doe");
        System.out.println("Employee 2 (Two-argument constructor):");
        emp2.display();
        
        Employee emp3 = new Employee(102, "Jane Smith", 75000.50);
        System.out.println("Employee 3 (Three-argument constructor):");
        emp3.display();
        
        System.out.println("\n=== MATHOPERATIONS METHOD OVERLOADING DEMO ===\n");
        
        MathOperations math = new MathOperations();
        
        int result1 = math.multiply(5, 10);
        System.out.println("multiply(5, 10) = " + result1);
        
        double result2 = math.multiply(3.5, 2.5);
        System.out.println("multiply(3.5, 2.5) = " + result2);
        
        int result3 = math.multiply(2, 3, 4);
        System.out.println("multiply(2, 3, 4) = " + result3);
    }
}