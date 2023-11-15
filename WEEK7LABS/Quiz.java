package OOP.WEEK7LABS;

interface Interfejs{
    abstract String test();
}

class Test1 implements Interfejs {

    private int atribut1;
    private String atribut2;

    public Test1(int atribut1, String atribut2) {
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

    @Override
    public String test() {
        return "Jedan";
    }
}

class Test2 implements Interfejs {

    public Test2(String atribut1) {
        this.atribut1 = atribut1;
    }

    public String getAtribut1() {
        return atribut1;
    }

    public void setAtribut1(String atribut1) {
        this.atribut1 = atribut1;
    }

    private String atribut1;
    @Override
    public String test() {
        return "Dva";
    }
}