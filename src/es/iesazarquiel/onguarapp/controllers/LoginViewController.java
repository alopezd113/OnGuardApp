package es.iesazarquiel.onguarapp.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label usuario;

    @FXML
    private TextField loginUsuario;

    @FXML
    private TextField loginPassword;

    @FXML
    private Label contraseña;

    @FXML
    private Button entrar;

    @FXML
    void initialize() {
        assert usuario != null : "fx:id=\"usuario\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert loginUsuario != null : "fx:id=\"loginUsuario\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert loginPassword != null : "fx:id=\"loginPassword\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert contraseña != null : "fx:id=\"contraseña\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert entrar != null : "fx:id=\"entrar\" was not injected: check your FXML file 'LoginView.fxml'.";

    }
}
