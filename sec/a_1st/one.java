package sec.a_1st;
import java.util.Scanner;

public class one {
  public static void main(String[] args) {
    try (Scanner l = new Scanner(System.in)) {
        System.out.println("Zero to trans from $ to Egp and one for Egp to $");
        int x = l.nextInt();
        int output;
        if (x == 1) {
            int Egp = l.nextInt();
             output = Egp * 30;
            
            
        } else {
            int d = l.nextInt();
            output = d/30;

        }
        System.out.println(output);
    }
    
  }
}
