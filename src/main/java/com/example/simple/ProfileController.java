package com.example.simple;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class ProfileController {

    @FXML
    private Text Password;

    @FXML
    private Text Userame;
    @FXML
    private Button Logout;

    private HelloController helloController;

    public void processAuthData(String username, String password) {
        Userame.setText(username);
        Password.setText(password);
    }

    @FXML
    protected void logout() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simple/hello-view.fxml"));
            Parent root = loader.load();

            HelloController helloController1 = loader.getController();

            Scene scene = new Scene(root);

            Stage currentStage = (Stage) Logout.getScene().getWindow();

            // Устанавливаем новую сцену в текущем окне
            currentStage.setScene(scene);
            currentStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
