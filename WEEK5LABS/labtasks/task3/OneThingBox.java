package OOP.WEEK5LABS.labtasks.task3;

import java.util.ArrayList;

public class OneThingBox extends Box{

    private ArrayList<Thing> storage= new ArrayList<Thing>();
    @Override
    public void add(Thing thing) {
        if(this.storage.size() >= 1) {
            return;
        }
        else{
            this.storage.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.storage.contains(thing)) {
            return true;
        }
        return false;
    }

}
