package lec.week2;
import java.util.Arrays;
import java.util.Scanner;
public class Functions {
    
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){


            System.out.print("a= ");
            int a = input.nextInt();

            System.out.print("b= ");
            int b = input.nextInt();

            System.out.print("c= ");
            int c = input.nextInt();
            
            int res = sum(sum(pow(a, 3),pow(b, 2)),pow(c, 3));
            System.out.println(res);

            int arr[]={1,2,3,4,5};

            increment(arr);

            System.out.println(Arrays.toString(arr));


            // print with for_each loob

            // for (int i : arr) {
            //     System.out.println(i);
            // }
        }
        
    }


    public static int pow(int base, int number){
      int   res =1;
        for (int i = 0; i < number; i++) {
          res*=base;  
        }
        return res;
    }

    public static int sum(int n1, int n2){
        return n1 +n2;
    
    }
    public static void increment(int arr[] ){
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }
}
