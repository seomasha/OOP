package OOP.Week2LABS;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        printStars(5);
        printStars(3);
        printStars(11);
    }

    public static void printStars(int amount) {
        for(int i = 0; i < amount; i++) {
            System.out.print('*');
        }
        System.out.println();
    }
}
