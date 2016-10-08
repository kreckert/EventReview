package GUI;

/**
 * Created by td41 on 08/10/16.
 */

import Application.EventListWrapper;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MyController implements Initializable {

    @FXML
    Parent root;
    @FXML
    private TextField nameField, ticketPriceField, organizerField, locationField;   //Application.Event attributes
    @FXML
    private DatePicker dateField;
    @FXML
    private Text resultField;

    @FXML
    private TextField eventNameField, authorField;   //Application.EventRating attributes
    @FXML
    private TextArea commentArea;
    @FXML
    private ComboBox<Integer> rateCombo;


    private Stage primaryStage;
    private Scene[] scenes;
    private EventListWrapper csvWrapper;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        csvWrapper = new EventListWrapper();
    }

    public void setStageAndScenes(Stage stage, Scene[] scenes) {
        this.primaryStage = stage;
        this.scenes = scenes;
    }

    @FXML
    public void loadEventCSVFile(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("CSV files (*.csv)", "*.csv");
        fileChooser.getExtensionFilters().add(extFilter);
        File file = fileChooser.showOpenDialog(primaryStage);
    }

    @FXML
    public void loadEventRatingsCSVFile(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("CSV files (*.csv)", "*.csv");
        fileChooser.getExtensionFilters().add(extFilter);
        File file = fileChooser.showOpenDialog(primaryStage);
    }

    @FXML
    public void assignRatingsToEvents(ActionEvent event) {

    }

    public void quitApplication(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void goToSceneAddEvent(ActionEvent event) {
        primaryStage.setScene(scenes[1]);
    }

    @FXML
    private void goToSceneAddEventRating(ActionEvent event) {
        primaryStage.setScene(scenes[2]);
    }

    @FXML
    private void backToMainMenu(ActionEvent event) throws IOException {
        if(scenes != null) {
            primaryStage.setScene(scenes[0]);
        }
    }

    @FXML
    private boolean addEventToCSV(ActionEvent event)  {

        try {
            String name = nameField.getText();
            String location = locationField.getText();
            String organizer = organizerField.getText();
            Integer ticketCost = Integer.valueOf(ticketPriceField.getText());
            String date = dateField.toString();

            csvWrapper.addEvent(name,date,location,ticketCost,organizer);
            return true;
        } catch (IllegalArgumentException e) {

        }
        return false;
    }

    @FXML
    public boolean addRatingToCSV(ActionEvent event) {
        try {
            String name = eventNameField.getText();
            String authorName = authorField.getText();
            String comments = commentArea.getText();
            Integer rate = rateCombo.getValue();

            csvWrapper.addRating(name,authorName,rate,comments);
            return true;
        } catch (IllegalArgumentException e) {

        }
        return false;
    }




}