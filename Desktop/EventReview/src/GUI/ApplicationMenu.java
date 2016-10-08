package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

        FXMLLoader loaderMainMenu = new FXMLLoader(getClass().getClassLoader().getResource("GUI/fxml/MainMenu.fxml"));
        FXMLLoader loaderAddEvent = new FXMLLoader(getClass().getClassLoader().getResource("GUI/fxml/AddEvent.fxml"));
        FXMLLoader loaderAddEventRating = new FXMLLoader(getClass().getClassLoader().getResource("GUI/fxml/AddEventRating.fxml"));


        Parent root = (Parent) loaderMainMenu.load();
        Parent rootAddEvent = (Parent) loaderAddEvent.load();
        Parent rootAddEventRating = (Parent) loaderAddEventRating.load();


        MyController myController1=(MyController) loaderMainMenu.getController();
        MyController myController2=(MyController) loaderAddEvent.getController();
        MyController myController3=(MyController) loaderAddEventRating.getController();


        Scene sceneMainMenu = new Scene(root,350,400);
        Scene sceneAddEvent = new Scene(rootAddEvent,350,400);
        Scene sceneAddEventRating = new Scene(rootAddEventRating,350,400);

        myController1.setStageAndScenes(primaryStage,new Scene[] {sceneMainMenu,sceneAddEvent,sceneAddEventRating});
        myController2.setStageAndScenes(primaryStage,new Scene[] {sceneMainMenu,sceneAddEvent,sceneAddEventRating});
        myController3.setStageAndScenes(primaryStage,new Scene[] {sceneMainMenu,sceneAddEvent,sceneAddEventRating});


        primaryStage.setScene(sceneMainMenu);
        primaryStage.setTitle("Event Reviewer");
        primaryStage.show();



    }
}