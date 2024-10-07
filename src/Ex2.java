import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Ex2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Canvas canvas = new Canvas(500, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Dessiner un rectangle bleu
        gc.setFill(Color.BLUE);
        gc.fillRect(50, 50, 100, 50);  // Rectangle 1


        // Dessiner un cercle rouge
        gc.setFill(Color.RED);
        gc.fillOval(100, 150, 60, 60);  // Cercle 1


        root.getChildren().add(canvas);
        Scene scene = new Scene(root, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Formes multiples avec Canvas");
        primaryStage.show();
    }
}
