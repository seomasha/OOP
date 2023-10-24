package OOP.Week4LABS.shapes;

public class Rectangle extends Shape{

    private double height;
    private double width;
    public Rectangle(String col, FillType ft, double h, double w) {
        super(col, ft);
        this.width = w;
        this.height = h;
    }

    @Override
    public double getArea() {
        return width + height;
    }

    @Override
    public void displayInfo() {
        System.out.println("The color of the shape: " + super.getColor() + "\nAnd the shape is: " + super.getFillType() + "\nand the width is: " + this.width + "\n and the height: " + this.height);
    }


}
