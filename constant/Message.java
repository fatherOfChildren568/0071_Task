package constant;

public class Message {

    // private constuctor
    private Message() {

    }

    public static final String ERROR_LIMIT_CHOICE = "Please input in range %s -> %s";
    public static final String ERROR_INVALID_INPUT_INT = "Invalid choice";
    public static final String PROMPT_TIME_START = "Time start: ";
    public static final String PROMPT_TIME_END = "Time start: ";
    public static final String PROMT_NAME_TASK = "Name task: ";
    public static final String PROMPT_TASK_TYPE = "Task type: ";
    public static final String PROMPT_ASSIGNEE = "Assignee: ";
    public static final String PROMT_REVIEWER = "Reviewer: ";

    public static final String ERROR_INPUT_EMPTY = "String cannot be empty";
    public static final String ERROR_LIMIT_TIME = "Time limit from %s --> %s";
    public static final String ERROR_TIME_FORMART = "Input time is error formart";

    public static final String HEADER_LSIT = String.format("%-5s%-15s%-15s%-15s%-12s%-12s%-12s%-12s\n",
            "ID", "Name Task", "Type Task", "Date", "From", "To", "Assignee", "Reviewer");
}
