package GUI;

/**
 * Created by td41 on 08/10/16.
 */

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class MyController implements Initializable {

    @FXML
    private TextField nameField, ticketPriceField, organizerField, locationField;   //Event attributes
    @FXML
    private DatePicker dateField;
    @FXML
    private Text resultField;

    @FXML
    private TextField eventNameField, authorField;   //EventRating attributes
    @FXML
    private TextArea commentArea;
    @FXML
    private ComboBox<Integer> rateCombo;
    private Stage primaryStage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void setStage(Stage stage) {
        this.primaryStage = stage;
    }

    @FXML
    private void addEvent(ActionEvent event) {
        resultField.setText(nameField.getText());
    }

    @FXML
    private void addEventRating(ActionEvent event) {

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

    }

    @FXML
    public void assignRatingsToEvents(ActionEvent event) {

    }

    public void quitApplication(ActionEvent event) {
        System.exit(0);
    }
}