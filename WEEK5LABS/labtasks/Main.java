package OOP.WEEK5LABS.labtasks;

import OOP.WEEK5LABS.labtasks.task2.Book;
import OOP.WEEK5LABS.labtasks.task2.Box;
import OOP.WEEK5LABS.labtasks.task2.CD;
import OOP.WEEK5LABS.labtasks.task3.MaxWeightBox;
import OOP.WEEK5LABS.labtasks.task3.OneThingBox;
import OOP.WEEK5LABS.labtasks.task3.Thing;

public class Main {
    public static void main(String[] args) {
        OneThingBox box = new OneThingBox();

        Thing thing = new Thing("Test", 5);
        Thing thing2 = new Thing("Sdads", 5);

        box.add(thing);
        box.add(thing2);

        System.out.println(box.isInTheBox(thing));
        System.out.println(box.isInTheBox(thing2));

    }
}
