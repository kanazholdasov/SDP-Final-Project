package facade;

import notification.Notification;
import notification.NotificationFactory;
import task.*;

public class TaskManagementFacade {
    private NotificationFactory notificationFactory;

    public TaskManagementFacade() {
        this.notificationFactory = new NotificationFactory();
    }

    public void createTask(String title, String priority, String notificationType, User user) {
        Task task = new PriorityTask(new BasicTask(title), priority);
        user.update("Task created: " + task.getDetails());

        Notification notification = notificationFactory.createNotification(notificationType);
        notification.sendNotification("New Task: " + task.getDetails());
    }
}