package OOP.Week3LABS;

public class TaskItem {
    int taskId;
    String taskDescription;
    Status taskStatus;

    public TaskItem(int id, String desc, Status status) {
        this.taskId = id;
        this.taskDescription = desc;
        this.taskStatus = status;
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

    public Status getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Status taskStatus) {
        this.taskStatus = taskStatus;
    }
}
