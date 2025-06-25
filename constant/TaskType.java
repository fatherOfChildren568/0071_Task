package constant;

public enum TaskType {
    CODE("Code"),
    TEST("Test"),
    REVIEW("Review"),
    DESIGN("Design");

    private String taskType;

    private TaskType(String taskType) {
        this.taskType = taskType;
    }

    public static TaskType choiceTask(int choice) {
        switch (choice) {
            case 1:
                return CODE;
            case 2:
                return TEST;
            case 3:
                return REVIEW;
            case 4:
                return DESIGN;
            default:
                throw new IllegalStateException();
        }
    }

    public String toString() {
        return taskType;
    }
}
