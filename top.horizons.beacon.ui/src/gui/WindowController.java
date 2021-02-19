package gui;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author StarsEnd
 * @since 2021-02-19
 */
public class WindowController extends Application {
    Stage stage=new Stage();
    @Override
    public void start(Stage stage) throws Exception {
        this.stage=stage;
    }
     void closeWindow(){
        stage.hide();
    }
    public void showWindow() throws Exception {
        start(stage);
    }
}
