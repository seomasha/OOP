package OOP.Week2LABS;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How many times do you want to print the message: ");
        int num = reader.nextInt();

        for(int i = 0; i < num; i++) {
            printText();
        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.\n");
    }
}
