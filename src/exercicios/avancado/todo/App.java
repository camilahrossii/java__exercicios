package exercicios.avancado.todo;

import exercicios.avancado.todo.Tasks;

public class App {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();

        tasks.addTask(new Task("Comprar leite", "Comprar leite no mercado"));

        tasks.addTask(new Task("Lavar roupas", "Lavar roupas do cesto"));

        tasks.removeTask(tasks.getTasks().get(0));

        tasks.markTaskAsCompleted(tasks.getTasks().get(0));

        for (Task task : tasks.getTasks()) {
            System.out.println(
                    task.getTitle() + ": " + task.getDescription() + " (Concluída: " + task.isCompleted() + " )");
        }
    }
}
