package OOP.WEEK7LABS;

//Create one abstract class which has two attributes with constructors getters and setters and one method. Create two
//classes which have a constructor and the method from the abstract class and third class which is a generic class
//extending that abstract class and create constructors getters and setters

abstract class Klasa {
    private int at1;
    private String at2;

    public Klasa(int a, String b) {
        this.at1 = a;
        this.at2 = b;
    }

    public int getAt1() {
        return this.at1;
    }

    public void setAt1(int a) {
        this.at1 = a;
    }

    public String getAt2() {
        return this.at2;
    }

    public void setAt2(String a) {
        this.at2 = a;
    }

    abstract String test();
}

class Quiz1 extends Klasa{
    public Quiz1(int a, String b) {
        super(a, b);
    }

    @Override
    public String test() {
        return "Test";
    }
}

class Quiz2 extends Klasa{
    public Quiz2(int a, String b) {
        super(a, b);
    }

    @Override
    public String test() {
        return "Test";
    }
}

class Quiz3 <T> extends Klasa{
    private T type;

    public Quiz3(int a, String b, T t) {
        super(a, b);
        this.type = t;
    }

    public T getType() {
        return this.type;

    }

    public void setType(T newType) {
        this.type = newType;
    }

    @Override
    public String test() {
        return "Test";
    }
}