package OOP.MIDTERMLIVECODING.Week5;

import java.util.ArrayList;
import java.util.List;

class Box implements ToBeStored {
    private double maxWeight;
    private double weight;
    private List<ToBeStored> storage = new ArrayList<>();

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.weight = 0;
    }

    @Override
    public double weight() {
        return this.maxWeight;
    }

    public void addThings(ToBeStored toBeStored) {
        if (toBeStored.weight() > this.maxWeight && this.weight > this.maxWeight) {
            System.out.println("No more storage");
        } else {
            storage.add(toBeStored);
            this.weight++;
        }
    }
}
