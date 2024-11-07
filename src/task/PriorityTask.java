package task;

public class PriorityTask extends TaskDecorator {
    private String priority;

    public PriorityTask(Task task, String priority) {
        super(task);
        this.priority = priority;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Priority: " + priority;
    }
}