package sec.week4;

import java.util.Scanner;

public class TestmainRec {
    public static void main(String[] args) {
        double w,h;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width and height");
        w = input.nextDouble();
        h= input.nextDouble();
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(w,h);
        System.out.println("'Area'");
        System.out.println("r1");
        System.out.println(r1.getArea());
        System.out.println("r2");
        System.out.println(r2.getArea());
        System.out.println("'Peramter'");
        System.out.println("r1");
        System.out.println(r1.getParamter());
        System.out.println("r2");
        System.out.println(r2.getParamter());
    }
    
}
