package lab.a_1st.assg;
import java.util.Scanner;
public class avg {
    public static void main(String[] args) {
        double w,h,bmi;
        System.out.println("enter your weight");
        try(Scanner kandyl=new Scanner(System.in)){
            w = kandyl.nextDouble();
                    System.out.println("enter your height");
            h = kandyl.nextDouble();
            bmi =w/h*h;

        }


        System.out.println("the bmi" + "=" + bmi);
    }
}
