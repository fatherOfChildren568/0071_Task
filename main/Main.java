package main;

import java.util.Scanner;

import constant.Message;
import constant.TaskType;
import controller.TaskController;
import dto.TaskDTO;
import utility.TaskException;
import utility.Validator;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // declear
        TaskDTO dto = new TaskDTO();
        TaskController taskController = new TaskController();
        // handle function
        while (true) {
            try {
                // display menu
                menu();
                // input function
                int choice = Integer.parseInt(sc.nextLine().trim());
                // check function
                if (!Validator.isValidLimitInt(choice, 1, 4)) {
                    continue;
                }
                // HANDLE
                switch (choice) {
                    // ask task
                    case 1:
                        // input name task
                        System.out.print(Message.PROMT_NAME_TASK);
                        String nameTask = sc.nextLine();
                        if (!Validator.isValidString(nameTask)) {
                            continue;
                        }

                        // input task type
                        System.out.println(Message.PROMPT_TASK_TYPE);
                        taskController.displayListTaskType();
                        int task = Integer.parseInt(sc.nextLine());

                        TaskType taskType = Validator.isValidTaskType(task);

                        // input time start
                        System.out.print(Message.PROMPT_TIME_START);
                        double start = Double.parseDouble(sc.nextLine());

                        // check time in rage 8 -> 17.5
                        if (!Validator.isValidLimitDoulbe(start, 8.0, 17.5)) {
                            continue;
                        }

                        // check valid time is .5
                        if (!Validator.isValidTimeFormart(start)) {
                            continue;
                        }

                        // input time end
                        System.out.print(Message.PROMPT_TIME_END);
                        double end = Double.parseDouble(sc.nextLine());

                        // check time in rage 8 -> 17.5
                        if (!Validator.isValidLimitDoulbe(end, 8.0, 17.5)) {
                            continue;
                        }

                        // check valid time is .5
                        if (!Validator.isValidTimeFormart(end)) {
                            continue;
                        }

                        // input assignee
                        System.out.print(Message.PROMPT_ASSIGNEE);
                        String assignee = sc.nextLine();
                        // check valid
                        if (!Validator.isValidString(assignee)) {
                            continue;
                        }

                        // input reviewer
                        System.out.print(Message.PROMT_REVIEWER);
                        String reviewer = sc.nextLine();
                        // check valid
                        if (!Validator.isValidString(reviewer)) {
                            continue;
                        }

                        // set data for dto
                        dto.setNameTask(nameTask);
                        dto.setTaskType(taskType);
                        dto.setFrom(start);
                        dto.setTo(end);
                        dto.setAssignee(assignee);
                        dto.setReviewer(reviewer);

                        // set data for controller
                        taskController.setInput(dto);
                        // add task
                        taskController.addTask();
                        break;
                    // delete task
                    case 2:
                        // display list task
                        taskController.displayListTask();
                        int size = taskController.getSizeOfListTask();
                        // input id need delete
                        System.out.print(Message.PROMPT_ID);
                        int dId = Integer.parseInt(sc.nextLine());

                        // check valid dId
                        if (!Validator.isValidLimitInt(dId, 1, size)) {
                            continue;
                        }
                        // set data for dto
                        dto.setId(dId);
                        // set data for controller
                        taskController.setInput(dto);
                        // delete task
                        taskController.delete();
                        break;
                    // display task
                    case 3:
                        taskController.displayListTask();
                        break;
                    // exit
                    case 4:
                        System.exit(0);
                        sc.close();
                        break;

                }
            } catch (NumberFormatException e) {
                System.out.println(Message.ERROR_INVALID_INPUT_INT);
            } catch (TaskException taskException) {
                System.out.println(taskException);
            }

        }
    }

    private static void menu() {
        System.out.println("========= Task program =========");
        System.out.println("1.Add Task");
        System.out.println("2.Delete task");
        System.out.println("3.Display Task");
        System.out.println("4.Exit");
        System.out.print("Choice: ");
    }
}
