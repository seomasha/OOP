package OOP.WEEK7LABS;

public class TestingFunctionalInterface{
    public static void main(String[] args) {
        OperationalInterface sumOperation = (int x, int y) -> x + y;

        OperationalInterface multiplyOperation = (int x, int y) -> x * y;

        MessageInterface messageInterface = message -> "F1km37 ".concat(message);

        System.out.println(doAOperation(1, 5, sumOperation));
        System.out.println(doAOperation(1, 5, multiplyOperation));
    }

    public static int doAOperation(int a, int b, OperationalInterface object) {
        return object.operation(a, b);
    }
}
