package OOP.MIDTERMLIVECODING.Week6;

import java.util.*;

class NightSky {
    private double density;
    private int width;
    private int height;
    private int numberOfStarts;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
        this.numberOfStarts = 0;
    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
        this.numberOfStarts = 0;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.numberOfStarts = 0;
    }

    public void printLine() {
        Random random = new Random();

        for(int i = 0; i < width; i++) {
            if(random.nextDouble() > this.density) {
                System.out.print(" ");
            }
            else{
                System.out.print(" * ");
                this.numberOfStarts++;
            }
        }
    }
    public void print(){
        for(int i = 0; i < this.height; i++) {
            printLine();
            System.out.println();
        }
    }

    public int starsInLastPrint() {
        int num = this.numberOfStarts;
        this.numberOfStarts = 0;
        return num;
    }

}

class Mejn{
    public static void main(String[] args) {
        List<Integer> cuna = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(reverseList(cuna));
    }

    public static <T extends Number> double sumOfAllOddsAndEvens(List<T> list) {
        double sumOfEven = 0, sumOfOdd = 0;
        for(T t : list) {
            double number = t.doubleValue();
            if(number%2==0) {
                sumOfEven += number;
            }
            else{
                sumOfOdd += number;
            }
        }
        System.out.println(sumOfEven);
        System.out.println(sumOfOdd);
        return sumOfEven + sumOfOdd;
    }

    public static <G> List<G> reverseList(List<G> list) {
        Collections.reverse(list);

        return list;
    }
}