package sec.week10_11.supermarket;

import java.util.ArrayList;
import java.util.Date;
// import java.time.LocalDate;

public class Order {
    private  int  id=0;
    private static int counter=0;
    private Date orderDate;
    private Customer c;
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Double> quantity = new ArrayList<>();
    private static double Deliveryfree= 20;
    private boolean freeDelivery=false;
    private boolean cancelled= false;

    public Order (Customer c){
        id=counter;
        counter++;
        this.orderDate = new Date();
        this.c = c;
    }
    public void AddItem(Item i,double q){
        items.add(i);
        quantity.add(q);
    }
    public void removeItem(int index){
        Item i = items.get(index);
        if (items.contains(i)) {
            items.remove(i);
            quantity.remove(index);  
        }

    }
    public double getTotalprice(){
        double total=0;
        for (int i = 0; i < items.size(); i++) {
            total+=items.get(i).getPrice()*quantity.get(i);
        }
        if (total>=500) {
            freeDelivery =true;
        }else{
            total+=Deliveryfree;
        }
        return total;
    }
    public static double getDeliveryfree() {
        return Deliveryfree;
    }
    public static void setDeliveryfree(double deliveryfree) {
        Deliveryfree = deliveryfree;
    }
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
    @Override
    public String toString() {
        return "Order [id=" + id + ", orderDate=" + orderDate + ", c=" + c + ", items=" + items + ", quantity="
                + quantity + ", freeDelivery=" + freeDelivery + ", cancelled=" + cancelled + "]";
    }



}
