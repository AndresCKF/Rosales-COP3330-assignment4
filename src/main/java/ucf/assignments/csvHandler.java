package ucf.assignments;

import java.util.*;

public class csvHandler {

    public HashMap readCSVList(String filename){
        List<ToDo> listItems = new ArrayList<>();
        HashMap<String, List> toDoList = new HashMap<>();
        //try and open file
        //if not existent return empty List
        //use csv parser to create todos List
        //format listname, duedate, description, completion status
        // give listname to Map key, value ToDo Object
        return toDoList;
    }

    public void writeCSV(List<ToDo> todos){
        //check if file exists
        //if does, ask user if they would like to overwrite
        //if file doesnt exist or if yes, create file
        //loop through list writing to file with commas,new line for every TODO
    }
    public void createFile(String filename){
        //try and create new file
        //if file success print file created
        //if not print file already exists
        //catch ioexception print error
    }
}
