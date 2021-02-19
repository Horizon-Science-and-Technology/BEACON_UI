package loader;

import gui.WindowController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import static javafx.application.Application.launch;

/**
 * @author StarsEnd
 * @since 2021-02-19
 */
public class LoginLoader extends WindowController {

    @Override
    public void start(Stage primaryStage) {
        System.out.println(getClass());
        try {
            // Read file fxml and draw interface.
            Parent root = FXMLLoader.load(getClass()
                    .getResource("/login.fxml"));

            primaryStage.setTitle("BEACON");
            primaryStage.setScene(new Scene(root));
            primaryStage.setResizable(false);
            primaryStage.getIcons().add(new Image("img/BEACON_logo.png"));
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
