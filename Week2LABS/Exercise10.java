package OOP.Week2LABS;

import java.util.Random;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int drawnNum = drawNumber();

        System.out.println("Type a number: ");
        int num = reader.nextInt();
        int counter = 1;

        System.out.println(drawnNum);

        while(num != drawnNum) {
            if(num > drawnNum) {
                System.out.println("The number is less than the drawn number.");
            }
            else {
                System.out.println("The number is greater than the drawn number.");
            }
            counter++;
            num = reader.nextInt();

            if(num == drawnNum) {
                System.out.println("Congratulations, it took you " + counter + " tries to guess the right number.");
            }
        }

    }

    public static int drawNumber() {
        return new Random().nextInt(101);
    }
}
