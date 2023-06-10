import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class TextFieldExperiments extends Application {
@Override
public void start(Stage primaryStage) throws Exception {
primaryStage.setTitle("HBox Experiment 1");
TextField textField = new TextField();
Label label = new Label("My Label");
Button button = new Button("Click to get text");
button.setOnAction(action -> {
label
.setText("Halo perkenalkan saya " + textField
.getText());
});
VBox vbox = new VBox(label, textField, button);
Scene scene = new Scene(vbox, 200, 100);
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args) {
Application.launch(args);
}
}