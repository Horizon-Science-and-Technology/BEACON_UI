package controller;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 * @author StarsEnd
 * @since 2021-02-19
 */
public class TryController {
    @FXML
    private Button mButton;
    @FXML
    private TextField mTextField;

    @FXML
    public void onButtonClick(ActionEvent event) {
        mTextField.setText("HelloWorld");
    }

}
