package Classroom.Day40.ToDoList;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ToDoList app = new ToDoList();
        Task task1 = new Task("Complete assignments", "2024-03-05");

        app.addTask(task1);

        app.displayTasks();

        app.completeTask("Complete assignments");

        app.displayCompletedTasks();

    }
}
