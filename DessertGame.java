import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.application.Platform;
import javafx.geometry.Pos;
import java.util.Random;

public class DessertGame extends Application {
    private int score = 0;

    @Override
    public void start(final Stage stage) {
        // Step 3 & 4
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 640, 480);
        stage.setTitle("Dessert in the Desert JavaFX Game");

        // Step 5
        Label scoreLabel = new Label("Score: 0");
        borderPane.setTop(scoreLabel);
        BorderPane.setAlignment(scoreLabel, Pos.TOP_LEFT);

        Button exitButton = new Button("Exit");
        exitButton.setOnAction(event -> {
            Platform.exit();
        });
        borderPane.setBottom(exitButton);
        BorderPane.setAlignment(exitButton, Pos.BOTTOM_RIGHT);

        // Step 6
        Pane pane = new Pane();
        borderPane.setCenter(pane);
        BorderPane.setAlignment(pane, Pos.CENTER);

        // TODO: Step 7-10
        Button dessert = new Button("Dessert");
        Button desert = new Button("Desert");
        Button desert2 = new Button("Desert");
        Button desert3 = new Button("Desert");
        Button desert4 = new Button("Desert");
        Button desert5 = new Button("Desert");
        Button desert6 = new Button("Desert");
        Button desert7 = new Button("Desert");

        pane.getChildren().add(dessert);
        pane.getChildren().add(desert);
        pane.getChildren().add(desert2);
        pane.getChildren().add(desert3);
        pane.getChildren().add(desert4);
        pane.getChildren().add(desert5);
        pane.getChildren().add(desert6);
        pane.getChildren().add(desert7);

        Random randGenerator = new Random();
        Button[] arrayButtons = new Button[]{dessert, desert, desert2, desert3, desert4, desert5, desert6, desert7};

        dessert.setOnAction(event -> {
            score = score + 1;
            borderPane.setTop(new Label("Score: " + score));
            randomizeButtonPositions(randGenerator, arrayButtons);
            exitButton.requestFocus();
        });

        desert.setOnAction(event -> {
            score = score - 1;
            borderPane.setTop(new Label("Score: " + score));
            randomizeButtonPositions(randGenerator, arrayButtons);
            exitButton.requestFocus();
        });

        desert2.setOnAction(event -> {
            score = score - 1;
            borderPane.setTop(new Label("Score: " + score));
            randomizeButtonPositions(randGenerator, arrayButtons);
            exitButton.requestFocus();
        });

        desert3.setOnAction(event -> {
            score = score - 1;
            borderPane.setTop(new Label("Score: " + score));
            randomizeButtonPositions(randGenerator, arrayButtons);
            exitButton.requestFocus();
        });

        desert4.setOnAction(event -> {
            score = score - 1;
            borderPane.setTop(new Label("Score: " + score));
            randomizeButtonPositions(randGenerator, arrayButtons);
            exitButton.requestFocus();
        });

        desert5.setOnAction(event -> {
            score = score - 1;
            borderPane.setTop(new Label("Score: " + score));
            randomizeButtonPositions(randGenerator, arrayButtons);
            exitButton.requestFocus();
        });

        desert6.setOnAction(event -> {
            score = score - 1;
            borderPane.setTop(new Label("Score: " + score));
            randomizeButtonPositions(randGenerator, arrayButtons);
            exitButton.requestFocus();
        });

        desert7.setOnAction(event -> {
            score = score - 1;
            borderPane.setTop(new Label("Score: " + score));
            randomizeButtonPositions(randGenerator, arrayButtons);
            exitButton.requestFocus();
        });

        randomizeButtonPositions(randGenerator, arrayButtons);
        exitButton.requestFocus();

        stage.setScene(scene);
        stage.show();
    }

    private static void randomizeButtonPositions(Random randGenerator, Button[] arrayButtons) {
        for (int i = 0; i < arrayButtons.length; ++i) {
            arrayButtons[i].setLayoutX(randGenerator.nextInt(600));
            arrayButtons[i].setLayoutY(randGenerator.nextInt(400));
        }

        return;
    }

    public static void main(String[] args) {
        Application.launch();
    }
}