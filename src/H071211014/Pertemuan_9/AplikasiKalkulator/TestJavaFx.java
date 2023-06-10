import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.control.Button;

public class TestJavaFx {
            Button btn = new Button("Dont Click");
        VBox vbox = new VBox();
        vbox.getChildren().add(btn);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 600, 300);
        stage.setScene(scene);
        stage.setTitle("Example");
        stage.show();

}
