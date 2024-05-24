package src;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainInterface.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 1029, 584);
        stage.setTitle("Divisão Justa");
        stage.setScene(scene);
        stage.show();
    }
}
