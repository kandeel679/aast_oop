package sec.week10_11.supermarket;

public class Item {
    protected String name;
    protected double price;
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Item [name=" + name + ", price=" + price + "]";
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    

}
