package lab.week3;
import java.util.Scanner;
public class Assign_grade {
    public static int Getmax(int [] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
        
    }
    public static char[] Gradeing(int []arr,int best){
        char[] Lgrade = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=best-5){
                //A
                Lgrade[i]='A';
            }
            else if (arr[i]>=best-10) {
                //B
                Lgrade[i]='B';
            } else if(arr[i]>=best-15){
                //C
                Lgrade[i]='C';
            }
            else if(arr[i]>=best-20){
                //D
                Lgrade[i]='D';
            }else{
                //F
                Lgrade[i]='F';
            }
        }
        return Lgrade;
    }
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
        int numberOfStudends = input.nextInt();
        int[] grade = new int[numberOfStudends];
        for (int i = 0; i < grade.length; i++) {
            grade[i]=input.nextInt();
        }
        int best = Getmax(grade);
        System.out.println(best);
          
        char[] Lgrade = Gradeing(grade, best);
        for (int i = 0; i < Lgrade.length; i++) {
            System.out.println("Student " + (i+1) + "score is" +grade[i] +"and grade is "+Lgrade[i]);
        }
 
        }
    }
}
