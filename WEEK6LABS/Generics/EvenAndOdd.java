package OOP.WEEK6LABS.Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenAndOdd {

    public static <T extends Number> double sumEvenAndOdd(List<T> numbers) {
        double sumEven = 0;
        double sumOdd = 0;

        for (T number : numbers) {
            double value = number.doubleValue();
            if (value % 2 == 0) {
                sumEven += value;
            } else {
                sumOdd += value;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

        return sumEven + sumOdd;
    }

    public static <T> List<T> reverseList(List<T> inputlist) {
        List<T> newlist = new ArrayList<>();

        Collections.reverse(newlist);

        return newlist;
    }
}
