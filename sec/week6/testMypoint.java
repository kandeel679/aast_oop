package sec.week6;

public class testMypoint {
    public static void main(String[] args) {
        myPoint p1 = new myPoint();
        myPoint p2 = new myPoint(10,30.5);
        System.out.println(myPoint.distance(p1, p2));


    }
}
