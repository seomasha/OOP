package OOP.Week2LABS;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String secret = "This is the secret message.";
        boolean flag = true;

        while(flag) {
            System.out.println("Type a password: ");
            String password = reader.nextLine();

            if(password.equals("banana")) {
                System.out.println(secret);
                flag = false;
            }
        }
    }
}
