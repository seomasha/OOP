package OOP.MIDTERMLIVECODING.Week5.Boxes;

public record Thing(String name, double weight) {
    public Thing(String name, double weight) {
        if(weight < 0) {
            throw new IllegalArgumentException("Ne moze bit manje od nula jbt.");
        }
        this.name = name;
        this.weight = weight;
    }


}
