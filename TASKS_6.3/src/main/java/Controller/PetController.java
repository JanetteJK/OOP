package Controller;
import Model.Pet;

public class PetController {
    private Pet pet;
    private final double SPEED = 0.01;

    public PetController(Pet pet) {
        this.pet = pet;
    }

    public void movePet(int dx, int dy){
        pet.x += (dx * SPEED);
        pet.y += (dy * SPEED);
    }

}
