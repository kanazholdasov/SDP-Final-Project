package command;

import facade.TaskManagementFacade;
import task.User;

public class CreateTaskCommand implements Command {
    private TaskManagementFacade taskFacade;
    private String title;
    private String priority;
    private String notificationType;
    private User user;

    public CreateTaskCommand(TaskManagementFacade taskFacade, String title, String priority, String notificationType, User user) {
        this.taskFacade = taskFacade;
        this.title = title;
        this.priority = priority;
        this.notificationType = notificationType;
        this.user = user;
    }

    @Override
    public void execute() {
        taskFacade.createTask(title, priority, notificationType, user);
    }
}