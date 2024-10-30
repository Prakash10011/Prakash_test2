package com.example.lab2;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class SecondPageController {

    public Button secondpagebton;

    @FXML
    protected void handleUser() {
        try {
            // Load the library page in a new stage
            Parent libraryPage = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Stage libraryStage = new Stage();
            libraryStage.setTitle("Hello view");
            libraryStage.setScene(new Scene(libraryPage));

            // Show the library stage
            libraryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void handleLogout() {
        try {
            // Load the login page in a new stage
            Parent loginPage = FXMLLoader.load(getClass().getResource("login.fxml"));
            Stage loginStage = new Stage();
            loginStage.setTitle("Login Page");
            loginStage.setScene(new Scene(loginPage));

            // Close the current stage
            Stage currentStage = (Stage) secondpagebton.getScene().getWindow(); // Assuming usernameField is accessible
            currentStage.close();

            // Show the login stage
            loginStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
