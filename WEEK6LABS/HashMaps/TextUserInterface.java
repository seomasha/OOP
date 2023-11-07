package OOP.WEEK6LABS.HashMaps;

import java.util.Dictionary;
import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;
    public TextUserInterface(Scanner reader) {
        this.reader = reader;
    }

    public void start() {
        System.out.println("Statement:\nquit - quit the interface");
    }
}
