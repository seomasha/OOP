package OOP.WEEK7LABS.Exercise1;

public record RecordLogger(String loggerName) implements Logger {
    @Override
    public void logMessage(String name) {
        System.out.println("The records loggers name: " + this.loggerName);
    }
}
