package controller;

import java.util.ArrayList;
import java.util.List;

import constant.Message;
import constant.TaskType;
import dto.TaskDTO;
import model.TaskModel;
import utility.GetLocalDate;
import view.TaskView;

public class TaskController {

    // declear
    private TaskView taskView = new TaskView();
    private TaskDTO input = new TaskDTO();
    private List<TaskModel> listTask = new ArrayList<>();

    // constructor
    public TaskController() {
        TaskModel taskModel1 = new TaskModel(1, "haha", TaskType.CODE, GetLocalDate.getDate(), 8.0, 9.0, "a", "bsg");
        TaskModel taskModel2 = new TaskModel(2, "sdgsd", TaskType.CODE, GetLocalDate.getDate(), 9, 14, "a=p", "bssdg");
        TaskModel taskModel3 = new TaskModel(3, "sgd sd", TaskType.CODE, GetLocalDate.getDate(), 10, 13, "as", "bs");
        listTask.add(taskModel1);
        listTask.add(taskModel2);
        listTask.add(taskModel3);
    }

    // setInput
    public void setInput(TaskDTO input) {
        this.input = input;
    }

    // display task view
    public void displayListTaskType() {
        taskView.displayAllTask();
    }

    // init id auto increase
    private int idAuto = 1;

    // add task
    public void addTask() {
        String nameTask = input.getNameTask();
        TaskType taskType = input.getTaskType();
        double start = input.getFrom();
        double end = input.getTo();
        String assignee = input.getAssignee();
        String reviewer = input.getReviewer();
        listTask.add(new TaskModel(idAuto, nameTask, taskType, nameTask, start, end, assignee, reviewer));
        idAuto++;
    }

    public void displayListTask() {
        // set header
        taskView.setHeader(Message.HEADER_LSIT);
        // create varriable to store data
        StringBuilder sb = new StringBuilder();
        // loop in listTask
        for (TaskModel taskModel : listTask) {
            sb.append(taskModel);
        }
        // set body
        taskView.setBody(sb.toString());
        // display
        taskView.display();
    }

    // get size of list task
    public int getSizeOfListTask() {
        return listTask.size();
    }

    // delete task
    public void delete() {
        // get id need delete
        int id = input.getId();
        // loop in list to find task have id
        for (int i = 0; i < listTask.size(); i++) {
            TaskModel taskModel = listTask.get(i);
            if (taskModel.getId() == id) {
                listTask.remove(taskModel);
                break;
            }
        }
    }

}
