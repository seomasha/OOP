package OOP.Week4LABS.shapes;

public class Circle extends Shape{

    private double radius;
    public Circle(String col, FillType ft, double rad) {
        super(col, ft);
        this.radius = rad;
    }

    @Override
    public double getArea() {
        double pi = 3.14;

        return this.radius * pi;
    }

    @Override
    public void displayInfo() {
        System.out.println("The color of the shape: " + super.getColor() + "\nAnd the shape is: " + super.getFillType() + "\n and the radius is: " + this.radius);
    }

    public double calculateCircumference(double rad, double pi) {
        return 2 * pi * rad;
    }

    public double calculateCircumference(double rad) {
        return 2 * rad /* 3.14 */;
    }

}
