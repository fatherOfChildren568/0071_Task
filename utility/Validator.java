package utility;

import constant.Message;

public class Validator {

    // private constructor
    private Validator() {

    }

    public static boolean isValidInt(int input, int min, int max) {
        if (input >= min && input <= max) {
            return true;
        }
        throw new TaskException(String.format(Message.ERROR_LIMIT_CHOICE, min, max));
    }

    public static boolean isValidString(String nameTask) {
        if (nameTask.trim() != null) {
            return true;
        }
        throw new TaskException(Message.ERROR_INPUT_EMPTY);
    }
}
