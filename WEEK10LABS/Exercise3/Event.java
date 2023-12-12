package OOP.WEEK10LABS.Exercise3;

import java.io.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Event {
    public static void generateEventsFile(String fileName) throws IOException {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String[] events = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
        int event = new Random().nextInt(0, events.length);
        int UserID = new Random().nextInt(0, 999);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true));
        bufferedWriter.write(UserID + "| " + events[event] + " | " + timestamp);
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static void readEventsFile(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        List<String> lines = bufferedReader.lines().collect(Collectors.toList());

        for(String line : lines) {
            System.out.println(line);
        }

        bufferedReader.close();
    }

    public static void main(String[] args) throws IOException {
        Event.generateEventsFile("output.txt");
        Event.readEventsFile("output.txt");
    }
}
