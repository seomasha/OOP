package OOP.WEEK6LABS.Exercise1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {6, 5, 8, 7, 11};

        swap(values, 0, 4);
        System.out.println(Arrays.toString(values));

        swap(values, 1, 3);
        System.out.println(Arrays.toString(values));
    }

    public static int smallest(int[] array) { //exercise 1
        int min = array[0];

        for(int i = 1; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    public static int indexOfTheSmallest(int[] array) { //exercise 2
        int min = array[0];
        int index = 0;

        for(int i = 1; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) { //exercise 3
        int min = array[index];
        int ind = 0;

        for(int i = index+1; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
                ind = i;
            }
        }

        return ind;
    }

    public static void swap(int[] array, int index1, int index2) { //exercise 4
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

