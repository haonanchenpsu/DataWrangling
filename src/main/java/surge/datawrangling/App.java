package surge.datawrangling;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("primary.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 550, 200);
        stage.setTitle("DataWrangling");
        stage.setScene(scene);
        stage.setX(100);
        stage.setY(100);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}