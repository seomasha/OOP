package OOP.WEEK7LABS;

abstract class Quiz2 {
    private int atribut1;
    private String atribut2;

    public Quiz2(int atribut1, String atribut2) {
        this.atribut1 = atribut1;
        this.atribut2 = atribut2;
    }

    public int getAtribut1() {
        return atribut1;
    }

    public void setAtribut1(int atribut1) {
        this.atribut1 = atribut1;
    }

    public String getAtribut2() {
        return atribut2;
    }

    public void setAtribut2(String atribut2) {
        this.atribut2 = atribut2;
    }

    public String test() {
        return "Test";
    }
}
class Klasa1 extends Quiz2 {
    public Klasa1(int atribut1, String atribut2) {
        super(atribut1, atribut2);
    }

    @Override
    public String test() {
        return "kec";
    }
}

class Klasa2 extends Quiz2 {
    public Klasa2(int atribut1, String atribut2) {
        super(atribut1, atribut2);
    }

    @Override
    public String test() {
        return "Dva";
    }
}

class Klasa3 <T> extends Quiz2{

    private T nesto;

    public Klasa3(int atribut1, String atribut2, T nesto) {
        super(atribut1, atribut2);
        this.nesto = nesto;
    }

    public T getNesto() {
        return nesto;
    }

    public void setNesto(T nesto) {
        this.nesto = nesto;
    }
}
