public class Item
{
    private String name;
    private double price;
    //Constructor
    public Item(String name, double price)
    {
        this.name=name;
        this.price=price;
    }

    //getter for name
    public String getName(){
        return this.name;
    }
    //setter for name
    public void setName(String setName) {
        this.name = setName;
    }
    //getter for price
    public double getPrice(){
        return this.price;
    } 
    //setter for price
    public void setPrice(double price){
        this.price = price;
    }

}