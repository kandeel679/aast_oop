package lec.a_1st;

import java.util.Scanner;

public class Frist {

    public static void main(String[] args) {
        System.out.println("Enter the number of numbers you want to calc the sum for: ");
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int sum =0;
            int x = 1*2;
            for (int i = 0; i < x; i++) {
                System.out.print("num "+(i+1)+" =");
                sum+=sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}