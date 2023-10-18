package lab.week3;
import java.util.Scanner;
public class Average__matrix {
    public static int[] GetMajorDiagonal(int arr[][]){
        int[]DM = new int[4]; 
        for (int i = 0; i < 4; i++) {
            DM[i]= arr[i][i];
            
        }
        return DM ;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int [][]  matrix = new int[4][4]; 
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    matrix[i][j]=input.nextInt();
                }
            }
            System.out.println("\n");
            int[] MajorDiagonal = GetMajorDiagonal(matrix);
            int sum = 0;
            for (int i : MajorDiagonal) {
                sum =+ i;
            }
            System.out.println("\nAvg:"+sum/4);





        }


    }
}
