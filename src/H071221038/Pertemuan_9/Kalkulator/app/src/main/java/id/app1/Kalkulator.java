package id.app1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.scene.effect.Reflection;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.HBox;

public class Kalkulator extends Application {
    Stage mainStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        mainStage.setTitle("Aplikasi Kalkulator");
        tampilkanScene2();
        mainStage.show();
    }

    
    public void tampilkanScene1() {
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(20);
        
        Image backgroundImage = new Image("/background.jpg");
        BackgroundSize backgroundSize = new BackgroundSize(1.0, 1.0, true, true, false, true);
        BackgroundImage background = new BackgroundImage(backgroundImage,
        BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
        BackgroundPosition.CENTER, backgroundSize);
        layout.setBackground(new Background(background));
        
        Label text = new Label("PILIH MENU");
        Font font = Font.font("Arial", FontWeight.EXTRA_BOLD, 37);
        text.setFont(font);
        text.setTextFill(Color.BLACK);
        
        Button button2 = new Button("Konversi Mata Uang");
        button2.setStyle("-fx-background-color: #808080");
        button2.setFont(Font.font("Arial", 20));
        button2.setPrefSize(250, 50);
        button2.setTextFill(Color.WHITE);
        
        
        button2.setOnAction(action -> {
            tampilkanScene33();
        });
        
        Button button3 = new Button("Kalkulasi Persegi");
        button3.setStyle("-fx-background-color: #808080");
        button3.setFont(Font.font("Arial", 20));
        button3.setPrefSize(250, 50);
        button3.setTextFill(Color.WHITE);
        
        
        button3.setOnAction(action -> {
            tampilkanScene4();
        });
        
        Button button = new Button("Home");
        button.setStyle("-fx-background-color: #000000");
        button.setTextFill(Color.WHITE);
        button.setFont(Font.font("Calibri", 20));
        button.setPrefSize(100, 30);
        
        button.setOnAction(action -> {
            tampilkanScene2();
        });
        
        layout.getChildren().addAll(text, button2, button3, button);
        Scene scene1 = new Scene(layout, 640, 480);
        mainStage.setScene(scene1);
    }
    
    public void tampilkanScene2() {
    VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(20);

        Image backgroundImage = new Image("/background.jpg");
        BackgroundSize backgroundSize = new BackgroundSize(1.0, 1.0, true, true, false, true);
        BackgroundImage background = new BackgroundImage(backgroundImage,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER, backgroundSize);
        layout.setBackground(new Background(background));

        Image logo = new Image("/app.png");
        ImageView logoView = new ImageView(logo);
        logoView.setFitWidth(150);
        logoView.setFitHeight(150);

        Rectangle clip = new Rectangle();
        clip.setWidth(logoView.getFitWidth());
        clip.setHeight(logoView.getFitHeight());
        clip.setArcWidth(20);
        clip.setArcHeight(20);

        logoView.setClip(clip);

        layout.getChildren().addAll(logoView);

        Label text = new Label("KALKULATOR");
        Font font = Font.font("Calibri", FontWeight.EXTRA_BOLD, 30);
        text.setFont(font);
        text.setTextFill(Color.BLACK);


        Button button = new Button("MULAI");
        button.setStyle("-fx-background-color: #000000");
        button.setTextFill(Color.WHITE);
        button.setFont(Font.font("Calibri", 20));
        button.setPrefSize(130, 50);
    
        button.setOnAction(action -> {
            tampilkanScene1();
        });

        layout.getChildren().addAll(text, button);
        Scene scene2 = new Scene(layout, 640, 480);
        mainStage.setScene(scene2);
    }
    
    public void tampilkanScene33(){
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(20);
        
        Image backgroundImage = new Image("/background.jpg");
        BackgroundSize backgroundSize = new BackgroundSize(1.0, 1.0, true, true, false, true);
        BackgroundImage background = new BackgroundImage(backgroundImage,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER, backgroundSize);
        layout.setBackground(new Background(background));

        Button buttonA = new Button("Konversi USD to IDR");
        buttonA.setStyle("-fx-background-color: #808080");
        buttonA.setFont(Font.font("Arial", 20));
        buttonA.setPrefSize(250, 50);
        buttonA.setTextFill(Color.WHITE);

        buttonA.setOnAction(action -> {
            tampilkanScene3A();
        });

        Button buttonB = new Button("Konversi JPY to IDR");
        buttonB.setStyle("-fx-background-color: #808080");
        buttonB.setFont(Font.font("Arial", 20));
        buttonB.setPrefSize(250, 50);
        buttonB.setTextFill(Color.WHITE);

        buttonB.setOnAction(action -> {
            tampilkanScene3B();
        });

        Button buttonC = new Button("Konversi GBP to IDR");
        buttonC.setStyle("-fx-background-color: #808080");
        buttonC.setFont(Font.font("Arial", 20));
        buttonC.setPrefSize(250, 50);
        buttonC.setTextFill(Color.WHITE);

        buttonC.setOnAction(action -> {
            tampilkanScene3C();
        });

        Button backButton = new Button("Back to Home");
        backButton.setStyle("-fx-background-color: #808080");
        backButton.setFont(Font.font("Arial", 17));
        backButton.setPrefSize(150, 50);
        backButton.setTextFill(Color.BLACK);
    
    
    
        backButton.setOnAction(action -> {
            tampilkanScene1();
        });

        layout.getChildren().addAll(buttonA, buttonB, buttonC, backButton); // Tambahkan tombol-tombol ke dalam layout
    
        Scene scene33 = new Scene(layout, 640, 480);
        mainStage.setScene(scene33);
    }
    

    public void tampilkanScene3A() {
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(20);

    
        Image backgroundImage = new Image("/background.jpg");
        BackgroundSize backgroundSize = new BackgroundSize(1.0, 1.0, true, true, false, true);
        BackgroundImage background = new BackgroundImage(backgroundImage,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER, backgroundSize);
        layout.setBackground(new Background(background));
    
        Label text = new Label("Konversi USD to IDR\n\t\t(US)");
        text.setStyle("-fx-background-color: #000000");
        text.setPrefHeight(90);
        Font font = Font.font("Arial", FontWeight.EXTRA_BOLD, 27);
        text.setFont(font);
        text.setTextFill(Color.WHITE);
    
        TextField inputTextField = new TextField();
        inputTextField.setPromptText("Masukkan Nominal Uang");
        inputTextField.setPrefWidth(200);
        inputTextField.setPrefHeight(50);
        
    
        Button convertButton = new Button("Konversi");
        convertButton.setFont(Font.font("Arial", 17));
        convertButton.setStyle("-fx-background-color: #008000");
        convertButton.setPrefSize(120, 50);
        convertButton.setTextFill(Color.BLACK);
    
        
    
        Button backButton = new Button("Back to Home");
        backButton.setStyle("-fx-background-color: #808080");
        backButton.setFont(Font.font("Arial", 17));
        backButton.setPrefSize(150, 50);
        backButton.setTextFill(Color.BLACK);
    
    
    
        backButton.setOnAction(action -> {
            tampilkanScene1();
        });

        Button backMenu = new Button("Back");
        backMenu.setStyle("-fx-background-color: #D3D3D3");
        backMenu.setFont(Font.font("Arial", 17));
        backMenu.setPrefSize(150, 50);
        backMenu.setTextFill(Color.BLACK);
    
    
    
        backMenu.setOnAction(action -> {
            tampilkanScene33();
        });

        HBox buttonLayout = new HBox(); // Menambahkan HBox baru untuk tombol backButton dan backMenu
        buttonLayout.setAlignment(Pos.CENTER);
        buttonLayout.setSpacing(10);
        buttonLayout.getChildren().addAll(backButton, backMenu);
    
        Label resultLabel = new Label();
    
        Button clearButton = new Button("Clear");
        clearButton.setStyle("-fx-background-color: #FF0000");
        convertButton.setFont(Font.font("Arial", 17));
        clearButton.setPrefSize(80, 50);
        clearButton.setTextFill(Color.WHITE);
    
        
    
        convertButton.setOnAction(action -> {
            String input = inputTextField.getText();
            try {
                double nominal = Double.parseDouble(input);
                double kurs = 14840;
                double hasil = nominal * kurs;
                resultLabel.setText("Hasil Konversi: Rp" + hasil);
                resultLabel.setStyle("-fx-background-color: #FFFFFF");
                resultLabel.setFont(Font.font("Arial", 23));
                resultLabel.setPrefHeight(50);
                resultLabel.setTextFill(Color.GREEN);
            } catch (NumberFormatException e) {
                resultLabel.setText("Input tidak valid");
                resultLabel.setStyle("-fx-background-color: #FFFFFF");
                resultLabel.setFont(Font.font("Arial", 23));
                resultLabel.setPrefHeight(50);
                resultLabel.setTextFill(Color.GREEN);
            }
        });
    
        clearButton.setOnAction(action -> {
            inputTextField.clear();
            resultLabel.setText("");
        });
    
        layout.getChildren().addAll(text, inputTextField, convertButton, resultLabel, clearButton, buttonLayout);
        Scene scene3 = new Scene(layout, 640, 480);
        mainStage.setScene(scene3);
    }
    
    public void tampilkanScene3B() {
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(20);

    
        Image backgroundImage = new Image("/background.jpg");
        BackgroundSize backgroundSize = new BackgroundSize(1.0, 1.0, true, true, false, true);
        BackgroundImage background = new BackgroundImage(backgroundImage,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER, backgroundSize);
        layout.setBackground(new Background(background));
    
        Label text = new Label("Konversi JPY to IDR\n\t  (JEPANG)");
        text.setStyle("-fx-background-color: #000000");
        text.setPrefHeight(90);
        Font font = Font.font("Arial", FontWeight.EXTRA_BOLD, 27);
        text.setFont(font);
        text.setTextFill(Color.WHITE);
    
        TextField inputTextField = new TextField();
        inputTextField.setPromptText("Masukkan Nominal Uang");
        inputTextField.setPrefWidth(200);
        inputTextField.setPrefHeight(50);
        
    
        Button convertButton = new Button("Konversi");
        convertButton.setFont(Font.font("Arial", 17));
        convertButton.setStyle("-fx-background-color: #008000");
        convertButton.setPrefSize(120, 50);
        convertButton.setTextFill(Color.BLACK);
    
        
    
        Button backButton = new Button("Back to Home");
        backButton.setStyle("-fx-background-color: #808080");
        backButton.setFont(Font.font("Arial", 17));
        backButton.setPrefSize(150, 50);
        backButton.setTextFill(Color.BLACK);
    
    
    
        backButton.setOnAction(action -> {
            tampilkanScene1();
        });

        Button backMenu = new Button("Back");
        backMenu.setStyle("-fx-background-color: #D3D3D3");
        backMenu.setFont(Font.font("Arial", 17));
        backMenu.setPrefSize(150, 50);
        backMenu.setTextFill(Color.BLACK);
    
    
    
        backMenu.setOnAction(action -> {
            tampilkanScene33();
        });

        HBox buttonLayout = new HBox(); // Menambahkan HBox baru untuk tombol backButton dan backMenu
        buttonLayout.setAlignment(Pos.CENTER);
        buttonLayout.setSpacing(10);
        buttonLayout.getChildren().addAll(backButton, backMenu);
    
        Label resultLabel = new Label();
    
        Button clearButton = new Button("Clear");
        clearButton.setStyle("-fx-background-color: #FF0000");
        convertButton.setFont(Font.font("Arial", 17));
        clearButton.setPrefSize(80, 50);
        clearButton.setTextFill(Color.WHITE);
    
        
    
        convertButton.setOnAction(action -> {
            String input = inputTextField.getText();
            try {
                double nominal = Double.parseDouble(input);
                double kurs = 11024;
                double hasil = nominal * kurs;
                resultLabel.setText("Hasil Konversi: Rp" + hasil);
                resultLabel.setStyle("-fx-background-color: #FFFFFF");
                resultLabel.setFont(Font.font("Arial", 23));
                resultLabel.setPrefHeight(50);
                resultLabel.setTextFill(Color.GREEN);
            } catch (NumberFormatException e) {
                resultLabel.setText("Input tidak valid");
                resultLabel.setStyle("-fx-background-color: #FFFFFF");
                resultLabel.setFont(Font.font("Arial", 23));
                resultLabel.setPrefHeight(50);
                resultLabel.setTextFill(Color.GREEN);
            }
        });
    
        clearButton.setOnAction(action -> {
            inputTextField.clear();
            resultLabel.setText("");
        });
    
        layout.getChildren().addAll(text, inputTextField, convertButton, resultLabel, clearButton, buttonLayout);
        Scene scene3 = new Scene(layout, 640, 480);
        mainStage.setScene(scene3);
    }
    
    public void tampilkanScene3C() {
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(20);

    
        Image backgroundImage = new Image("/background.jpg");
        BackgroundSize backgroundSize = new BackgroundSize(1.0, 1.0, true, true, false, true);
        BackgroundImage background = new BackgroundImage(backgroundImage,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER, backgroundSize);
        layout.setBackground(new Background(background));
    
        Label text = new Label("Konversi GBP to IDR\n\t (INGGRIS)");
        text.setStyle("-fx-background-color: #000000");
        text.setPrefHeight(90);
        Font font = Font.font("Arial", FontWeight.EXTRA_BOLD, 27);
        text.setFont(font);
        text.setTextFill(Color.WHITE);
    
        TextField inputTextField = new TextField();
        inputTextField.setPromptText("Masukkan Nominal Uang");
        inputTextField.setPrefWidth(200);
        inputTextField.setPrefHeight(50);
        
    
        Button convertButton = new Button("Konversi");
        convertButton.setFont(Font.font("Arial", 17));
        convertButton.setStyle("-fx-background-color: #008000");
        convertButton.setPrefSize(120, 50);
        convertButton.setTextFill(Color.BLACK);
    
        
    
        Button backButton = new Button("Back to Home");
        backButton.setStyle("-fx-background-color: #808080");
        backButton.setFont(Font.font("Arial", 17));
        backButton.setPrefSize(150, 50);
        backButton.setTextFill(Color.BLACK);
    
    
    
        backButton.setOnAction(action -> {
            tampilkanScene1();
        });

        Button backMenu = new Button("Back");
        backMenu.setStyle("-fx-background-color: #D3D3D3");
        backMenu.setFont(Font.font("Arial", 17));
        backMenu.setPrefSize(150, 50);
        backMenu.setTextFill(Color.BLACK);
    
    
    
        backMenu.setOnAction(action -> {
            tampilkanScene33();
        });

        HBox buttonLayout = new HBox(); // Menambahkan HBox baru untuk tombol backButton dan backMenu
        buttonLayout.setAlignment(Pos.CENTER);
        buttonLayout.setSpacing(10);
        buttonLayout.getChildren().addAll(backButton, backMenu);
    
        Label resultLabel = new Label();
    
        Button clearButton = new Button("Clear");
        clearButton.setStyle("-fx-background-color: #FF0000");
        convertButton.setFont(Font.font("Arial", 17));
        clearButton.setPrefSize(80, 50);
        clearButton.setTextFill(Color.WHITE);
    
        
    
        convertButton.setOnAction(action -> {
            String input = inputTextField.getText();
            try {
                double nominal = Double.parseDouble(input);
                double kurs = 18380;
                double hasil = nominal * kurs;
                resultLabel.setText("Hasil Konversi: Rp" + hasil);
                resultLabel.setStyle("-fx-background-color: #FFFFFF");
                resultLabel.setFont(Font.font("Arial", 23));
                resultLabel.setPrefHeight(50);
                resultLabel.setTextFill(Color.GREEN);
            } catch (NumberFormatException e) {
                resultLabel.setText("Input tidak valid");
                resultLabel.setStyle("-fx-background-color: #FFFFFF");
                resultLabel.setFont(Font.font("Arial", 23));
                resultLabel.setPrefHeight(50);
                resultLabel.setTextFill(Color.GREEN);
            }
        });
    
        clearButton.setOnAction(action -> {
            inputTextField.clear();
            resultLabel.setText("");
        });
    
        layout.getChildren().addAll(text, inputTextField, convertButton, resultLabel, clearButton, buttonLayout);
        Scene scene3 = new Scene(layout, 640, 480);
        mainStage.setScene(scene3);
    }

    public void tampilkanScene4() {
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(20);
    
        Image backgroundImage = new Image("/background.jpg");
        BackgroundSize backgroundSize = new BackgroundSize(1.0, 1.0, true, true, false, true);
        BackgroundImage background = new BackgroundImage(backgroundImage,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER, backgroundSize);
        layout.setBackground(new Background(background));
    
        Label text = new Label("Kalkulasi Persegi");
        text.setStyle("-fx-background-color: #000000");
        text.setPrefHeight(60);
        Font font = Font.font("Arial", FontWeight.EXTRA_BOLD, 27);
        text.setFont(font);
        text.setTextFill(Color.WHITE);
    
        TextField inputTextField = new TextField();
        inputTextField.setPromptText("Masukkan Angka");
        inputTextField.setPrefHeight(40);
        inputTextField.setPrefWidth(250);
    
        
    
        Button calculateButton = new Button("Calculate");
        calculateButton.setStyle("-fx-background-color: #008000");
        calculateButton.setFont(Font.font("Arial", 17));
        calculateButton.setPrefSize(120, 50);
        calculateButton.setTextFill(Color.WHITE);
    
        
    
        Button backButton = new Button("Back to Home");
        backButton.setStyle("-fx-background-color: #808080");
        backButton.setFont(Font.font("Arial", 17));
        backButton.setPrefSize(150, 50);
        backButton.setTextFill(Color.BLACK);
    
        
    
        backButton.setOnAction(action -> {
            tampilkanScene1();
        });
    
        Label resultLabel = new Label();
    
        Button clearButton = new Button("Clear");
        clearButton.setStyle("-fx-background-color: #FF0000");
        clearButton.setFont(Font.font("Arial", 17));
        clearButton.setPrefSize(100, 50);
        clearButton.setTextFill(Color.WHITE);

    
        calculateButton.setOnAction(action -> {
            String input = inputTextField.getText();
            try {
                double angka = Double.parseDouble(input);
                double keliling = angka * 4;
                double luas = angka * angka ;
                // resultLabel.setText("Keliling : " + keliling);
                resultLabel.setText("Keliling : "+ keliling +"\nLuas : " + luas );
                resultLabel.setStyle("-fx-background-color: #FFFFFF");
                resultLabel.setFont(Font.font("Arial", 23));
                resultLabel.setPrefHeight(50);
                resultLabel.setTextFill(Color.GREEN);
            } catch (NumberFormatException e) {
                resultLabel.setText("Input tidak valid");
                resultLabel.setStyle("-fx-background-color: #FFFFFF");
                resultLabel.setFont(Font.font("Arial", 23));
                resultLabel.setPrefHeight(50);
                resultLabel.setTextFill(Color.GREEN);
            }
        });
    
        clearButton.setOnAction(action -> {
            inputTextField.clear();
            resultLabel.setText("");
        });
    
        layout.getChildren().addAll(text, inputTextField, calculateButton, resultLabel, clearButton, backButton);
        Scene scene4 = new Scene(layout, 640, 480);
        mainStage.setScene(scene4);
    }
}
