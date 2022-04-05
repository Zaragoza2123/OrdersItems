import java.util.ArrayList;
public class Order
{
    private String name;
    private boolean ready; 
    private ArrayList<Item> items;

    public Order()
    {
        this.name = "Guest";
        this.items =  new ArrayList<Item>();
    }
    public Order(String name) {
        this.name = name;
        this.items =  new ArrayList<Item>();
    }

    //ORDER METHODS 
    public void addItem(Item item){
        this.items.add(item);
    }
    public String getStatusMessage(){
        if (this.ready == false){
            return "Thank you for waiting. Your order will be ready soon.";
        } else {
            return "Your order is ready.";
        }
    }
    public double getOrderTotal(){
        double total = 0.0;
        for(Item items: this.items){
            total += items.getPrice();
        }
        return total;
    }
    public void display(){
        System.out.println("Customer Name: " + this.name);
        for(Item items: this.items) {
            System.out.println(items.getName() + " - $" + items.getPrice() +'0');
        }
        System.out.println("Total: $" + this.getOrderTotal() +'0');
    }



    //getter for name
    public String getName(){
        return this.name;
    }
    //setter for name 
    public void setName(String name){
        this.name = name;
    }
    //getter for is ready
    public boolean getReady(){
        return this.ready;
    }
    //setter for is ready
    public void setReady(boolean ready){
        this.ready = ready;
    }
    //getter for items
    public ArrayList<Item> getItems(){
        return items;
    }
    //setter for items
    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
};