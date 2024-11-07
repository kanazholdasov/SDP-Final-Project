package task;

public class BasicTask implements Task {
    private String title;

    public BasicTask(String title) {
        this.title = title;
    }

    @Override
    public String getDetails() {
        return "Task: " + title;
    }
}