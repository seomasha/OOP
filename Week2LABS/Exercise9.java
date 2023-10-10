package OOP.Week2LABS;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        drawStarsPyramidOther(5);

    }

    public static void drawStarsPyramid(int rows) {
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void drawStarsPyramidOther(int rows) {
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
