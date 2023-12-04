package OOP.MIDTERMLIVECODING.Week4;

class Shape {
    private String color;
    private FillType fillType;
    public Shape(String color, FillType fillType)
    {
        this.color = color;
        this.fillType = fillType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FillType getFillType() {
        return fillType;
    }

    public void setFillType(FillType fillType) {
        this.fillType = fillType;
    }

    public void displayInfo(){
        System.out.println(this.color + this.fillType);
    }

    public double getArea(){
        return 0;
    }
}

class Circle extends Shape{
    private double radius;
    public Circle(String color, FillType fillType, double radius)
    {
        super(color, fillType);
        this.radius = radius;
    }
    @Override
    public void displayInfo()
    {
        System.out.println(this.getColor() + this.getFillType() + this.radius);
    }
    @Override
    public double getArea()
    {
        return 1.3;
    }
    public double calculateCircumference(double PI, double r)
    {
        return 2*PI*r;
    }
    public double calculateCircumference(double r)
    {
        return 2*3.14*r;
    }
}


enum FillType{
    FILLED, NOT_FILLED
}