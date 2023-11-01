package OOP.WEEK5LABS.labtasks.task3;

import java.util.ArrayList;


public class BlackHoleBox extends Box{

    private ArrayList<Thing> storage = new ArrayList<Thing>();
    @Override
    public void add(Thing thing) {
        this.storage.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }

}
