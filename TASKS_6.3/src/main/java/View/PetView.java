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

    private static final int CANVAS_SIZE = 500;
    private Canvas canvas;
    private GraphicsContext gc;
    private PetController controller;
    private Image image;
    private Pet pet;



    @Override
    public void start(Stage screen) {
        pet = new Pet(100,20);
        controller = new PetController();
        image = new Image("Cat.png");

        screen.setTitle("Your little pet");

        canvas = new Canvas(CANVAS_SIZE,CANVAS_SIZE);
        gc = canvas.getGraphicsContext2D();


        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, CANVAS_SIZE, CANVAS_SIZE);

        root.getChildren().add(canvas);



        update();
        scene.setFill(Color.DARKGREEN);


        screen.setScene(scene);
        screen.show();
    }



    private void update(){
        gc.clearRect(0,0, CANVAS_SIZE, CANVAS_SIZE);
        gc.drawImage(image, controller.getPetX(), controller.getPetY());
    }


}
