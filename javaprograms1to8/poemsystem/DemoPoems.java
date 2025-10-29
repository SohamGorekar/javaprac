class DemoPoems {
    public static void main(String[] args) {
        Couplet couplet = new Couplet("The Rose");
        Limerick limerick = new Limerick("There Once Was a Man");
        Haiku haiku = new Haiku("Spring Morning");
        
        System.out.println("=== Poem Demonstration ===\n");
        
        System.out.println("Couplet:");
        System.out.println("Title: " + couplet.getName());
        System.out.println("Lines: " + couplet.getLines());
        System.out.println();
        
        System.out.println("Limerick:");
        System.out.println("Title: " + limerick.getName());
        System.out.println("Lines: " + limerick.getLines());
        System.out.println();
        
        System.out.println("Haiku:");
        System.out.println("Title: " + haiku.getName());
        System.out.println("Lines: " + haiku.getLines());
    }
}