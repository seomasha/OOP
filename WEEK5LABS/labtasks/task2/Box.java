package OOP.WEEK5LABS.labtasks.task2;

public class Box implements ToBeStored {

    private int boxSize;
    private double weight;
    private int maxWeight;

    public Box(int max) {
        this.boxSize = 0;
        this.weight = 0;
        this.maxWeight = max;
    }


    @Override
    public double weight() {
        return this.maxWeight;
    }

    @Override
    public String toString() {
        return "Box: " + this.boxSize + " things, total weight " + this.weight;
    }

    public void add(ToBeStored object) {
        if(this.weight > this.maxWeight) {
            System.out.println("Box limit exceeded.");
        }
        else{
            this.boxSize++;
            this.weight += object.weight();
        }
    }

}
