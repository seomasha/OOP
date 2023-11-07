package OOP.WEEK6LABS.BirdWatchersDatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<BirdWatchers> birds = new ArrayList<>();

        String choice = reader.nextLine();

        while(!choice.equals("Quit")) {
            if(choice.equals("Add")) {
                System.out.println("The name of the bird: ");
                String name = reader.nextLine();

                System.out.println("The latin name of the bird: ");
                String latinName = reader.nextLine();

                birds.add(new BirdWatchers(name, latinName));
                choice = reader.nextLine();
            }
            else if (choice.equals("Observation")) {
                System.out.println("What was observed");
                String name = reader.nextLine();

                for(BirdWatchers bird : birds) {
                    if(bird.getName().equals(name)) {
                        bird.observation();
                    }

                    else{
                        System.out.println("Not a bird");
                        break;
                    }
                }
                choice = reader.nextLine();
            }
            else if (choice.equals("Statistics")) {
                for(BirdWatchers bird : birds) {
                    System.out.println(bird);
                }
                choice = reader.nextLine();
            }
            else if (choice.equals("Show")) {
                String name = reader.nextLine();
                for (BirdWatchers bird : birds) {
                    if (bird.getName().equals(name)) {
                        System.out.println(bird);
                    }
                }
                choice = reader.nextLine();
            }
            else{
                System.out.println("Enter valid input!");
                choice = reader.nextLine();
            }
        }
    }
}
