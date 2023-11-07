package OOP.WEEK6LABS.Exercise7;

import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;

    private int starsInLastPrint;

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        Random random = new Random();
        for (int i = 0; i < this.width; i++) {
            if (random.nextDouble() <= this.density) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public void print() {
        Random random = new Random();
        for(int i = 0; i < this.height; i++) {
            for(int j = 0; j < this.width; j++) {
                if(random.nextDouble() < this.density) {
                    System.out.print("*");
                    starsInLastPrint++;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void starsInLastPrint() {
        System.out.println("Number of stars: " + starsInLastPrint);
    }
}
