package calculator;

import java.util.function.UnaryOperator;
import java.util.regex.Pattern;


import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TimeScene { 
    private Stage stage;

    public TimeScene(Stage stage) {
        this.stage = stage;
    }

    public void timeScene() {
        Text text3 = new Text("TIME CONVERTER");
        text3.setFont(Font.font("Arial Black", 15));
        text3.setFill(Color.WHITE);

        StackPane stackPane1 = new StackPane();
        stackPane1.setPrefWidth(350);
        stackPane1.setPrefHeight(25);
        
        Label label1 = new Label("INPUT");
        label1.setFont(Font.font("Arial", 12));
        label1.setTextFill(Color.WHITE);
        
        Label label2 = new Label("HASIL");
        label2.setFont(Font.font("Arial", 12));
        label2.setTextFill(Color.WHITE);

        StackPane stackPane2 = new StackPane();
        stackPane2.setPrefWidth(350);
        stackPane2.setPrefHeight(25);

        TextField textField1 = new TextField();
        textField1.setPromptText("Input angka...");
        Pattern pattern = Pattern.compile("\\d*");
        UnaryOperator<TextFormatter.Change> filter = change -> {
            String newText = change.getControlNewText();
            if (pattern.matcher(newText).matches()) {
                return change;
            }
            return null;
        };
        TextFormatter<String> textFormatter = new TextFormatter<>(filter);
        textField1.setTextFormatter(textFormatter);
        ComboBox<String> cb1 = new ComboBox<>(FXCollections.observableArrayList(
            "Milisecond", "Second", "Minute", "Hour", "Day", "Week", "Decade", "Century", "Millennium")
            );
        cb1.setPromptText("Pilih");
        
        TextField textField2 = new TextField();
        textField2.setPromptText("Hasil...");
        textField2.setEditable(false);
        ComboBox<String> cb2 = new ComboBox<>(FXCollections.observableArrayList(
            "Milisecond", "Second", "Minute", "Hour", "Day", "Week", "Decade", "Century", "Millennium")
            );
        cb2.setPromptText("Pilih");
            
        HBox hbox1 = new HBox(10, cb1, textField1);
        hbox1.setAlignment(Pos.BASELINE_CENTER);

        HBox hbox2 = new HBox(10, cb2, textField2);
        hbox2.setAlignment(Pos.BASELINE_CENTER);

        Button clearButton = new Button("CLEAR");
        clearButton.setOnAction(v -> {
            textField1.clear();
            textField2.clear();
        });

        Button calculateButton = new Button("CALCULATE");
        calculateButton.setOnAction(v -> {
            TimeCalculate calculate = new TimeCalculate(cb1.getValue(), cb2.getValue(), Integer.parseInt(textField1.getText()));
            textField2.setText(Double.toString(calculate.convertTime()));
        });

        Button backButton = new Button("BACK TO MENU");
        backButton.setOnAction(v -> App.sceneTwo());

        HBox hbox3 = new HBox(10, clearButton, calculateButton);
        hbox3.setAlignment(Pos.BASELINE_CENTER);
        
        VBox vbox = new VBox(10, stackPane1, text3, label1, hbox1, label2, hbox2, stackPane2, hbox3, backButton);
        vbox.setStyle("-fx-background-color: black;");
        vbox.setAlignment(Pos.TOP_CENTER);

        Scene scene = new Scene(vbox, 350, 400, Color.BLACK);
        stage.setScene(scene);
        stage.show();
    }
}
 