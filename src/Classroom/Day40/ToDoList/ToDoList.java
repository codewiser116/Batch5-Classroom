package Classroom.Day40.ToDoList;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> tasks = new ArrayList<>();
    private ArrayList<Task> completedTasks = new ArrayList<>();

    public void addTask(Task task){
        this.tasks.add(task);
        System.out.println(task.getName() + " task was added!");
    }

    public void displayTasks(){
        System.out.println("Current tasks: ");
        for (Task task : tasks) {
            System.out.println("Task name: " + task.getName());
            System.out.println("Due date: " + task.getDueDate());
        }
    }

    public void completeTask(String name){
        for(int i = 0; i < tasks.size(); i++){
            if(tasks.get(i).getName().equals(name)){
                completedTasks.add(tasks.get(i));
                tasks.remove(i);
                System.out.println("Task was moved to completed");
                break;
            }
        }
    }

    public void displayCompletedTasks(){
        System.out.println("Completed tasks: ");
        for (Task task : completedTasks) {
            System.out.println("Task name: " + task.getName());
        }
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public ArrayList<Task> getCompletedTasks() {
        return completedTasks;
    }

    public void setCompletedTasks(ArrayList<Task> completedTasks) {
        this.completedTasks = completedTasks;
    }
}
