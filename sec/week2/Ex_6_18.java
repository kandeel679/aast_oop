package sec.week2;
//EX:6.18:
import java.util.Scanner;




public class Ex_6_18 {
    public static void main(String[] args) {

        System.out.println("enter your password : \n");
        try (Scanner input=new Scanner(System.in)){
            String p = input.nextLine();
            boolean vaild = carcters_checkers(p) && only_lettersordigits (p) && theredigits_cheecker(p);
            System.out.println(vaild?"valid password":"is not vaild");

        }
    }

    public static boolean carcters_checkers(String p) {
      if(p.length()>=10)
          return true;
      else
          return false;
    }
    public static boolean only_lettersordigits (String p) {
        for (int i=0;i<p.length();i++) {
            if (!Character.isLetterOrDigit(p.charAt(i)))
                return false;
        }
        return true;
    }
    public static boolean theredigits_cheecker(String p) {
        int count = 0;
        for (int i = 0; i < p.length(); i++) {
            if(Character.isDigit(p.charAt(i)))
                   count++;
        }
        if(count<=3)
            return false;
        else
            return true;

    }

}