package OOP.Week1LABS;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int num1 = reader.nextInt();

        if(num1 > 0) {
            System.out.println("The number is positive");
        }
        else{
            System.out.println("Number is negative");
        }
    }
}
