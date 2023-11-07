package OOP.WEEK6LABS.Lecture;

public class Component {
    private String serialNumber;

    public void say() {
        System.out.println("Component said something");
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
