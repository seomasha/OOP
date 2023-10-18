package OOP.Week3LABS;

public class QuizPractice {

    public static void main(String[] args) {
        printTablesNumber(1, 10, 3);
    }

    public static void printTablesNumber(int start, int end, int number) {
        while(start <= end) {
            System.out.println(start + "*" + number + "=" + (start*number));
            start++;
        }
    }

    public static int baseRaisedToPow(int base, int exp) {

        int num = 1;

        for(int i = 0; i < exp; i++) {
            num*= base;
        }

        return num;
    }

    public static void printInvertedHalfPyramid(int num) {
        for(int i = 1; i <= num; i++) {
            for(int j = num; j >= i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void printWordsFromSentence(String sentence) {
        String[] array = sentence.split(" ");

        for(String w : array) {
            System.out.println(w);
        }
    }
    public static int isNumberPrime(int number) {
        int counter = 0, count = 0;

        for(int i = 2; i <= number; i++) {
            for(int j = 2; j <= i; j++) {
                if(i % j == 0) {
                    counter++;
                }
            }
            if(counter == 1) {
                count++;
            }
            counter = 0;
        }
        return count;


    }

    public static void countEvenOddZeros(int[] array) {
        int even = 0, odd = 0, zero = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] == 0) {
                zero++;
            }
            else if(array[i] % 2 == 0) {
                even++;
            }
            else{
                odd++;
            }
        }

        System.out.println("Even: " +even);
        System.out.println("Odd: " +odd);
        System.out.println("Zeros: " +zero);
    }
}
