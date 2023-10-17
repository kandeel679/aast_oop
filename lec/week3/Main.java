package lec.week3;

public class Main {

    public static void main(String[] args) {

        double Radius =15;
        
        Circle c1 = new Circle(Radius);
        System.out.println(c1.getArea());
        System.out.println(c1.c());
        System.out.println(c1.getR());
        c1.SetR(14);
        System.out.println(c1.getR());
        
    }

    

    
}
