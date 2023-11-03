
import java.util.Scanner;

/**
 * 7.26 (Check whether array is sorted) An array list is required to be sorted
 * in ascending order. Write a method that returns true if list is sorted, using
 * the following header: public static boolean isSorted(int[] list) Write a test
 * program that prompts the user to enter a list of integers. Note the first
 * number in the input indicates the number of elements in the list. This number
 * is not part of the list.
 *
 *
 * Enter list: 5 2 5 6 9 10 The list is sorted
 *
 * Enter list: 5 2 5 6 1 6 The list is not sorted.
 *
 *
 */
public class ArraySortChecker {

    public static void main(String[] args) {

       try( Scanner scanner = new Scanner(System.in)){

           System.out.print("Enter list size: ");
           int size = scanner.nextInt();

        System.out.print("Enter list content: ");
        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            list[i] = scanner.nextInt();
        }

        boolean sorted = isSorted(list);

        if (sorted) {
            System.out.println("The list is sorted.");
        } else {
            System.out.println("The list is not sorted.");
        }

    }
}

    public static boolean isSorted(int[] list) {
        boolean sorted = true;
        for (int i = 1; i < list.length; i++) {
            if (list[i-1] > list[i]) {
                sorted = false;
                break;
            }
        }
        return sorted;
    }
}
