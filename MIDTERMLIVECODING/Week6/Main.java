package OOP.MIDTERMLIVECODING.Week6;

import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        int[] array = {8,9,3,4,1,6,5,2};

        printElegantly(array);
    }

    public static int getSmallestFromArray(int[] array) {

        int min = array[0];
        int smallest = 0;
        for(int i = 1; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
                smallest = i;
            }
        }

        return smallest;
    }

    public static int getSmallestFromArray(int[] array, int num) {

        int min = array[num];
        int smallest = 0;
        for(int i = num+1; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
                smallest = i;
            }
        }

        return smallest;
    }

    public static void swap(int[] array, int index1, int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static void printElegantly(int[] array)
    {
        System.out.print(array[0]);
        for(int i = 1; i < array.length; i++){
            System.out.print(", " + array[i]);
        }
    }
}

class BinarySearch{
    public static boolean binarySearch(int[] array, int searchedValue) {

        Arrays.sort(array);

        int l = 0;
        int r = array.length - 1;

        while(l <= r) {
            int mid = l + (r-l)/2;
            if(array[mid] > searchedValue) {
                r = mid - 1;
            }
            else if(array[mid] < searchedValue) {
                l = mid + 1;
            }
            else{
                return true;
            }
        }

        return false;
    }
}
