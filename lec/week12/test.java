package lec.week12;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for (Number number : numbers) {
           int n = s.nextInt();
            int d =s.nextInt();
            number = new Number(n,d);
        }    
    }
}
