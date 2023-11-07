package OOP.WEEK6LABS.HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map <String, String> namesAndNicknames = new HashMap<>();

        namesAndNicknames.put("matti", "mage");
        namesAndNicknames.put("mikael", "mixu");
        namesAndNicknames.put("arto", "arppa");

        System.out.println(namesAndNicknames.get("mikael"));

        PromissoryNote matti = new PromissoryNote();

        matti.setLoan("Sejo", 50.5);
        System.out.println(matti.howMuchIsTheDebt("Sejo"));

        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");


        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));

        System.out.println(dictionary.amountOfWords());

        System.out.println(dictionary.translationList());

        Scanner reader = new Scanner(System.in);
        Dictionary dictionary1 = new Dictionary();
        TextUserInterface textUserInterface = new TextUserInterface(reader);
        textUserInterface.start();
    }
}
