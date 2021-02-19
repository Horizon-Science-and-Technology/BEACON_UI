package loader;

import gui.WindowController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @author StarsEnd
 * @since 2021-02-19
 */
public class MainLoader extends WindowController {
    @Override
    public void start(Stage primaryStage) {
    System.out.println(getClass());
    try {
        // Read file fxml and draw interface.
        Parent root = FXMLLoader.load(getClass()
                .getResource("/main.fxml"));

        primaryStage.setTitle("BEACON");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(true);
        primaryStage.getIcons().add(new Image("img/BEACON_logo.png"));
        primaryStage.show();

    } catch(Exception e) {
        e.printStackTrace();
    }
    }
    public MainLoader(){
        Stage stage=new Stage();
        start(stage);
    }
}
