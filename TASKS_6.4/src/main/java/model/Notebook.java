package model;


import java.util.ArrayList;
import java.util.HashMap;

public class Notebook {
        private ArrayList<Note> notes;

    public Notebook(){
        notes = new ArrayList<>();
    }

    public ArrayList<Note> getNotes(){
            return notes;
        }


    public void addNote(Note note){
        notes.add(note);
    }
}
