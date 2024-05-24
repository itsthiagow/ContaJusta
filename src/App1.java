package src;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App1 extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("src/resources/layout.fxml"));
        Parent root = fxmlLoader.load();
        Scene windowScene = new Scene(root, 1029, 584);

        primaryStage.setTitle("Roleta Russa");
        primaryStage.setScene(windowScene);
        primaryStage.show();

        
    }
}