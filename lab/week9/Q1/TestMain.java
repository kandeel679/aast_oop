package lab.week9.Q1;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the three sides of the triangle:");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("Enter the color of the triangle:");
        String color = input.next();

        System.out.println("Is the triangle filled? Enter true or false:");
        boolean filled = input.nextBoolean();

        Triangle t1 = new Triangle(color, filled, side1, side2, side3);
        t1.setFilled(true);
        t1.setColor("Red");

        System.out.println(t1);
    }
}
