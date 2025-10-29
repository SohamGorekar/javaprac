import java.util.Scanner;

class SqrtException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number to find its square root: ");
        double number = input.nextDouble();
        
        try {
            if (number < 0) {
                throw new ArithmeticException("Cannot calculate square root of a negative number");
            }
            double result = Math.sqrt(number);
            System.out.println("The square root of " + number + " is " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        input.close();
    }
}