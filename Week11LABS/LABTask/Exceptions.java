package OOP.Week11LABS.LABTask;

class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String message) {
        super(message);
    }
}

class EmptyStudentListException extends RuntimeException{
    public EmptyStudentListException(String message) {
        super(message);
    }
}