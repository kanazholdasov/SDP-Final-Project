package task;

public abstract class TaskDecorator implements Task {
    protected Task decoratedTask;

    public TaskDecorator(Task task) {
        this.decoratedTask = task;
    }

    @Override
    public String getDetails() {
        return decoratedTask.getDetails();
    }
}