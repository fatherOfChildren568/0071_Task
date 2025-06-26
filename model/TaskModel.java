package model;

import constant.TaskType;
import utility.GetLocalDate;

public class TaskModel {
    // declear
    private int id;
    private String nameTask;
    private TaskType taskType;
    private String date;
    private double from;
    private double to;
    private String assignee;
    private String reviewer;

    // constructor no parameter
    public TaskModel() {
    }

    // constructor have parameters
    public TaskModel(int id, String nameTask, TaskType taskType, String date, double from, double to, String assignee,
            String reviewer) {
        this.id = id;
        this.nameTask = nameTask;
        this.taskType = taskType;
        this.date = GetLocalDate.getDate();
        this.from = from;
        this.to = to;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    // getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }
    // end getter and setter

    @Override
    public String toString() {
        return String.format("%-5s%-15s%-15s%-15s%-12s%-12s%-12s%-12s\n",
                id, nameTask, taskType, date, from, to, assignee, reviewer);
    }

}