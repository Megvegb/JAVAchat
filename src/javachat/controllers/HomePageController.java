package javachat.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class HomePageController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea textAreaInput;

    @FXML
    private Button sendBtn;

    @FXML
    private TextArea textAreaOutput;

    @FXML
    void initialize() {
        sendBtn.setOnAction(event -> {
            textAreaOutput.appendText("Vlad say: " + textAreaInput.getText() + "\n");
            textAreaInput.clear();
        });

    }
}

