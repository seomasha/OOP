package OOP.MIDTERMLIVECODING.Week2Labs;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Random random = new Random();

        int num = random.nextInt(0, 100);

        System.out.println(num);
    }

    public static int threeNumbers(int a, int b, int c)
    {
        return a + b + c;
    }

    public static void sum() {
        int sum = 0;

        Scanner reader = new Scanner(System.in);

        while(true) {
            int num = reader.nextInt();

            if(num == 0) {
                break;
            }

            sum += num;
        }
        System.out.println(sum);
    }

    public static void printBetween(int num1, int num2)
    {
        while(num1 <= num2)
        {
            System.out.println(num1);
            num1++;
        }
    }

    public static int twoPowerN(int n) {
        int sum = 0;

        while(n > -1) {
            sum += (int) Math.pow(2, n);
            n--;
        }

        return sum;
    }

    public static void printText()
    {
        System.out.println("In the beginning there were the swamp, the hoe and Java");
    }

    public static void printStars(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(" * ");
        }
        System.out.println();
    }

    public static void drawStarsPiramid(int num)
    {
        for(int i = 1; i <= num; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawNumbersPyramid(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
