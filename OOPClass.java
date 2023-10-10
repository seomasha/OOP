package OOP;

public class OOPClass {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void printNumbersInRange(int start, int end){
        for(int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
