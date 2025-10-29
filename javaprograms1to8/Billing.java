class Billing {
    public static double computeBill(double price) {
        double total = price + (price * 0.08);
        return total;
    }
    
    public static double computeBill(double price, int quantity) {
        double subtotal = price * quantity;
        double total = subtotal + (subtotal * 0.08);
        return total;
    }
    
    public static double computeBill(double price, int quantity, double coupon) {
        double subtotal = (price * quantity) - coupon;
        double total = subtotal + (subtotal * 0.08);
        return total;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Photo Book Store Billing ===\n");
        
        double bill1 = computeBill(20.00);
        System.out.println("Bill for one photo book at $20.00:");
        System.out.println("Total due: $" + bill1);
        System.out.println();
        
        double bill2 = computeBill(20.00, 3);
        System.out.println("Bill for 3 photo books at $20.00 each:");
        System.out.println("Total due: $" + bill2);
        System.out.println();
        
        double bill3 = computeBill(20.00, 3, 10.00);
        System.out.println("Bill for 3 photo books at $20.00 each with $10.00 coupon:");
        System.out.println("Total due: $" + bill3);
    }
}