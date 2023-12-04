package OOP.MIDTERMLIVECODING.Week7;

interface Logger {
    public String logMessage(String message);
}

record RecordLogger(String loggerName) implements Logger{

    @Override
    public String logMessage(String message) {
        return message + this.loggerName;
    }
}

class ClassLogger implements Logger{

    private String loggerName;

    public ClassLogger(String loggerName) {
        this.loggerName = loggerName;
    }

    @Override
    public String logMessage(String message) {
        return message + this.loggerName;
    }
}

class Main{
    public static void main(String[] args) {
        Logger recordLogger = new RecordLogger("Fikret");
        Logger classLogger = new ClassLogger("Sead");
        Logger logger = name -> "Ona je ljepsa od noci " + name;

        System.out.println(recordLogger.logMessage("Logger je "));
        System.out.println(classLogger.logMessage("Ovjde je loger "));
        System.out.println(logger.logMessage("Seadinho"));
    }
}