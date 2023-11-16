package OOP.WEEK7LABS.Exercise1;

public class ClassLogger implements Logger{

    private String loggerName;

    public ClassLogger(String name) {
        this.loggerName = name;
    }

    @Override
    public void logMessage(String name) {
        System.out.println("The class loggers name: " + this.loggerName);
    }
}
