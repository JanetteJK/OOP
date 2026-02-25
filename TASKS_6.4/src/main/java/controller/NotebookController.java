package controller;
import javafx.fxml.FXML;
import model.Notebook;
import model.Note;

import java.awt.*;


public class NotebookController {
    Notebook notebook = new Notebook();
    @FXML
    private TextField textField;

    @FXML
    private TextArea textArea;

    @FXML
    private Button button;

    @FXML
    private void createNote(){
        Note note = new Note(textField.getText(), textArea.getText());
        notebook.addNote(note);
        System.out.println("fmdfgkjdmslöf");
    }
}
