package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import loader.MainLoader;

/**
 * @author StarsEnd
 * @since 2021-02-19
 */
public class LoginController {
    @FXML
    private Button loginButton;
    @FXML
    private Label versionLabel;

    @FXML
    public void onButtonClick(ActionEvent event) {
        versionLabel.setText("HelloWorld");
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        var stage = loginButton.getScene().getWindow();
        stage.hide();
        MainLoader mainLoader=new MainLoader();
    }

}
