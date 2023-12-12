package OOP.Week11LABS.LABTask;

public record Student(int ID, String name, String university, String department, double GPA) {
    @Override
    public String toString() {
        return this.name;
    }
}
