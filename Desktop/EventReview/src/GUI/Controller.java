package GUI;

/**
 * Created by td41 on 08/10/16.
 */

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
{
    @FXML private Text actiontarget;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

    }
    @FXML
    private void test(ActionEvent event)
    {
        System.out.println("lollolol");
        actiontarget.setText("Button Pressed");

    }
    @FXML
    private void addEvent(ActionEvent event) {

    }
}