import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Rectangle rect = new Rectangle(200, 200, 100, 50); // x, y, largeur, hauteur
        rect.setFill(Color.BLUE);
        root.getChildren().add(rect);

        Scene scene = new Scene(root, 600, 400);

        // Gestion des événements clavier pour déplacer le rectangle
        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case LEFT:
                    rect.setX(rect.getX() - 10);
                    break;
                case RIGHT:
                    rect.setX(rect.getX() + 10);
                    break;
                case UP:
                    rect.setY(rect.getY() - 10);
                    break;
                case DOWN:
                    rect.setY(rect.getY() + 10);
                    break;
            }
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("Déplacer un rectangle");
        primaryStage.show();

    }
}
