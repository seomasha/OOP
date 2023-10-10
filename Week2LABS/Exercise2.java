package OOP.Week2LABS;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        int counter = 1;

        while(counter <= 3) {
            System.out.println("Type a number: ");
            read = reader.nextInt();

            sum += read;
            read = 0;

            counter++;
        }

        System.out.println("Sum: " + sum);
    }
}
