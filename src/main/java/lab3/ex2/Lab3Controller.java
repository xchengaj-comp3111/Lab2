package lab3.ex2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Lab3Controller {

    @FXML
    private Button button1;

    @FXML
    private Label label1;

    @FXML
    private TextField text1;

    @FXML
    void buttonPressed(ActionEvent event) {
        label1.setText(text1.getText());

    }

}
