package model;


import java.util.HashMap;

public class Notebook {
        private HashMap<String, String> notes;

    public Notebook(){
        notes = new HashMap();
    }

    public HashMap getNotes(){
            return notes;
        }


    public void addNote(Note note){
        notes.put(note.getTitle(), note.getText());
    }
}
