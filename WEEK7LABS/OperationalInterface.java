package OOP.WEEK7LABS;

@FunctionalInterface
interface OperationalInterface {
    int operation(int a, int b);
}

@FunctionalInterface
interface MessageInterface{
    void sayHello(String message);
}