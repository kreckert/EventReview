package GUI;

/**
 * Created by td41 on 08/10/16.
 */

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Text resultField;
    @FXML
    private TextField nameField;
    //@FXML private TextField ticketPriceField;
    //  @FXML private TextField organizerField;
    //  @FXML private TextField locationField;
    //  @FXML private DatePicker dateField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

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
    }

    @FXML
    public void loadEventRatingsCSVFile(ActionEvent event) {

    }

    @FXML
    public void assingRatingsToEvents(ActionEvent event) {

    }
}