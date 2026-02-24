package Controller;
import Model.Pet;
import View.PetView;


public class PetController {
    private Pet pet;

    public PetController() {

    }

    public void moving() {

    }

    public int getPetX(){
        return pet.getX();
    }
    public int getPetY(){
        return pet.getY();
    }
    public int getGridSize(){
        return pet.getGridSize();
    }
}
