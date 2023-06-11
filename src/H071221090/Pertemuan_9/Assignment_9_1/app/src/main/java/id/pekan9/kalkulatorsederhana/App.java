package id.Pertemuan_9.KalkuPlus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    private Stage stage;

    @Override
    public void start(Stage mainStage) {
        //handling stage
        stage = mainStage;
        
        //stage
        stage.setTitle("");
        stage.setScene(getScene1());
        stage.show();
    }

    private Scene getScene1() {

        // judul
        Text text = new Text("KalkuPlus");
        text.getStyleClass().add("title");
    
        
        // logo
        ImageView ivBanner1 = new ImageView("/Images/math1.png");
        ivBanner1.setFitWidth(300);
        ivBanner1.setFitHeight(300);
        ivBanner1.setPreserveRatio(true);
        
        // button
        Region space = new Region();
        space.setPrefHeight(12);
        Button bMulai = new Button("MULAI");
        bMulai.getStyleClass().add("tMulai");

        VBox vLayout = new VBox(ivBanner1, text, space, bMulai);
        vLayout.setSpacing(10);
        vLayout.setPadding(new Insets(50));
        vLayout.setAlignment(Pos.CENTER);
        vLayout.setId("background");

        Scene scene = new Scene(vLayout, 450, 500);
        scene.getStylesheets().add(getClass().getResource("/Styles/home.css").toExternalForm());

        // action untuk button
        bMulai.setOnAction(v->{
            stage.setScene(getScene2());
        });
        return scene;
    }
    
    private Scene getScene2() {
        Text text = new Text("PILIH MENU");
        text.getStyleClass().add("title");

        //space
        Region space1 = new Region();
        space1.setPrefHeight(12);

        Region space2 = new Region();
        space2.setPrefHeight(20);

        //button
        Button bKal1 = new Button("Kalkulator 1");
        bKal1.getStyleClass().add("tKal");
        Button bKal2 = new Button("Kalkulator 2");
        bKal2.getStyleClass().add("tKal");

        //button kembali
        Button bBack = new Button("Back");
        bBack.getStyleClass().add("tBack");

        VBox sectionRight1 = new VBox(text);
        sectionRight1.setSpacing(500);
        sectionRight1.setAlignment(Pos.CENTER);
        sectionRight1.setPrefWidth(30);

        VBox sectionRight2 = new VBox(bKal1);
        sectionRight2.setSpacing(200);
        sectionRight2.setAlignment(Pos.CENTER);
        sectionRight2.setPrefWidth(70);

        VBox sectionRight3 = new VBox(bKal2);
        sectionRight3.setSpacing(200);
        sectionRight3.setAlignment(Pos.CENTER);
        sectionRight3.setPrefWidth(70);

        VBox sectionRight4 = new VBox(bBack);
        sectionRight4.setAlignment(Pos.CENTER);

        //Action untuk Button
        bKal1.setOnAction(v -> {
            stage.setScene(getScene3());
        });

        bKal2.setOnAction(v -> {
            stage.setScene(getScene4());
        });

        bBack.setOnAction(v -> {
            stage.setScene(getScene1());
        });

        //rootNode
        VBox rootNode = new VBox(sectionRight1, sectionRight2, space1, sectionRight3, space2, sectionRight4);
        rootNode.setAlignment(Pos.CENTER);
        rootNode.setId("background");

        Scene scene = new Scene(rootNode, 400, 500);

        //atur css
        scene.getStylesheets().add(getClass().getResource("/Styles/main.css").toExternalForm());
        return scene;

    }

    private Scene getScene3() {
        Text text = new Text("Konversi Farhenheit ke Celcius");
        text.getStyleClass().add("title2");

        Region space = new Region();
        space.setPrefHeight(12);

        Region space1 = new Region();
        space1.setPrefHeight(12);

        Label lCelcius = new Label("Farhenheit");
        lCelcius.getStyleClass().add("tCelcius");
        TextField tInput1 = new TextField();
        tInput1.getStyleClass().add("Inputan");
        Label lResult = new Label("");
        lResult.getStyleClass().add("tCelcius");
        
        Text text1 = new Text("Hasil");
        text1.getStyleClass().add("title2");

        // button
        Button clear = new Button("Clear");
        clear.getStyleClass().add("tButton");
        Button convert = new Button("Convert");
        convert.getStyleClass().add("tButton");
        Button back = new Button("Kembali ke menu");
        back.getStyleClass().add("tMenu");

        clear.setOnAction(v -> {
            tInput1.clear();
            lResult.setText("");
        });

        convert.setOnAction(v -> {
            try {
                // konversi Farhenheit ke celcius 
                String fahrenheitText = tInput1.getText();
                double fahrenheit = Double.parseDouble(fahrenheitText);
                double celsius = (fahrenheit - 32) * 5 / 9;
                lResult.setText(String.valueOf(celsius) + "C");
            } catch (NumberFormatException e) {
                lResult.setText("Input tidak valid!");
            }
        });

        back.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        // VBOX
        VBox sectionRight = new VBox(text);
        sectionRight.setAlignment(Pos.TOP_CENTER);

        VBox sectionRight1 = new VBox(text1);
        sectionRight1.setAlignment(Pos.CENTER_LEFT);

        VBox sectionRight2 = new VBox(tInput1);
        sectionRight2.setAlignment(Pos.CENTER);

        VBox sectionRight3 = new VBox(lResult);
        sectionRight3.setAlignment(Pos.CENTER_LEFT);

        HBox button = new HBox(clear, convert);
        button.setSpacing(10);
        button.setAlignment(Pos.CENTER);

        //rootNode 
        VBox rootNode = new VBox(sectionRight, space, lCelcius, sectionRight2, space1, sectionRight1, sectionRight3, button, back);
        rootNode.setSpacing(10);
        rootNode.setPadding(new Insets(50));
        rootNode.setAlignment(Pos.TOP_CENTER);
        rootNode.setId("background");

        Scene scene = new Scene(rootNode, 400, 500);

        //atur css
        scene.getStylesheets().add(getClass().getResource("/Styles/main.css").toExternalForm());
        return scene;

    }

    private Scene getScene4() {
        Text text = new Text("Kalkulator Faktorial");
        text.getStyleClass().add("title2");

        Region space = new Region();
        space.setPrefHeight(12);

        Region space1 = new Region();
        space1.setPrefHeight(12);

        Label lFaktorial = new Label("Angka");
        lFaktorial.getStyleClass().add("tCelcius");
        TextField tInput1 = new TextField();
        tInput1.getStyleClass().add("Inputan");
        Label lfaktorialResult = new Label("");
        lfaktorialResult.getStyleClass().add("tCelcius");
        
        Text text1 = new Text("Hasil");
        text1.getStyleClass().add("title2");

        // button
        Button clear = new Button("Clear");
        clear.getStyleClass().add("tButton");
        Button calculate = new Button("Calculate");
        calculate.getStyleClass().add("tButton");
        Button back = new Button("Kembali ke menu");
        back.getStyleClass().add("tMenu");

        VBox sectionRight3 = new VBox(lfaktorialResult);
        sectionRight3.setAlignment(Pos.CENTER_LEFT);

        clear.setOnAction(v -> {
            tInput1.clear();
            lfaktorialResult.setText("");
        });


        calculate.setOnAction(v -> {
            try {
                String numberText = tInput1.getText();
                int number = Integer.parseInt(numberText);
    
                // Menghitung faktorial menggunakan looping
               if (number >= 0) {
                int factorial = 1;
                for ( int i = 1; i <= number; i++) {
                    factorial *= i;
                }

                  lfaktorialResult.setText(number + "! = " + factorial);

               } else {
                lfaktorialResult.setText("Input tidak valid");
               }
                  

            } catch (NumberFormatException e) {
               lfaktorialResult.setText("Input tidak valid!");
            }
        });

        back.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        // VBOX
        VBox sectionRight = new VBox(text);
        sectionRight.setAlignment(Pos.TOP_CENTER);

        VBox sectionRight1 = new VBox(text1);
        sectionRight1.setAlignment(Pos.CENTER_LEFT);

        VBox sectionRight2 = new VBox(tInput1);
        sectionRight2.setAlignment(Pos.CENTER);

        // VBox sectionRight3 = new VBox(lsin, lcos, ltan);
        // sectionRight3.setAlignment(Pos.CENTER_LEFT);

        HBox button = new HBox(clear, calculate);
        button.setSpacing(10);
        button.setAlignment(Pos.CENTER);

        //rootNode 
        VBox rootNode = new VBox(sectionRight, space, sectionRight2, space1, sectionRight1, sectionRight3, button, back);
        rootNode.setSpacing(10);
        rootNode.setPadding(new Insets(50));
        rootNode.setAlignment(Pos.TOP_CENTER);
        rootNode.setId("background");

        Scene scene = new Scene(rootNode, 400, 500);

        //atur css
        scene.getStylesheets().add(getClass().getResource("/Styles/main.css").toExternalForm());
        return scene;
    }

    public static void main(String[] args) {
        launch(args);
    }
}




