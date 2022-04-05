import java.util.ArrayList;
public class Order
{
    public String name;
    public double total;
    public boolean ready; 
    public ArrayList<Item> items = new ArrayList<Item>();

    public Order()
    {
        this.name = name;
        this.total = total;
        this.ready = ready;
        this.items = items;
    }
}