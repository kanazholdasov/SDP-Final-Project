package notification;

public class EmailNotification implements Notification {
    public void sendNotification(String message) {
        System.out.println("Email sent: " + message);
    }
}