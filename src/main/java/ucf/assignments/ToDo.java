package ucf.assignments;

public class ToDo {
    public String dueDate;
    public String description;
    public char status;

    public ToDo(){
        new ToDo("","",'I');
    }
    public ToDo(String dueDate, String description, char status){
        this.dueDate = dueDate;
        this.description = description;
        this.status = status;
    }
    public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setStatus(char status){
        this.status = status;
    }
    public String getDueDate(){
        return this.dueDate;
    }
    public String getDescription(){
        return this.description;
    }
    public char getStatus(){
        return this.status;
    }
}
