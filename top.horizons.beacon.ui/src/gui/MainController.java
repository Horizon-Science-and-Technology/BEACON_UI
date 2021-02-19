package gui;

import javafx.stage.Stage;

/**
 * @author StarsEnd
 * @since 2021-02-19
 */
public class MainController {
    public MainController() {

    }
    public void changeWindow(WindowController close, WindowController show){
        close.closeWindow();//show.showWindow();
    }
    public void changeWindow(Stage close, WindowController show){
        close.hide();//show.showWindow();
    }
}
