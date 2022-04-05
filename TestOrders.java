import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("Mocha", 5.00);
        Item item2 = new Item("Drip Coffee", 4.00);
        Item item3 = new Item("Latte", 4.50);
        Item item4 = new Item("Capuccino", 6.00);
    
        // Order variables -- order1, order2 etc.
        // Order order1 = new Order();
        // order1.name = "Cindhuri";
        // Order order2 = new Order();
        // order2.name = "Jimmy";
        // Order order3 = new Order();
        // order3.name = "Noah";
        // Order order4 = new Order();
        // order4.name = "Sam";

        // Application Simulations
        //Create 2 orders for unspecified guests (without specifying a name);
        Order order1 = new Order();
        Order order2 = new Order();

        //Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("Yote");
        Order order4 = new Order("Evers");
        Order order5 = new Order("Chvio");

        //Add at least 2 items to each of the orders using the addItem method you wrote,
        order1.addItem(item1);
        order1.addItem(item3);
        order2.addItem(item2);
        order2.addItem(item4);
        order3.addItem(item3);
        order3.addItem(item2);
        order4.addItem(item1);
        order4.addItem(item4);
        order5.addItem(item1);
        order5.addItem(item2);

        //Test your getStatusMessage functionality by setting some orders to ready and printing the messages for each order.
        order2.setReady(true); System.out.println(order2.getStatusMessage());
        order5.setReady(true); System.out.println(order2.getStatusMessage());
        order3.setReady(true); System.out.println(order2.getStatusMessage());

        //Test the total by printing the return value  
        System.out.println(order1.getOrderTotal());
        System.out.println(order2.getOrderTotal());
        System.out.println(order3.getOrderTotal());
        System.out.println(order4.getOrderTotal());
        System.out.println(order5.getOrderTotal());

        //Finally, call the display method on all of your orders 
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();


    }
}
