import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex3 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        // Ajouter des rectangles
        Rectangle rect1 = new Rectangle(50, 50, 100, 50);
        rect1.setFill(Color.BLUE);

        Rectangle rect2 = new Rectangle(200, 50, 150, 75);
        rect2.setFill(Color.GREEN);

        // Ajouter des cercles
        Circle circle1 = new Circle(100, 200, 30); // x, y, radius
        circle1.setFill(Color.RED);

        Circle circle2 = new Circle(250, 200, 40);
        circle2.setFill(Color.ORANGE);

        Circle circle3 = new Circle(400, 200, 20);
        circle3.setFill(Color.PURPLE);

        root.getChildren().addAll(rect1, rect2, circle1, circle2, circle3);

        Scene scene = new Scene(root, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Formes multiples");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
