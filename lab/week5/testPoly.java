package lab.week5;

public class testPoly {
    public static void main(String[] args) {
        PolygonClass p1 = new PolygonClass();
        PolygonClass p2 = new PolygonClass(6,4);
        PolygonClass p3 = new PolygonClass(10,4,5.6,7.8);

        System.out.println("perimeter: "+p1.getperimeter()+ " Area: " + p1.getArea());
        System.out.println("perimeter: "+p2.getperimeter()+ " Area: " + p2.getArea());
        System.out.println("perimeter: "+p3.getperimeter()+ " Area: " + p3.getArea());
    }
}
