package OOP.WEEK7LABS;

//Make an interface with one abstract method, then create two classes both implementing that interface and one of them
//has one attribute the second one has two attributes, create the getters and setters for all attributes and constructors
//and make an implementation for that method of the interface

interface Interfejs{
    abstract String test();
}

class Class1 implements Interfejs{
    private int at1;
    private String at2;

    public Class1(int a, String b) {
        this.at1 = a;
        this.at2 = b;
    }

    public int getAt1() {
        return this.at1;
    }

    public void setAt1(int newat) {
        this.at1 = newat;
    }

    public String getAt2() {
        return this.at2;
    }

    public void setAt2(String newat) {
        this.at2 = newat;
    }

    @Override
    public String test() {
        return "Test";
    }
}

class Class2 implements Interfejs{
    private int at1;

    public Class2(int a) {
        this.at1 = a;
    }

    public int getAt1() {
        return this.at1;
    }

    public void setAt1(int newat) {
        this.at1 = newat;
    }

    @Override
    public String test() {
        return "test";
    }
}