package day4.collections.set.hashset;

import java.util.LinkedHashSet;

public class TodoList {

    // Underlying DataStructure to implement the Todo List
    LinkedHashSet<String> tasks = new LinkedHashSet<>();


    // Add task
    public void addTask(String task) {
        this.tasks.add(task);
    }


    // Display all the tasks
    public void displayTasks() {
        System.out.println("To-Do List:: ");
        for(String task : this.tasks) {
            System.out.println("- "+ task);
        }
    }


    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        todoList.addTask("By Groceries");
        todoList.addTask("Walk the Dog");
        todoList.addTask("complete the programming practise");
        todoList.addTask("Recap internal working of hashset");
        todoList.addTask("Schedule a Doctor Appointment");
        todoList.addTask("Complete the Core Java");

        todoList.displayTasks();

    }
}
