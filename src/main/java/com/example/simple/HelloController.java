package com.example.simple;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField PasswordField;

    @FXML
    private TextField UsernameField;

    @FXML
    private Button authLoginButtom;

    @FXML
    private Label welcomeText;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onAuthButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simple/profile.fxml"));
            Parent root = loader.load();

            ProfileController profileController = loader.getController();

            Scene scene = new Scene(root);

            Stage currentStage = (Stage) authLoginButtom.getScene().getWindow();

            // Установите новую сцену в текущем окне
            currentStage.setScene(scene);
            currentStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}