package OOP.WEEK6LABS.Exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);

        System.out.println("The values of the array: " + Arrays.toString(array));
        System.out.println();

        System.out.println("Enter searched number: ");
        int searchedValue = reader.nextInt();

        boolean result = BinarySearch.search(array, searchedValue);
        System.out.println(result);

         */
        int[] array = {-3, 2, 3, 4, 7, 8, 12};

        printElegantly(array);
    }

    public static void printElegantly(int[] array) { //exercise 6
        for(int i = 0; i < array.length; i++) {
            if(i == array.length-1) {
                System.out.print(array[i]);
            }
            else{
                System.out.print(array[i] + ", ");
            }
        }
    }
}
