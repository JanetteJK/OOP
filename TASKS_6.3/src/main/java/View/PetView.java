package View;
import Controller.PetController;
import Model.Pet;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;


public class PetView extends Application {

    private static final int CANVAS_SIZE = 500;
    private Canvas canvas;
    private GraphicsContext gc;
    private PetController controller;
    private Image image;
    private Pet pet;

    @Override
    public void start(Stage screen) {
        screen.setTitle("Your little pet");
        pet = new Pet(100,20);
        controller = new PetController(pet);
        canvas = new Canvas();
        gc = canvas.getGraphicsContext2D();
        Group root = new Group();
        root.getChildren().add(canvas);

        canvas.setOnMouseMoved(event -> {
            System.out.println("liikutaan");

            updateScreen();
        });

        image = new Image("Cat.png");
        updateScreen();

        Scene scene = new Scene(root);
        scene.setFill(Color.DARKGREEN);
        screen.setScene(scene);


        screen.show();
    }

    private void updateScreen(){
        gc.clearRect(0,0,CANVAS_SIZE,CANVAS_SIZE);
        gc.drawImage(image, pet.x, pet.y);
    }
}
