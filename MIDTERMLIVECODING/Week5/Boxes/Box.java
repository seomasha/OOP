package OOP.MIDTERMLIVECODING.Week5.Boxes;

import OOP.WEEK5LABS.labtasks.task2.ToBeStored;

import java.util.Collections;
import java.util.List;

public abstract class Box{
    public abstract void add(ToBeStored thing);

    public abstract void add(List<Thing> things);

    public abstract boolean isInTheBox(ToBeStored thing);

    public static void main(String[] args) {

    }
}
