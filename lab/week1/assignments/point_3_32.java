package lab.week1.assignments;
import java.util.Scanner;

public class point_3_32 {
    public static void main(String[] args) {
     try  (Scanner input = new Scanner(System.in)){
        System.out.println("Enter the cord of the p0(x,y)");     
        int x0 = input.nextInt();
        int y0 = input.nextInt();
        System.out.println("Enter the cord of the p1(x,y)");     
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        System.out.println("Enter the cord of the p2(x,y)");        
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int f = (x1-x0)*(y2-y0)-(x2-x0)*(y1-y0);
        if (f > 0) {
            // left
            System.out.println("left");
        } else if(f<0) {
            // reght
            System.out.println("right");

        }else{
          System.out.println("onit"); 
        }
      }
    }
}