package Controller;
import Model.Pet;

public class PetController {
    private Pet pet;

    public PetController(Pet pet) {
        this.pet = pet;
    }

    public int getPetX(){
        return pet.getX();
    }
    public int getPetY(){
        return pet.getY();
    }
}
