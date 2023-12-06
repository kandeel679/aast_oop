package sec.week10.supermarket;

public class Product extends Item {
    private double weight;

    public Product(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product [weight=" + weight + super.toString()+"]";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    

}
