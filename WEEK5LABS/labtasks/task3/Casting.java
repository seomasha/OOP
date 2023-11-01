package OOP.WEEK5LABS.labtasks.task3;

public class Casting {
    public static void main(String[] args) {
        Box box1 = new MaxWeightBox(10);
        Box box2 = new OneThingBox();
        Box box3 = new BlackHoleBox();

        Thing thing = new Thing("Saludo", 4);

        box1.add(thing);
        box2.add(thing);
        box3.add(thing);

        Box box4 = new MaxWeightBox(10);
        Box box5 = new OneThingBox();
        Box box6 = new BlackHoleBox();

        MaxWeightBox mwb = (MaxWeightBox) box4;
        OneThingBox otb = (OneThingBox) box5;
        BlackHoleBox bhb = (BlackHoleBox) box6;
    }
}
