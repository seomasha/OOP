package OOP.MIDTERMLIVECODING.Week3;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TaskItem {
    private int taskId;
    private String taskDescription;
    private taskStatus taskstatus;

    public TaskItem(int taskId, String taskDescription, taskStatus taskstatus) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.taskstatus = taskstatus;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public taskStatus getTaskstatus() {
        return taskstatus;
    }

    public void setTaskstatus(taskStatus taskstatus) {
        this.taskstatus = taskstatus;
    }

    @Override
    public String toString() {
        return "["+this.taskId + " " + this.taskDescription + " " + this.taskstatus + "]";
    }
}

enum taskStatus
{
    TO_DO, IN_PROGRESS, COMPLETED, CANCELLED
}

class DataStructures{
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to the github", taskStatus.TO_DO),
                new TaskItem(2, "Prepare for the quiz", taskStatus.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from lab2", taskStatus.COMPLETED)
        );
    }
    public List<String> getAllObjects()
    {
        ArrayList<String> list = new ArrayList<>();
        for(TaskItem t : tasks) {
            list.add(t.toString());
        }
        return list;
    }

    public List<TaskItem> getByStatus(taskStatus status) {
        return tasks.stream().filter(taskItem -> taskItem.getTaskstatus().equals(status)).toList();
    }

    public List<TaskItem> findTasksById()
    {
        return tasks.stream().filter(taskItem -> taskItem.getTaskId() >= 2).toList();
    }

    public void printConsoleDescription() {
        tasks.stream().forEach(taskItem -> System.out.println(taskItem.getTaskDescription()));
    }

}

class DBConnection{
    private static final String CONNECTION_STRING = "";
    private static final String USERNAME = "";
    private static final String PASSWORD = "";
    private Connection connection = null;

    public DBConnection(){
        try{
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        }
        catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAllTasks() throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM tasks;");

        ResultSet rs = statement.executeQuery();

        while(rs.next()) {
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("name"));
        }
    }
}

class Main{
    public static void main(String[] args) throws SQLException{
    }
}