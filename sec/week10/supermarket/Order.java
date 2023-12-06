package sec.week10.supermarket;

import java.util.ArrayList;
import java.util.Date;
// import java.time.LocalDate;

public class Order {
    private static int  id=0;
    private Date orderDate;
    private Customer c;
    private ArrayList<Item> cOrder = new ArrayList<>();
    private ArrayList<Double> quantity = new ArrayList<>();
    private static double Deliveryfree= 20;
    private boolean freeDelivery=false;
    private boolean canceld = false;

    public Order (Customer c){
        id++;
        this.orderDate = new Date();
        this.c = c;
    }



}
