package OOP.Week2LABS;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = reader.nextInt();

        int sum = 0, counter = 0;

        while(counter <= number) {
            sum += (int)Math.pow(2, counter);

            counter++;
        }
        System.out.println("The sum is: " + sum);
    }
}
