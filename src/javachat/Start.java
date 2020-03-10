package javachat;

/**
 * @Autor Vladimir Medvedev
 * @Date 11/03/2020
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start extends Application {
    private static final String TITLE = "MY JAVA CHAT";
    private static final String URL = "fxml/homepage.fxml";
    private static final double WINDOW_WEIGHT = 700;
    private static final double WINDOW_HEIGHT = 580;



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource(URL));
        primaryStage.setTitle(TITLE);
        primaryStage.setScene(new Scene(root, WINDOW_WEIGHT, WINDOW_HEIGHT));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
