package View;
import Controller.PetController;
import Model.Pet;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;


public class PetView extends Application {

    private static final int CELL_SIZE = 500;
    private Canvas canvas;
    private GraphicsContext gc;
    private PetController controller;
    private Image image;
    private Pet pet;


    @Override
    public void start(Stage primary) {
        int grid = controller.getGridSize();
        int canvasSize = grid* CELL_SIZE;
        canvas = new Canvas(canvasSize,canvasSize);
        gc = canvas.getGraphicsContext2D();

        canvas.setFocusTraversable(true);
        canvas.setOnMousePressed(event -> {
            //tähän liikkumisjutut
        });
        pet = new Pet(100,20);

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, canvasSize, canvasSize);
        primary.setTitle("Your little pet");

        image = new Image("Cat.png");
        controller = new PetController();
        update();
        scene.setFill(Color.DARKGREEN);


        primary.setScene(scene);
        primary.show();
    }



    private void update(){
        int grid = CELL_SIZE*controller.getGridSize();
        gc.clearRect(0,0, grid, grid);
        gc.drawImage(image, controller.getPetX(), controller.getPetY());
    }


}
