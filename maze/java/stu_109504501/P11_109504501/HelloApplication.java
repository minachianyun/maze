package stu_109504501.P11_109504501;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Stage currentStage;
    public static Scene menuScene;
    public static Scene mazeScene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("maze.fxml"));

        currentStage = stage;
        menuScene = new Scene(fxmlLoader1.load());
        mazeScene = new Scene(fxmlLoader2.load());
        currentStage.setTitle("Walk to Exit");
        currentStage.setScene(menuScene);
        currentStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}