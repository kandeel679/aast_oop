package sec.week10.supermarket;

import java.util.ArrayList;

public class Customer {
    private String name;
    private Address a1;
    private ArrayList<Order> order = new ArrayList<>();
    public Customer(String name,Address a1){
        this.name = name;
        this.a1 = a1;

    }

    public int NumOfOrders(){
        return order.size();
    }
    
    // TotalOrdersInvoice





    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getA1() {
        return a1;
    }
    public void setA1(Address a1) {
        this.a1 = a1;
    }
    public void AddOrder(Order o){
        order.add(o);
    }
    
}
