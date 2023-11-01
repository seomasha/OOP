package OOP.WEEK5LABS.labtasks.task3;

public class Thing {
    private double weight;
    private String name;

    public Thing(String name) {
        this.name = name;
        this.weight = 0;
    }

    public Thing(String name, double weight) {
        if(weight < 0) {
            throw new IllegalArgumentException("The weight can't be less than 0.");
        }
        else{
            this.name = name;
            this.weight = weight;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public double getWeight() {
        return weight;
    }
}
