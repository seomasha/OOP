package OOP.WEEK7LABS.Exercise1;

public class Main {
    public static void main(String[] args) {
        RecordLogger recordLogger = new RecordLogger("Sead");
        ClassLogger classLogger = new ClassLogger("Sejo");
        Logger logger = (String name) -> System.out.println(name);

        recordLogger.logMessage("Sejo");
        classLogger.logMessage("Sejo");
        logger.logMessage("Sead");
    }
}
