package controller;

import java.util.ArrayList;
import java.util.List;

import constant.Message;
import constant.TaskType;
import dto.TaskDTO;
import model.TaskModel;
import view.TaskView;

public class TaskController {

    // declear
    private TaskView taskView = new TaskView();
    private TaskDTO input = new TaskDTO();
    private List<TaskModel> listTask = new ArrayList<>();

    // setInput
    public void setInput(TaskDTO input) {
        this.input = input;
    }

    // display task view
    public void displayListTaskType() {
        taskView.displayAllTask();
    }

    private int idAuto = 1;

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

}
