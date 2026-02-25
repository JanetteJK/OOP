package model;


import java.util.HashMap;

public class Notebook {
        private HashMap<String, String> notes;

    public Notebook(){
        notes = new HashMap<>();
    }

    public String getNote(String title){
        if (notes.containsKey(title)){
            return notes.get(title);
        }
        else return "No such title";
    }
    public void addNote(Note note){
        notes.put(note.getTitle(), note.getText());
    }
}
