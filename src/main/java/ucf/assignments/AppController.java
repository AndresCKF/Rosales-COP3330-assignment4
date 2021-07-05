package ucf.assignments;

import javafx.fxml.FXML;

import java.awt.event.ActionEvent;

public class AppController {

    @FXML
    public void addToDoListButton(ActionEvent actionEvent){
        addToDoList();
    }

    private void addToDoList() {
        //initialize new List of Todo objects
        //create prompt window asking for name
        //if name exists tell them sorry name already exists.
        //append name, List, to HashMap<Name, List<ToDos> MasterList
    }

    @FXML
    public void removeToDoListButton(ActionEvent actionEvent){
        removeToDoList();
    }

    private void removeToDoList() {
        //delete a List object
        //retrieve
    }

    @FXML
    public void loadListButton(ActionEvent actionEvent){
        loadList();
    }

    private void loadList() {
        //call readCSVList with listname
        //return a Hashmap ToDoList, open in titlepane.
    }

    @FXML
    public void saveListsButton(ActionEvent actionEvent){
        saveLists();
    }

    public void saveLists() {
        //call
    }

    @FXML
    public void addToDoButton(ActionEvent actionEvent){
        addToDo();
    }

    public void addToDo() {
    }
    @FXML
    public void removeToDoButton(ActionEvent actionEvent){
        removeToDo();
    }

    public void removeToDo() {
    }

    @FXML
    public void saveSingleListButton(ActionEvent actionEvent){
        saveSingleList();
    }

    private void saveSingleList() {
    }
    
}
