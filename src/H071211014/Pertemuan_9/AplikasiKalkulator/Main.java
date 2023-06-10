public class Main {
    public static void main(String[] args) {
        private TextField display;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Calculator");

       
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

       
        display = new TextField();
        display.setPrefHeight(30);
        display.setEditable(false);
        GridPane.setColumnSpan(display, 4);
        grid.getChildren().add(display);

       
        String[] kalkulator1 = "Masukkan angka";
        String[] kalkulator2 = "Masukkan angka";


    
        int row = 1;
        int col = 0;


        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.setPrefHeight(30);
            button.setPrefWidth(30);

            // Menambahkan event handler untuk tombol
            button.setOnAction(event -> {
                String currentText = display.getText();
                String buttonText = button.getText();

                // Menghandle tombol "=" untuk melakukan perhitungan
                if (buttonText.equals("=")) {
                    try {
                        double result = evaluateExpression(currentText);
                        display.setText(Double.toString(result));
                    } catch (Exception e) {
                        display.setText("Error");
                    }
                } else {
                    display.setText(currentText + buttonText);
                }
            });

            grid.add(button, col, row);

            // Mengatur posisi tombol pada GridPane
            col++;
            if (col > 3) {
                col = 0;
                row++;
            }
        }

        Scene scene = new Scene(grid, 160, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private double evaluateExpression(String expression) {
        
        javax.script.ScriptEngineManager mgr = new javax.script.ScriptEngineManager();
        javax.script.ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
            Object result = engine.eval(expression);
            return (double) result;
        } catch (Exception e) {
            throw new RuntimeException("Error evaluating expression: " + expression, e);
        }
    }
}
