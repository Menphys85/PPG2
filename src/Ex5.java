import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ex5 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Pane root = new Pane();
        Circle circle = new Circle(50, 200, 30); // x, y, radius
        circle.setFill(Color.GREEN);
        root.getChildren().add(circle);

        // Animation pour déplacer le cercle
        AnimationTimer timer = new AnimationTimer() {
            int dx = 15;
            @Override
            public void handle(long now) {
                // Rebondir lorsque le cercle atteint les bords
                if (circle.getCenterX() - circle.getRadius() <= 0 || circle.getCenterX() + circle.getRadius() >= 600) {
                    dx *= -1;
                }
                circle.setCenterX(circle.getCenterX() + dx);

            }
        };
        timer.start();

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Animation simple");
        primaryStage.show();

    }
}
