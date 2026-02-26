package controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;
import model.Notebook;
import model.Note;
import view.NotebookView;

import java.util.ArrayList;

public class NotebookController {
    Notebook notebook = new Notebook();
    @FXML
    private TextField textField;

    @FXML
    private TextArea textArea;

    @FXML
    private Button button;

    @FXML
    private TextArea writtenNotes;

    @FXML
    private void createNote(){
        Note note = new Note(textField.getText(), textArea.getText());
        notebook.addNote(note);
        System.out.println(textField.getText() + " : " + textArea.getText());
        getNotes();
        textArea.setText("");
        textField.setText("");

    }

    private void getNotes() {
        for (int i = 0; i < notebook.getNotes().size(); i++);{
            System.out.println(notebook.getNotes());
            writtenNotes.setText("Saved notes: \n" + notebook.getNotes());

        }


    }
}
