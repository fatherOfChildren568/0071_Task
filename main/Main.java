package main;

import java.util.Scanner;

import constant.Message;
import dto.TaskDTO;
import utility.TaskException;
import utility.Validator;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // declear
        TaskDTO taskDTO = new TaskDTO();

        // handle function
        while (true) {
            try {
                // display menu
                menu();
                // input function
                int choice = Integer.parseInt(sc.nextLine().trim());
                // check function
                if (!Validator.isValidInt(choice, 1, 4)) {
                    continue;
                }

                switch (choice) {
                    //ask task
                    case 1:
                        //input name task
                        String nameTask = sc.nextLine();
                        if(!Validator.isValidString(nameTask)){
                            continue;
                        }
                        break;

                        //input task type
                        
                    //delete task
                    case 2:

                        break;
                    //display task
                    case 3:

                        break;
                    //exit
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
