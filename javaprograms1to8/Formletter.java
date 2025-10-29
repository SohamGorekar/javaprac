class Formletter {
    public static void displaySalutation(String lastName) {
        System.out.println("Dear Mr. or Ms. " + lastName + ",");
        System.out.println("Thank you for your recent order.");
        System.out.println();
    }
    
    public static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName + ",");
        System.out.println("Thank you for your recent order.");
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("=== Form Letter Examples ===\n");
        
        displaySalutation("Johnson");
        
        displaySalutation("Emily", "Anderson");
    }
}