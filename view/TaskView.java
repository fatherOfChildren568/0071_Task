package view;

public class TaskView {

    // declear
    private String header;
    private String body;

    //set header
    public void setHeader(String header) {
        this.header = header;
    }

    //set body
    public void setBody(String body) {
        this.body = body;
    }

    // display list task type
    public void displayAllTask() {
        System.out.println("1.Code");
        System.out.println("2.Test");
        System.out.println("3.Design");
        System.out.println("4.Review");
        System.out.print("Choice: ");
    }

    //display
    public void display(){
        System.out.print(header);
        System.out.print(body);
    }
}
