package fr.amu.iut.exercice8;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class LoginControl extends GridPane {

    @FXML
    private TextField username;

    @FXML
    private PasswordField pwd;

    @FXML
    private Button okButton;

    @FXML
    private Button cancelButton;

    @FXML
    private void okClicked() {
        System.out.println("ID: " + username.getText());
        System.out.println("Password: " + pwd.getText());
    }

    @FXML
    private void cancelClicked() {
        username.clear();
        pwd.clear();
    }
}