package main;

import command.Command;
import command.TaskInvoker;
import facade.TaskManagementFacade;
import command.*;
import task.User;
public class Main {
    public static void main(String[] args) {
        DatabaseConnection db = DatabaseConnection.getInstance();

        TaskManagementFacade facade = new TaskManagementFacade();
        TaskInvoker invoker = new TaskInvoker();
        User user = new User("Alice");

        Command createTask = new CreateTaskCommand(facade, "Design Patterns Project", "High", "email", user);
        invoker.executeCommand(createTask);
    }
}
