package OOP.Week2LABS;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        drawStarsInvertedPyramid(5);
    }

    public static void drawStarsPyramid(int rows) {
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void drawStarsInvertedPyramid(int rows) {
        for(int i = rows; i >= 0; i--) {
            for(int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
