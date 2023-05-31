package pertemuan_9;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Assignment_9_1 extends Application {
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Kalkulator Sederhana");
        stage = primaryStage;
        showFirstScene();
        stage.show();
    }

    public void showFirstScene() {
        Image image = new Image("/iconCalculator.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);
        imageView.setPreserveRatio(true);

        Label label = new Label("Kalkulator Sederhana");
        label.setId("labelKalkulator");
        label.setFont(Font.font("Times New Roman", 20));

        Button button = new Button("Mulai");
        button.getStyleClass().add("custom-button");
        button.setOnAction(action -> {
            showSecondScene();
        });

        VBox vBox = new VBox(imageView, label, button);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        Scene scene1 = new Scene(vBox, 300, 500);
        scene1.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene1);
    }

    public void showSecondScene() {
        Label label = new Label("Pilih Menu");
        label.setFont(Font.font("Times New Roman", 20));

        Button dasar = new Button("Kalkulator Dasar");
        dasar.getStyleClass().add("custom-scene2");
        dasar.setOnAction(action -> {
            showDasar();
        });

        Button bangunRuang = new Button("Bangun Ruang");
        bangunRuang.getStyleClass().add("custom-scene2");
        bangunRuang.setOnAction(action -> {
            showBangunRuang();
        });

        Button bangunDatar = new Button("Bangun Datar");
        bangunDatar.getStyleClass().add("custom-scene2");
        bangunDatar.setOnAction(action -> {
            showBangunDatar();
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-back");
        back.setOnAction(action -> {
            showFirstScene();

        });

        VBox vBox = new VBox(label, dasar, bangunRuang, bangunDatar, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        Scene scene2 = new Scene(vBox, 300, 500);
        scene2.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene2);
    }

    public void showDasar() {
        Label label = new Label("Kalkulator Dasar");
        label.setFont(Font.font("Times New Roman", 20));

        TextField input1 = new TextField();
        input1.setPromptText("");
        TextField input2 = new TextField();
        input2.setPromptText("");

        Label output = new Label();

        Button tambah = new Button("+");
        tambah.getStyleClass().add("custom-dasar");
        tambah.setOnAction(action -> {
            try {
                double angka1 = Double.parseDouble(input1.getText());
                double angka2 = Double.parseDouble(input2.getText());
                double hasil = angka1 + angka2;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        Button kurang = new Button("-");
        kurang.getStyleClass().add("custom-dasar");
        kurang.setOnAction(action -> {
            try {
                double angka1 = Double.parseDouble(input1.getText());
                double angka2 = Double.parseDouble(input2.getText());
                double hasil = angka1 - angka2;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        HBox tambahKurang = new HBox(tambah, kurang);
        tambahKurang.setAlignment(Pos.CENTER);
        tambahKurang.setSpacing(10);

        Button kali = new Button("x");
        kali.getStyleClass().add("custom-dasar");
        kali.setOnAction(action -> {
            try {
                double angka1 = Double.parseDouble(input1.getText());
                double angka2 = Double.parseDouble(input2.getText());
                double hasil = angka1 * angka2;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        Button bagi = new Button("/");
        bagi.getStyleClass().add("custom-dasar");
        bagi.setOnAction(action -> {
            try {
                double angka1 = Double.parseDouble(input1.getText());
                double angka2 = Double.parseDouble(input2.getText());
                double hasil = (double) angka1 / angka2;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        HBox kaliBagi = new HBox(kali, bagi);
        kaliBagi.setAlignment(Pos.CENTER);
        kaliBagi.setSpacing(10);

        VBox tambahKurangKaliBagi = new VBox(tambahKurang, kaliBagi);
        tambahKurangKaliBagi.setAlignment(Pos.CENTER);
        tambahKurangKaliBagi.setSpacing(10);

        Button clear = new Button("Clear");
        clear.getStyleClass().add("custom-clear");
        clear.setOnAction(action -> {
            input1.setText("");
            input2.setText("");
            output.setText("");
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-back");
        back.setOnAction(action -> {
            showSecondScene();
        });

        VBox vBox = new VBox(label, input1, input2, output, tambahKurangKaliBagi,
                clear, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        Scene scene3 = new Scene(vBox, 300, 500);
        scene3.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene3);
    }

    public void showBangunRuang() {
        Label label = new Label("Bangun Ruang");
        label.setFont(Font.font("Times new Roman", 20));

        Button kubus = new Button("Kubus");
        kubus.getStyleClass().add("custom-bangunRuang");
        kubus.setOnAction(action -> {
            showKubus();
        });

        Button balok = new Button("Balok");
        balok.getStyleClass().add("custom-bangunRuang");
        balok.setOnAction(action -> {
            showBalok();
        });

        Button bola = new Button("Bola");
        bola.getStyleClass().add("custom-bangunRuang");
        bola.setOnAction(action -> {
            showBola();
        });

        Button tabung = new Button("Tabung");
        tabung.getStyleClass().add("custom-bangunRuang");
        tabung.setOnAction(action -> {
            showTabung();
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-back");
        back.setOnAction(action -> {
            showSecondScene();
        });

        VBox vBox = new VBox(label, kubus, balok, bola, tabung, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        Scene scene3 = new Scene(vBox, 300, 500);
        scene3.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene3);
    }

    public void showBangunDatar() {
        Label label = new Label("Bangun Datar");
        label.setFont(Font.font("Times New Roman", 20));

        Button persegi = new Button("Persegi");
        persegi.getStyleClass().add("custom-bangunDatar");
        persegi.setOnAction(action -> {
            showPersegi();
        });

        Button persegiPanjang = new Button("Persegi Panjang");
        persegiPanjang.getStyleClass().add("custom-bangunDatar");
        persegiPanjang.setOnAction(action -> {
            showPersegiPanjang();
        });

        Button lingkaran = new Button("Lingkaran");
        lingkaran.getStyleClass().add("custom-bangunDatar");
        lingkaran.setOnAction(action -> {
            showLingkaran();
        });

        Button segitiga = new Button("Segitiga");
        segitiga.getStyleClass().add("custom-bangunDatar");
        segitiga.setOnAction(action -> {
            showSegitiga();
        });

        Button trapesium = new Button("Trapesium");
        trapesium.getStyleClass().add("custom-bangunDatar");
        trapesium.setOnAction(action -> {
            showTrapesium();
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-back");
        back.setOnAction(action -> {
            showSecondScene();
        });

        VBox vBox = new VBox(label, persegi, persegiPanjang, lingkaran, segitiga,
                trapesium, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        Scene scene3 = new Scene(vBox, 300, 500);
        scene3.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene3);
    }

    public void showKubus() {
        Label label = new Label("Kubus");
        label.setFont(Font.font("Times New Roman", 20));

        Label label2 = new Label("Input sisi kubus: ");
        TextField input = new TextField();
        Label output = new Label();

        Button volume = new Button("volume");
        volume.getStyleClass().add("custom-voluke");
        volume.setOnAction(action -> {
            try {
                double angka = Double.parseDouble(input.getText());
                double hasil = angka * angka * angka;
                output.setText("Hasil Volume = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        Button luas = new Button("Luas");
        luas.getStyleClass().add("custom-voluke");
        luas.setOnAction(action -> {
            try {
                double angka = Double.parseDouble(input.getText());
                double hasil = angka * angka;
                output.setText("Hasil Luas = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        HBox volu = new HBox(volume, luas);
        volu.setAlignment(Pos.CENTER);
        volu.setSpacing(5);

        Button clear = new Button("Clear");
        clear.getStyleClass().add("custom-clear");
        clear.setOnAction(action -> {
            input.setText("");
            output.setText("");
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-back");
        back.setOnAction(action -> {
            showBangunRuang();
        });

        VBox vBox = new VBox(label, label2, input, output, clear, volu, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        Scene scene4 = new Scene(vBox, 300, 500);
        scene4.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene4);
    }

    public void showBalok() {
        Label label = new Label("Balok");
        label.setFont(Font.font("Times New Roman", 20));

        Label panjang = new Label("Input panjang: ");
        TextField inputPanjang = new TextField();
        Label lebar = new Label("Input lebar: ");
        TextField inputLebar = new TextField();
        Label tinggi = new Label("Input tinggi: ");
        TextField inputTinggi = new TextField();
        Label output = new Label();

        Button volume = new Button("volume");
        volume.getStyleClass().add("custom-voluke");
        volume.setOnAction(action -> {
            try {
                double angka1 = Double.parseDouble(inputPanjang.getText());
                double angka2 = Double.parseDouble(inputLebar.getText());
                double angka3 = Double.parseDouble(inputTinggi.getText());
                double hasil = angka1 * angka2 * angka3;
                output.setText("Hasil Volume = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        Button luas = new Button("Luas");
        luas.getStyleClass().add("custom-voluke");
        luas.setOnAction(action -> {
            try {
                double angka1 = Double.parseDouble(inputPanjang.getText());
                double angka2 = Double.parseDouble(inputLebar.getText());
                double angka3 = Double.parseDouble(inputTinggi.getText());
                double hasil = 2 * (angka1 * angka2 + angka1 * angka3 + angka2 * angka3);
                output.setText("Hasil Luas = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        HBox volu = new HBox(volume, luas);
        volu.setAlignment(Pos.CENTER);
        volu.setSpacing(5);

        Button clear = new Button("Clear");
        clear.getStyleClass().add("custom-clear");
        clear.setOnAction(action -> {
            inputPanjang.setText("");
            inputLebar.setText("");
            inputTinggi.setText("");
            output.setText("");
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-back");
        back.setOnAction(action -> {
            showBangunRuang();
        });

        VBox vBox = new VBox(label, panjang, inputPanjang, lebar, inputLebar, tinggi,
                inputTinggi, output, clear, volu,
                back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        Scene scene4 = new Scene(vBox, 300, 500);
        scene4.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene4);
    }

    public void showBola() {
        Label label = new Label("Bola");
        label.setFont(Font.font("Times New Roman", 20));

        Label label2 = new Label("Input jari-jari: ");
        TextField input = new TextField();
        Label output = new Label();

        Button volume = new Button("volume");
        volume.getStyleClass().add("custom-voluke");
        volume.setOnAction(action -> {
            try {
                Double angka = Double.parseDouble(input.getText());
                Double hasil = 4 / 3 * Math.PI * angka * angka * angka;
                output.setText("Hasil Volume = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        Button luas = new Button("Luas");
        luas.getStyleClass().add("custom-voluke");
        luas.setOnAction(action -> {
            try {
                double angka = Double.parseDouble(input.getText());
                double hasil = 4 * Math.PI * angka * angka;
                output.setText("Hasil Luas = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        HBox volu = new HBox(volume, luas);
        volu.setAlignment(Pos.CENTER);
        volu.setSpacing(5);

        Button clear = new Button("Clear");
        clear.getStyleClass().add("custom-clear");
        clear.setOnAction(action -> {
            input.setText("");
            output.setText("");
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-back");
        back.setOnAction(action -> {
            showBangunRuang();
        });

        VBox vBox = new VBox(label, label2, input, output, clear, volu, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        Scene scene4 = new Scene(vBox, 300, 500);
        scene4.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene4);
    }

    public void showTabung() {
        Label label = new Label("Tabung");
        label.setFont(Font.font("Times New Roman", 20));

        Label jarijari = new Label("Input jari-jari: ");
        TextField inputJarijari = new TextField();
        Label tinggi = new Label("Input tinggi: ");
        TextField inputTinggi = new TextField();

        Label output = new Label();

        Button volume = new Button("volume");
        volume.getStyleClass().add("custom-voluke");
        volume.setOnAction(action -> {
            try {
                double angka1 = Double.parseDouble(inputJarijari.getText());
                double angka2 = Double.parseDouble(inputTinggi.getText());
                Double hasil = Math.PI * Math.pow(angka1, 2) * angka2;
                output.setText("Hasil Volume = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        Button luas = new Button("Luas");
        luas.getStyleClass().add("custom-voluke");
        luas.setOnAction(action -> {
            try {
                double angka1 = Double.parseDouble(inputJarijari.getText());
                double angka2 = Double.parseDouble(inputTinggi.getText());
                double hasil = 2 * Math.PI * angka1 * (angka1 + angka2);
                output.setText("Hasil Luas = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        HBox volu = new HBox(volume, luas);
        volu.setAlignment(Pos.CENTER);
        volu.setSpacing(5);

        Button clear = new Button("Clear");
        clear.getStyleClass().add("custom-clear");
        clear.setOnAction(action -> {
            inputJarijari.setText("");
            inputTinggi.setText("");
            output.setText("");
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-back");
        back.setOnAction(action -> {
            showBangunRuang();
        });

        VBox vBox = new VBox(label, jarijari, inputJarijari, tinggi, inputTinggi,
                output, clear, volu, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        Scene scene4 = new Scene(vBox, 300, 500);
        scene4.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene4);
    }

    public void showPersegi() {
        Label label = new Label("Persegi");
        label.setFont(Font.font("Times New Roman", 20));

        Label label2 = new Label("Input sisi persegi: ");
        TextField input = new TextField();
        Label output = new Label();

        Button keliling = new Button("keliling");
        keliling.getStyleClass().add("custom-voluke");
        keliling.setOnAction(action -> {
            try {
                double angka = Double.parseDouble(input.getText());
                double hasil = 4 * angka;
                output.setText("Hasil Keliling = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        Button luas = new Button("Luas");
        luas.getStyleClass().add("custom-voluke");
        luas.setOnAction(action -> {
            try {
                double angka = Double.parseDouble(input.getText());
                double hasil = angka * angka;
                output.setText("Hasil Luas = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        HBox kelu = new HBox(keliling, luas);
        kelu.setAlignment(Pos.CENTER);
        kelu.setSpacing(5);

        Button clear = new Button("Clear");
        clear.getStyleClass().add("custom-clear");
        clear.setOnAction(action -> {
            input.setText("");
            output.setText("");
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-back");
        back.setOnAction(action -> {
            showBangunDatar();
        });

        VBox vBox = new VBox(label, label2, input, output, clear, kelu, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        Scene scene4 = new Scene(vBox, 300, 500);
        scene4.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene4);
    }

    public void showPersegiPanjang() {
        Label label = new Label("Persegi Panjang");
        label.setFont(Font.font("Times New Roman", 20));

        Label panjang = new Label("Input panjang: ");
        TextField inputPanjang = new TextField();
        Label lebar = new Label("Input lebar: ");
        TextField inputLebar = new TextField();

        Label output = new Label();

        Button keliling = new Button("Keliling");
        keliling.getStyleClass().add("custom-voluke");
        keliling.setOnAction(action -> {
            try {
                double angka1 = Double.parseDouble(inputPanjang.getText());
                double angka2 = Double.parseDouble(inputLebar.getText());
                double hasil = 2 * (angka1 + angka2);
                output.setText("Hasil Keliling = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        Button luas = new Button("Luas");
        luas.getStyleClass().add("custom-voluke");
        luas.setOnAction(action -> {
            try {
                double angka1 = Double.parseDouble(inputPanjang.getText());
                double angka2 = Double.parseDouble(inputLebar.getText());
                double hasil = angka1 * angka2;
                output.setText("Hasil Luas = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        HBox kelu = new HBox(keliling, luas);
        kelu.setAlignment(Pos.CENTER);
        kelu.setSpacing(5);

        Button clear = new Button("Clear");
        clear.getStyleClass().add("custom-clear");
        clear.setOnAction(action -> {
            inputPanjang.setText("");
            inputLebar.setText("");
            output.setText("");
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-back");
        back.setOnAction(action -> {
            showBangunDatar();

        });

        VBox vBox = new VBox(label, panjang, inputPanjang, lebar, inputLebar, output,
                clear, kelu, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        Scene scene4 = new Scene(vBox, 300, 500);
        scene4.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene4);
    }

    public void showLingkaran() {
        Label label = new Label("Lingkaran");
        label.setFont(Font.font("Times New Roman", 20));

        Label label2 = new Label("Input jari-jari: ");
        TextField input = new TextField();
        Label output = new Label();

        Button keliling = new Button("keliling");
        keliling.getStyleClass().add("custom-voluke");
        keliling.setOnAction(action -> {
            try {
                double angka = Double.parseDouble(input.getText());
                Double hasil = 2 * Math.PI * angka;
                output.setText("Hasil Keliling = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        Button luas = new Button("Luas");
        luas.getStyleClass().add("custom-voluke");
        luas.setOnAction(action -> {
            try {
                double angka = Double.parseDouble(input.getText());
                Double hasil = Math.PI * angka * angka;
                output.setText("Hasil Luas = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        HBox kelu = new HBox(keliling, luas);
        kelu.setAlignment(Pos.CENTER);
        kelu.setSpacing(5);

        Button clear = new Button("Clear");
        clear.getStyleClass().add("custom-clear");
        clear.setOnAction(action -> {
            input.setText("");
            output.setText("");
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-back");
        back.setOnAction(action -> {
            showBangunDatar();
        });

        VBox vBox = new VBox(label, label2, input, output, clear, kelu, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        Scene scene4 = new Scene(vBox, 300, 500);
        scene4.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene4);
    }

    public void showSegitiga() {
        Label label = new Label("Segitiga");
        label.setFont(Font.font("Times New Roman", 20));

        Label sisiA = new Label("Input sisiA: ");
        TextField inputSisiA = new TextField();
        Label sisiB = new Label("Input sisiB: ");
        TextField inputSisiB = new TextField();
        Label sisiC = new Label("Input sisiC: ");
        TextField inputSisiC = new TextField();
        Label output = new Label();

        Button keliling = new Button("keliling");
        keliling.getStyleClass().add("custom-voluke");
        keliling.setOnAction(action -> {
            try {
                double angka1 = Double.parseDouble(inputSisiA.getText());
                double angka2 = Double.parseDouble(inputSisiB.getText());
                double angka3 = Double.parseDouble(inputSisiC.getText());
                double hasilKeliling = angka1 + angka2 + angka3;
                output.setText("Hasil Keliling = " + hasilKeliling);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        Button luas = new Button("Luas");
        luas.getStyleClass().add("custom-voluke");
        luas.setOnAction(action -> {
            try {
                double angka1 = Double.parseDouble(inputSisiA.getText());
                double angka2 = Double.parseDouble(inputSisiB.getText());
                double angka3 = Double.parseDouble(inputSisiC.getText());
                Double hasilKeliling = angka1 + angka2 + angka3;
                Double s = 0.5 * (hasilKeliling);
                Double l = s * (s - angka1) * (s - angka2) * (s - angka3);
                Double hasilLuas = Math.sqrt(l);

                output.setText("Hasil Luas= " + hasilLuas);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        HBox kelu = new HBox(keliling, luas);
        kelu.setAlignment(Pos.CENTER);
        kelu.setSpacing(5);

        Button clear = new Button("Clear");
        clear.getStyleClass().add("custom-clear");
        clear.setOnAction(action -> {
            inputSisiA.setText("");
            inputSisiB.setText("");
            inputSisiC.setText("");
            output.setText("");
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-back");
        back.setOnAction(action -> {
            showBangunDatar();
        });

        VBox vBox = new VBox(label, sisiA, inputSisiA, sisiB, inputSisiB, sisiC,
                inputSisiC, output,
                clear, kelu, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        Scene scene4 = new Scene(vBox, 300, 500);
        scene4.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene4);
    }

    public void showTrapesium() {
        Label label = new Label("Trapesium");
        label.setFont(Font.font("Times New Roman", 20));

        Label tinggi = new Label("Input tinggi: ");
        TextField inputTinggi = new TextField();
        Label sisiA = new Label("Input sisiA: ");
        TextField inputSisiA = new TextField();
        Label sisiB = new Label("Input sisiB: ");
        TextField inputSisiB = new TextField();
        Label sisiC = new Label("Input sisiC: ");
        TextField inputSisiC = new TextField();
        Label sisiD = new Label("Input sisiD: ");
        TextField inputSisiD = new TextField();
        Label output = new Label();

        Button keliling = new Button("keliling");
        keliling.getStyleClass().add("custom-voluke");
        keliling.setOnAction(action -> {
            try {
                double angka2 = Double.parseDouble(inputSisiA.getText());
                double angka3 = Double.parseDouble(inputSisiB.getText());
                double angka4 = Double.parseDouble(inputSisiC.getText());
                double angka5 = Double.parseDouble(inputSisiD.getText());
                double hasil = angka2 + angka3 + angka4 + angka5;
                output.setText("Hasil Keliling = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        Button luas = new Button("Luas");
        luas.getStyleClass().add("custom-voluke");
        luas.setOnAction(action -> {
            try {
                double angka1 = Double.parseDouble(inputTinggi.getText());
                double angka2 = Double.parseDouble(inputSisiA.getText());
                double angka3 = Double.parseDouble(inputSisiB.getText());
                Double hasil = 0.5 * (angka2 + angka3) * angka1;
                output.setText("Hasil Luas = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan Angka");
            }
        });

        HBox kelu = new HBox(keliling, luas);
        kelu.setAlignment(Pos.CENTER);
        kelu.setSpacing(5);

        Button clear = new Button("Clear");
        clear.getStyleClass().add("custom-clear");
        clear.setOnAction(action -> {
            inputTinggi.setText("");
            inputSisiA.setText("");
            inputSisiB.setText("");
            inputSisiC.setText("");
            inputSisiD.setText("");
            output.setText("");

        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-back");
        back.setOnAction(action -> {
            showBangunDatar();
        });

        VBox vBox = new VBox(label, tinggi, inputTinggi, sisiA, inputSisiA, sisiB,
                inputSisiB, sisiC, inputSisiC, sisiD,
                inputSisiD, output, clear, kelu, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(5);
        Scene scene4 = new Scene(vBox, 300, 500);
        scene4.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene4);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}