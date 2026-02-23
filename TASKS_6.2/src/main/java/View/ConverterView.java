package View;
import Controller.ConverterController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.TextField;


import java.awt.*;

public class ConverterView extends Application {
    private Label money = new Label();
    private ConverterController controller = new ConverterController();

    public void start(Stage window){
        Button button = new Button("Convert");
        FlowPane pane = new FlowPane();
        TextField input = new TextField();

        pane.getChildren().add(input);
        pane.getChildren().add(button);
        pane.getChildren().add(money);

        Scene view = new Scene(pane);
        window.setTitle("Currency converter");
        window.setScene(view);
        window.show();

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                money.setText(controller.getConv(input.getText()));
            }
        });

        window.show();
    }
}
