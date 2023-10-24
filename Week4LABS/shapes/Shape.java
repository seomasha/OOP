package OOP.Week4LABS.shapes;

public abstract class Shape {
    private String color;
    private FillType fillType;

    public Shape(String col, FillType ft) {
        this.color = col;
        this.fillType = ft;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String newcol) {
        this.color = newcol;
    }

    public FillType getFillType() {
        return this.fillType;
    }

    public void setFillType(FillType newft) {
        this.fillType = newft;
    }

    public void displayInfo() {
        System.out.println("The color of the shape: " + this.color + "\nAnd the shape is: " + this.fillType);
    }

    public abstract double getArea();
}

enum FillType {
    FILLED,
    NOT_FILLED
}