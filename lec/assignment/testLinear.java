package lec.assignment;

import java.util.Scanner;

public class testLinear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,d,e,f;
        System.out.println("Enter the number of elements respectively: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        

        LinearEquation linear = new LinearEquation(a,b,c,d,e,f);
        System.out.println("The solution is "+linear.getY());
        System.out.println("The solution is "+linear.getX());
        input.close();

    }
}
