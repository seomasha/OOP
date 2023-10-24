package OOP.Week4LABS.shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", FillType.FILLED, 2.56);
        Rectangle rectangle = new Rectangle("Blue", FillType.NOT_FILLED, 2.45, 1.26);

        circle.displayInfo();
        rectangle.displayInfo();
    }
}
