/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffLogin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author z5039190
 */
public class StaffLoginFXMLController implements Initializable {

    @FXML
    private Label label;
    
    @FXML
    private TextField email;
    
    @FXML
    private PasswordField password;
    
    @FXML
    private Button signinbtn;
    
    @FXML
    void signin(ActionEvent event) {
        String userEmail = email.getText();
        String userPass = password.getText();
        System.out.println(userEmail + userPass);
        if (userEmail.equals("123@gmail.com") && userPass.equals("pass"))
        {
            label.setText("Welcome");
        }
        else {
                label.setText("Username or Password invalid");
        }
        }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
