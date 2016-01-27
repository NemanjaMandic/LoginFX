/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author nemus
 */
public class FXMLLoginController implements Initializable {
    
    @FXML
    private Label labelStatus;
    
    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private void login(ActionEvent event) throws IOException {
       if(txtUserName.getText().equals("nemanja") && txtPassword.getText().equals("lozinka")){
          labelStatus.setText("Login Success !");
          
          Stage stage = new Stage();
           Parent root = FXMLLoader.load(getClass().getResource("FXMLMain.fxml"));
        
            Scene scene = new Scene(root);
        
            stage.setScene(scene);
            stage.show();
       }else{
           labelStatus.setText("Login Failed !");
       }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
