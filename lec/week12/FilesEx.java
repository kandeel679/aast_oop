package lec.week12;

import java.io.PrintWriter;
import java.util.Scanner;

public class FilesEx {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner("input.txt");
            String input = sc.nextLine();
            String arr[]=input.split(",");
            for (String n : arr) {
                PrintWriter pw = new PrintWriter("output.txt");
                pw.println(Integer.parseInt(n));
                pw.close();
            }
        } catch (Exception e) {
            
        }
    }
}
