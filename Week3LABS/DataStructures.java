package OOP.Week3LABS;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1,"Push lab code to the github", Status.TO_DO),
                new TaskItem(2,"Prepare for the quiz", Status.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2", Status.COMPLETED));
    }

    public List<TaskItem> getTasks() {
        return tasks;
    }

    public List<TaskItem> getByStatus(Status status) {

        ArrayList<TaskItem> items = new ArrayList<>();

        for(TaskItem task : tasks) {
            if(task.taskStatus == status) {
                items.add(task);
            }
        }

        return items;
    }

    public List<TaskItem> getByIdGreaterOrEqualToTwo() {

        ArrayList<TaskItem> items = new ArrayList<>();

        for(TaskItem task : tasks) {
            if(task.taskId >= 2) {
                items.add(task);
            }
        }

        return items;


    }

    public void printTaskDescription() {
        for(TaskItem task : tasks) {
            System.out.println(task.taskDescription);
        }
    }
}
