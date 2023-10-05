import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int num1 = reader.nextInt();
        int num2 = reader.nextInt();

        if(num1 > num2) {
            System.out.println("Number 1 is greater than number 2");
        }
        else{
            System.out.println("Number 2 is greater than number 1");
        }
    }
}
