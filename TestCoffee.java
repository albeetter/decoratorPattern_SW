public class TestCoffee {
    
    public static void main(String[] args) {
        System.out.println("========== Brewtiful Coffee Shop ==========\n");
        
        // Example 1: Black Coffee only
        Coffee order1 = new BlackCoffee();
        displayOrder(order1);
        
        // Example 2: Espresso with Milk
        System.out.println();
        Coffee order2 = new Espresso();
        order2 = new Milk(order2);
        displayOrder(order2);
        
        // Example 3: Black Coffee with Milk and Caramel Syrup
        System.out.println();
        Coffee order3 = new BlackCoffee();
        order3 = new Milk(order3);
        order3 = new CaramelSyrup(order3);
        displayOrder(order3);
        
        // Example 4: Espresso with Milk, Sugar, and Whipped Cream
        System.out.println();
        Coffee order4 = new Espresso();
        order4 = new Milk(order4);
        order4 = new Sugar(order4);
        order4 = new WhippedCream(order4);
        displayOrder(order4);
        
        // Example 5: Black Coffee with multiple additions
        System.out.println();
        Coffee order5 = new BlackCoffee();
        order5 = new CaramelSyrup(order5);
        order5 = new WhippedCream(order5);
        order5 = new Milk(order5);
        order5 = new Sugar(order5);
        displayOrder(order5);
    }
    

    private static void displayOrder(Coffee coffee) {
        System.out.println("Order: " + coffee.getDescription());
        System.out.printf("Cost: ₱ %.2f%n", coffee.getCost());
    }
}
