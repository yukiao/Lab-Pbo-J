package helloapp;

import org.w3c.dom.events.Event;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class App extends Application {
    private Stage stage;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        showFirstScene();
        stage.show();
        stage.setTitle("MY CALCULATOR");
        Image icon = new Image("C:/Users/ASUS/Downloads/475497.png");
        primaryStage.getIcons().add(icon);

    }

    private void showFirstScene(){
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-background-color: #FFA500; ");
        Label label = new Label("MY CALCULATOR");
        label.setStyle("-fx-font-weight: bold; -fx-font-size: 40px; ");

        ImageView imageView = new ImageView();
        String imagePath ="C:/Users/ASUS/Downloads/475497.png";
        Image image = new Image(imagePath);
        imageView.setImage(image);;

        Button button = new Button("Mulai");
        button.setFont(Font.font("Arial", 30));
        button.setStyle("-fx-background-color: #FFC0CB; -fx-background-radius: 10;");
        button.setOnAction(event -> showSecScene());

        vbox.getChildren().add(label);
        vbox.getChildren().add(imageView);
        vbox.getChildren().add(button);

        Scene scene1 = new Scene(vbox, 400, 300);  
        stage.setScene(scene1);
        stage.show();
        stage.setFullScreen(true);
        
    }

    private void showSecScene(){
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        Text text = new Text("PILIH MENU");
        text.setStyle("-fx-font-weight: bold; -fx-font-size: 40px; ");
        Button button = new Button("Kalkulator 1");
        button.setFont(Font.font("Arial", 30));
        Label label = new Label();
        button.setOnAction(event -> showThirdScene());
        Button button1 = new Button("Kalkulator 2");
        button1.setFont(Font.font("Arial", 30));
        button1.setOnAction(event -> showFourthScene());
        vbox.setStyle("-fx-background-color: #FFC0CB");

        vbox.getChildren().add(text);
        vbox.getChildren().add(button);
        vbox.getChildren().add(label);
        vbox.getChildren().add(button1);

        Scene scene2 = new Scene(vbox, 400, 300);
        stage.setScene(scene2);
        stage.show();
        stage.setFullScreen(true);
    }

    private void showThirdScene(){
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        Text text = new Text("PENJUMLAHAN");
        TextField tfield = new TextField();
        TextField tfield1 = new TextField();
        Text text1 = new Text("Hasil");
        Label label = new Label();
        Button button = new Button("Clear");
        button.setOnAction(event ->{
            tfield.clear();
            tfield1.clear();
        });
        Button button1 = new Button("Calculate");
        button1.setOnAction(event -> {
            try {
                String input1 = tfield.getText();
                int nilai1 = Integer.parseInt(input1);
                String input2 = tfield1.getText();
                int nilai2 = Integer.parseInt(input2);

                int hasil = nilai1 + nilai2;
                label.setText(""+ hasil);
            } catch (Exception e) {
                label.setText("Inputan tidak valid");
            }
        });
        Button button2 = new Button("Back To Home");
        button2.setOnAction(event ->{
            showSecScene();
        });
        vbox.setStyle("-fx-background-color: #800080;");  

        vbox.getChildren().add(text);
        vbox.getChildren().add(tfield);
        vbox.getChildren().add(tfield1);
        vbox.getChildren().add(text1);
        vbox.getChildren().add(label);
        vbox.getChildren().add(button);
        vbox.getChildren().add(button1);
        vbox.getChildren().add(button2);

        Scene scene3 = new Scene(vbox, 400, 300);
        stage.setScene(scene3);
        stage.show();
        stage.setFullScreen(true);

    }
    private void showFourthScene(){
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        Text text = new Text("Pengurangan");
        TextField tfield = new TextField();
        TextField tfield1 = new TextField();
        Text text1 = new Text("Hasil");
        Label label = new Label();
        Button button = new Button("Clear");
        button.setOnAction(event ->{
            tfield.clear();
            tfield1.clear();
        });
        Button button1 = new Button("Calculate");
        button1.setOnAction(event -> {
            try {
                String input1 = tfield.getText();
                int nilai1 = Integer.parseInt(input1);
                String input2 = tfield1.getText();
                int nilai2 = Integer.parseInt(input2);

                int hasil = nilai1 - nilai2;
                label.setText(""+ hasil);
            } catch (Exception e) {
                label.setText("Inputan tidak valid");
            }
        });
        Button button2 = new Button("Back To Home");
        button2.setOnAction(event ->{
            showSecScene();
        });
        vbox.setStyle("-fx-background-color: #00BFFF;");

        vbox.getChildren().add(text);
        vbox.getChildren().add(tfield);
        vbox.getChildren().add(tfield1);
        vbox.getChildren().add(text1);
        vbox.getChildren().add(label);
        vbox.getChildren().add(button);
        vbox.getChildren().add(button1);
        vbox.getChildren().add(button2);

        Scene scene4 = new Scene(vbox, 400, 300);
        stage.setScene(scene4);
        stage.show();
        stage.setFullScreen(true);

    }




    public static void main(String[] args) {
        launch();
    }

}