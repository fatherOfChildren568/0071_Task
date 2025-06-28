package utility;

import constant.Message;
import constant.TaskType;

public class Validator {

    // private constructor
    private Validator() {

    }

    public static boolean isValidLimitInt(int input, int min, int max) {
        if (input >= min && input <= max) {
            return true;
        }
        throw new TaskException(String.format(Message.ERROR_LIMIT_CHOICE, min, max));
    }

    public static boolean isValidString(String input) {
        if (input.trim() != null) {
            return true;
        }
        throw new TaskException(Message.ERROR_INPUT_EMPTY);
    }

    public static TaskType isValidTaskType(int task) {
        return TaskType.choiceTask(task);
    }

    //check double in range
    public static boolean isValidLimitDoulbe(double input, double min, double max) {
        if(input >= min && input <= max){
            return true;
        }
        throw new TaskException(String.format(Message.ERROR_LIMIT_TIME, min, max));
    }

    //check formart time
    public static boolean isValidTimeFormart(double input) {
        if((input*10)%5 != 0){
            throw new TaskException(Message.ERROR_TIME_FORMART);
        }
        return true;
    }

    public static boolean isValidInt(int dId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isValidInt'");
    }
}
