package com.example.simple;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
    protected void onAuthButtonClick(){
        authLoginButtom.setOnAction(actionEvent -> {
            System.out.println(UsernameField.toString());
            System.out.println(PasswordField.toString());
        });
    }
}