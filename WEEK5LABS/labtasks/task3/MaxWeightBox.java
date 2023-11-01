package OOP.WEEK5LABS.labtasks.task3;

import java.util.ArrayList;
import java.util.Collection;

public class MaxWeightBox extends Box{
    private double maxWeight;
    private double weight;
    private ArrayList<Thing> storage = new ArrayList<Thing>();

    public MaxWeightBox(double weight) {
        this.maxWeight = weight;
        this.weight = 0;
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.storage.contains(thing)) {
            return true;
        }
        return false;
    }


    public double getWeight() {
        return weight;
    }

    @Override
    public void add(Thing thing) {
        if(this.weight >= this.maxWeight) {
            System.out.println("Weight limit exceeded.");
        }
        else{
            this.weight += thing.getWeight();
            this.storage.add(thing);
        }
    }
}
