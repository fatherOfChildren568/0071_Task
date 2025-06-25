package dto;

import constant.*;

public class TaskDTO {

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
    public TaskDTO() {
    }

    // constructor have parameters
    public TaskDTO(int id, String nameTask, TaskType taskType, String date, double from, double to, String assignee,
            String reviewer) {
        this.id = id;
        this.nameTask = nameTask;
        this.taskType = taskType;
        this.date = date;
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
}