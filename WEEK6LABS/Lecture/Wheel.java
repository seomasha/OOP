package OOP.WEEK6LABS.Lecture;

public class Wheel extends Component{
    private int diameter;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void say() {
        System.out.println("Wheel said something");
    }
}
