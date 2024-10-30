package com.example.lab2;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    protected void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("prakash") && password.equals("prakash")) {
            try {
                Parent secondScene = FXMLLoader.load(getClass().getResource("secondpage.fxml"));
                Stage secondStage = new Stage();
                secondStage.setTitle("User Scene");
                secondStage.setScene(new Scene(secondScene));

                // Close the current stage
                Stage firstStage = (Stage) usernameField.getScene().getWindow();
                firstStage.close();

                // Show the new stage
                secondStage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Invalid credentials!");
        }
    }
}
