package View;
import Controller.ConverterController;
import com.sun.javafx.scene.control.DoubleField;
import com.sun.javafx.scene.control.IntegerField;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.TextField;


import java.awt.*;

import static javafx.geometry.Pos.*;

public class ConverterView extends Application {
    private ConverterController controller = new ConverterController();

    public void start(Stage window){
        Button button = new Button("Convert");
        VBox pane = new VBox();
        TextField input = new TextField();
        SplitMenuButton menuCurrency = new SplitMenuButton();
        SplitMenuButton menuConvert = new SplitMenuButton();

        menuCurrency.setText("Currency");
        MenuItem usd = new MenuItem("USD");
        MenuItem eur = new MenuItem("EUR");
        menuCurrency.getItems().addAll(usd, eur);

        menuConvert.setText("Convert to");
        MenuItem usd1 = new MenuItem("USD");
        MenuItem eur1 = new MenuItem("EUR");
        menuConvert.getItems().addAll(usd1, eur1);

        Label money = new Label();


        //pane.getChildren().add(input);


        DoubleField inp = new DoubleField();
        pane.getChildren().add(inp);
        pane.getChildren().add(menuCurrency);
        pane.getChildren().add(menuConvert);

        Scene view = new Scene(pane);
        window.setTitle("Currency converter");
        pane.getChildren().add(money);
        money.setText("Converted currency");
        money.setAlignment(BOTTOM_RIGHT);
        pane.getChildren().add(button);
        button.setAlignment(CENTER_RIGHT);
        view.getStylesheets().add("ConverterStyle.css");
        window.setScene(view);


        usd.setOnAction((e)->{
            menuCurrency.setText(usd.getText());
        });

        eur.setOnAction((e)->{
            menuCurrency.setText(eur.getText());
        });

        usd1.setOnAction((e)->{
            menuConvert.setText(usd1.getText());
        });

        eur1.setOnAction((e)->{
            menuConvert.setText(eur1.getText());
        });

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (menuCurrency.getText().equals("USD") && menuConvert.getText().equals("EUR")) {
                    money.setText(String.valueOf(controller.getUsdToEur(inp.getValue())));
                }
                else if (menuCurrency.getText().equals("EUR") && menuConvert.getText().equals("USD")) {
                    money.setText(String.valueOf(controller.getEurToUsd(inp.getValue())));
                }
                else {
                    money.setText("Invalid input");
                }



            }
        });

        window.show();
    }
}
