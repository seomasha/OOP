package OOP.Week2LABS;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        while(true) {
            int read = reader.nextInt();

            if(read == 0) {
                break;
            }

            sum += read;
            read = 0;

            System.out.println("Sum now: " + sum);
        }

        System.out.println("Sum at the end: " + sum);

    }
}
