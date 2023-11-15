package exercicios.avancado.todo;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
    private List<Task> tasks;

    public Tasks() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void removeTask(Task task) {
        this.tasks.remove(task);
    }

    public void markTaskAsCompleted(Task task) {
        task.setCompleted(true);
    }

    public List<Task> getTasks() {
        return this.tasks;
    }

}
