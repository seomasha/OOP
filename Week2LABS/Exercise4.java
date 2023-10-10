package OOP.Week2LABS;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1, num2;

        System.out.println("First: ");
        num1 = reader.nextInt();

        System.out.println("Last: ");
        num2 = reader.nextInt();

        if(num1 > num2) {
            System.out.println();
        }
        else{
            while(num1 <= num2) {
                System.out.println(num1);
                num1++;
            }
        }
    }
}
