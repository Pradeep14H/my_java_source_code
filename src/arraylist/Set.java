package arraylist;

 

public class Set {
    String ItemName;
    float price;

    public Set(String ItemName,float price)
    {
        this.ItemName=ItemName;
        this.price=price;
    }

    public String toString()
    {
        return "ItemName "+ItemName+" , price "+price;
    }
}