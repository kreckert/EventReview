package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *
 */

public class ApplicationMenu extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/fxml/MainMenu.fxml"));
        Parent root = (Parent) loader.load();
        MyController myController=(MyController) loader.getController();
        myController.setStage(primaryStage);
        Scene scene = new Scene(root,350,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Event Reviewer");
        primaryStage.show();
    }


}
