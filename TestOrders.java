import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("Mocha", 5.00);
        Item item2 = new Item("Drip Coffee", 4.00);
        Item item3 = new Item("Latte", 4.50);
        Item item4 = new Item("Capuccino", 6.00);
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";
        Order order2 = new Order();
        order2.name = "Jimmy";
        Order order3 = new Order();
        order3.name = "Noah";
        Order order4 = new Order();
        order4.name = "Sam";

        // Application Simulations

        //Add item1 to order2's item list and increment the order's total.
        order2.items.add(item1);
        order2.total += item1.price;

        //order3 ordered a cappucino. Add the cappuccino to their order list and to their tab
        order3.items.add(item4);
        order3.total += item4.price;

        //order4 added a latte. Update accordingly.
        order4.items.add(item3);
        order4.total += item3.price;

        //Cindhuri’s order is now ready. Update her status.
        order1.ready = true;

        //Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.items.add(item3);
        order4.items.add(item3);
        order4.total += item3.price*2;

        //Jimmy’s order is now ready. Update his status.
        order2.ready = true;

        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Items: %s\n", order1.items);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("~~~~~~~~~~~~~~~~~~~ \n");

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Items: %s\n", order2.items);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.printf("~~~~~~~~~~~~~~~~~~~ \n");

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Items: %s\n", order3.items);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        System.out.printf("~~~~~~~~~~~~~~~~~~~ \n");

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Items: %s\n", order4.items);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
        System.out.printf("~~~~~~~~~~~~~~~~~~~ \n");
    }
}
