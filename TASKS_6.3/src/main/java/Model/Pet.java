package Model;

public class Pet {
    private int x;
    private int y;
    private static final int GRID_SIZE = 30;

    public Pet(int x, int y){
        this.x = x;
        this.y = y;

    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getGridSize(){
        return GRID_SIZE;
    }
}
